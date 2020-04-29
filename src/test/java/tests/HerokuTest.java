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

    @Test
    public void alertTest(){
        alertPage.openPage();
        alertPage.alertClick();
    }

    @Test
    public void confirmTest(){
        alertPage.openPage();
        alertPage.confirmClick();
    }

    @Test
    public void promptTest(){
        alertPage.openPage();
        alertPage.promptClick();
    }
}
