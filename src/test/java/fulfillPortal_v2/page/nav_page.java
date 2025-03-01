package fulfillPortal_v2.page;

import org.openqa.selenium.By;

public class nav_page {
    public By productsNav = By.xpath("//span[contains(text(),'Products')]//ancestor::li");
    public By ordersNav = By.xpath("//span[contains(text(),'Orders')]//ancestor::li");
    public By requestsNav = By.xpath("//span[contains(text(),'Requests')]//ancestor::li");
    public By requestSourcingNav = By.xpath("//span[contains(text(),'Request Sourcing')]//ancestor::li[1]");
    public By requestFulfillNav = By.xpath("//span[contains(text(),'Request Fulfill')]//ancestor::li[1]");


}
