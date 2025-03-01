package fulfillPortal.function;

import core.basePage;
import core.common_function;
import fulfillPortal.page.requestSourcing_page;
import org.openqa.selenium.WebDriver;
import sellerPortal.function.requestSourcingseller_function;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class requestSourcing_function extends basePage {
    public requestSourcing_function(WebDriver driver) {
        super(driver);
    }
    requestSourcing_page requestSourcingPage =new requestSourcing_page();
    common_function commonFunction =new common_function(driver);
    requestSourcingseller_function requestSourcingsellerFunction = new requestSourcingseller_function(driver);
    public void searchRequest(){
        commonFunction.senKeyPrice(requestSourcingPage.searchRequest, "BYZ");
    }
    public void verifyrequest() throws InterruptedException, IOException {
        Properties props = new Properties();
        Path confDir = Paths.get("/e2way");
        Path confFile = confDir.resolve("data.props");
        props.load(Files.newInputStream(confFile));
        String requestNumber = (props.getProperty("requestNumber"));
//        requestSourcingseller_function requestSourcingsellerFunction = new requestSourcingseller_function(driver);
//        Thread.sleep(3000);
//        String numberRequest= commonFunction.getText(requestSourcingPage.numberRequest);
//        System.out.println(numberRequest);
//        Assert.assertEquals(numberRequest,requestSourcingsellerFunction.numberRequest1);
//        Assert.assertEquals(numberRequest,requestSourcingsellerFunction.numberRequest1);
        commonFunction.verifyElement(requestSourcingPage.numberRequest,requestNumber);
        commonFunction.verifyElement(requestSourcingPage.productRequest,"Quick Dry Sport Jacket");
        commonFunction.verifyElement(requestSourcingPage.sellerRequest,"tuyennguyen.aion@example.com");

    }
    public void verifyDetailRequest(){
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.productRequestDetail,"Quick Dry Sport Jacket");
        commonFunction.verifyElement(requestSourcingPage.sellerRequestDetail,"Seller: soyero8019@ociun.com");
        commonFunction.verifyElement(requestSourcingPage.statusRequestDetail,"Status: Opening");
        commonFunction.click(requestSourcingPage.linkProductRequest);
        commonFunction.verifyElement(requestSourcingPage.productName,"Quick Dry Sport Jacket");
        commonFunction.verifyElement(requestSourcingPage.linkProduct,"https://alfawears.com/collections/blazers-jackets/products/quick-dry-sport-jacket");
        commonFunction.verifyElement(requestSourcingPage.descriptionProduct,
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional Material: NYLON Material: spandex Feature: Anti-Wrinkle Feature: Anti-Pilling Feature: Waterproof Feature: Quick Dry Feature: Windproof Collar: MANDARIN COLLAR");

    }
    public void verifyQuickReasonReject(){
        commonFunction.click(requestSourcingPage.reject1Button);
        commonFunction.verifyElement(requestSourcingPage.textReason1,"Temporary Out of Stock");
        commonFunction.verifyElement(requestSourcingPage.textReason2,"Product is no longer manufactured");
        commonFunction.verifyElement(requestSourcingPage.textReason3,"Product cannot be manufactured");
        commonFunction.verifyElement(requestSourcingPage.textReason4,"Policy Violation");
        commonFunction.verifyPage(requestSourcingPage.descriptionReason);
        commonFunction.verifyPage(requestSourcingPage.rejectCloseBtn);
    }
    public void respondByNewProduct() throws InterruptedException {
        commonFunction.click(requestSourcingPage.repond1Button);
        commonFunction.click(requestSourcingPage.respondByNewProduct);
        addProduct_function addProductFunction = new addProduct_function(driver);
        addProductFunction.addTitleProduct();
        addProductFunction.createDescription();
        driver.switchTo().defaultContent();
        addProductFunction.createSpecification();
        driver.switchTo().defaultContent();
        addProductFunction.addImage();
        addProductFunction.addProductCost();
        addProductFunction.addOption();
        addProductFunction.verifyVariants();
        addProductFunction.addShippingInformation();
        addProductFunction.policyProduct();
        driver.switchTo().defaultContent();
        commonFunction.scroll(requestSourcingPage.setionTitle);
        commonFunction.verifyElement(requestSourcingPage.lastDealText,"Last deal");
        commonFunction.click(requestSourcingPage.respondBtn);
        Thread.sleep(2000);
    }
    public void respondFromList() throws InterruptedException {
        commonFunction.click(requestSourcingPage.repond1Button);
        commonFunction.click(requestSourcingPage.respondByListProduct);
        Thread.sleep(2000);
        commonFunction.senKeys(requestSourcingPage.searchProduct,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.Hover(requestSourcingPage.hoverProduct);
        Thread.sleep(2000);
        commonFunction.click(requestSourcingPage.selectBtn);
        commonFunction.click(requestSourcingPage.respondBtn);
        Thread.sleep(2000);
    }
    public void respondRejectRequest()  {
        commonFunction.click(requestSourcingPage.checkboxReason1);
        commonFunction.click(requestSourcingPage.checkboxReason2);
        commonFunction.click(requestSourcingPage.checkboxReason3);
        commonFunction.click(requestSourcingPage.checkboxReason4);
        commonFunction.senKeys(requestSourcingPage.descriptionInput,"Test reject Request");
        commonFunction.click(requestSourcingPage.rejectCloseBtn);
    }
    public void verifyRejectDetail() throws InterruptedException {
        Thread.sleep(5000);
        commonFunction.verifyElement(requestSourcingPage.textRejectedDetail,"Rejected");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReason1Detail,"Temporary Out of Stock");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReason2Detail,"Product is no longer manufactured");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReason3Detail,"Product cannot be manufactured");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReason4Detail,"Policy Violation");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReasonInputDetail,"Test reject Request");
        commonFunction.verifyElement(requestSourcingPage.statusRequestDetail,"Status: Rejected");
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
        commonFunction.verifyElement(requestSourcingPage.textCloseRequest,"This request was closed");
    }
    public void verifyAcceptRequestBySeller() throws InterruptedException {
        commonFunction.click(requestSourcingPage.numberRequest);
        Thread.sleep(1000);
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
        commonFunction.verifyElement(requestSourcingPage.statusRequestDetail,"Status: Accepted");
        commonFunction.verifyElement(requestSourcingPage.textCloseRequest,"This request was closed");
    }
    public void verifyRejectRequestBySeller(){
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
        commonFunction.verifyElement(requestSourcingPage.statusRequestDetail,"Status: Rejected");
        commonFunction.verifyElement(requestSourcingPage.textRejected,"Rejected");
        commonFunction.verifyElement(requestSourcingPage.verifyReason1BySeller,"Price is higher than exceptation");
        commonFunction.verifyElement(requestSourcingPage.verifyReason2BySeller,"Product does not match the requirements");
        commonFunction.verifyElement(requestSourcingPage.verifyReason3BySeller,"I don't want to sell this anymore");
        commonFunction.verifyElement(requestSourcingPage.verifyReason4BySeller,"Seller reject Request");
        commonFunction.verifyElement(requestSourcingPage.textCloseRequest,"This request was closed");
    }
    public void verifyDetailRequestFromListMyProduct(){
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.productRequestDetail,"Product Title + Team defaul");
        commonFunction.verifyElement(requestSourcingPage.sellerRequestDetail,"Seller: tuyennguyen.aion@example.com");
        commonFunction.verifyElement(requestSourcingPage.statusRequestDetail,"Status: Opening");
        commonFunction.click(requestSourcingPage.linkProductRequest);
        commonFunction.verifyElement(requestSourcingPage.productNameRequest,"Product Title + Team defaul");
    }
    public void respondByTheSameProduct() throws InterruptedException {
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.productRequest,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.click(requestSourcingPage.productNameRequest);
        commonFunction.click(requestSourcingPage.respondBtn);
        commonFunction.verifyElement(requestSourcingPage.sameProductMenu,"Same product");
        commonFunction.verifyElement(requestSourcingPage.valueSameProduct,"By updating product cost and shipping information");
        commonFunction.click(requestSourcingPage.valueSameProduct);
        commonFunction.senKeyPrice(requestSourcingPage.productCost1,"4.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestSellingPrice1,"12.99");
        commonFunction.scroll(requestSourcingPage.sectionVariant);
        commonFunction.verifyElement(requestSourcingPage.variant1,"Purple / S");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant1,"4.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant1,"12.99");

        commonFunction.verifyElement(requestSourcingPage.variant2,"Purple / M");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant2,"5.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant2,"15.99");

        commonFunction.verifyElement(requestSourcingPage.variant3,"Purple / L");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant3,"6.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant3,"18.99");

        commonFunction.verifyElement(requestSourcingPage.variant4,"Gray / S");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant4,"4.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant4,"12.99");

        commonFunction.verifyElement(requestSourcingPage.variant5,"Gray / M");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant5,"5.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant5,"15.99");

        commonFunction.verifyElement(requestSourcingPage.variant6,"Gray / L");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant6,"6.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant6,"18.99");

        commonFunction.verifyElement(requestSourcingPage.variant7,"Blue / S");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant7,"4.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant7,"12.99");

        commonFunction.verifyElement(requestSourcingPage.variant8,"Blue / M");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant8,"5.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant8,"15.99");

        commonFunction.verifyElement(requestSourcingPage.variant9,"Blue / L");
        commonFunction.senKeyPrice(requestSourcingPage.productCostVariant9,"6.33");
        commonFunction.senKeyPrice(requestSourcingPage.suggestPriceVariant9,"18.99");

        commonFunction.scroll(requestSourcingPage.sectionShipping);
        commonFunction.verifyElement(requestSourcingPage.sectionShipping,"Shipping Information");
        commonFunction.senKeyPrice(requestSourcingPage.firstItem,"3.99");
        commonFunction.senKeyPrice(requestSourcingPage.addItem,"2.99");
        commonFunction.scroll(requestSourcingPage.headerPopupTheSameProduct);
        commonFunction.click(requestSourcingPage.checkboxLastDeal2);
        Thread.sleep(1000);
        commonFunction.click(requestSourcingPage.respondBtn1);
        Thread.sleep(2000);
    }
    public void verifyRequest() throws InterruptedException {
        commonFunction.click(requestSourcingPage.numberRequest);
        Thread.sleep(5000);
        commonFunction.verifyElement(requestSourcingPage.statusRequestDetail,"Status: Accepted");
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
    }
    public void respondByEditProductSeller() throws InterruptedException {
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.productRequest,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.click(requestSourcingPage.productNameRequest);
        commonFunction.click(requestSourcingPage.respondBtn);
        commonFunction.verifyElement(requestSourcingPage.valueAction,"By editing on Seller Product");
        commonFunction.click(requestSourcingPage.EditProductSellerBtn);
        addProduct_function addProductFunction;
        addProductFunction = new addProduct_function(driver);
        addProductFunction.editTitleProduct();
        addProductFunction.editDescriptionProduct();
        driver.switchTo().defaultContent();
        addProductFunction.editSpecificationProduct();
        driver.switchTo().defaultContent();
        addProductFunction.editPricing();
        addProductFunction.editVariants();
        addProductFunction.editShippingInfomation();
        addProductFunction.editPolicy();
        driver.switchTo().defaultContent();
        commonFunction.scroll(addProductFunction.addProductPage.sectionTitle);
        commonFunction.click(requestSourcingPage.checkboxLastDeal3);
        Thread.sleep(1000);
        commonFunction.click(requestSourcingPage.respond2Btn);
        Thread.sleep(2000);

    }
}
