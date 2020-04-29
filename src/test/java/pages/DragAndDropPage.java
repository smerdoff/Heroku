package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public static final String DRAG_AND_DROP_URL = "http://the-internet.herokuapp.com/drag_and_drop";
    private static final By ELEMENT_A = By.id("column-a");
    private static final By ELEMENT_B = By.id("column-b");

    public void openPage(){
        driver.get(DRAG_AND_DROP_URL);
    }

//    public void dragAndDrop(){
//        WebElement elementA = driver.findElement(ELEMENT_A);
//        WebElement elementB = driver.findElement(ELEMENT_B);
//        actions.dragAndDrop(elementA,elementB).build().perform();
//    }

    public void headerValidate(String expectedHeader){
        String actualHeader = driver.findElement(By.cssSelector("header")).getText();
        Assert.assertEquals(actualHeader, expectedHeader, "Перемещение выполнено не правильно, элементы не поменялись" );
    }

}
