package sellerPortal.page;

import org.openqa.selenium.By;

public class testProducts_page {
    public By addProductBtn  = By.xpath("//span[contains(text(),'Add Product')]");
    public By titleProduct = By.xpath("//div[@id='information_id']//descendant::input");

    public By iframeDescription = By.xpath("//div[@id='information_id']//descendant::iframe");
    public By description = By.xpath("//body[@id='tinymce']");

    public By iframeSpecification = By.xpath("//div[@id='specification_id']//descendant::iframe");
    public By specification = By.xpath("//body[@id='tinymce']");
    //image
    public By addImageProduct = By.xpath("//div[@id='media_id']//descendant::input//parent::span");
    public By image4 = By.xpath("//div[@class='ant-upload-list ant-upload-list-picture-card']/div[4]/descendant::a");
    public By iconDelete= By.xpath("//div[@class='ant-upload-list ant-upload-list-picture-card']/div[4]/descendant::button");

    //pricing
    public By productCost = By.xpath("//div[@id='pricing_id']//descendant::input");
    public By suggestPrice = By.xpath("//div[@id='pricing_id']//descendant::input[2]");
    public By addAnotherOption = By.xpath("//div[@id='options_id']/div/div/div[2]/div/div");
    public By optionName1= By.xpath("//div[@id='options_id']//descendant::input");
    public By value1Option1 = By.xpath("//div[@id='options_id']//descendant::input[2]");
    public By value2Option1 = By.xpath("//div[@id='options_id']//descendant::input[3]");
    public By value3Option1 = By.xpath("//div[@id='options_id']//descendant::input[4]");

    public By addAnotherOption2 = By.xpath("//div[@id='options_id']/div/div/div[2]/div/div/div/div[2]");
    public By optionName2 = By.xpath("//div[@id='options_id']//descendant::input[6]");
    public By value1Option2 = By.xpath("//div[@id='options_id']//descendant::input[7]");
    public By value2Option2 = By.xpath("//div[@id='options_id']//descendant::input[8]");
    public By value3Option2 = By.xpath("//div[@id='options_id']//descendant::input[9]");
    //variant
    public By variant1= By.xpath("//tbody/tr[2]/td[2]/strong");
    public By imageVariant1 = By.xpath("//tbody/tr[2]/td[3]/div");
    public By imagePurple = By.xpath("//div[@class='ant-modal-body']//descendant::img[2]//parent::div");
    public By confirmBtn = By.xpath("//button[contains(text(),'Confirm')]");
    public By applyToAllImageV1 = By.xpath("//tbody/tr[2]/td[3]/div[2]");
    public By confirmApplyToAll =By.xpath("//span[contains(text(),'OK')]");
    public By productCostVariant1 = By.xpath("//tbody/tr[2]/td[4]//descendant::input");
    public By applyToAllProductCostV1 = By.xpath("//tbody/tr[2]/td[4]/div[2]");
    public By confirmApplyToAll2 = By.xpath("//div[7]/div/div/div/div[2]/div/div[2]/button[2]/span");
    public By suggetPriceVariant1= By.xpath("//tbody/tr[2]/td[5]//descendant::input");

    public By applyToAllSuggestPriceV1 = By.xpath("//tbody/tr[2]/td[5]/div[2]");

    public By confirmApplyToAll3 = By.xpath("//div[8]/div/div/div/div[2]/div/div[2]/button[2]/span");
    public By skuVariant1 = By.xpath("//tbody/tr[2]/td[6]//descendant::input");
    public By applyToAllSkuV1 = By.xpath("//tbody/tr[2]/td[6]/div");
    public By confirmApplyToAll4 = By.xpath("//div[9]/div/div/div/div[2]/div/div[2]/button[2]/span");
    //variant 2
    public By variant2= By.xpath("//tbody/tr[3]/td[2]/strong");
    public By productCostVariant2 = By.xpath("//tbody/tr[3]/td[4]//descendant::input");
    public By suggetPriceVariant2= By.xpath("//tbody/tr[3]/td[5]//descendant::input");
    public By skuVariant2 = By.xpath("//tbody/tr[3]/td[6]//descendant::input");
    //variant3
    public By variant3= By.xpath("//tbody/tr[4]/td[2]/strong");
    public By productCostVariant3 = By.xpath("//tbody/tr[4]/td[4]//descendant::input");
    public By suggetPriceVariant3= By.xpath("//tbody/tr[4]/td[5]//descendant::input");
    public By skuVariant3 = By.xpath("//tbody/tr[4]/td[6]//descendant::input");
    //variant4
    public By variant4= By.xpath("//tbody/tr[5]/td[2]/strong");
    public By imageVariant4 = By.xpath("//tbody/tr[5]/td[3]/div");
    public By imageGray= By.xpath("//div[@class='ant-modal-body']//descendant::img[3]");
    public By productCostVariant4 = By.xpath("//tbody/tr[5]/td[4]//descendant::input");
    public By suggetPriceVariant4= By.xpath("//tbody/tr[5]/td[5]//descendant::input");
    public By skuVariant4 = By.xpath("//tbody/tr[5]/td[6]//descendant::input");
    //variants5
    public By variant5= By.xpath("//tbody/tr[6]/td[2]/strong");
    public By imageVariant5 = By.xpath("//tbody/tr[6]/td[3]/div");
    public By productCostVariant5 = By.xpath("//tbody/tr[6]/td[4]//descendant::input");
    public By suggetPriceVariant5= By.xpath("//tbody/tr[6]/td[5]//descendant::input");
    public By skuVariant5 = By.xpath("//tbody/tr[6]/td[6]//descendant::input");
    //variant6
    public By variant6= By.xpath("//tbody/tr[7]/td[2]/strong");
    public By imageVariant6 = By.xpath("//tbody/tr[7]/td[3]/div");
    public By productCostVariant6 = By.xpath("//tbody/tr[7]/td[4]//descendant::input");
    public By suggetPriceVariant6= By.xpath("//tbody/tr[7]/td[5]//descendant::input");
    public By skuVariant6 = By.xpath("//tbody/tr[7]/td[6]//descendant::input");
    //variant8
    public By variant8= By.xpath("//tbody/tr[9]/td[2]/strong");
    public By imageVariant8 = By.xpath("//tbody/tr[9]/td[3]/div");
    public By imageBlue= By.xpath("//div[@class='ant-modal-body']//descendant::img[4]");
    public By productCostVariant8 = By.xpath("//tbody/tr[9]/td[4]//descendant::input");
    public By suggetPriceVariant8= By.xpath("//tbody/tr[9]/td[5]//descendant::input");
    public By skuVariant8 = By.xpath("//tbody/tr[9]/td[6]//descendant::input");
    //variant7
    public By variant7= By.xpath("//tbody/tr[8]/td[2]/strong");
    public By imageVariant7 = By.xpath("//tbody/tr[8]/td[3]/div");
    public By productCostVariant7 = By.xpath("//tbody/tr[8]/td[4]//descendant::input");
    public By suggetPriceVariant7= By.xpath("//tbody/tr[8]/td[5]//descendant::input");
    public By skuVariant7 = By.xpath("//tbody/tr[8]/td[6]//descendant::input");
    //variant9
    public By variant9= By.xpath("//tbody/tr[10]/td[2]/strong");
    public By imageVariant9 = By.xpath("//tbody/tr[10]/td[3]/div");
    public By productCostVariant9 = By.xpath("//tbody/tr[10]/td[4]//descendant::input");
    public By suggetPriceVariant9= By.xpath("//tbody/tr[10]/td[5]//descendant::input");
    public By skuVariant9 = By.xpath("//tbody/tr[10]/td[6]//descendant::input");




