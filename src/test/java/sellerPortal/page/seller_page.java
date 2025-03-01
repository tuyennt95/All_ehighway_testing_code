package sellerPortal.page;

import org.openqa.selenium.By;

public class seller_page {
    public By nav = By.xpath("//aside");
    public By collapse =By.xpath("//img[@class='ant-image-img sidebar_collapseIcon__9mnvD']");
    public By sellpages =By.xpath("//span[contains(text(),'Sellpages')]//ancestor::div[3]/div");
    public By sellpagesNav = By.xpath("//nav/div/div[2]//span[contains(text(),'Sellpages')]");
    public By sellpageTest = By.xpath("//span[contains(text(),'Sellpages test')]");
    public By searchSellpage = By.xpath("//input[@placeholder ='Search sellpage by domain, creator']");
    public By sellpage1 = By.xpath("//tbody/tr[2]");
    public By linkSellpage1 = By.xpath("//tbody/tr[2]/td/div//a");
    public By action = By.xpath("//tbody/tr[2]/td[7]/div[1]/*[1]");

    public By editSellpageBtn = By.xpath("//span[contains(text(),'Edit sellpage')]");
    public By productsNav = By.xpath("//span[contains(text(),'Products')]");
    public By testProductsNav = By.xpath("//span[contains(text(),'Test products')]");
    public By fulfillableProductsNav = By.xpath("//span[contains(text(),'Fulfillable products')]");
//    public By myProductsNav = By.xpath("//span[contains(text(),'My products')]");
    public By requestManagementNav = By.xpath("//span[contains(text(),'Requests')]//ancestor::div[1]");
    public By requestSourcingNav = By.xpath("//span[contains(text(),'Request sourcing')]//ancestor::div[1]");
    public By requestFulfillNav = By.xpath("//span[contains(text(),'Request fulfill')]//ancestor::div[2]");
    //select team
    public  By filterTeam  = By.xpath("//span[contains(text(),'All team')]//ancestor::div[@class='ant-select-selector']");
    public By searchTeam = By.xpath("//input[@placeholder ='Search by team name']");
    public By teamTester = By.xpath("//div[@title ='Team Tester']");
    public By teamDefaul = By.xpath("//div[@title ='Team Default']");
    public By body = By.xpath("//body");

}
