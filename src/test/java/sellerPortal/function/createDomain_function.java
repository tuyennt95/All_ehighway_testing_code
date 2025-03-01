package sellerPortal.function;

import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.createDomain_page;

public class createDomain_function extends basePage {
    public String domain1 = ".devshop.theplus1.net";
    public String domain2 = ".kinthemain.online";
    public String domain3 = ".rochenianly.space";
    public createDomain_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction =new common_function(driver);
    createDomain_page createDomainPage = new createDomain_page();

    public String randomSubdomain(){
        String subdomain = RandomStringUtils.randomAlphabetic(10);
        return subdomain;
    }

    public void createSubdomain() throws InterruptedException {
        commonFunction.senKeys(createDomainPage.subdomain,randomSubdomain());
    }
    public void createTPODomain() throws InterruptedException {
        commonFunction.senKeys(createDomainPage.subdomain,randomSubdomain());
        String subdomain = commonFunction.getValue(createDomainPage.subdomain);
//        System.out.println(subdomain);
        commonFunction.verifyElement(createDomainPage.verifyValueDomain,domain1);
        String domain = "https://" + subdomain + domain1;
        System.out.println(domain);
        Thread.sleep(2000);
        commonFunction.click(createDomainPage.confirmBtn);
        Thread.sleep(2000);
        commonFunction.verifyPage(createDomainPage.titleEditSellpage);
        Assert.assertEquals(domain,commonFunction.getText(createDomainPage.domainSellpage));
    }
    public void createCustomizeDomain() throws InterruptedException {
        commonFunction.click(createDomainPage.customizeRadio);
        commonFunction.verifyPage(createDomainPage.noteCustomize);
        commonFunction.verifyElement(createDomainPage.noteCustomize,"DNS changes can take up to 10 minutes to apply.");
        commonFunction.senKeys(createDomainPage.subdomain,randomSubdomain());
        String subdomain = commonFunction.getValue(createDomainPage.subdomain);
//        System.out.println(subdomain);
        commonFunction.click(createDomainPage.domain);
        commonFunction.click(createDomainPage.valueDomain);

        commonFunction.verifyElement(createDomainPage.verifyValueDomain,domain2);
        String domain = "https://" + subdomain + domain2;
        System.out.println(domain);
        Thread.sleep(2000);
        commonFunction.click(createDomainPage.confirmBtn);
        Thread.sleep(2000);
        commonFunction.verifyPage(createDomainPage.titleEditSellpage);
        Assert.assertEquals(domain,commonFunction.getText(createDomainPage.domainSellpage));
    }
   public void createCustomizeDomainVerify() throws InterruptedException {
       commonFunction.click(createDomainPage.customizeRadio);
       commonFunction.verifyPage(createDomainPage.noteCustomize);
       commonFunction.verifyElement(createDomainPage.noteCustomize,"DNS changes can take up to 10 minutes to apply.");
       commonFunction.senKeys(createDomainPage.subdomain,randomSubdomain());
       String subdomain = commonFunction.getValue(createDomainPage.subdomain);
//        System.out.println(subdomain);
       commonFunction.click(createDomainPage.domain);
       commonFunction.click(createDomainPage.domainVerify);

       commonFunction.verifyElement(createDomainPage.verifyValueDomain,".rochenianly.space");
       String domain = "https://" + subdomain +domain3;
       System.out.println(domain);
       Thread.sleep(2000);
       commonFunction.click(createDomainPage.confirmBtn);
       Thread.sleep(2000);
       commonFunction.verifyPage(createDomainPage.titleEditSellpage);
       Assert.assertEquals(domain,commonFunction.getText(createDomainPage.domainSellpage));

   }

}
