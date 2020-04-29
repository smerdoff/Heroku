package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.FileUploaderPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    FileUploaderPage fileUploaderPage;
    ContextMenuPage contextMenuPage;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        fileUploaderPage = new FileUploaderPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
    }


    @AfterMethod(alwaysRun =true)
    public void closeBrowser() {
        driver.quit();
    }
}

