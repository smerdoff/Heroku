package tests;

import org.testng.annotations.Test;

public class HerokuTest extends BaseTest {
    @Test
    public void fileUploadTest(){
        fileUploaderPage.openPage();
        fileUploaderPage.uploadFile();
        fileUploaderPage.clickUpload();
        fileUploaderPage.uploadValidate();
    }

    @Test
    public void contextMenuTest(){
        contextMenuPage.openPage();
        contextMenuPage.rightClick();
        contextMenuPage.alertValidate();
    }





}
