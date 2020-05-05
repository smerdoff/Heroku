package tests;

import org.testng.annotations.Test;

public class HerokuTest extends BaseTest {
    String filePath = "src/test/resources/txt.txt";

    @Test
    public void fileUploadTest(){
        fileUploaderPage.openPage();
        fileUploaderPage.uploadFile(filePath);
        fileUploaderPage.clickUpload();
        fileUploaderPage.uploadValidate("txt.txt");
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
        alertPage.alertValidate("You successfuly clicked an alert");
    }

    @Test
    public void confirmTest(){
        alertPage.openPage();
        alertPage.confirmValidate("You clicked: Ok", "You clicked: Cancel");
    }

    @Test
    public void promptTest(){
        alertPage.openPage();
        alertPage.promptClick();
        alertPage.promptValidate("Test");
    }

    @Test
    public void dragAndDropTest(){
        dragAndDropPage.openPage();
//        dragAndDropPage.dragAndDrop();
        dragAndDropPage.headerValidate("B");
    }
}
