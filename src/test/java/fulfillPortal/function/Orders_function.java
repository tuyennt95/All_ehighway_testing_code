package fulfillPortal.function;

import core.basePage;
import core.common_function;
import fulfillPortal.page.Orders_page;
import org.openqa.selenium.WebDriver;

public class Orders_function extends basePage {
    public Orders_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function(driver);
    Orders_page ordersPage = new Orders_page();
    public void viewOrder1() throws InterruptedException {
        commonFunction.click(ordersPage.OrdersListNav);
        commonFunction.senKeyPrice(ordersPage.search,"BYZ");
        Thread.sleep(3000);
        commonFunction.click(ordersPage.orderNumber1);
    }
    public void verifyOrderPaypal(){
        commonFunction.verifyElement(ordersPage.statusOrder1,"Paid");
        commonFunction.verifyElement(ordersPage.productName1,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
//        commonFunction.verifyElement(ordersPage.variantColor1,"Color: Purple");
//        commonFunction.verifyElement(ordersPage.variantSize1,"Size: S");
//        commonFunction.verifyElement(ordersPage.productCost1,"$6.33");
        commonFunction.verifyElement(ordersPage.quantity1,"1 item");
//        commonFunction.verifyElement(ordersPage.subtotal1,"$6.33");
        commonFunction.verifyElement(ordersPage.shipping1,"$4.99");
//        commonFunction.verifyElement(ordersPage.Total,"$11.32");
        commonFunction.verifyElement(ordersPage.Customer,"Tuyen Nguyen");
        commonFunction.verifyElement(ordersPage.Email,"tuyennt@ehighway.co");
        commonFunction.verifyElement(ordersPage.shippingAddress,"1 Main St\n" +
                "CA\n" +
                "San Jose\n" +
                "US\n" +
                "95131\n" +
                "US");
        commonFunction.verifyElement(ordersPage.BillingAddress,"tuyennt@ehighway.co\n" +
                "Tuyen\n" +
                "Nguyen\n" +
                "US\n" +
                "US");
    }
}
