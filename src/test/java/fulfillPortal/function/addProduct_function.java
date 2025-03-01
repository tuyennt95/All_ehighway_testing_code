package fulfillPortal.function;

import core.basePage;
import core.common_function;
import fulfillPortal.page.addProduct_page;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;

public class addProduct_function extends basePage {
    public addProduct_function(WebDriver driver) {
        super(driver);
    }
    addProduct_page addProductPage =new addProduct_page();
    common_function commonFunction =new common_function(driver);
    public void addTitleProduct(){
//        commonFunction.verifyPage(addProductPage.addProductText);
        commonFunction.senKeys(addProductPage.titleProduct,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        String titleProduct = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional";
        Assert.assertEquals(titleProduct,commonFunction.getValue(addProductPage.titleProduct));
    }
    public void createDescription() throws InterruptedException {
        commonFunction.switchIframe(addProductPage.iframeDescription);
        commonFunction.senKeys(addProductPage.description,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n" +
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        String description = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n" +
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional";
        commonFunction.verifyElement(addProductPage.description,description);

    }
    public void createSpecification() throws InterruptedException {
        commonFunction.switchIframe(addProductPage.iframeSpecification);
        commonFunction.senKeys(addProductPage.specification,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n"+
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        String specification = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n" +
                "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional";
        commonFunction.verifyElement(addProductPage.specification,specification);
    }
    public void addImage() throws InterruptedException {
        commonFunction.scroll(addProductPage.iframeAboutProduct);
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(addProductPage.addImageProduct,"D:\\Aion\\ảnh test\\áo\\áo tím.webp");
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(addProductPage.addImageProduct,"D:\\Aion\\ảnh test\\áo\\áo xám.webp");
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(addProductPage.addImageProduct,"D:\\Aion\\ảnh test\\áo\\áo xanh.webp");

    }
    public void addProductCost(){
        commonFunction.senKeys(addProductPage.productCost,"5.33");
        Assert.assertEquals("5.33",commonFunction.getValue(addProductPage.productCost));
        Assert.assertEquals("15.99",commonFunction.getValue(addProductPage.suggestPrice));
        commonFunction.senKeyPrice(addProductPage.suggestPrice,"20");
        Assert.assertEquals("20",commonFunction.getValue(addProductPage.suggestPrice));
    }
    public void addOption(){
        commonFunction.click(addProductPage.addAnotherOption);
        commonFunction.senKeys(addProductPage.optionName1,"Color");
        commonFunction.senKeys(addProductPage.value1Option1,"Purple");
        commonFunction.senKeys(addProductPage.value2Option1,"Gray");
        commonFunction.senKeys(addProductPage.value3Option1,"Blue");
        commonFunction.click(addProductPage.addAnotherOption);
        commonFunction.senKeys(addProductPage.optionName2,"Size");
        commonFunction.senKeys(addProductPage.value1Option2,"S");
        commonFunction.senKeys(addProductPage.value2Option2,"M");
        commonFunction.senKeys(addProductPage.value3Option2,"L");
    }
    public void verifyVariants() throws InterruptedException {
        //variants1
        commonFunction.scroll(addProductPage.sectionVariant);
        commonFunction.verifyElement(addProductPage.variant1,"Purple / S");
        commonFunction.click(addProductPage.imageVariant1);
        commonFunction.click(addProductPage.imageVariant1);
        commonFunction.click(addProductPage.image1);
        commonFunction.senKeyPrice(addProductPage.productCostVariant1,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(addProductPage.productCostVariant1));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant1,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(addProductPage.suggetPriceVariant1));
        commonFunction.senKeys(addProductPage.skuVariant1,"Test123451");
        Assert.assertEquals("Test123451",commonFunction.getValue(addProductPage.skuVariant1));
        //variants2
        commonFunction.verifyElement(addProductPage.variant2,"Purple / M");
        commonFunction.click(addProductPage.imageVariant2);
        commonFunction.click(addProductPage.image1);
        commonFunction.senKeyPrice(addProductPage.productCostVariant2,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(addProductPage.productCostVariant2));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant2,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(addProductPage.suggetPriceVariant2));
        commonFunction.senKeys(addProductPage.skuVariant2,"Test123452");
        Assert.assertEquals("Test123452",commonFunction.getValue(addProductPage.skuVariant2));
        //variant3
        commonFunction.verifyElement(addProductPage.variant3,"Purple / L");
        commonFunction.click(addProductPage.imageVariant3);
        commonFunction.click(addProductPage.image1);
        commonFunction.senKeyPrice(addProductPage.productCostVariant3,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(addProductPage.productCostVariant3));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant3,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(addProductPage.suggetPriceVariant3));
        commonFunction.senKeys(addProductPage.skuVariant3,"Test123453");
        Assert.assertEquals("Test123453",commonFunction.getValue(addProductPage.skuVariant3));
        //variant4
        commonFunction.verifyElement(addProductPage.variant4,"Gray / S");
        commonFunction.click(addProductPage.imageVariant4);
        commonFunction.click(addProductPage.imageGray);
//        commonFunction.scroll(addProductPage.confirmBtn);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant4,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(addProductPage.productCostVariant4));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant4,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(addProductPage.suggetPriceVariant4));
        commonFunction.senKeys(addProductPage.skuVariant4,"Test123454");
        Assert.assertEquals("Test123454",commonFunction.getValue(addProductPage.skuVariant4));
        //variant5
        commonFunction.verifyElement(addProductPage.variant5,"Gray / M");
        commonFunction.click(addProductPage.imageVariant5);
        commonFunction.click(addProductPage.imageGray);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant5,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(addProductPage.productCostVariant5));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant5,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(addProductPage.suggetPriceVariant5));
        commonFunction.senKeys(addProductPage.skuVariant5,"Test123455");
        Assert.assertEquals("Test123455",commonFunction.getValue(addProductPage.skuVariant5));
        //variant6
        commonFunction.verifyElement(addProductPage.variant6,"Gray / L");
        commonFunction.click(addProductPage.imageVariant6);
        commonFunction.click(addProductPage.imageGray);
