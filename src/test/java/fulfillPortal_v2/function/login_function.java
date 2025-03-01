package fulfillPortal_v2.function;

import core.basePage;
import core.common_function;
import fulfillPortal_v2.page.login_page;
import org.openqa.selenium.WebDriver;

public class login_function extends basePage {
    public login_function(WebDriver driver) {
        super(driver);}
    login_page loginPage =new login_page();
    common_function commonFunction =new common_function(driver);
    public void login(String email, String pass) throws InterruptedException {
        commonFunction.senKeys(loginPage.email,email);
        commonFunction.senKeys(loginPage.password,pass);
        commonFunction.click(loginPage.loginBtn);
    }
}
