package buyerCheckOut.function;

import buyerCheckOut.page.*;
import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.sellpageRevenue_page;

public class checkout_function extends basePage {
    public checkout_function(WebDriver driver) {
        super(driver);
    }
    public String paypalUsername1 = "tuyennt@ehighway.co";
    public String paypalPassword1 = "eHighway@123";
    common_function commonFunction =new common_function(driver);
    sellpage_page sellpagePage = new sellpage_page();
    sellpageRevenue_page sellpageRevenuePage = new sellpageRevenue_page();
    cart_page cartPage = new cart_page();
    checkout_page checkoutPage = new checkout_page();
    checkout1_page checkout1Page = new checkout1_page();
    thankyou_page thankyouPage = new thankyou_page();
    String mainWindowHandle = driver.getWindowHandle();
    public void paypalCheckout() throws InterruptedException {
        commonFunction.scroll(sellpagePage.countDownTimer);
        commonFunction.click(sellpagePage.paypalBtn);

        commonFunction.switchWindowByTitle("Log in to your PayPal account");
        commonFunction.senKeys(checkoutPage.email,paypalUsername1);
        commonFunction.click(checkoutPage.nextBtn);
        commonFunction.senKeys(checkoutPage.password,paypalPassword1);
        commonFunction.click(checkoutPage.loginBtn);
        Thread.sleep(5000);
        commonFunction.click(checkoutPage.submitBtn);
        driver.switchTo().window(mainWindowHandle);
        commonFunction.verifyElement(thankyouPage.textThankyou,"Thank you. Your order has been received.");
    }
    public void paypalCheckout1() throws InterruptedException {
        commonFunction.scroll(sellpageRevenuePage.sectionVariants);
        commonFunction.click(sellpageRevenuePage.paypalBtn);

        commonFunction.switchWindowByTitle("Log in to your PayPal account");
        commonFunction.senKeys(checkoutPage.email,paypalUsername1);
        commonFunction.click(checkoutPage.nextBtn);
        commonFunction.senKeys(checkoutPage.password,paypalPassword1);
        commonFunction.click(checkoutPage.loginBtn);
        commonFunction.click(checkoutPage.submitBtn);
        driver.switchTo().window(mainWindowHandle);
        commonFunction.verifyElement(thankyouPage.textThankyou,"Thank you. Your order has been received.");
    }
    public void stripeCheckout() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
//        commonFunction.click(sellpagePage.colorPink);
        commonFunction.click(sellpageRevenuePage.colorGray);
        commonFunction.click(sellpagePage.sizeM);
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.click(sellpagePage.addToCartBtn);
        commonFunction.verifyPage(cartPage.cartTitle);
        commonFunction.verifyElement(cartPage.cartTitle,"Your shopping cart");
        commonFunction.click(cartPage.processBtn);
        Assert.assertEquals("Checkout",driver.getTitle());
        commonFunction.senKeys(checkout1Page.email,"tuyennt@ehighway.co");
        commonFunction.senKeys(checkout1Page.firstName,"Tuyen");
        commonFunction.senKeys(checkout1Page.lastName,"Nguyen");
        commonFunction.senKeys(checkout1Page.address,"Nguyen Co Thach");
        commonFunction.senKeys(checkout1Page.city,"Ha Noi");
        commonFunction.click(checkout1Page.country);
        commonFunction.click(checkout1Page.countryValue);
        commonFunction.senKeys(checkout1Page.zipCode,"100000");
        commonFunction.senKeys(checkout1Page.phoneNumber,"0123456789");
        commonFunction.scroll(checkout1Page.placeOrderBtn);
        commonFunction.switchIframe(checkout1Page.iframeStripe);
        commonFunction.senKeys(checkout1Page.cardNumber,"4242424242424242");
        commonFunction.senKeys(checkout1Page.cardExpiration,"0327");
        commonFunction.senKeys(checkout1Page.cardCvv,"123");
        driver.switchTo().defaultContent();
        commonFunction.click(checkout1Page.placeOrderBtn);
        commonFunction.verifyElement(thankyouPage.textThankyou,"Thank you. Your order has been received.");
    }
    public void orderSummary() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.click(sellpagePage.colorPink);
        commonFunction.click(sellpagePage.sizeM);
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.click(sellpagePage.addToCartBtn);
        commonFunction.verifyPage(cartPage.cartTitle);
        commonFunction.verifyElement(cartPage.cartTitle,"Your shopping cart");
        commonFunction.click(cartPage.processBtn);
        Assert.assertEquals("Checkout",driver.getTitle());
        commonFunction.verifyPage(checkout1Page.orderSummary);
        commonFunction.verifyElement(checkout1Page.titleProduct,"Blaze_Sản phẩm test Tracking");
        commonFunction.verifyElement(checkout1Page.colorVariant,"color: Pink");
        commonFunction.verifyElement(checkout1Page.sizeVariant,"Size: M");
        commonFunction.verifyElement(checkout1Page.quantity,"Quantity: 1");
        commonFunction.verifyElement(checkout1Page.subtotal,"$48.33");
        commonFunction.verifyElement(checkout1Page.Subtotal,"$48.33");
