package fulfillPortal.test;

import core.baseTest.fulfill;
import fulfillPortal.function.fulfillPortal_function;
import fulfillPortal.function.login_function;
import fulfillPortal.function.requestFulfill_function;
import org.testng.annotations.Test;

public class requestFulfillment extends fulfill {
    public String email = "csnew@example.com";
    public String password ="csnew@123";
    @Test
    public void rejectRequestFulfill() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestFulfill();
        requestFulfill_function requestFulfillFunction = new requestFulfill_function(driver);
        requestFulfillFunction.verifyRequestFulfill();
        requestFulfillFunction.rejectRequestFulfill();
        requestFulfillFunction.verifyRejectRequest();
    }
    @Test
    public void createInvoice() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestFulfill();
        requestFulfill_function requestFulfillFunction = new requestFulfill_function(driver);
        requestFulfillFunction.verifyRequestFulfill();
        requestFulfillFunction.createInvoice();
    }
}
