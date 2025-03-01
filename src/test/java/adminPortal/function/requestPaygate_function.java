package adminPortal.function;

import adminPortal.page.requestPaygate_page;
import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;

public class requestPaygate_function extends basePage {
    public requestPaygate_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function(driver);
    requestPaygate_page requestPaygatePage = new requestPaygate_page();
    public void rejectRequest(){
        commonFunction.click(requestPaygatePage.requestPaygateNav);
        commonFunction.click(requestPaygatePage.Collapse);
        commonFunction.Hover(requestPaygatePage.line1);
        commonFunction.click(requestPaygatePage.actionIcon);
        commonFunction.click(requestPaygatePage.RejectBtn);
        commonFunction.verifyElement(requestPaygatePage.titlePopupReject,"Reason reject request");
        commonFunction.verifyElement(requestPaygatePage.textReason1,"Product is not eligible, is in a restricted category");
        commonFunction.verifyElement(requestPaygatePage.textReason2,"A photo with ID is invalid");
        commonFunction.verifyElement(requestPaygatePage.textReason3,"Invalid utility bill/bank statement");
        commonFunction.verifyElement(requestPaygatePage.textReason4,"Information does not match");
        commonFunction.verifyElement(requestPaygatePage.textReason5,"Information is not eligible");
        commonFunction.click(requestPaygatePage.checkboxReason1);
        commonFunction.click(requestPaygatePage.checkboxReason2);
        commonFunction.click(requestPaygatePage.checkboxReason3);
        commonFunction.click(requestPaygatePage.checkboxReason4);
        commonFunction.click(requestPaygatePage.checkboxReason5);
        commonFunction.click(requestPaygatePage.rejectRequestBtn);
        commonFunction.verifyElement(requestPaygatePage.messageNotify,"Reject success");
    }
    public void configPaygate() throws InterruptedException {
        commonFunction.click(requestPaygatePage.requestPaygateNav);
        commonFunction.click(requestPaygatePage.Collapse);
        commonFunction.Hover(requestPaygatePage.line2);
        commonFunction.click(requestPaygatePage.actionPaypal);
        commonFunction.click(requestPaygatePage.paygateBtn);
        commonFunction.senKeys(requestPaygatePage.searchPaygate,"cs paygate");
        commonFunction.click(requestPaygatePage.paygate01);
        commonFunction.click(requestPaygatePage.conectBtn);
        commonFunction.click(requestPaygatePage.confirmBtn);
        Thread.sleep(7000);
//        commonFunction.verifyPage(requestPaygatePage.messageNotifyAccepted);
    }

}
