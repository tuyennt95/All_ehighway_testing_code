package buyerCheckOut.page;

import org.openqa.selenium.By;

public class seller1_page {
    public By email = By.id("email");
    public By password = By.id("password");
    public By loginBtn= By.xpath("//span[contains(text(),'Login')]");
    public By ordersNav= By.xpath("//span[contains(text(),'Orders')]//ancestor::div[1]");
    public By orderNav = By.xpath("//nav/div[1]/div[4]/div[1]");
    public By myOrdesNav= By.xpath("//span[contains(text(),'My orders')]//ancestor::div[3]/div[2]");
    public By collapseNav= By.xpath("//img[@class='ant-image-img sidebar_collapseIcon__9mnvD']");
    public By orderNumber = By.xpath("//form[@id='form-listOrder']//tbody/tr[2]/td[2]/span/a");
    public By myOrderNumber =By.xpath("//tbody/tr[2]/td[3]/span/a");
    //order detail
    public By statusOrder = By.xpath("//div[@class='d-flex']/div[1]");
    public By productName = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div/div/div/div[2]/span/span");
    public By variantColor = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div/div/div/div[2]/span/div/div/div");
    public By variantSize = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div/div/div/div[2]/span/div/div/div[2]");
    public By priceVariant = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div/div/div/div[3]");
    public By quantity = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div/div/div/div[4]");
    public By subtotal1= By.xpath("//div[@title='Order list']/div[2]/div/div/div/div/div/div/div[5]");
    public By subtotal2 = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div[2]/div/div/div/div[2]");
    public By tip = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]");
    public By shipping = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div[2]/div/div/div[3]/div[2]");
    public By shippingPaypalEx = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]");
    public By total = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div[2]/div/div/div[4]/strong");
    public By totalPaypalEx = By.xpath("//div[@title='Order list']/div[2]/div/div/div/div[2]/div/div/div[3]/strong");
    public By customerEmail = By.xpath("//div[2]/div/div/div/div[2]/div[2]");
    public By customerPhoneNumber = By.xpath("//div[contains(text(),'Phone')]//following::div[1]");
    public By customerShippingAddress= By.xpath("//div/div/div[4]/div[2]");
    public By customerBillingAddress = By.xpath("//div[5]/div[2]");

}
