package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }
    public static final String ALERTS_PAGE_URL = "http://the-internet.herokuapp.com/javascript_alerts";
    private static final By JS_ALERT = By.xpath("//*[text() = 'Click for JS Alert']");
    private static final By JS_CONFIRM = By.xpath("//*[text() = 'Click for JS Confirm']");
    private static final By JS_PROMPT = By.xpath("//*[text() = 'Click for JS Prompt']");
    private static final By RESULT = By.id("result");

    public void openPage(){
        driver.get(ALERTS_PAGE_URL);
    }
    public void alertClick(){
        driver.findElement(JS_ALERT).click();
        driver.switchTo().alert().accept();
    }
    public void alertValidate(String expectedMessage){
        String actualText = driver.findElement(RESULT).getText();
        Assert.assertEquals(actualText, expectedMessage,"Текст алерта не совпадает");
    }

    public void confirmValidate(String messageAfterConfirm, String messageAfterCancel){
        driver.findElement(JS_CONFIRM).click();
        driver.switchTo().alert().accept();
        String actualText = driver.findElement(RESULT).getText();
        Assert.assertEquals(actualText, messageAfterConfirm , "Текст результата не совпадает");
        driver.findElement(JS_CONFIRM).click();
        driver.switchTo().alert().dismiss();
        actualText = driver.findElement(RESULT).getText();
        Assert.assertEquals(actualText, messageAfterCancel, "Текст результата не совпадает");
    }

    public void promptClick(){
        driver.findElement(JS_PROMPT).click();
    }

    public void promptValidate(String enteredText){
        driver.switchTo().alert().sendKeys(enteredText);
        driver.switchTo().alert().accept();
        String actualText = driver.findElement(RESULT).getText();
        Assert.assertEquals(actualText, "You entered: " + enteredText, "Текст результата не совпадает");
    }
}

