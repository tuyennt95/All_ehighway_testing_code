package buyerCheckOut.function;

import buyerCheckOut.page.seller1_page;
import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

public class seller1_function extends basePage {
    public seller1_function(WebDriver driver) {
        super(driver);
    }
    public String email = "tuyennguyen.aion@example.com";
    public String password = "eHighway@123";
    common_function commonFunction =new common_function(driver);
    seller1_page seller1Page = new seller1_page();
    public void loginSellerPortal(){
        commonFunction.senKeys(seller1Page.email,email);
        commonFunction.senKeys(seller1Page.password,password);
        commonFunction.click(seller1Page.loginBtn);
        Assert.assertEquals("Login | eHighway",driver.getTitle());
    }
    public void viewOrderDetail(){
        commonFunction.click(seller1Page.ordersNav);
        commonFunction.click(seller1Page.collapseNav);
        commonFunction.click(seller1Page.orderNav);
        commonFunction.click(seller1Page.orderNumber);

    }
    public void viewMyOrderDetail(){
        commonFunction.click(seller1Page.collapseNav);
        commonFunction.click(seller1Page.ordersNav);
        commonFunction.click(seller1Page.myOrdesNav);
        commonFunction.click(seller1Page.myOrderNumber);
    }
    public void verifyOrderDetailStripe() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(seller1Page.statusOrder,"Paid");
        commonFunction.verifyElement(seller1Page.productName,"Blaze_Sản phẩm test Tracking");
        commonFunction.verifyElement(seller1Page.variantColor,"Color : Pink");
        commonFunction.verifyElement(seller1Page.variantSize,"Size : M");
        commonFunction.verifyElement(seller1Page.priceVariant,"$48.33");
        commonFunction.verifyElement(seller1Page.quantity,"1");
        commonFunction.verifyElement(seller1Page.subtotal1,"$48.33");
        commonFunction.verifyElement(seller1Page.subtotal2,"$48.33");
        commonFunction.verifyElement(seller1Page.tip,"$0.97");
        commonFunction.verifyElement(seller1Page.shipping,"$4.99");
        commonFunction.verifyElement(seller1Page.total,"$54.29");
        commonFunction.verifyElement(seller1Page.customerEmail,"tuyennt@ehighway.co");
        commonFunction.verifyElement(seller1Page.customerPhoneNumber,"0123456789");
        commonFunction.verifyElement(seller1Page.customerShippingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, Nguyen Co Thach, Ha Noi, Afghanistan, 100000, 0123456789, AF,");
        commonFunction.verifyElement(seller1Page.customerBillingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, Nguyen Co Thach, Ha Noi, Afghanistan, 100000, 0123456789, AF,");
    }
    public void verifyMyOrderDetailPaypal() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(seller1Page.statusOrder,"Paid");
        commonFunction.verifyElement(seller1Page.productName,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(seller1Page.variantColor,"Color : Purple");
        commonFunction.verifyElement(seller1Page.variantSize,"Size : S");
        commonFunction.verifyElement(seller1Page.priceVariant,"$50");
        commonFunction.verifyElement(seller1Page.quantity,"1");
        commonFunction.verifyElement(seller1Page.subtotal1,"$50.00");
        commonFunction.verifyElement(seller1Page.subtotal2,"$50.00");
//        commonFunction.verifyElement(seller1Page.tip,"$0.97");
//        commonFunction.verifyElement(seller1Page.shipping,"$0");
//        commonFunction.verifyElement(seller1Page.total,"$50.00");
        commonFunction.verifyElement(seller1Page.customerEmail,"tuyennt@ehighway.co");
//        commonFunction.verifyElement(seller1Page.customerPhoneNumber,"0123456789");
        commonFunction.verifyElement(seller1Page.customerShippingAddress,"1 Main St, CA, San Jose, US, 95131, US,");
        commonFunction.verifyElement(seller1Page.customerBillingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, US, US,");
    }
    public void verifyOrderPaypal() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(seller1Page.statusOrder,"Paid");
        commonFunction.verifyElement(seller1Page.productName,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(seller1Page.variantColor,"Color : Purple");
        commonFunction.verifyElement(seller1Page.variantSize,"Size : S");
        commonFunction.verifyElement(seller1Page.priceVariant,"$50");
        commonFunction.verifyElement(seller1Page.quantity,"1");
        commonFunction.verifyElement(seller1Page.subtotal1,"$50.00");
        commonFunction.verifyElement(seller1Page.subtotal2,"$50.00");
        commonFunction.verifyElement(seller1Page.shippingPaypalEx,"$0");
        commonFunction.verifyElement(seller1Page.totalPaypalEx,"$50");
        commonFunction.verifyElement(seller1Page.customerEmail,"tuyennt@ehighway.co");
        commonFunction.verifyElement(seller1Page.customerShippingAddress,"1 Main St, CA, San Jose, US, 95131, US,");
        commonFunction.verifyElement(seller1Page.customerBillingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, US, US,");
    }
    public void verifyMyOrderStripe() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(seller1Page.statusOrder,"Paid");
        commonFunction.verifyElement(seller1Page.productName,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(seller1Page.variantColor,"Color : Gray");
        commonFunction.verifyElement(seller1Page.variantSize,"Size : M");
        commonFunction.verifyElement(seller1Page.priceVariant,"$51");
        commonFunction.verifyElement(seller1Page.quantity,"1");
        commonFunction.verifyElement(seller1Page.subtotal1,"$51.00");
        commonFunction.verifyElement(seller1Page.subtotal2,"$51.00");
        commonFunction.verifyElement(seller1Page.tip,"$2.55");
        commonFunction.verifyElement(seller1Page.shipping,"$5.99");
        commonFunction.verifyElement(seller1Page.total,"$59.54");
        commonFunction.verifyElement(seller1Page.customerEmail,"tuyennt@ehighway.co");
        commonFunction.verifyElement(seller1Page.customerPhoneNumber,"0123456789");
        commonFunction.verifyElement(seller1Page.customerShippingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, Nguyen Co Thach, Ha Noi, Afghanistan, 100000, 0123456789, AF,");
        commonFunction.verifyElement(seller1Page.customerBillingAddress,"tuyennt@ehighway.co, Tuyen, Nguyen, Nguyen Co Thach, Ha Noi, Afghanistan, 100000, 0123456789, AF,");

    }
}

