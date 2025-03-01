package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.editSellpage_function;
import sellerPortal.function.login_function;
import sellerPortal.function.seller_function;

public class editSellpage extends seller {
    public String email = "soyero8019@ociun.com";
    public String password = "soyero8019@123";
    @Test
    public void TC02_editSellpage() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectDefaultTeam();
        sellerFunction.viewEditSellpgage();
        Thread.sleep(5000);

        editSellpage_function editSellpageFunction= new editSellpage_function(driver);
        editSellpageFunction.editSellpagePage();
        Thread.sleep(5000);

        editSellpageFunction.uploadFileLogo();
        editSellpageFunction.uploadFivacon();
        editSellpageFunction.editTitleSellpage();
        editSellpageFunction.scrollToTitle();

        editSellpageFunction.setBulkVariants();
        editSellpageFunction.SetupCountDownTimer();

        editSellpageFunction.createAnnouncementBar();

        editSellpageFunction.editDescription();
       driver.switchTo().defaultContent();
        editSellpageFunction.createCombo();

       editSellpageFunction.ShippingSetting();

       editSellpageFunction.clickQuantityDiscount();
        editSellpageFunction.inputDiscount1();

        editSellpageFunction.setupImageWithText();

       editSellpageFunction.addReview();

       editSellpageFunction.createPolicy();

       driver.switchTo().defaultContent();
        editSellpageFunction.clickSavePublic();

       Thread.sleep(5000);

        editSellpageFunction.setupUpsale();
        editSellpageFunction.configPaygate();
    }

}
