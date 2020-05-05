package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;

public class FileUploaderPage extends BasePage {

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }
    public static final String FILE_UPLOADER_URL = "http://the-internet.herokuapp.com/upload";
    private static final By UPLOAD_BUTTON = By.id("file-submit");
    private static final By CHOOSE_BUTTON = By.id("file-upload");

    public void openPage(){
        driver.get(FILE_UPLOADER_URL);
    }
    public void uploadFile(String UPLOAD_FILE_URL) {
        File UPLOAD_FILE_ABSOLUTE_URL = new File(UPLOAD_FILE_URL);
        driver.findElement(CHOOSE_BUTTON).sendKeys(UPLOAD_FILE_ABSOLUTE_URL.getAbsolutePath());
    }

    public void clickUpload(){
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public void uploadValidate(String fileName){
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualFilename, fileName,"Имена файлов не совпадают");
    }
}
