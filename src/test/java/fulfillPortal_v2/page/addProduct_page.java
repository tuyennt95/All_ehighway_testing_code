package fulfillPortal_v2.page;

import org.openqa.selenium.By;

public class addProduct_page {
    public By addProductBtn = By.xpath("//span[contains(text(),'Add product')]//parent::button");

    public By informationSection = By.id("information_id");
    public By inputTitleProduct = By.id("basic_title");
    public By iframeDescription = By.xpath("//form[1]//div[2]//descendant::iframe");
    public By inputDescription = By.xpath("//body[@id='tinymce']");

    public By specificationSection = By.id("specification_id");
    public By iframeSpecification = By.xpath("//form[2]//div[2]//descendant::iframe");
    public By inputSpecification = By.xpath("//body[@id='tinymce']");

    public By mediaSection = By.id("media_id");
    public By addMediaBtn = By.xpath("//div[contains(text(),'Add media')]//ancestor::div[@class='ant-upload ant-upload-select ant-upload-select-picture-card']");

    public By pricingSection = By.id("pricing_id");
    public By pricingCost = By.id("basic_cost");
    public By suggestSellingPrice = By.id("basic_suggestPrice");

    public By optionSection = By.id("options_id");
    public By addOption = By.xpath("//span[contains(text(),'Add another option')]//parent::button");
    //option1
    public By optionName1= By.xpath("//div[@id='options_id']//descendant::input[1]");
    public By value1Option1 = By.xpath("//div[@id='options_id']//descendant::input[1]");
    public By value2Option1 = By.xpath("//div[@id='options_id']//descendant::input[2]");
    public By value3Option1 = By.xpath("//div[@id='options_id']//descendant::input[3]");
    //option2
    public By optionName2 = By.xpath("//div[@id='options_id']/div[2]/div/div/div[2]//descendant::input[1]");
    public By value1Option2 = By.xpath("//div[@id='options_id']/div[2]/div/div/div[2]//descendant::input[2]");
    public By value2Option2 = By.xpath("//div[@id='options_id']/div[2]/div/div/div[2]//descendant::input[3]");
    public By value3Option2 = By.xpath("//div[@id='options_id']/div[2]/div/div/div[2]//descendant::input[4]");

    public By variantsSection = By.id("variants_id");
//variant1
    public By variant1= By.xpath("//div[@id='variants_id']//tbody/tr[2]/td[2]/div/strong");
    public By imageVariant1 = By.xpath("div[@id='variants_id']//tbody/tr[2]/td[3]/div");
    public By image1 = By.xpath("//div[contains(text(),'Gallery')]//ancestor::div[4]/div[2]//descendant::img");
    public By applyToAllImageV1 = By.xpath("//div[@id='variants_id']//tbody/tr[2]/td[3]/div[2]");
    //
    public By confirmApplyToAll =By.xpath("//span[contains(text(),'OK')]");
    public By productCostVariant1 = By.xpath("//form[6]//tbody/tr[1]/td[4]//descendant::input");
    public By applyToAllProductCostV1 = By.xpath("//form[6]//tbody/tr[2]/td[4]/div[2]");
    public By confirmApplyToAll2 = By.xpath("//div[7]/div/div/div/div[2]/div/div[2]/button[2]/span");
    public By suggetPriceVariant1= By.xpath("//form[6]//tbody/tr[1]/td[5]//descendant::input");

    public By applyToAllSuggestPriceV1 = By.xpath("//form[6]//tbody/tr[2]/td[5]/div[2]");

