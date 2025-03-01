package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;
import sellerPortal.function.testProducts_function;
import sellerPortal.function.seller_function;

public class Product extends seller {
//public String email = "soyero8019@ociun.com";
//    public String password = "soyero8019@123";
    public String email = "tuyentesttm@gmail.com";
    public String password = "tuyentesttm@123";
    @Test
    public void verifymesErro() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.viewTestProducts();
        testProducts_function myProductsFunction = new testProducts_function(driver);
        myProductsFunction.clickAddProduct();
        myProductsFunction.createTitleProduct();
        myProductsFunction.verifyMes();

    }
    @Test
    public void addProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectDefaultTeam();
        testProducts_function myProductsFunction = new testProducts_function(driver);
        myProductsFunction.clickAddProduct();
        myProductsFunction.createTitleProduct();
        myProductsFunction.createDescription();
        driver.switchTo().defaultContent();
        myProductsFunction.createSpecification();
        driver.switchTo().defaultContent();
        myProductsFunction.addImage();
        myProductsFunction.addProductCost();
        myProductsFunction.addOption();
        myProductsFunction.verifyVariants();
        myProductsFunction.addShippingInformation();
        myProductsFunction.policyProduct();
        myProductsFunction.save();
    }
    @Test
    public void requestProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectDefaultTeam();
        testProducts_function myProductsFunction = new testProducts_function(driver);
        myProductsFunction.clickAddProduct();
        myProductsFunction.createTitleProduct();
        myProductsFunction.createDescription();
        driver.switchTo().defaultContent();
        myProductsFunction.createSpecification();
        driver.switchTo().defaultContent();
        myProductsFunction.addImage();
        myProductsFunction.addProductCost();
        myProductsFunction.addOption();
        myProductsFunction.verifyVariants();
        myProductsFunction.editVariants();
        myProductsFunction.addShippingInformation();
        myProductsFunction.policyProduct();
        myProductsFunction.saveAndRequest();
    }
    @Test
    public void editProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        seller_function sellerFunction = new seller_function(driver);
        sellerFunction.selectDefaultTeam();
        testProducts_function myProductsFunction = new testProducts_function(driver);
        myProductsFunction.viewEditProduct();
        myProductsFunction.editTitleProduct();
        myProductsFunction.editDescriptionProduct();
        driver.switchTo().defaultContent();
        myProductsFunction.editSpecificationProduct();
        driver.switchTo().defaultContent();
        myProductsFunction.editImage();
        myProductsFunction.editPricing();
        myProductsFunction.editVariants();
        myProductsFunction.editShippingInfomation();
        myProductsFunction.editPolicy();
        myProductsFunction.saveEditProduct();
    }
}
