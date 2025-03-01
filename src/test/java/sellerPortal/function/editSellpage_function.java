package sellerPortal.function;

import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.editSellpage_page;

public class editSellpage_function extends basePage {
    public editSellpage_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction = new common_function(driver);
    editSellpage_page editSellpagePage = new editSellpage_page();
    public void verifyCreateSellpage(){
        commonFunction.verifySellerPage(editSellpagePage.titleEditSellpage);
    }
    public void editSellpagePage(){
        commonFunction.switchWindowByTitle("Edit sellpage");
    }
    public void chooseLogo(){
        commonFunction.click(editSellpagePage.chooseLogo);
    }
    public  void uploadFileLogo() throws InterruptedException {
//        String filePath= System.getProperty("user.dir")+"\\Aion\\logo";
        commonFunction.uploadFile(editSellpagePage.chooseLogo,"D:\\Aion\\mau-logo-dep.jpg");
    }
    public void uploadFivacon() throws InterruptedException {
        commonFunction.uploadFile(editSellpagePage.chooseFavicon,"D:\\Aion\\icon.jpg");
    }
    public void scrollToTitle() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.titleSellpage);
    }
    public void editTitleSellpage() throws InterruptedException {
        commonFunction.senKeyPrice(editSellpagePage.titleSellpage,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
    }
    public void uploadMedia() throws InterruptedException {
        commonFunction.uploadFile(editSellpagePage.addMedia,"D:\\Aion\\logo.png");
    }
    public void editPriceVariants() throws InterruptedException {
        commonFunction.senKeyPrice(editSellpagePage.priceVariant1,"50");
        commonFunction.senKeyPrice(editSellpagePage.priceVariant2,"51");
    }
    public void setBulkVariants(){
        commonFunction.click(editSellpagePage.filter);
        commonFunction.verifyElement(editSellpagePage.textColor,"Color");
        commonFunction.verifyElement(editSellpagePage.textCheckboxV1,"Purple");
        commonFunction.verifyElement(editSellpagePage.textCheckboxV2,"Gray");
        commonFunction.verifyElement(editSellpagePage.textCheckboxV3,"Blue");
        commonFunction.verifyElement(editSellpagePage.textSize,"Size");
        commonFunction.verifyElement(editSellpagePage.textCheckboxV4,"S");
        commonFunction.verifyElement(editSellpagePage.textCheckboxV5,"M");
        commonFunction.verifyElement(editSellpagePage.textCheckboxV6,"L");
//sizeS
        commonFunction.click(editSellpagePage.checkboxColor);
        commonFunction.click(editSellpagePage.checkboxV4);
        commonFunction.click(editSellpagePage.OKBtn);

        commonFunction.verifyElement(editSellpagePage.colorV1,"Color: Purple");
        commonFunction.verifyElement(editSellpagePage.sizeV1,"Size: S");

        commonFunction.verifyElement(editSellpagePage.colorV2,"Color: Gray");
        commonFunction.verifyElement(editSellpagePage.sizeV2,"Size: S");

        commonFunction.verifyElement(editSellpagePage.colorV3,"Color: Blue");
        commonFunction.verifyElement(editSellpagePage.sizeV3,"Size: S");

        commonFunction.click(editSellpagePage.selectAll);
        commonFunction.verifyElement(editSellpagePage.titleBulk,"Set bulk for 3 selected variants");
        commonFunction.senKeyPrice(editSellpagePage.priceBulk,"50");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceBulk,"150");
        commonFunction.click(editSellpagePage.applyBtn);

        commonFunction.verifyValueElement(editSellpagePage.priceV1,"50");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV1,"150");

        commonFunction.verifyValueElement(editSellpagePage.priceV2,"50");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV2,"150");

        commonFunction.verifyValueElement(editSellpagePage.priceV3,"50");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV3,"150");
        commonFunction.click(editSellpagePage.iconX);
//sizeM
        commonFunction.click(editSellpagePage.filter);
        commonFunction.click(editSellpagePage.checkboxColor);
        commonFunction.click(editSellpagePage.checkboxV4);
        commonFunction.click(editSellpagePage.checkboxV5);
        commonFunction.click(editSellpagePage.OKBtn);

        commonFunction.verifyElement(editSellpagePage.colorV1,"Color: Purple");
        commonFunction.verifyElement(editSellpagePage.sizeV1,"Size: M");

        commonFunction.verifyElement(editSellpagePage.colorV2,"Color: Gray");
        commonFunction.verifyElement(editSellpagePage.sizeV2,"Size: M");

        commonFunction.verifyElement(editSellpagePage.colorV3,"Color: Blue");
        commonFunction.verifyElement(editSellpagePage.sizeV3,"Size: M");

        commonFunction.click(editSellpagePage.selectAll);
        commonFunction.verifyElement(editSellpagePage.titleBulk,"Set bulk for 3 selected variants");
        commonFunction.senKeyPrice(editSellpagePage.priceBulk,"51");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceBulk,"153");
        commonFunction.click(editSellpagePage.applyBtn);

        commonFunction.verifyValueElement(editSellpagePage.priceV1,"51");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV1,"153");

        commonFunction.verifyValueElement(editSellpagePage.priceV2,"51");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV2,"153");

        commonFunction.verifyValueElement(editSellpagePage.priceV3,"51");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV3,"153");
        commonFunction.click(editSellpagePage.iconX);
