package sellerPortal.page;

import org.openqa.selenium.By;

public class requestSourcing_page {
    public By addRequestSourcingBtn = By.xpath("//span[contains(text(),'Add request sourcing')]//ancestor::button");
    public By productNameInput = By.id("productName");
    public By linkInput= By.id("link");
    public By addImage = By.xpath("//div[contains(text(),'Add media')]");
    public By description = By.id("description");
    public By requestBtn = By.xpath("//span[contains(text(),'Request')]//parent::button");
    public By status= By.xpath("//div[@role ='status']");
    public By numberRequest = By.xpath("//tbody/tr[2]/td[2]");
    public By searchRequest = By.xpath("//input[@placeholder ='Search title request name, number']");
    //detail Request
    public By numberRequestDetail = By.xpath("//div[@class='styles_request__detail__title__appAR']/div/div/span[1]");
    public By productRequestDetail = By.xpath("//div[@class='styles_request__detail__title__appAR']/div/div/span[2]");
    public By fulfiller = By.xpath("//div[@class='styles_request__detail__body__I9aAW']/div/div/span[1]");
    public By statusDetail = By.xpath("//div[@class='styles_request__detail__body__I9aAW']/div/div[2]/div/span[2]");
    public By linkProductRequest = By.xpath("//article[@class='styles_messages__hT9u1 styles_messagesRight__GtryD']//p");
    public By productNameRequest = By.id("productName");
    public By linkRequest = By.id("link");
    public By descriptionRequest = By.id("description");
    //detail repond new product
    public  By linkProductRespondByFulfill = By.xpath("//article[@class='styles_messages__hT9u1 styles_messagesLeft__Wda9h']//p");
    public By textDescription = By.xpath("//article[@class='styles_messages__hT9u1 styles_messagesLeft__Wda9h']//strong");
    public By rejectBtn = By.xpath("//span[contains(text(),'Reject')]//parent::button");
    public By acceptBtn = By.xpath("//span[contains(text(),'Accept')]//parent::button");
    public By textQuickReason = By.xpath("//strong[contains(text(),'Reason')]");
    public By checkboxReason1 = By.xpath("//div[@id ='reasons']//descendant::input//parent::span");
    public By checkboxReason2 = By.xpath("//div[@id ='reasons']//descendant::input[2]//parent::span");
    public By checkboxReason3 = By.xpath("//div[@id ='reasons']//descendant::input[3]//parent::span");
    public By textReason1 = By.xpath("//div[@id ='reasons']//descendant::label[1]/span[2]");
    public By textReason2 = By.xpath("//div[@id ='reasons']//descendant::label[2]/span[2]");
    public By textReason3 = By.xpath("//div[@id ='reasons']//descendant::label[3]/span[2]");
    public By reasonOtherInput = By.id("other");
    public By rejectCloseBtn = By.xpath("//span[contains(text(),'Reject & close')]//parent::button");
    public By confirmBtn = By.xpath("//span[contains(text(),'Confirm')]");
    public By rejectContinueBtn = By.xpath("//span[contains(text(),'Reject & continue')]//parent::button");
    //detail fulfill reject tại seller
    public By textRejectedDetail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/div/strong");
    public By valueQuickReason1Detail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[1]");
    public By valueQuickReason2Detail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[2]");
    public By valueQuickReason3Detail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[3]");
    public By valueQuickReason4Detail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[4]");
    public By valueQuickReasonInputDetail = By.xpath("//article[@class ='styles_messages__hT9u1 styles_messagesLeft__Wda9h']/div/p[5]");

    public By textCloseRequest = By.xpath("//div[contains(text(),'This request was closed')]");
    public By textHeader = By.xpath("//main//descendant::article[2]//descendant::strong");
    public By linkProductName = By.xpath("//main//descendant::article[2]/div/div/div[2]//descendant::p");
    public By AcceptBtn = By.xpath("//span[contains(text(),'Accept')]//parent::button");
    public By statusRequest = By.xpath("//div[@class = 'styles_request__detail__body__I9aAW']/div/div[2]/div/span[2]");
    //edit product seller
    public By productNameRespond = By.xpath("//div[@class='ant-modal-header']/div/div/span");
    public By variant1 = By.xpath("//div[@class='d-flex flex-wrap']/button[1]/span");

    public By colorPuple = By.xpath("//div[@class='d-flex flex-wrap']//button[1]");
    public By sizeS = By.xpath("//span[contains(text(),'S')]//parent::button");

    public By colorGray = By.xpath("//div[@class='d-flex flex-wrap']//button[2]");
    public By sizeM = By.xpath("//span[contains(text(),'M')]//parent::button");

    public By colorBlue = By.xpath("//div[@class='d-flex flex-wrap']//button[3]");
    public By sizeL = By.xpath("//span[contains(text(),'L')]//parent::button");

    public By variant2 = By.xpath("//div[@class='d-flex flex-wrap']/button[2]/span");
    public By variant3 = By.xpath("//div[@class='d-flex flex-wrap']/button[3]/span");
    public By variant4 = By.xpath("//div[@class='d-flex flex-wrap']/button[4]/span");
    public By variant5 = By.xpath("//div[@class='d-flex flex-wrap']/button[5]/span");
    public By variant6 = By.xpath("//div[@class='d-flex flex-wrap']/button[6]/span");
    public By variant7 = By.xpath("//div[@class='d-flex flex-wrap']/button[7]/span");
    public By variant8 = By.xpath("//div[@class='d-flex flex-wrap']/button[8]/span");
    public By variant9 = By.xpath("//div[@class='d-flex flex-wrap']/button[9]/span");
    public By productCost = By.xpath("//div[@class='row']/div[2]/article[1]/div[2]/div[1]//strong");
    public By suggestPrice = By.xpath("//div[@class='row']/div[2]/article[1]/div[2]/div[2]//strong");
    public By sku = By.xpath("//div[@class='row']/div[2]/article[1]/div[2]/div[3]/div[2]/div");

    public By sectionDescription = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]");
    public By getDescription1 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[1]");
    public By getDescription2 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[2]");
    public By getDescription3 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[3]");
    public By getDescription4 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[4]");
    public By getDescription5 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[5]");
    public By getDescription6 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[6]");
    public By getDescription7 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[7]");
    public By getDescription8 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[8]");
    public By getDescription9 = By.xpath("//article[@class ='product_product__Detail__VAYFc'][2]/div/div/div[2]/div/div/div/p[9]");





}
