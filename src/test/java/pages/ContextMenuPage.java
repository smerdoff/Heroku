package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    public static final String CONTEXT_MENU_URL = "http://the-internet.herokuapp.com/context_menu";
    private static final By HOT_SPOT = By.id("hot-spot");
    private String expectedAlertText = "You selected a context menu";

    public void openPage(){
        driver.get(CONTEXT_MENU_URL);
    }
    public void rightClick(){
        WebElement hotspot =  driver.findElement(HOT_SPOT);
        actions.contextClick(hotspot).perform();
    }

    public void alertValidate(){
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, expectedAlertText,"Текста алертов не совпадают");
    }






}