//        commonFunction.scroll(addProductPage.confirmBtn);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant6,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(addProductPage.productCostVariant6));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant6,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(addProductPage.suggetPriceVariant6));
        commonFunction.senKeys(addProductPage.skuVariant6,"Test123456");
        Assert.assertEquals("Test123456",commonFunction.getValue(addProductPage.skuVariant6));
        //variant7
        commonFunction.verifyElement(addProductPage.variant7,"Blue / S");
        commonFunction.click(addProductPage.imageVariant7);
        commonFunction.click(addProductPage.imageBlue);
//        commonFunction.scroll(addProductPage.confirmBtn);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant7,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(addProductPage.productCostVariant7));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant7,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(addProductPage.suggetPriceVariant7));
        commonFunction.senKeys(addProductPage.skuVariant7,"Test123457");
        Assert.assertEquals("Test123457",commonFunction.getValue(addProductPage.skuVariant7));
        //variant8
        commonFunction.verifyElement(addProductPage.variant8,"Blue / M");
        commonFunction.click(addProductPage.imageVariant8);
        commonFunction.click(addProductPage.imageBlue);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant8,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(addProductPage.productCostVariant8));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant8,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(addProductPage.suggetPriceVariant8));
        commonFunction.senKeys(addProductPage.skuVariant8,"Test123458");
        Assert.assertEquals("Test123458",commonFunction.getValue(addProductPage.skuVariant8));
        //variant9
        commonFunction.verifyElement(addProductPage.variant9,"Blue / L");
        commonFunction.click(addProductPage.imageVariant9);
        commonFunction.click(addProductPage.imageBlue);
//        commonFunction.scroll(addProductPage.confirmBtn);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant9,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(addProductPage.productCostVariant9));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant9,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(addProductPage.suggetPriceVariant9));
        commonFunction.senKeys(addProductPage.skuVariant9,"Test123459");
        Assert.assertEquals("Test123459",commonFunction.getValue(addProductPage.skuVariant9));

    }
    //    public void verifyVariants(){
