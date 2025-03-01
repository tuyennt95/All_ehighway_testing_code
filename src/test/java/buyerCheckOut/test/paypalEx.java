package buyerCheckOut.test;

import buyerCheckOut.function.checkout_function;
import core.baseTest.buyer;
import org.testng.annotations.Test;

public class paypalEx extends buyer {
    @Test(priority= 1 )
    public void paypalCheckout() throws InterruptedException {
        checkout_function checkoutFunction = new checkout_function(driver);
        checkoutFunction.paypalCheckout();
    }
    @Test
    public void orders() throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
            setup();
            paypalCheckout();
            teardown();
            i++;
        }
    }
}
