package sellerPortal.test;

import core.baseTest.seller;
import org.testng.annotations.Test;
import sellerPortal.function.login_function;

public class login extends seller {
    public String email = "soyero8019@ociun.com";
    public String password = "soyero8019@123";
    @Test
    public void login() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
    }
}
