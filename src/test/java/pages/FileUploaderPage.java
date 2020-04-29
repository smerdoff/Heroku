package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileUploaderPage extends BasePage {

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }
    public static final String FILE_UPLOADER_URL = "http://the-internet.herokuapp.com/upload";
    private static final By UPLOAD_BUTTON = By.id("file-submit");
    private static final By CHOOSE_BUTTON = By.id("file-upload");;

    public void openPage(){
        driver.get(FILE_UPLOADER_URL);
    }

    public void uploadFile(){
        driver.findElement(CHOOSE_BUTTON).sendKeys("C:\\Users\\admin\\IdeaProjects\\Heroku\\src\\test\\java\\resources\\txt.txt");
    }


    public void clickUpload(){
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public void uploadValidate(){
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualFilename, "txt.txt","Имена файлов не совпадают");
    }

}
