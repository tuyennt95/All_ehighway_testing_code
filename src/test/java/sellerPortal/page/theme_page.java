package sellerPortal.page;

import org.openqa.selenium.By;

public class theme_page {
    public By imageRevenue = By.xpath("//header[contains(text(),'Revenue')]/preceding::img[1]");
    public By imageFreshsea = By.xpath("//header[contains(text(),'Fresh sea')]/preceding::img[1]");

    //    public By createSellpageBtn = By.xpath("//div[@class='ant-modal-content']/div[2]/div[1]/article[3]/div/div/div[1]/div/button");
    public By createSellpageBtn = By.xpath("//header[contains(text(),'Revenue')]/preceding::button[contains(text(),'Apply and create domain')][1]");

    public By creatSellpageFreshseaBtn =By.xpath("//button[contains(text(),'Apply and create domain')]");

}
