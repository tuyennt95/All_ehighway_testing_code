package sellerPortal.function;

import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.theme_page;

public class theme_function extends basePage {
    public theme_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function(driver);
    theme_page themePage = new theme_page();
    public void hoverImageRevenue(){
        commonFunction.Hover(themePage.imageRevenue);
    }
    public void clickCreateSellpage(){
        commonFunction.click(themePage.createSellpageBtn);
    }
    public void hoverImageFreshsea(){commonFunction.Hover(themePage.imageFreshsea);};
    public void clickCreateSellpage2(){
        commonFunction.click(themePage.creatSellpageFreshseaBtn);
    }
}
