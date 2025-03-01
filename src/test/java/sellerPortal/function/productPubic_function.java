package sellerPortal.function;

import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.fulfillableProduct_page;

public class productPubic_function extends basePage {
    public productPubic_function(WebDriver driver) {
        super(driver);
    }
    fulfillableProduct_page fulfillableProductPage =new fulfillableProduct_page();
    common_function commonFunction =new common_function(driver);
    public void searchProduct(String key) throws InterruptedException {
        commonFunction.senKeys(fulfillableProductPage.search,key);
    }
    public void hoverImage(){
//        Actions action = new Actions(driver);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(publicProductPage.hoverImage));
//        action.moveToElement(element).perform();
//        commonFunction.Hover(fulfillableProductPage.hoverImage);
    }
    public void sellThisProduct() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", publicProductPage.sellThisProductBtn);
//        Thread.sleep(1000);
        commonFunction.click(fulfillableProductPage.sellThisProductBtn);
    }
}
