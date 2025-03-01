package fulfillPortal.page;

import org.openqa.selenium.By;

public class Orders_page {
    public By OrdersListNav = By.xpath("//p[contains(text(),'Orders List')]//ancestor::a");
    public By search = By.xpath("//input[@placeholder='Search by orders, customer name, email, tracking number, transaction ID']");
    public By orderNumber1 = By.xpath("//tbody[@class='MuiTableBody-root css-ceeiht']/tr/td[2]/a");
    //Paypal
    public By statusOrder1 = By.xpath("//div[2]/div/div/span");
    public By productName1 = By.xpath("//span[@class='styles_nameVariant___8z1i']");
    public By variantColor1 = By.xpath("//div[2]/div[2]/span/div");
    public By variantSize1 =By.xpath("//div[@class='styles_productVariantItem__jkXlh' and contains(text(),'Size')]");
    public By productCost1 = By.xpath("//div[@class='styles_productTitle__eHkVL']");
    public By quantity1 = By.xpath("//div[@class='styles_productTitle__eHkVL']//following::div[1]");
    public By subtotal1 =By.xpath("//div[@class='styles_productTitle__eHkVL']//following::div[2]");
    public By subtotal2 = By.xpath("//div[2]/div/div/span");
    public By shipping1 = By.xpath("//div[3]/div[2]/div[3]");
    public By Total = By.xpath("//div[3]/div[3]/div/strong");
    public By Customer = By.xpath("//main/div/div/div/div/div[2]/div/div/div/div/div/div[2]/div");
    public By Email = By.xpath("//main/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div");
    public By shippingAddress = By.xpath("//main/div/div/div/div/div[2]/div/div/div/div/div[3]/div[2]");
    public By BillingAddress = By.xpath("//main/div/div/div/div/div[2]/div/div/div/div/div[4]/div[2]");






}