//        commonFunction.verifyElement(checkout1Page.Tip,"$0.97");
//        commonFunction.verifyElement(checkout1Page.Shipping,"$4.99");
//        commonFunction.verifyElement(checkout1Page.Total,"$54.29");
    }
    public void verifySectionTip() throws InterruptedException {
        orderSummary();
        commonFunction.verifyPage(checkout1Page.titleTip);
        commonFunction.verifyElement(checkout1Page.noteTip,"We greatly appreciate your generosity, even the tiniest amount help us continue what we're doing");
        commonFunction.verifyPage(checkout1Page.option1);
        System.out.println(commonFunction.getText(checkout1Page.option1));
        commonFunction.verifyElement(checkout1Page.option1,"2%");
        commonFunction.verifyElement(checkout1Page.valueOption1,"$0.97");
        commonFunction.verifyElement(checkout1Page.option2,"5%");
        commonFunction.verifyElement(checkout1Page.valueOption2,"$2.42");
        commonFunction.verifyElement(checkout1Page.option3,"8%");
        commonFunction.verifyElement(checkout1Page.valueOption3,"$3.87");
        commonFunction.verifyElement(checkout1Page.option4,"10%");
        commonFunction.verifyElement(checkout1Page.valueOption4,"$4.83");
        commonFunction.verifyElement(checkout1Page.option5,"15%");
        commonFunction.verifyElement(checkout1Page.valueOption5,"$7.25");
        commonFunction.verifyElement(checkout1Page.noTip,"No tip");
        commonFunction.verifyPage(checkout1Page.customTip);
    }
    public void verifyOrderSummaryOption1() throws InterruptedException {
        orderSummary();
        commonFunction.click(checkout1Page.option1Btn);
        commonFunction.verifyElement(checkout1Page.Tip,"$0.97");
        commonFunction.verifyElement(checkout1Page.Shipping,"$4.99");
        commonFunction.verifyElement(checkout1Page.Total,"$54.29");
    }
    public void verifyOrderSummaryOption2() throws InterruptedException {
        orderSummary();
        commonFunction.click(checkout1Page.option2Btn);
        commonFunction.verifyElement(checkout1Page.Tip,"$2.42");
        commonFunction.verifyElement(checkout1Page.Shipping,"$4.99");
        commonFunction.verifyElement(checkout1Page.Total,"$55.74");
    }
    public void verifyOrderSummaryOption3() throws InterruptedException {
        orderSummary();
        commonFunction.click(checkout1Page.option3Btn);
        commonFunction.verifyElement(checkout1Page.Tip,"$3.87");
        commonFunction.verifyElement(checkout1Page.Shipping,"$4.99");
        commonFunction.verifyElement(checkout1Page.Total,"$57.19");
    }
    public void verifyOrderSummaryOption4() throws InterruptedException {
        orderSummary();
        commonFunction.click(checkout1Page.option4Btn);
        commonFunction.verifyElement(checkout1Page.Tip,"$4.83");
        commonFunction.verifyElement(checkout1Page.Shipping,"$4.99");
        commonFunction.verifyElement(checkout1Page.Total,"$58.15");
    }
    public void verifyOrderSummaryOption5() throws InterruptedException {
        orderSummary();
        commonFunction.click(checkout1Page.option5Btn);
        commonFunction.verifyElement(checkout1Page.Tip,"$7.25");
        commonFunction.verifyElement(checkout1Page.Shipping,"$4.99");
        commonFunction.verifyElement(checkout1Page.Total,"$60.57");
    }
    public void verifyOrderSummaryNoTip() throws InterruptedException {
        orderSummary();
        commonFunction.click(checkout1Page.noTipBtn);
        commonFunction.verifyElement(checkout1Page.Shipping,"$4.99");
        commonFunction.verifyElement(checkout1Page.Total,"$53.32");
    }
    public void verifyOrderSummaryCustomTip() throws InterruptedException {
        orderSummary();
        commonFunction.senKeys(checkout1Page.customTip,"2.99");
        commonFunction.click(checkout1Page.tipUsBtn);
        commonFunction.verifyElement(checkout1Page.Tip,"$2.99");
        commonFunction.verifyElement(checkout1Page.Shipping,"$4.99");
        commonFunction.verifyElement(checkout1Page.Total,"$56.31");
    }
    public void paypalProCheckout() throws InterruptedException {
        commonFunction.scroll(sellpagePage.sectionVariants);
        commonFunction.click(sellpagePage.addToCartBtn);
        commonFunction.verifyPage(cartPage.cartTitle);
        commonFunction.verifyElement(cartPage.cartTitle,"Your shopping cart");
        commonFunction.click(cartPage.processBtn);
        Assert.assertEquals("Checkout",driver.getTitle());
        commonFunction.senKeys(checkout1Page.email,"tuyennt@gmail.com");
        commonFunction.senKeys(checkout1Page.firstName,"Tuyen");
        commonFunction.senKeys(checkout1Page.lastName,"Nguyen");
        commonFunction.senKeys(checkout1Page.address,"Nguyen Co Thach");
        commonFunction.senKeys(checkout1Page.city,"Ha Noi");
        commonFunction.click(checkout1Page.country);
        commonFunction.click(checkout1Page.countryValuePaypalPro);
        commonFunction.senKeys(checkout1Page.zipCode,"100000");
        commonFunction.senKeys(checkout1Page.phoneNumber,"0123456789");
        commonFunction.scroll(checkout1Page.placeOrderBtn);
        commonFunction.switchIframe(checkout1Page.iframePaypal);
        commonFunction.senKeys(checkout1Page.cardNumberPaypal,"4012 8888 8888 1881");
        driver.switchTo().defaultContent();
        commonFunction.switchIframe(checkout1Page.iframeCvv);
        commonFunction.senKeys(checkout1Page.cardCvvPaypal,"123");
        driver.switchTo().defaultContent();
        commonFunction.switchIframe(checkout1Page.iframeDate);
        commonFunction.senKeys(checkout1Page.cardExpirationPaypal,"0327");
        driver.switchTo().defaultContent();
        commonFunction.click(checkout1Page.placeOrderBtn);
        commonFunction.verifyElement(thankyouPage.textThankyou,"Thank you. Your order has been received.");
    }

}

