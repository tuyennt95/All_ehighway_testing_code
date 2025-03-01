package fulfillPortal.page;

import org.openqa.selenium.By;

public class login_page {
    public By email = By.id("email");
    public By password=By.id("auth-login-password");
    public By loginBtn=By.xpath("//button[contains(text(),'Login')]");

}
