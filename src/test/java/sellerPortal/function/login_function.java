package sellerPortal.function;

import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.login_page;

public class login_function extends basePage {
    public login_function(WebDriver driver) {
        super(driver);
    }
    login_page loginPage =new login_page();
    common_function commonFunction =new common_function(driver);
    public void login(String email, String pass) throws InterruptedException {
        commonFunction.senKeys(loginPage.email,email);
        commonFunction.senKeys(loginPage.password,pass);
        commonFunction.click(loginPage.loginBtn);
        commonFunction.verifyPage(loginPage.loginLogo);
    }
}
