package sellerPortal.page;

import org.openqa.selenium.By;

public class createDomain_page {
    public By customizeRadio = By.xpath("//input[@value='customize']//parent::span");
    public By noteCustomize = By.xpath("//form/div/div[2]/div");
    public By subdomain = By.xpath("//input[@placeholder='Enter domain here']");
    public By domain = By.xpath("//input[@id='name']//following::div[@class='ant-select-selector']");
//    public By valueDomain = By.xpath("//span[contains(text(),'.decorwix.online')]");
    public By valueDomain = By.xpath("//span[contains(text(),'.kinthemain.online')]//parent::div[@class='ant-select-item-option-content']");
    public By verifyValueDomain = By.xpath("//div[@class='ant-select-selector']/span[2]/span");
    //    public By confirmBtn = By.xpath("//button[@value='Confirm']");
    public By confirmBtn = By.xpath("//span[contains(text(),'Confirm')]//parent::button");
    public By domainSellpage = By.xpath("//div[contains(text(),'Domain')]//following::a[1]");
    public By titleEditSellpage = By.xpath("//div[contains(text(),'Edit sellpages')]");
    public By domainVerify = By.xpath("//span[contains(text(),'.rochenianly.space')]//parent::div[@class='ant-select-item-option-content']");
}