//        commonFunction.verifyElement(myProductsPage.variant1,"Purple / S");
//        commonFunction.click(myProductsPage.imageVariant1);
//        commonFunction.click(myProductsPage.confirmBtn);
//        commonFunction.senKeyPrice(myProductsPage.productCostVariant1,"5.33");
//        commonFunction.senKeyPrice(myProductsPage.suggetPriceVariant1,"15.99");
//        commonFunction.senKeys(myProductsPage.skuVariant1,"Test12345");
//
//        //apply to all
//        commonFunction.click(myProductsPage.applyToAllImageV1);
//        commonFunction.click(myProductsPage.confirmApplyToAll);
//        commonFunction.click(myProductsPage.applyToAllProductCostV1);
//        commonFunction.click(myProductsPage.confirmApplyToAll2);
//        commonFunction.click(myProductsPage.applyToAllSuggestPriceV1);
//        commonFunction.click(myProductsPage.confirmApplyToAll3);
//        commonFunction.click(myProductsPage.applyToAllSkuV1);
//        commonFunction.click(myProductsPage.confirmApplyToAll4);
//    }
    public void addShippingInformation() throws InterruptedException {
        commonFunction.scroll(addProductPage.shippingInformation);
        commonFunction.click(addProductPage.addMoreBtn);
        commonFunction.click(addProductPage.region);
        commonFunction.click(addProductPage.UnitedStates);
        commonFunction.click(addProductPage.Vietnam);
        commonFunction.senKeyPrice(addProductPage.firstItem,"4.99");
        Assert.assertEquals("4.99",commonFunction.getValue(addProductPage.additionalItem));
        commonFunction.senKeyPrice(addProductPage.additionalItem,"3.99");
    }
    public void policyProduct(){
        commonFunction.switchIframe(addProductPage.iframeAboutProduct);
        commonFunction.senKeys(addProductPage.descriptionPolicy,"About This Product");
        driver.switchTo().defaultContent();
        commonFunction.click(addProductPage.return_refundBtn);
        commonFunction.switchIframe(addProductPage.iframeAboutProduct);
        commonFunction.senKeys(addProductPage.descriptionPolicy,"return and refund product");
    }
    public void save(){
        driver.switchTo().defaultContent();
        commonFunction.click(addProductPage.saveBtn);
//        commonFunction.verifyPage(addProductPage.myProducts);

    }
    //    public void verifyMes(){