//size L
        commonFunction.click(editSellpagePage.filter);
        commonFunction.click(editSellpagePage.checkboxColor);
        commonFunction.click(editSellpagePage.checkboxV5);
        commonFunction.click(editSellpagePage.checkboxV6);
        commonFunction.click(editSellpagePage.OKBtn);

        commonFunction.verifyElement(editSellpagePage.colorV1,"Color: Purple");
        commonFunction.verifyElement(editSellpagePage.sizeV1,"Size: L");

        commonFunction.verifyElement(editSellpagePage.colorV2,"Color: Gray");
        commonFunction.verifyElement(editSellpagePage.sizeV2,"Size: L");

        commonFunction.verifyElement(editSellpagePage.colorV3,"Color: Blue");
        commonFunction.verifyElement(editSellpagePage.sizeV3,"Size: L");

        commonFunction.click(editSellpagePage.selectAll);
        commonFunction.verifyElement(editSellpagePage.titleBulk,"Set bulk for 3 selected variants");
        commonFunction.senKeyPrice(editSellpagePage.priceBulk,"52");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceBulk,"156");
        commonFunction.click(editSellpagePage.applyBtn);

        commonFunction.verifyValueElement(editSellpagePage.priceV1,"52");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV1,"156");

        commonFunction.verifyValueElement(editSellpagePage.priceV2,"52");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV2,"156");

        commonFunction.verifyValueElement(editSellpagePage.priceV3,"52");
        commonFunction.verifyValueElement(editSellpagePage.comparePriceV3,"156");
        commonFunction.click(editSellpagePage.iconX);


    }
    public void editDescription() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.iframeDescription);
        commonFunction.switchIframe(editSellpagePage.iframeDescription);
        commonFunction.senKeys(editSellpagePage.description,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n"+
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
    }
    public void selectUpsellBuilder() throws InterruptedException {
        commonFunction.selectDropdown(editSellpagePage.selectTitle,"Upsell Builder");
    }
    public void clickQuantityDiscount(){
        commonFunction.click(editSellpagePage.addQuantityDiscount);
    }
    public void inputDiscount1() throws InterruptedException {
        commonFunction.senKeys(editSellpagePage.inputDiscount1,"20");
    }
    public void addReview() throws InterruptedException {
        commonFunction.click(editSellpagePage.addReview);
        commonFunction.senKeys(editSellpagePage.nameReview,"Tuyen Nguyen");
        commonFunction.senKeys(editSellpagePage.emailReview,"tuyennt@ehighway.co");
        commonFunction.senKeys(editSellpagePage.titleReview,"Product");
//        commonFunction.uploadFile(editSellpagePage.addImageReview,"D:\\Aion\\logo.png");
        commonFunction.uploadFile(editSellpagePage.addImageReview,"D:\\Aion\\ảnh test\\áo\\áo tím.webp");
        Thread.sleep(2000);
        commonFunction.senKeys(editSellpagePage.descriptionReview,"Nice product good value for money");
        commonFunction.click(editSellpagePage.saveReviewBtn);
    }
    public void createCombo() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.upsell);
        commonFunction.click(editSellpagePage.addCombo);

        commonFunction.click(editSellpagePage.addImageCombo);
//        commonFunction.switchIframe(editSellpagePage.iframeImageCombo);

        commonFunction.click(editSellpagePage.imageCombo);
        driver.switchTo().defaultContent();
        commonFunction.click(editSellpagePage.addVariansBtn);
        commonFunction.click(editSellpagePage.selectVariant);

//        commonFunction.switchIframe(editSellpagePage.iframeVariantCombo);
        commonFunction.click(editSellpagePage.variantCombo1);

        commonFunction.click(editSellpagePage.addVariansBtn);
        commonFunction.click(editSellpagePage.selectVariant);
        commonFunction.click(editSellpagePage.variantCombo2);
