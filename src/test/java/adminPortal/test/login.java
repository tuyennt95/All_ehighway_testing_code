package adminPortal.test;

import adminPortal.function.login_function;
import core.baseTest.admin;
import org.junit.Test;

public class login extends admin {
    @Test
    public void loginAdmin(){
        login_function loginFunction = new login_function(driver);
        loginFunction.loginAdmin();
    }
}
