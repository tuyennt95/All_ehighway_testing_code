package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.*;

public class createSellpage extends seller {
    public String email = "soyero8019@ociun.com";
    public String password = "soyero8019@123";
   /*  Public product đã ẩn
   @Test
    public void CreateTPOSellpage() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectTeam();
        productPubic_function productPublicFunction = new productPubic_function(driver);
        productPublicFunction.searchProduct("Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        Thread.sleep(3000);

        productPublicFunction.hoverImage();
        productPublicFunction.sellThisProduct();

        theme_function themeFunction = new theme_function(driver);
        themeFunction.hoverImageRevenue();
        themeFunction.clickCreateSellpage();

        createDomain_function createDomainFunction = new createDomain_function(driver);
        createDomainFunction.createTPODomain();
//        createDomainFunction.clickConfirmBtn();
//
//        editSellpage_function editSellpageFunction = new editSellpage_function(driver);
//        editSellpageFunction.verifyCreateSellpage();
//
//        String s1 = driver.getCurrentUrl();
//
//        System.out.println(s1);

    }
    @Test()
    public void createCustomizeDomain() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        productPubic_function productPublicFunction = new productPubic_function(driver);
        productPublicFunction.searchProduct("Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        Thread.sleep(3000);

        productPublicFunction.hoverImage();
        productPublicFunction.sellThisProduct();

        theme_function themeFunction = new theme_function(driver);
        themeFunction.hoverImageRevenue();
        themeFunction.clickCreateSellpage();

        createDomain_function createDomainFunction = new createDomain_function(driver);
        createDomainFunction.createCustomizeDomain();
    }*/
    @Test
    public void createDomainMyProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectDefaultTeam();

        sellerFunction.viewTestProducts();
        testProducts_function myProductsFunction = new testProducts_function(driver);
        myProductsFunction.viewProductDetail();

        theme_function themeFunction = new theme_function(driver);

        themeFunction.hoverImageRevenue();
        themeFunction.clickCreateSellpage();

        createDomain_function createDomainFunction = new createDomain_function(driver);
        createDomainFunction.createCustomizeDomain();
    }
    @Test
    public void createDomainPrivateProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);

        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectDefaultTeam();

        sellerFunction.viewFulfillableProducts();
        testProducts_function myProductsFunction = new testProducts_function(driver);
        myProductsFunction.viewProductDetail();

        theme_function themeFunction = new theme_function(driver);
        themeFunction.hoverImageRevenue();
        themeFunction.clickCreateSellpage();

        createDomain_function createDomainFunction = new createDomain_function(driver);
        createDomainFunction.createCustomizeDomainVerify();

    }
}
