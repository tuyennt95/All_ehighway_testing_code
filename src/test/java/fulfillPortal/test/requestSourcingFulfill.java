package fulfillPortal.test;

import core.baseTest.fulfill;
import fulfillPortal.function.fulfillPortal_function;
import fulfillPortal.function.login_function;
import fulfillPortal.function.requestSourcing_function;
import org.testng.annotations.Test;

import java.io.IOException;

public class requestSourcingFulfill extends fulfill {
    public String email = "csnew@example.com";
    public String password ="csnew@123";
    @Test(priority = 1)
    public void verifyRequestSourcing() throws InterruptedException, IOException {

        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestSourcingPage();
        requestSourcing_function requestSourcingFunction = new requestSourcing_function(driver);
        requestSourcingFunction.searchRequest();
//        requestSourcingFunction.verifyrequest();
        requestSourcingFunction.verifyDetailRequest();
        requestSourcingFunction.verifyQuickReasonReject();
        requestSourcingFunction.respondByNewProduct();
    }
    @Test
    public void respondFromListProduct() throws InterruptedException, IOException {

        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestSourcingPage();
        requestSourcing_function requestSourcingFunction = new requestSourcing_function(driver);
//        requestSourcingFunction.searchRequest();
//        requestSourcingFunction.verifyrequest();
        requestSourcingFunction.verifyDetailRequest();
        requestSourcingFunction.respondFromList();
    }
    @Test
    public void respondRejectRequest() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestSourcingPage();
        requestSourcing_function requestSourcingFunction = new requestSourcing_function(driver);
        requestSourcingFunction.verifyDetailRequest();
        requestSourcingFunction.verifyQuickReasonReject();
        requestSourcingFunction.respondRejectRequest();
        requestSourcingFunction.verifyRejectDetail();
    }
    @Test
    public void verifyRejectRequestBySeller() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestSourcingPage();
        requestSourcing_function requestSourcingFunction = new requestSourcing_function(driver);
        requestSourcingFunction.searchRequest();
        requestSourcingFunction.verifyRejectRequestBySeller();
    }
    @Test
    public void verifyAcceptRequestBySeller() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestSourcingPage();
        requestSourcing_function requestSourcingFunction = new requestSourcing_function(driver);
        requestSourcingFunction.searchRequest();
        requestSourcingFunction.verifyAcceptRequestBySeller();
    }
    @Test
    public void respondByTheSameProduct() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestSourcingPage();
        requestSourcing_function requestSourcingFunction = new requestSourcing_function(driver);
        requestSourcingFunction.searchRequest();
        requestSourcingFunction.respondByTheSameProduct();
    }
    @Test
    public void verifyRequest() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestSourcingPage();
        requestSourcing_function requestSourcingFunction = new requestSourcing_function(driver);
        requestSourcingFunction.searchRequest();
        requestSourcingFunction.verifyRequest();

    }
    @Test
    public void respondByEditProductSeller() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
        fulfillPortal_function fulfillPortalFunction= new fulfillPortal_function(driver);
        fulfillPortalFunction.viewRequestSourcingPage();
        requestSourcing_function requestSourcingFunction = new requestSourcing_function(driver);
        requestSourcingFunction.searchRequest();
        requestSourcingFunction.respondByEditProductSeller();

    }

}