    public By confirmApplyToAll3 = By.xpath("//div[8]/div/div/div/div[2]/div/div[2]/button[2]/span");
    public By skuVariant1 = By.xpath("//form[6]//tbody/tr[1]/td[6]//descendant::input");
    public By applyToAllSkuV1 = By.xpath("//form[6]//tbody/tr[2]/td[6]/div");
    public By confirmApplyToAll4 = By.xpath("//div[9]/div/div/div/div[2]/div/div[2]/button[2]/span");
    //variant 2
    public By variant2= By.xpath("//form[6]//tbody/tr[2]/td[2]/strong");
    public By imageVariant2 = By.xpath("//form[6]//tbody/tr[2]/td[3]/div");
    public By productCostVariant2 = By.xpath("//form[6]//tbody/tr[2]/td[4]//descendant::input");
    public By suggetPriceVariant2= By.xpath("//form[6]//tbody/tr[2]/td[5]//descendant::input");
    public By skuVariant2 = By.xpath("//form[6]//tbody/tr[2]/td[6]//descendant::input");
    //variant3
    public By variant3= By.xpath("//form[6]//tbody/tr[3]/td[2]/strong");
    public By imageVariant3 = By.xpath("//form[6]//tbody/tr[3]/td[3]/div");
    public By productCostVariant3 = By.xpath("//form[6]//tbody/tr[3]/td[4]//descendant::input");
    public By suggetPriceVariant3= By.xpath("//form[6]//tbody/tr[3]/td[5]//descendant::input");
    public By skuVariant3 = By.xpath("//form[6]//tbody/tr[3]/td[6]//descendant::input");
    //variant4
    public By variant4= By.xpath("//form[6]//tbody/tr[4]/td[2]/strong");
    public By imageVariant4 = By.xpath("//form[6]//tbody/tr[4]/td[3]/div");
    public By imageGray= By.xpath("//div[contains(text(),'Gallery')]//ancestor::div[4]/div[2]//descendant::img[2]");
    public By productCostVariant4 = By.xpath("//form[6]//tbody/tr[4]/td[4]//descendant::input");
    public By suggetPriceVariant4= By.xpath("//form[6]//tbody/tr[4]/td[5]//descendant::input");
    public By skuVariant4 = By.xpath("//form[6]//tbody/tr[4]/td[6]//descendant::input");
    //variants5
    public By variant5= By.xpath("//form[6]//tbody/tr[5]/td[2]/strong");
    public By imageVariant5 = By.xpath("//form[6]//tbody/tr[5]/td[3]/div");
    public By productCostVariant5 = By.xpath("//form[6]//tbody/tr[5]/td[4]//descendant::input");
    public By suggetPriceVariant5= By.xpath("//form[6]//tbody/tr[5]/td[5]//descendant::input");
    public By skuVariant5 = By.xpath("//form[6]//tbody/tr[5]/td[6]//descendant::input");
    //variant6
    public By variant6= By.xpath("//form[6]//tbody/tr[6]/td[2]/strong");
    public By imageVariant6 = By.xpath("//form[6]//tbody/tr[6]/td[3]/div");
    public By productCostVariant6 = By.xpath("//form[6]//tbody/tr[6]/td[4]//descendant::input");
    public By suggetPriceVariant6= By.xpath("//form[6]//tbody/tr[6]/td[5]//descendant::input");
    public By skuVariant6 = By.xpath("//form[6]//tbody/tr[6]/td[6]//descendant::input");
    //variant8
    public By variant8= By.xpath("//form[6]//tbody/tr[8]/td[2]/strong");
    public By imageVariant8 = By.xpath("//form[6]//tbody/tr[8]/td[3]/div");
    public By imageBlue= By.xpath("//div[contains(text(),'Gallery')]//ancestor::div[4]/div[2]//descendant::img[3]");
    public By productCostVariant8 = By.xpath("//form[6]//tbody/tr[8]/td[4]//descendant::input");
    public By suggetPriceVariant8= By.xpath("//form[6]//tbody/tr[8]/td[5]//descendant::input");
    public By skuVariant8 = By.xpath("//form[6]//tbody/tr[8]/td[6]//descendant::input");
    //variant7
    public By variant7= By.xpath("//form[6]//tbody/tr[7]/td[2]/strong");
    public By imageVariant7 = By.xpath("//form[6]//tbody/tr[7]/td[3]/div");
    public By productCostVariant7 = By.xpath("//form[6]//tbody/tr[7]/td[4]//descendant::input");
    public By suggetPriceVariant7= By.xpath("//form[6]//tbody/tr[7]/td[5]//descendant::input");
    public By skuVariant7 = By.xpath("//form[6]//tbody/tr[7]/td[6]//descendant::input");
    //variant9
    public By variant9= By.xpath("//form[6]//tbody/tr[9]/td[2]/strong");
    public By imageVariant9 = By.xpath("//form[6]//tbody/tr[9]/td[3]/div");
    public By productCostVariant9 = By.xpath("//form[6]//tbody/tr[9]/td[4]//descendant::input");
    public By suggetPriceVariant9= By.xpath("//form[6]//tbody/tr[9]/td[5]//descendant::input");
    public By skuVariant9 = By.xpath("//form[6]//tbody/tr[9]/td[6]//descendant::input");
    // Shipping infomation
    public By shippingInformationSection= By.id("shipping_id");
    public By addMoreBtn= By.xpath("//div[@id='shipping_id']//button");
    public By region = By.xpath("//span[contains(text(),'Type region')]/ancestor::div[1]");
    public By UnitedStates = By.xpath("//body//descendant::li[@title='United States']");
    public By Vietnam = By.xpath("//body//descendant::li[@title='Vietnam']");
    public By firstItem = By.xpath("//div[@id='shipping_id']//descendant::input[2]");
    public By additionalItem = By.xpath("//div[@id='shipping_id']//descendant::input[3]");
    public By region2= By.xpath("//span[contains(text(),'Type region')]/ancestor::div[1]");
    public By Australia = By.xpath("//body//descendant::li[@title='Australia']");
    public By Japan = By.xpath("//body//descendant::li[@title='Japan']");
    public By firstItem2 = By.xpath("//div[@id='shipping_id']//descendant::input[2][@value ='0']");
    public By additionalItem2 = By.xpath("//form[8]//preceding::input[1]");
    //Policy product
    public By policySection = By.id("policy_id");
    public By return_refundBtn = By.xpath("//div[@id='rc-tabs-1-tab-2']/parent::div");
    public By iframeAboutProduct= By.xpath("//div[@id='policy_id']//descendant::iframe");
    public By descriptionPolicy = By.xpath("//body[@id='tinymce']");
    //Save
    public By saveBtn = By.xpath("//span[contains(text(),'Save')]//parent::button");



}
