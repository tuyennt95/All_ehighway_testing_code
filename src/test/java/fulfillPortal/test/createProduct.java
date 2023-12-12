package fulfillPortal.test;

import core.baseTest.fulfill;
import fulfillPortal.function.addProduct_function;
import fulfillPortal.function.fulfillPortal_function;
import fulfillPortal.function.login_function;
import org.testng.annotations.Test;

public class createProduct extends fulfill {
    @Test
    public void addProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("tedy@gmail.com", "Tedy@6688");
//        loginFunction.login("fulfiller", "fulfiller@123");
        loginFunction.login("wopigi23@gronasu.com", "wopigi23@123");

        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewAddProductPage();

        addProduct_function addProductFunction = new addProduct_function(driver);
        addProductFunction.addTitleProduct();
        addProductFunction.createDescription();
        driver.switchTo().defaultContent();
        addProductFunction.createSpecification();
        driver.switchTo().defaultContent();
        addProductFunction.addImage();
        addProductFunction.addProductCost();
        addProductFunction.addOption();
        addProductFunction.verifyVariants();
        addProductFunction.addShippingInformation();
        addProductFunction.policyProduct();
        addProductFunction.save();
    }
    @Test
    public void editProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
//        loginFunction.login("fulfiller", "fulfiller@123");
        loginFunction.login("wopigi23@gronasu.com", "wopigi23@123");

        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewEditProductPage();
        addProduct_function addProductFunction= new addProduct_function(driver);
        addProductFunction.editTitleProduct();
        addProductFunction.editDescriptionProduct();
        driver.switchTo().defaultContent();
        addProductFunction.editSpecificationProduct();
        driver.switchTo().defaultContent();
//        addProductFunction.editImage();
        addProductFunction.editPricing();
        addProductFunction.editVariants();
        addProductFunction.editShippingInfomation();
        addProductFunction.editPolicy();
        addProductFunction.saveEditProduct();
    }
}