    // Shipping infomation
    public By shippingInformation = By.id("shipping_id");
    public By addMoreBtn= By.xpath("//span[contains(text(),'Add more')]");
    public By region = By.xpath("//div[@id='shipping_id']/div/div/div[2]/div/div[2]/div");
    //body/div[10]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]
    public By UnitedStates = By.xpath("//body//descendant::li[@title='United States']");
    public By Vietnam = By.xpath("//body//descendant::li[@title='Vietnam']");
    public By firstItem = By.xpath("//div[@id='shipping_id']//descendant::input[2]");
    public By additionalItem = By.xpath("//div[@id='shipping_id']//descendant::input[3]");
    public By region2= By.xpath("//span[contains(text(),'Type region')]//parent::div");
    public By Australia = By.xpath("//body//descendant::li[@title='Australia']");
    public By Japan = By.xpath("//body//descendant::li[@title='Japan']");
    public By firstItem2 = By.xpath("//div[@id='shipping_id']//descendant::input[2][@value ='0']");
    public By additionalItem2 = By.xpath("//div[@id='policy_id']//preceding::input[1]");
    //Policy product
    public By return_refundBtn = By.xpath("//div[@id='policy_id']//descendant::button[contains(text(),'Refund & return')]");
    public By iframeAboutProduct= By.xpath("//div[@id='policy_id']//descendant::iframe");
    public By descriptionPolicy = By.xpath("//body[@id='tinymce']");

    //Save
    public By saveBtn = By.xpath("//span[contains(text(),'Save')]");
    //Save and request sourcing
    public By saveAndRequestBtn= By.xpath("//span[contains(text(),'Save & Request Sourcing')]");
    public By testProducts= By.xpath("//main//span[contains(text(),'Test products')]");
    public By requestSourcingBtn=By.xpath("//div[@class='ant-modal-content']/div[3]/button[2]");
    public By requestSourcingPage = By.xpath("//main//span[contains(text(),'Request sourcing')]");
    public By mesError = By.xpath("//span[contains(text(),'Please complete all information')]") ;
    //edit product
    public By productName= By.xpath("//tbody/tr[2]/td[2]//a");
    public By editBtn= By.xpath("//span[contains(text(),'Edit')]//parent::button[1]");
    public By editSellpageTitle= By.xpath("//span[contains(text(),'Edit product')]");
    public By mesSuccess = By.xpath("//span[contains(text(),'Update product success')]") ;
    public By action = By.xpath("//tbody/tr[2]/td[9]");
    public By product1= By.xpath("//tbody/tr[2]");
    public By requestSourcing = By.xpath("//div[@role = 'tooltip']//li[1]");
    public By confirmPopup = By.xpath("//div[@id='rc_unique_0']/div");
    public By requestSourcingBtnConfirm = By.xpath("//span[contains(text(),'Request sourcing')]//parent::button");
    public By requestStatus = By.xpath("//tbody/tr[2]/td[9]/div/span");
    public By sellThisProductBtn = By.xpath("//tbody/tr[2]/td[9]/button");
    //list my product
    public By myProduct1 = By.xpath("//tbody/tr[2]/td[2]//a");
    public By sellThisProductBtn2 = By.xpath("//div[@class='ant-modal-header']//span[contains(text(),'Sell this product')]//parent::button");
    //List private product
    public By privateProductBtn = By.xpath("//span[contains(text(),'Fulfillable product')]//parent::button");
    public By searchInput = By.xpath("//input[@placeholder='Search product name, creator']");


}
