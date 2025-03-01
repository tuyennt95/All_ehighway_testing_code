package sellerPortal.page;

import org.openqa.selenium.By;

public class login_page {
    public By email = By.id("email");
    public By password=By.id("password");
    public By loginBtn=By.xpath("//span[contains(text(),'Login')]");
    public By loginLogo = By.xpath("//img[@alt='The Plus One Logo']");

}
