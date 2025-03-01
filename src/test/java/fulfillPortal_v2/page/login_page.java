package fulfillPortal_v2.page;

import org.openqa.selenium.By;

public class login_page {
    public By email = By.id("username");
    public By password = By.id("password");
    public By loginBtn=By.xpath("//span[contains(text(),'Login')]//parent::button");
}
