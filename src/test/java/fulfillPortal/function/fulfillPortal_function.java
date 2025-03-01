package fulfillPortal.function;

import core.basePage;
import core.common_function;
import fulfillPortal.page.fulfillPortal_page;
import org.openqa.selenium.WebDriver;

public class fulfillPortal_function extends basePage {
    public fulfillPortal_function(WebDriver driver) {
        super(driver);
    }
    fulfillPortal_page fulfillPortalPage =new fulfillPortal_page();
    common_function commonFunction =new common_function(driver);
    public void viewAddProductPage() {
        commonFunction.verifyPage(fulfillPortalPage.Fulfill);
        commonFunction.click(fulfillPortalPage.productNav);
        commonFunction.click(fulfillPortalPage.addProductBtn);
    }
    public void viewEditProductPage() throws InterruptedException {
        commonFunction.verifyPage(fulfillPortalPage.Fulfill);
        commonFunction.click(fulfillPortalPage.productNav);
        Thread.sleep(5000);
        commonFunction.click(fulfillPortalPage.productName);
        commonFunction.click(fulfillPortalPage.editBtn);
//        commonFunction.verifyPage(addProductPage.editSellpageTitle);
    }
    public void viewRequestSourcingPage(){
        commonFunction.click(fulfillPortalPage.requestManagementNav);
    }
    public void viewRequestFulfill(){
        commonFunction.click(fulfillPortalPage.requestManagementNav);
        commonFunction.click(fulfillPortalPage.requestFulfillTab);
    }
}
