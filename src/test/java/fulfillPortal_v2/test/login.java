package fulfillPortal_v2.test;

import core.baseTest.fulfill_v2;
import org.testng.annotations.Test;
import fulfillPortal_v2.function.login_function;

public class login extends fulfill_v2 {
    public String email = "fulfiller@demo.com";
    public String password ="fulfiller@123";
    @Test
    public void login() throws InterruptedException {
        login_function loginFunction = new login_function(driver);
        loginFunction.login(email,password);
    }
}
