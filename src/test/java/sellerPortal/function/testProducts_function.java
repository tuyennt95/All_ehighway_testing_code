package sellerPortal.function;

import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.testProducts_page;

public class testProducts_function extends basePage {
    public testProducts_function(WebDriver driver) {
        super(driver);
    }
    testProducts_page testProductsPage =new testProducts_page();

    common_function commonFunction =new common_function(driver);
    public void clickAddProduct(){
        commonFunction.click(testProductsPage.addProductBtn);
    }
    public void createTitleProduct(){
        commonFunction.senKeys(testProductsPage.titleProduct,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        Assert.assertEquals("Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional",commonFunction.getValue(testProductsPage.titleProduct));
    }
    public void createDescription() throws InterruptedException {
        commonFunction.switchIframe(testProductsPage.iframeDescription);
        commonFunction.senKeys(testProductsPage.description,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR\n"+
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
        Thread.sleep(5000);
        commonFunction.verifyElement(testProductsPage.description,description);

    }
    public void createSpecification() throws InterruptedException {
        commonFunction.switchIframe(testProductsPage.iframeSpecification);
        commonFunction.senKeys(testProductsPage.specification,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
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
        commonFunction.verifyElement(testProductsPage.specification,specification);
    }
    public void addImage() throws InterruptedException {
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(testProductsPage.addImageProduct,"D:\\AION\\ảnh test\\áo\\áo tím.webp");
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(testProductsPage.addImageProduct,"D:\\Aion\\ảnh test\\áo\\áo xám.webp");
//        commonFunction.click(myProductsPage.addImageProduct);
        commonFunction.uploadFile(testProductsPage.addImageProduct,"D:\\Aion\\ảnh test\\áo\\áo xanh.webp");

    }
    public void addProductCost(){
        commonFunction.senKeys(testProductsPage.productCost,"5.33");
        Assert.assertEquals("5.33",commonFunction.getValue(testProductsPage.productCost));
        Assert.assertEquals("15.99",commonFunction.getValue(testProductsPage.suggestPrice));
    }
    public void addOption(){
        commonFunction.click(testProductsPage.addAnotherOption);
        commonFunction.senKeys(testProductsPage.optionName1,"Color");
        commonFunction.senKeys(testProductsPage.value1Option1,"Purple");
        commonFunction.senKeys(testProductsPage.value2Option1,"Gray");
        commonFunction.senKeys(testProductsPage.value3Option1,"Blue");
        commonFunction.click(testProductsPage.addAnotherOption2);
        commonFunction.senKeys(testProductsPage.optionName2,"Size");
        commonFunction.senKeys(testProductsPage.value1Option2,"S");
        commonFunction.senKeys(testProductsPage.value2Option2,"M");
        commonFunction.senKeys(testProductsPage.value3Option2,"L");
    }
    public void verifyVariants() throws InterruptedException {
        commonFunction.verifyElement(testProductsPage.variant1,"Purple / S");
        commonFunction.click(testProductsPage.imageVariant1);
        commonFunction.click(testProductsPage.imagePurple);
        commonFunction.scroll(testProductsPage.confirmBtn);
        commonFunction.click(testProductsPage.confirmBtn);
        commonFunction.senKeyPrice(testProductsPage.productCostVariant1,"5.33");
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant1,"15.99");
        commonFunction.senKeys(testProductsPage.skuVariant1,"Test12345");

        //apply to all
        commonFunction.click(testProductsPage.applyToAllImageV1);
        commonFunction.click(testProductsPage.confirmApplyToAll);
        commonFunction.click(testProductsPage.applyToAllProductCostV1);
        commonFunction.click(testProductsPage.confirmApplyToAll2);
        commonFunction.click(testProductsPage.applyToAllSuggestPriceV1);
        commonFunction.click(testProductsPage.confirmApplyToAll3);
        commonFunction.click(testProductsPage.applyToAllSkuV1);
        commonFunction.click(testProductsPage.confirmApplyToAll4);
    }
    public void addShippingInformation() throws InterruptedException {
        commonFunction.scroll(testProductsPage.shippingInformation);
        commonFunction.click(testProductsPage.addMoreBtn);
        commonFunction.click(testProductsPage.region);
        commonFunction.click(testProductsPage.UnitedStates);
        commonFunction.click(testProductsPage.Vietnam);
        commonFunction.senKeyPrice(testProductsPage.firstItem,"4.99");
        Assert.assertEquals("4.99",commonFunction.getValue(testProductsPage.additionalItem));
        commonFunction.senKeyPrice(testProductsPage.additionalItem,"3.99");
    }
    public void policyProduct(){
        commonFunction.switchIframe(testProductsPage.iframeAboutProduct);
        commonFunction.senKeys(testProductsPage.descriptionPolicy,"About This Product");
        driver.switchTo().defaultContent();
        commonFunction.click(testProductsPage.return_refundBtn);
        commonFunction.switchIframe(testProductsPage.iframeAboutProduct);
        commonFunction.senKeys(testProductsPage.descriptionPolicy,"return and refund product");
    }
    public void save(){
        driver.switchTo().defaultContent();
        commonFunction.click(testProductsPage.saveBtn);
        commonFunction.verifyPage(testProductsPage.testProducts);
    }
    public void saveAndRequest(){
        driver.switchTo().defaultContent();
        commonFunction.click(testProductsPage.saveAndRequestBtn);

        commonFunction.click(testProductsPage.requestSourcingBtn);
        commonFunction.verifyPage(testProductsPage.requestSourcingPage);
    }
    public void verifyMes(){
        commonFunction.click(testProductsPage.saveBtn);
        commonFunction.verifyPage(testProductsPage.mesError);
    }
    public void viewEditProduct(){
        commonFunction.click(testProductsPage.productName);
        commonFunction.click(testProductsPage.editBtn);
        commonFunction.verifyPage(testProductsPage.editSellpageTitle);
    }
    public void editTitleProduct(){
        commonFunction.senKeyPrice(testProductsPage.titleProduct,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        String titleProduct = "Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional";
        Assert.assertEquals(titleProduct,commonFunction.getValue(testProductsPage.titleProduct));
    }
    public void editDescriptionProduct(){
        commonFunction.switchIframe(testProductsPage.iframeDescription);
        commonFunction.senKeyPrice(testProductsPage.description,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
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
        commonFunction.verifyElement(testProductsPage.description,description);
//        Assert.assertEquals(description,commonFunction.getValue(myProductsPage.description));
    }
    public void editSpecificationProduct() {
        commonFunction.switchIframe(testProductsPage.iframeSpecification);
        commonFunction.senKeys(testProductsPage.specification,
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
        commonFunction.verifyElement(testProductsPage.specification,specification);
    }
    public void editImage() throws InterruptedException {
        commonFunction.uploadFile(testProductsPage.addImageProduct,"D:\\Aion\\ảnh test\\set quan áo.jpg");
        commonFunction.verifyPage(testProductsPage.image4);
        commonFunction.Hover(testProductsPage.image4);
        commonFunction.click(testProductsPage.iconDelete);
//        commonFunction.isElementDisplayed(myProductsPage.image4);
        commonFunction.uploadFile(testProductsPage.addImageProduct,"D:\\Aion\\ảnh test\\áo.jpg");
    }
    public void editPricing(){
        commonFunction.senKeyPrice(testProductsPage.productCost,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(testProductsPage.productCost));
        Assert.assertEquals("18.99",commonFunction.getValue(testProductsPage.suggestPrice));
        commonFunction.senKeyPrice(testProductsPage.suggestPrice,"20");
        Assert.assertEquals("20",commonFunction.getValue(testProductsPage.suggestPrice));

    }
    public void editVariants() throws InterruptedException {
        //variants1
        commonFunction.verifyElement(testProductsPage.variant1,"Purple / S");
        commonFunction.senKeyPrice(testProductsPage.productCostVariant1,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(testProductsPage.productCostVariant1));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant1,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(testProductsPage.suggetPriceVariant1));
        //variants2
        commonFunction.verifyElement(testProductsPage.variant2,"Purple / M");
        commonFunction.senKeyPrice(testProductsPage.productCostVariant2,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(testProductsPage.productCostVariant2));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant2,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(testProductsPage.suggetPriceVariant2));
        Assert.assertEquals("Test12345",commonFunction.getValue(testProductsPage.skuVariant2));
        //variant3
        commonFunction.verifyElement(testProductsPage.variant3,"Purple / L");
        commonFunction.senKeyPrice(testProductsPage.productCostVariant3,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(testProductsPage.productCostVariant3));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant3,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(testProductsPage.suggetPriceVariant3));
        Assert.assertEquals("Test12345",commonFunction.getValue(testProductsPage.skuVariant3));
        //variant4
        commonFunction.verifyElement(testProductsPage.variant4,"Gray / S");
        commonFunction.click(testProductsPage.imageVariant4);
        commonFunction.click(testProductsPage.imageGray);
        commonFunction.scroll(testProductsPage.confirmBtn);
        commonFunction.click(testProductsPage.confirmBtn);
        commonFunction.senKeyPrice(testProductsPage.productCostVariant4,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(testProductsPage.productCostVariant4));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant4,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(testProductsPage.suggetPriceVariant4));
        Assert.assertEquals("Test12345",commonFunction.getValue(testProductsPage.skuVariant4));
        //variant5
        commonFunction.verifyElement(testProductsPage.variant5,"Gray / M");
        commonFunction.click(testProductsPage.imageVariant5);
        commonFunction.click(testProductsPage.imageGray);
        commonFunction.click(testProductsPage.confirmBtn);
        commonFunction.senKeyPrice(testProductsPage.productCostVariant5,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(testProductsPage.productCostVariant5));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant5,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(testProductsPage.suggetPriceVariant5));
        Assert.assertEquals("Test12345",commonFunction.getValue(testProductsPage.skuVariant5));
        //variant6
        commonFunction.verifyElement(testProductsPage.variant6,"Gray / L");
        commonFunction.click(testProductsPage.imageVariant6);
        commonFunction.click(testProductsPage.imageGray);
        commonFunction.scroll(testProductsPage.confirmBtn);
        commonFunction.click(testProductsPage.confirmBtn);
        commonFunction.senKeyPrice(testProductsPage.productCostVariant6,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(testProductsPage.productCostVariant6));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant6,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(testProductsPage.suggetPriceVariant6));
        Assert.assertEquals("Test12345",commonFunction.getValue(testProductsPage.skuVariant6));
        //variant7
        commonFunction.verifyElement(testProductsPage.variant7,"Blue / S");
        commonFunction.click(testProductsPage.imageVariant7);
        commonFunction.click(testProductsPage.imageBlue);
        commonFunction.scroll(testProductsPage.confirmBtn);
        commonFunction.click(testProductsPage.confirmBtn);
        commonFunction.senKeyPrice(testProductsPage.productCostVariant7,"6.33");
        Assert.assertEquals("6.33",commonFunction.getValue(testProductsPage.productCostVariant7));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant7,"18.99");
        Assert.assertEquals("18.99",commonFunction.getValue(testProductsPage.suggetPriceVariant7));
        Assert.assertEquals("Test12345",commonFunction.getValue(testProductsPage.skuVariant7));
        //variant8
        commonFunction.verifyElement(testProductsPage.variant8,"Blue / M");
        commonFunction.click(testProductsPage.imageVariant8);
        commonFunction.click(testProductsPage.imageBlue);
        commonFunction.click(testProductsPage.confirmBtn);
        commonFunction.senKeyPrice(testProductsPage.productCostVariant8,"7.33");
        Assert.assertEquals("7.33",commonFunction.getValue(testProductsPage.productCostVariant8));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant8,"21.99");
        Assert.assertEquals("21.99",commonFunction.getValue(testProductsPage.suggetPriceVariant8));
        Assert.assertEquals("Test12345",commonFunction.getValue(testProductsPage.skuVariant8));
        //variant9
        commonFunction.verifyElement(testProductsPage.variant9,"Blue / L");
        commonFunction.click(testProductsPage.imageVariant9);
        commonFunction.click(testProductsPage.imageBlue);
        commonFunction.scroll(testProductsPage.confirmBtn);
        commonFunction.click(testProductsPage.confirmBtn);
        commonFunction.senKeyPrice(testProductsPage.productCostVariant9,"8.33");
        Assert.assertEquals("8.33",commonFunction.getValue(testProductsPage.productCostVariant9));
        commonFunction.senKeyPrice(testProductsPage.suggetPriceVariant9,"24.99");
        Assert.assertEquals("24.99",commonFunction.getValue(testProductsPage.suggetPriceVariant9));
        Assert.assertEquals("Test12345",commonFunction.getValue(testProductsPage.skuVariant9));

    }
    public void editShippingInfomation() throws InterruptedException {
        commonFunction.senKeyPrice(testProductsPage.firstItem,"5.99");
        Assert.assertEquals("5.99",commonFunction.getValue(testProductsPage.additionalItem));
        commonFunction.senKeyPrice(testProductsPage.additionalItem,"4.99");
        commonFunction.click(testProductsPage.addMoreBtn);
        commonFunction.click(testProductsPage.region2);
        commonFunction.click(testProductsPage.Australia);
        commonFunction.click(testProductsPage.Japan);
        commonFunction.senKeyPrice(testProductsPage.firstItem2,"5.99");
        Assert.assertEquals("5.99",commonFunction.getValue(testProductsPage.additionalItem2));
        commonFunction.senKeyPrice(testProductsPage.additionalItem2,"4.5");
        Assert.assertEquals("4.5",commonFunction.getValue(testProductsPage.additionalItem2));

    }
    public void editPolicy(){
        commonFunction.switchIframe(testProductsPage.iframeAboutProduct);
        commonFunction.senKeyPrice(testProductsPage.descriptionPolicy,"About This Product Update");
        String s1="About This Product Update";
        commonFunction.verifyElement(testProductsPage.descriptionPolicy,s1);
        driver.switchTo().defaultContent();
        commonFunction.click(testProductsPage.return_refundBtn);
        commonFunction.switchIframe(testProductsPage.iframeAboutProduct);
        commonFunction.senKeyPrice(testProductsPage.descriptionPolicy,"Return and refund product Update");
        String s2 ="Return and refund product Update";
        commonFunction.verifyElement(testProductsPage.descriptionPolicy,s2);
    }
    public void saveEditProduct(){
        driver.switchTo().defaultContent();
        commonFunction.click(testProductsPage.saveBtn);
        commonFunction.verifyElement(testProductsPage.mesSuccess,"Update product success");
    }
    public void requestSourcing() throws InterruptedException {
        commonFunction.Hover(testProductsPage.product1);
        commonFunction.click(testProductsPage.action);
        commonFunction.click(testProductsPage.requestSourcing);
        commonFunction.verifyElement(testProductsPage.confirmPopup,"Confirm");
        commonFunction.click(testProductsPage.requestSourcingBtnConfirm);
        Thread.sleep(5000);
        System.out.println(commonFunction.getText(testProductsPage.requestStatus));
        commonFunction.verifyElement(testProductsPage.requestStatus,"Requesting");
        commonFunction.Hover(testProductsPage.action);
        System.out.println(commonFunction.getText(testProductsPage.sellThisProductBtn));
        commonFunction.verifyElement(testProductsPage.sellThisProductBtn,"Sell this product");
    }
    public void viewProductDetail(){
        commonFunction.click(testProductsPage.myProduct1);
        commonFunction.click(testProductsPage.sellThisProductBtn2);
    }
    public void viewPrivateProduct(){
        commonFunction.click(testProductsPage.privateProductBtn);
    }
}