//        commonFunction.click(myProductsPage.saveBtn);
//        commonFunction.verifyPage(myProductsPage.mesError);
//    }
    public void editTitleProduct(){
        commonFunction.senKeyPrice(addProductPage.titleProduct,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        String titleProduct = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional";
        Assert.assertEquals(titleProduct,commonFunction.getValue(addProductPage.titleProduct));
    }
    public void editDescriptionProduct(){
        commonFunction.switchIframe(addProductPage.iframeDescription);
        commonFunction.senKeyPrice(addProductPage.description,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR");
        String description = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR";
        commonFunction.verifyElement(addProductPage.description,description);
//        Assert.assertEquals(description,commonFunction.getValue(myProductsPage.description));
    }
    public void editSpecificationProduct() {
        commonFunction.switchIframe(addProductPage.iframeSpecification);
        commonFunction.senKeys(addProductPage.specification,
                "Material: NYLON\n" +
                        "Material: spandex\n" +
                        "Feature: Anti-Wrinkle\n" +
                        "Feature: Anti-Pilling\n" +
                        "Feature: Waterproof\n" +
                        "Feature: Quick Dry\n" +
                        "Feature: Windproof\n" +
                        "Collar: MANDARIN COLLAR");
        String specification =
                "Material: NYLON\n" +
                        "Material: spandex\n" +
                        "Feature: Anti-Wrinkle\n" +
                        "Feature: Anti-Pilling\n" +
                        "Feature: Waterproof\n" +
                        "Feature: Quick Dry\n" +
                        "Feature: Windproof\n" +
                        "Collar: MANDARIN COLLAR" ;
        commonFunction.verifyElement(addProductPage.specification,specification);
    }
    public void editImage() throws InterruptedException {
        commonFunction.scroll(addProductPage.iframeAboutProduct);
        commonFunction.uploadFile(addProductPage.addImageProduct,"D:\\Aion\\ảnh test\\set quan áo.jpg");
//        commonFunction.verifyPage(addProductPage.image4);
//        commonFunction.Hover(addProductPage.image4);
//        commonFunction.click(addProductPage.iconDelete);
////        commonFunction.isElementDisplayed(myProductsPage.image4);
        commonFunction.uploadFile(addProductPage.addImageProduct,"D:\\Aion\\ảnh test\\áo.jpg");
    }
    public void editPricing(){
        commonFunction.senKeyPrice(addProductPage.productCost,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(addProductPage.productCost));
        Assert.assertEquals("18.99",commonFunction.getValue(addProductPage.suggestPrice));
        commonFunction.senKeyPrice(addProductPage.suggestPrice,"20");
        Assert.assertEquals("20",commonFunction.getValue(addProductPage.suggestPrice));

    }
    public void editVariants() throws InterruptedException {
        //variants1
        commonFunction.verifyElement(addProductPage.variant1,"Purple / S");
        commonFunction.click(addProductPage.imageVariant1);
        commonFunction.click(addProductPage.imageVariant1);
        commonFunction.click(addProductPage.image1);
        commonFunction.senKeyPrice(addProductPage.productCostVariant1,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(addProductPage.productCostVariant1));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant1,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(addProductPage.suggetPriceVariant1));
        commonFunction.senKeyPrice(addProductPage.skuVariant1,"Test1234561");
        Assert.assertEquals("Test1234561",commonFunction.getValue(addProductPage.skuVariant1));
        //variants2
        commonFunction.verifyElement(addProductPage.variant2,"Purple / M");
        commonFunction.click(addProductPage.imageVariant2);
        commonFunction.click(addProductPage.image1);
        commonFunction.senKeyPrice(addProductPage.productCostVariant2,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(addProductPage.productCostVariant2));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant2,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(addProductPage.suggetPriceVariant2));
        commonFunction.senKeyPrice(addProductPage.skuVariant2,"Test1234562");
        Assert.assertEquals("Test1234562",commonFunction.getValue(addProductPage.skuVariant2));
        //variant3
        commonFunction.verifyElement(addProductPage.variant3,"Purple / L");
        commonFunction.click(addProductPage.imageVariant3);
        commonFunction.click(addProductPage.image1);
        commonFunction.senKeyPrice(addProductPage.productCostVariant3,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(addProductPage.productCostVariant3));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant3,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(addProductPage.suggetPriceVariant3));
        commonFunction.senKeyPrice(addProductPage.skuVariant3,"Test1234563");
        Assert.assertEquals("Test1234563",commonFunction.getValue(addProductPage.skuVariant3));
        //variant4
        commonFunction.verifyElement(addProductPage.variant4,"Gray / S");
        commonFunction.click(addProductPage.imageVariant4);
        commonFunction.click(addProductPage.imageGray);
//        commonFunction.scroll(addProductPage.confirmBtn);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant4,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(addProductPage.productCostVariant4));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant4,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(addProductPage.suggetPriceVariant4));
        commonFunction.senKeyPrice(addProductPage.skuVariant4,"Test1234564");
        Assert.assertEquals("Test1234564",commonFunction.getValue(addProductPage.skuVariant4));
        //variant5
        commonFunction.verifyElement(addProductPage.variant5,"Gray / M");
        commonFunction.click(addProductPage.imageVariant5);
        commonFunction.click(addProductPage.imageGray);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant5,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(addProductPage.productCostVariant5));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant5,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(addProductPage.suggetPriceVariant5));
        commonFunction.senKeyPrice(addProductPage.skuVariant5,"Test1234565");
        Assert.assertEquals("Test1234565",commonFunction.getValue(addProductPage.skuVariant5));
        //variant6
        commonFunction.verifyElement(addProductPage.variant6,"Gray / L");
        commonFunction.click(addProductPage.imageVariant6);
        commonFunction.click(addProductPage.imageGray);
