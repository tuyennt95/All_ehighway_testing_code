package sellerPortal.function;

import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.sellpageRevenue_page;

public class sellpageRevenue_function extends basePage {
    public sellpageRevenue_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function(driver);
     sellpageRevenue_page sellpageRevenuePage = new sellpageRevenue_page();
     public void verifyRevenueSellpage() throws InterruptedException {
         commonFunction.switchWindowByTitle("Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");

         driver.navigate().refresh();
         Thread.sleep(100000);
         driver.navigate().refresh();

         Thread.sleep(3000);
         commonFunction.verifyElement(sellpageRevenuePage.announcement,"Sale Upto 30%");
         commonFunction.verifyElement(sellpageRevenuePage.sellpageTitle,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
//         commonFunction.verifyElement(sellpageRevenuePage.priceVariant,"$50.00");
         commonFunction.scroll(sellpageRevenuePage.sectionVariants);
         commonFunction.click(sellpageRevenuePage.sizeM);
         commonFunction.verifyElement(sellpageRevenuePage.priceVariant,"$51.00");
         commonFunction.click(sellpageRevenuePage.sizeS);
         commonFunction.scroll(sellpageRevenuePage.sectionVariants);
         Thread.sleep(1000);
         commonFunction.click(sellpageRevenuePage.addToCartBtn);
         commonFunction.verifyElement(sellpageRevenuePage.subtotalCart,"$50.00");
         commonFunction.verifyElement(sellpageRevenuePage.shippingCart,"$0.00");
         commonFunction.verifyElement(sellpageRevenuePage.totalCart,"$50.00");
         //tang 1 bien the
         commonFunction.click(sellpageRevenuePage.iconIncreaseCart);
         Thread.sleep(500);
         commonFunction.verifyElement(sellpageRevenuePage.subtotalCart,"$100.00");
         commonFunction.verifyElement(sellpageRevenuePage.valueQuantityDiscount,"-$20.00");
         commonFunction.verifyElement(sellpageRevenuePage.shippingCart,"$5.99");
         commonFunction.verifyElement(sellpageRevenuePage.totalCart,"$85.99");
         //tang 2 bien the
         commonFunction.click(sellpageRevenuePage.iconIncreaseCart);
         commonFunction.verifyElement(sellpageRevenuePage.subtotalCart,"$150.00");
         commonFunction.verifyElement(sellpageRevenuePage.valueQuantityDiscount,"-$30.00");
         commonFunction.verifyElement(sellpageRevenuePage.shippingCart,"$3.99");
         commonFunction.verifyElement(sellpageRevenuePage.totalCart,"$123.99");

         commonFunction.click(sellpageRevenuePage.closeCartBtn);
         commonFunction.scroll(sellpageRevenuePage.sectionTemOfPolicy);
         commonFunction.verifyPage(sellpageRevenuePage.sectionTemOfPolicy);

         commonFunction.scroll(sellpageRevenuePage.logo);
         Thread.sleep(60000);
         commonFunction.verifyElement(sellpageRevenuePage.textCountDownTimer,"Low stock! Order now to secure your items.");

     }
     public void swithSellpage(){
         commonFunction.switchWindowByTitle("Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
     }
}
