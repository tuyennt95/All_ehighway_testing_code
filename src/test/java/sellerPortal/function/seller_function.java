package sellerPortal.function;

import buyerCheckOut.page.seller1_page;
import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.seller_page;

public class seller_function extends basePage {
    public seller_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function(driver);
    seller_page sellerPage = new seller_page();
    seller1_page seller1Page = new seller1_page();
    public void viewEditSellpgage() throws InterruptedException {
        commonFunction.click(sellerPage.collapse);
        commonFunction.click(sellerPage.sellpages);
        Thread.sleep(5000);
        commonFunction.click(sellerPage.sellpageTest);
        Thread.sleep(5000);
        commonFunction.click(sellerPage.sellpage1);
//        Thread.sleep(5000);
//        commonFunction.click(sellerPage.action);
//        commonFunction.click(sellerPage.editSellpageBtn);
    }
    public void Sellpgage1() throws InterruptedException {
        commonFunction.click(sellerPage.collapse);
        commonFunction.click(sellerPage.sellpages);
        Thread.sleep(5000);
        commonFunction.click(sellerPage.sellpageTest);
        Thread.sleep(5000);
        commonFunction.click(sellerPage.linkSellpage1);
//        Thread.sleep(5000);
//        commonFunction.click(sellerPage.action);
//        commonFunction.click(sellerPage.editSellpageBtn);
    }
    public void sellpage1() throws InterruptedException {
        commonFunction.click(sellerPage.collapse);
        commonFunction.click(sellerPage.sellpages);
        Thread.sleep(5000);
        commonFunction.click(sellerPage.sellpagesNav);
        Thread.sleep(5000);
        commonFunction.click(sellerPage.linkSellpage1);
    }
    public void sellpageSearch() throws InterruptedException {
        commonFunction.click(sellerPage.collapse);
        commonFunction.click(sellerPage.sellpages);
        Thread.sleep(5000);
        commonFunction.click(sellerPage.sellpagesNav);
        Thread.sleep(5000);
        commonFunction.senKeys(sellerPage.searchSellpage,"ycjhinuqls.rochenianly.space");
        Thread.sleep(1000);
        commonFunction.click(sellerPage.linkSellpage1);
    }
    public void selectTeam() throws InterruptedException {
        commonFunction.click(sellerPage.filterTeam);
        commonFunction.senKeys(sellerPage.searchTeam,"Team Tester");
        commonFunction.click(sellerPage.teamTester);
//        commonFunction.click(sellerPage.teamDefaul);
        commonFunction.click(sellerPage.body);
        Thread.sleep(3000);
    }
    public void selectDefaultTeam () throws InterruptedException {
        commonFunction.click(sellerPage.filterTeam);
        commonFunction.senKeys(sellerPage.searchTeam,"Team Default");
        commonFunction.click(sellerPage.teamDefaul);
        commonFunction.click(sellerPage.body);
        Thread.sleep(3000);}

    public  void viewTestProducts() throws InterruptedException {
        commonFunction.Hover(sellerPage.nav);
        commonFunction.click(sellerPage.collapse);
        commonFunction.click(sellerPage.productsNav);
        commonFunction.click(sellerPage.testProductsNav);
        Thread.sleep(2000);
        commonFunction.click(sellerPage.collapse);
    }
    public  void viewFulfillableProducts() throws InterruptedException {
        commonFunction.Hover(sellerPage.nav);
        commonFunction.click(sellerPage.collapse);
        commonFunction.click(sellerPage.productsNav);
        commonFunction.click(sellerPage.fulfillableProductsNav);
        Thread.sleep(2000);
        commonFunction.click(sellerPage.collapse);
    }
    public void viewRequestSourcing() throws InterruptedException {
        commonFunction.Hover(sellerPage.nav);
        commonFunction.click(sellerPage.collapse);
        commonFunction.click(sellerPage.requestManagementNav);
        commonFunction.click(sellerPage.requestSourcingNav);
        Thread.sleep(2000);
        commonFunction.click(sellerPage.collapse);
    }
    public void viewMyOrderPage(){
        commonFunction.click(seller1Page.collapseNav);
        commonFunction.click(seller1Page.ordersNav);
        commonFunction.click(seller1Page.myOrdesNav);
    }
    public void viewRequestFulfill() throws InterruptedException {
        commonFunction.Hover(sellerPage.nav);
        commonFunction.click(sellerPage.collapse);
        commonFunction.click(sellerPage.requestManagementNav);
        commonFunction.click(sellerPage.requestFulfillNav);
        Thread.sleep(2000);
        commonFunction.click(sellerPage.collapse);
    }
}