//        commonFunction.scroll(addProductPage.confirmBtn);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant6,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(addProductPage.productCostVariant6));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant6,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(addProductPage.suggetPriceVariant6));
        commonFunction.senKeyPrice(addProductPage.skuVariant6,"Test1234566");
        Assert.assertEquals("Test1234566",commonFunction.getValue(addProductPage.skuVariant6));
        //variant7
        commonFunction.verifyElement(addProductPage.variant7,"Blue / S");
        commonFunction.click(addProductPage.imageVariant7);
        commonFunction.click(addProductPage.imageBlue);
//        commonFunction.scroll(addProductPage.confirmBtn);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant7,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(addProductPage.productCostVariant7));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant7,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(addProductPage.suggetPriceVariant7));
        commonFunction.senKeyPrice(addProductPage.skuVariant7,"Test1234567");
        Assert.assertEquals("Test1234567",commonFunction.getValue(addProductPage.skuVariant7));
        //variant8
        commonFunction.verifyElement(addProductPage.variant8,"Blue / M");
        commonFunction.click(addProductPage.imageVariant8);
        commonFunction.click(addProductPage.imageBlue);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant8,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(addProductPage.productCostVariant8));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant8,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(addProductPage.suggetPriceVariant8));
        commonFunction.senKeyPrice(addProductPage.skuVariant8,"Test1234568");
        Assert.assertEquals("Test1234568",commonFunction.getValue(addProductPage.skuVariant8));
        //variant9
        commonFunction.verifyElement(addProductPage.variant9,"Blue / L");
        commonFunction.click(addProductPage.imageVariant9);
        commonFunction.click(addProductPage.imageBlue);
//        commonFunction.scroll(addProductPage.confirmBtn);
//        commonFunction.click(addProductPage.confirmBtn);
        commonFunction.senKeyPrice(addProductPage.productCostVariant9,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(addProductPage.productCostVariant9));
        commonFunction.senKeyPrice(addProductPage.suggetPriceVariant9,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(addProductPage.suggetPriceVariant9));
        commonFunction.senKeyPrice(addProductPage.skuVariant9,"Test1234569");
        Assert.assertEquals("Test1234569",commonFunction.getValue(addProductPage.skuVariant9));

    }
    public void editShippingInfomation() throws InterruptedException {
        commonFunction.senKeyPrice(addProductPage.firstItem, "5.99");
        Assert.assertEquals("5.99", commonFunction.getValue(addProductPage.additionalItem));
        commonFunction.senKeyPrice(addProductPage.additionalItem, "4.99");
        commonFunction.click(addProductPage.addMoreBtn);
        commonFunction.click(addProductPage.region2);
        commonFunction.click(addProductPage.Australia);
        commonFunction.click(addProductPage.Japan);
        commonFunction.senKeyPrice(addProductPage.firstItem2, "5.99");
        Assert.assertEquals("5.99", commonFunction.getValue(addProductPage.additionalItem2));
        commonFunction.senKeyPrice(addProductPage.additionalItem2, "4.5");
        Assert.assertEquals("4.5", commonFunction.getValue(addProductPage.additionalItem2));
    }

    public void editPolicy(){
        commonFunction.switchIframe(addProductPage.iframeAboutProduct);
        commonFunction.senKeyPrice(addProductPage.descriptionPolicy,"About This Product Update");
        String s1="About This Product Update";
        commonFunction.verifyElement(addProductPage.descriptionPolicy,s1);
        driver.switchTo().defaultContent();
        commonFunction.click(addProductPage.return_refundBtn);
        commonFunction.switchIframe(addProductPage.iframeAboutProduct);
        commonFunction.senKeyPrice(addProductPage.descriptionPolicy,"Return and refund product Update");
        String s2 ="Return and refund product Update";
        commonFunction.verifyElement(addProductPage.descriptionPolicy,s2);
    }
    public void saveEditProduct(){
        driver.switchTo().defaultContent();
        commonFunction.click(addProductPage.saveBtn);
//        commonFunction.verifyElement(addProductPage.mesSuccess,"Update product success");
    }
}
