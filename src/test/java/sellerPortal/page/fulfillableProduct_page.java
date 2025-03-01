package sellerPortal.page;

import org.openqa.selenium.By;

public class fulfillableProduct_page {
    public By search  = By.xpath("//input[@placeholder='Search product name, creator']");
    public By linkProduct1 =By.xpath("//tbody/tr[2]/td[2]/a");
    public By sellThisProductBtn = By.xpath("//span[contains(text(),'Sell this product')]/ancestor::button");

}
