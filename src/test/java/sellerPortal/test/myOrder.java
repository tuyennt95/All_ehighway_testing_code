package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;
import sellerPortal.function.myOrder_function;

public class myOrder extends seller {
    public String email = "soyero8019@ociun.com";
    public String password = "soyero8019@123";
    @Test
    public void verifyMyOrderPaypal() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        myOrder_function myOrderFunction = new myOrder_function(driver);
        myOrderFunction.verifyMyOrderPaypal();

    }
    @Test
    public void verifyMyOrderStripe() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        myOrder_function myOrderFunction = new myOrder_function(driver);
        myOrderFunction.verifyMyOrderStripe();
    }
    @Test
    public void verifyOrderPaypal() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        myOrder_function myOrderFunction = new myOrder_function(driver);
        myOrderFunction.verifyOrderPaypal();
    }
}
