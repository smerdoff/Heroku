package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AlertPage;
import pages.ContextMenuPage;
import pages.DragAndDropPage;
import pages.FileUploaderPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    FileUploaderPage fileUploaderPage;
    ContextMenuPage contextMenuPage;
    AlertPage alertPage;
    DragAndDropPage dragAndDropPage;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        fileUploaderPage = new FileUploaderPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
        alertPage = new AlertPage(driver);
        dragAndDropPage = new DragAndDropPage(driver);
    }


    @AfterMethod(alwaysRun =true)
    public void closeBrowser() {
        driver.quit();
    }
}

