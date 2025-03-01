package sellerPortal.test;

import buyerCheckOut.function.checkout_function;
import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;
import sellerPortal.function.seller_function;
import sellerPortal.function.sellpageRevenue_function;

public class verifySellpage extends seller {
    public String email = "soyero8019@ociun.com";
    public String password = "soyero8019@123";
    @Test
    public void verifySellpage() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);

        seller_function sellerFunction = new seller_function(driver);
        Thread.sleep(5000);
        sellerFunction.sellpage1();
        Thread.sleep(3000);
        sellpageRevenue_function sellpageRevenueFunction = new sellpageRevenue_function(driver);
        sellpageRevenueFunction.verifyRevenueSellpage();
    }
    @Test
    public void checkoutPaypal() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);

        seller_function sellerFunction = new seller_function(driver);
        Thread.sleep(5000);
        sellerFunction.sellpage1();
        Thread.sleep(3000);


        sellpageRevenue_function sellpageRevenueFunction = new sellpageRevenue_function(driver);
        sellpageRevenueFunction.swithSellpage();
        driver.navigate().refresh();
//        Thread.sleep(180000);
//        driver.navigate().refresh();
        Thread.sleep(2000);

        checkout_function  checkoutFunction = new checkout_function(driver);
        checkoutFunction.paypalCheckout();

    }
    @Test
    public void checkoutStripe() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);

        seller_function sellerFunction = new seller_function(driver);
        Thread.sleep(5000);
        sellerFunction.sellpage1();
        Thread.sleep(3000);

        sellpageRevenue_function sellpageRevenueFunction = new sellpageRevenue_function(driver);
        sellpageRevenueFunction.swithSellpage();

        checkout_function  checkoutFunction = new checkout_function(driver);
        checkoutFunction.stripeCheckout();

    }
}