//        commonFunction.selectByVisibleText(editSellpagePage.selectVariant,"Purple - M ");
        commonFunction.senKeys(editSellpagePage.comboName,"Set couple");
        commonFunction.senKeyPrice(editSellpagePage.comboPrice,"80");
        commonFunction.senKeyPrice(editSellpagePage.compareComboPrice,"95");
    }
    public void createAnnouncementBar() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.sectionDescription);
        commonFunction.senKeys(editSellpagePage.inputAnnouncementBar,"Sale Upto 30%");
        commonFunction.verifyValueElement(editSellpagePage.inputAnnouncementBar,"Sale Upto 30%");
    }
    public void ShippingSetting() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.sectionShippingPrice);
        commonFunction.verifyElement(editSellpagePage.textOption1,"Subtotal based shipping rule");
        commonFunction.verifyElement(editSellpagePage.textOption1Btn,"Create subtotal based on shipping rule");
        commonFunction.click(editSellpagePage.option1Btn);
        commonFunction.scroll(editSellpagePage.sectionAsSeenOn);
        commonFunction.click(editSellpagePage.textOption1);
        commonFunction.verifyElement(editSellpagePage.dkShipSetting,">=");
        commonFunction.senKeyPrice(editSellpagePage.inputShipSetting,"51");
        commonFunction.verifyValueElement(editSellpagePage.inputShipSetting,"51");
        commonFunction.senKeyPrice(editSellpagePage.valueShippingOption1,"5.99");
        commonFunction.verifyValueElement(editSellpagePage.valueShippingOption1,"5.99");
        commonFunction.verifyElement(editSellpagePage.textAddOneMoreBtn,"Add one more");
        commonFunction.click(editSellpagePage.AddOneMoreBtn);
        commonFunction.senKeyPrice(editSellpagePage.inpunShipSetting2,"101");
        commonFunction.verifyValueElement(editSellpagePage.inpunShipSetting2,"101");
        commonFunction.senKeyPrice(editSellpagePage.valueShipSetting2,"3.99");
        commonFunction.verifyValueElement(editSellpagePage.valueShipSetting2,"3.99");
    }
    public void SetupCountDownTimer() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.sectionCountDownTimer);
        commonFunction.verifyElement(editSellpagePage.sectionCountDownTimer,"Countdown Timer");
        commonFunction.verifyElement(editSellpagePage.textSetIfEnd,"After countdown timer ends");
        commonFunction.verifyValueElement(editSellpagePage.durationInput,"15");
        commonFunction.verifyElement(editSellpagePage.valueOption1,"Repeat Countdown Timer after it ends");
        commonFunction.verifyElement(editSellpagePage.valueOption2,"Show text after it ends");
        commonFunction.verifyValueElement(editSellpagePage.textIfEnd,"Hurry up. This deal will end soon!!");
        commonFunction.verifyElement(editSellpagePage.textDisplay,"Display timer countdown in:");
        commonFunction.verifyElement(editSellpagePage.textDays,"Days");
        commonFunction.verifyElement(editSellpagePage.textHours,"Hours");
        commonFunction.verifyElement(editSellpagePage.textMinutes,"Minutes");
        commonFunction.verifyElement(editSellpagePage.textSeconds,"Seconds");
        commonFunction.verifyElement(editSellpagePage.textMilisecond,"Milisecond");
        commonFunction.senKeyPrice(editSellpagePage.durationInput,"1");
        commonFunction.verifyValueElement(editSellpagePage.durationInput,"1");
        commonFunction.senKeyPrice(editSellpagePage.textIfEnd,"Low stock! Order now to secure your items.");
        commonFunction.verifyValueElement(editSellpagePage.textIfEnd,"Low stock! Order now to secure your items.");
    }
    public void setupImageWithText() throws InterruptedException {
//        commonFunction.scroll(editSellpagePage.sectionImageWithText);
        commonFunction.verifyElement(editSellpagePage.textAddImageWithTextBTn,"Add image with text");

        commonFunction.click(editSellpagePage.textAddImageWithTextBTn);
        commonFunction.scroll(editSellpagePage.sectionAsSeenOn);
        commonFunction.uploadFile(editSellpagePage.imageWithText1,"D:\\Aion\\ảnh test\\áo\\áo tím.webp");
        commonFunction.scroll(editSellpagePage.sectionImageWithText);
        commonFunction.senKeys(editSellpagePage.imageWithTextTitle1,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.senKeys(editSellpagePage.imageWithTextDescription1,"\"Material: NYLON\\n\" +\n" +
                "                \"Material: spandex\\n\" +\n" +
                "                \"Feature: Anti-Wrinkle\\n\" +\n" +
                "                \"Feature: Anti-Pilling\\n\" +\n" +
                "                \"Feature: Waterproof\\n\" +\n" +
                "                \"Feature: Quick Dry\\n\" +\n" +
                "                \"Feature: Windproof\\n\" +\n" +
                "                \"Collar: MANDARIN COLLAR\\n\"+\n" +
                "                \"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.click(editSellpagePage.addImageWithTextBtn);
        commonFunction.uploadFile(editSellpagePage.imageWithText2,"D:\\Aion\\ảnh test\\áo\\áo xám.webp");
        commonFunction.senKeys(editSellpagePage.imageWithTextTitle2,"GIVE THE BUST A PERKY LIFT!");
        commonFunction.senKeys(editSellpagePage.imageWithTextDescription2,"This strapless bra lets you wear low-cut, off-shoulder and backless tops and dresses without ruining the look. Its wide wings and secure front and back buckles offer full non-slip support and flattens fatty bulges for a slimmer silhouette. The front buckle also boosts your cleavage while reducing bounce.");
    }
    public void createPolicy() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.iframeTermsOfPolicy);
        commonFunction.switchIframe(editSellpagePage.iframeTermsOfPolicy);
        commonFunction.senKeys(editSellpagePage.termOfPolicy,"With eHighway, Seller can easily track all the order status through the data system. Revenue and related business activities are also carefully stored and calculated on intuitive charts/graphs.");

    }
    //botige6044@aaorsi.com", "tWvgKT9t
    public void setupUpsale() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.sectionUpsale);
        commonFunction.click(editSellpagePage.upsaleBtn);
        commonFunction.verifyElement(editSellpagePage.textNoteUpsale,"You don't have any sellpages here. Please add sellpage to your upsale page");
        commonFunction.verifyElement(editSellpagePage.textHyperlinkAdd,"Add");
        commonFunction.click(editSellpagePage.hyperlinkAdd);
        commonFunction.verifyElement(editSellpagePage.headerPoupUpsale,"Set up for upsale page");
        commonFunction.click(editSellpagePage.hyperlinkAddSellpage);
        commonFunction.click(editSellpagePage.searchBox);
        commonFunction.senKeys(editSellpagePage.inputSearchBox,"revenue3105.kinthemain.online");
        commonFunction.click(editSellpagePage.sellpageUpsale1);
        commonFunction.click(editSellpagePage.hyperlinkAddSellpage);
        commonFunction.click(editSellpagePage.searchBox2);
        commonFunction.senKeys(editSellpagePage.inputsearchBox2,"bra.kinthemain.online");
        commonFunction.click(editSellpagePage.sellpageUpsale2);
        commonFunction.click(editSellpagePage.saveUpsaleBtn);
        commonFunction.verifyPage(editSellpagePage.previewBtn);

    }
    public void configPaygate() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.sectionLogo);
        commonFunction.click(editSellpagePage.addPaygateBtn);
        Thread.sleep(5000);

        commonFunction.click(editSellpagePage.selectPaypalPaygate);
        Thread.sleep(2000);
        commonFunction.click(editSellpagePage.paypalPaygate1);

        commonFunction.click(editSellpagePage.selectStripePaygate);
        Thread.sleep(1000);
        commonFunction.click(editSellpagePage.stripePaygate1);

        commonFunction.click(editSellpagePage.configBtn);
        //Config success
        commonFunction.verifyPage(editSellpagePage.status);
        commonFunction.verifyElement(editSellpagePage.status,"Config success");
    }
    public void requestPaygate() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.sectionLogo);
        commonFunction.click(editSellpagePage.addPaygateBtn);
        Thread.sleep(2000);

        commonFunction.click(editSellpagePage.selectPaypalPaygate);
        commonFunction.click(editSellpagePage.requestPaygatePaypal);

        commonFunction.click(editSellpagePage.selectStripePaygate);
        commonFunction.click(editSellpagePage.requestPaygateStripe);

        commonFunction.click(editSellpagePage.configBtn);
        commonFunction.scroll(editSellpagePage.submitAndRequestBtn);
        commonFunction.click(editSellpagePage.checkboxConfirmAgreed);
        commonFunction.click(editSellpagePage.submitAndRequestBtn);

        //Config success
        commonFunction.verifyPage(editSellpagePage.status);
        commonFunction.verifyElement(editSellpagePage.status,"Success");

    }
    public void verifySellpage() throws InterruptedException {
        commonFunction.scroll(editSellpagePage.sectionDescription);
        commonFunction.click(editSellpagePage.domainSellpage);
        sellpageRevenue_function sellpageRevenueFunction = new sellpageRevenue_function(driver);
        sellpageRevenueFunction.verifyRevenueSellpage();
    }
    public void clickSavePublic(){
        commonFunction.click(editSellpagePage.savePublicBtn);
    }
}
