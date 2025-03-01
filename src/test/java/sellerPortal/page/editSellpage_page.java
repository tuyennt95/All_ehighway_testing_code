package sellerPortal.page;

import org.openqa.selenium.By;

public class editSellpage_page {
    public By domainSellpage = By.xpath("//div[contains(text(),'Domain')]//following::a[1]");
    public By titleEditSellpage = By.xpath("//div[contains(text(),'Edit sellpages')]");
    public By chooseLogo = By.xpath("//div[@id='logo']//descendant::button");
    public  By chooseFavicon = By.xpath("//div[@id='favicon']//descendant::button");
    //    public By titleSellpage = By.xpath("//div[@id='title']//descendant::input");
    public By titleSellpage = By.xpath("//input[@id='title']");
    public By addMedia= By.xpath("//div[@id='media']//descendant::div[contains(text(),'Add media')]");

    //    public By priceVariant1= By.xpath("//div[@id='variant']//tbody/tr[2]/td[4]");
//    public By priceVariant1 = By.xpath("//tbody/tr[2]/td[4]/div[1]/div[1]/div[2]/input[1]");
    public By priceVariant1 = By.xpath("//tbody/tr[2]/td[4]/div/div/div[2]/input");
    public By priceVariant2 = By.xpath("//tbody/tr[3]/td[4]/div/div/div[2]/input");

    public By iframeDescription = By.xpath("//div[@id='description']//iframe [@title='Rich Text Area']");

    public By description = By.xpath("//body[@id='tinymce']");

    public By selectTitle= By.xpath("//div[@class='ant-col ant-col-xs-5']/div/div/span/input");

    public By addQuantityDiscount = By.xpath("//span[contains(text(),'Add quantity discount')]");

    public By inputDiscount1 = By.xpath("//span[contains(text(),'Add quantity discount')]//preceding::input[1]");
    //review
    public By addReview = By.xpath("//div[@class='review_review__item__gHDi1']/div");
    public By nameReview= By.id("control-ref_name");
    public By emailReview = By.xpath("//input[@id='control-ref_email']");
    public By titleReview = By.xpath("//input[@id='control-ref_title']");
    public By addImageReview = By.xpath("//div[contains(text(),'Add Image')]");
    public By descriptionReview = By.id("control-ref_description");
    //    public By saveReviewBtn= By.xpath("//body[1]/div[12]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/button[1]/span[1]");
    public By saveReviewBtn= By.xpath("//form[@id='control-ref']//span[contains(text(),'Save')]//parent::button");
    public By savePublicBtn =By.xpath("//span[contains(text(),'Save and publish')]");
    //combo
    public By upsell= By.id("upsell");
    public By addCombo= By.xpath("//span[contains (text(),'Add Another Combo')]");
    //    public By addImageCombo = By.xpath("//div[contains(text(),'Change')]");
    public By addImageCombo = By.xpath("//span[contains(text(),'Add Image')]//ancestor::div[3]");
    public By iframeImageCombo = By.xpath("//body/iframe[1]");
    public  By imageCombo= By.xpath("//div[@class='ant-modal-content']/div/div/div[1]/div/div/img");
    public By comboName =  By.xpath("//input[@placeholder ='Combo name']");
    public By comboPrice = By.xpath("//input[@placeholder ='Combo price']");
    public By compareComboPrice = By.xpath("//input[@placeholder ='Compare at combo price']");
    public By addVariansBtn= By.xpath("//span[contains(text(),'Add variant')]");
    //    public By selectVariant = By.xpath("//span[contains(text(),'Select variants')]");
    public By selectVariant = By.xpath("//span[contains(text(),'Select variants')]//preceding::input[1]");
    public By iframeVariantCombo = By.xpath("//iframe[@src='//r.zozezop.com/statistic?url=https%3A%2F%2Fseller.ehighway.co%2Flogin%3FreturnUrl%3D%252Fsellpages%252F64814a15fc3ccbf79b89742f%253Ftab%253Dtest&id=dc9893e8-c57f-4186-a0cb-f8d8b1347faf']");
    public By variantCombo1 = By.xpath("//div[contains(text(),'Purple - L ')]");
    public By variantCombo2 =By.xpath("//body/div[8]//descendant::div[contains(text(),'Purple - M ')]");
    //Announcement bar
    public By sectionDescription = By.xpath("//div[@id='description']");
    public By inputAnnouncementBar = By.xpath("//input[@placeholder ='Announcement bar']");
    //ass seen on
    public By sectionAsSeenOn = By.xpath("//span[contains(text(),'As seen on')]");
    //shipping

    public By sectionShippingPrice = By.xpath("//span[contains(text(),'Shipping price')]");
    public By option1Shipping = By.xpath("//div[@id ='shipping']//descendant::input");
    public By textOption1 = By.xpath("//div[@id ='shipping']//descendant::label[1]/span[2]/div[1]");
    public By option1Btn = By.xpath("//div[@id ='shipping']//descendant::button");
    public By textOption1Btn = By.xpath("//div[@id ='shipping']//descendant::button/span[2]");
    public By dkShipSetting  = By.xpath("//div[@class = 'ant-input-number-group-addon']/span");
    public By inputShipSetting = By.xpath("//div[@id ='shipping']/div/div/div/div/div/div/div/div[2]//descendant::input[1]");
    public By valueShippingOption1 = By.xpath("//div[@id ='shipping']/div/div/div/div/div/div/div/div[2]//descendant::input[2]");
    public By AddOneMoreBtn = By.xpath("//div[@class='row mt-3']");
    public By textAddOneMoreBtn = By.xpath("//div[@class='row mt-3']/div/span");
    public By inpunShipSetting2 = By.xpath("//div[@id ='shipping']/div/div/div/div/div/div/div/div[2]//descendant::input[3]");
    public By valueShipSetting2 = By.xpath("//div[@id ='shipping']/div/div/div/div/div/div/div/div[2]//descendant::input[4]");
    //image with text
    public By sectionImageWithText = By.xpath("//div[@id ='imageWithText']");
    public By addImageWithTextBtn = By.xpath("//div[@id ='imageWithText']/div/div/div/div/div/div/div/span");
    public By textAddImageWithTextBTn = By.xpath("//div[@id ='imageWithText']/div/div/div/div/div/div/div/span");
    public By imageWithText1 = By.xpath("//div[@id ='imageWithText']/div/div/div/div/div/div/div/div/div");
    public By imageWithTextTitle1= By.xpath("//div[@id ='imageWithText']/div/div/div/div/div/div/div/div/div[2]/div//descendant::input");
    public By imageWithTextDescription1 = By.xpath("//div[@id ='imageWithText']/div/div/div/div/div/div/div/div/div[2]/div[2]//descendant::textarea");
    public By imageWithText2 = By.xpath("//div[@id ='imageWithText']/div/div/div/div/div/div/div[2]/div/div");
    public By imageWithTextTitle2= By.xpath("//div[@id ='imageWithText']/div/div/div/div/div/div/div[2]/div/div[2]//descendant::input");
    public By imageWithTextDescription2 = By.xpath("//div[@id ='imageWithText']/div/div/div/div/div/div/div[2]/div/div[2]//descendant::textarea");
    //TermsOfPolicy
    public By sectionTermsOfPolicies = By.xpath("//div[@id ='termsOfPolicies']");
    public By iframeTermsOfPolicy = By.xpath("//div[@id='termsOfPolicies']//iframe [@title='Rich Text Area']");
    public By termOfPolicy = By.xpath("//body[@id='tinymce']");
//Set bulk variants
    public By filter = By.xpath("//table//tr[1]/th[3]/div/span[@role ='button']");
    public By checkboxColor = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[1]/span[3]/span");
    public By textColor = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[1]/span[4]/span");
    public By checkboxV1 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[2]/span[3]/span");
    public By textCheckboxV1 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[2]/span[4]/span");
    public By checkboxV2 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[3]/span[3]/span");
    public By textCheckboxV2 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[3]/span[4]/span");
    public By checkboxV3 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[4]/span[3]/span");
    public By textCheckboxV3 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[4]/span[4]/span");
    public By checkboxSize = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[5]/span[3]/span");
    public By textSize = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[5]/span[4]/span");
    public By checkboxV4 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[6]/span[3]/span");
    public By textCheckboxV4 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[6]/span[4]/span");
    public By checkboxV5 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[7]/span[3]/span");
    public By textCheckboxV5 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[7]/span[4]/span");
    public By checkboxV6 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[8]/span[3]/span");
    public By textCheckboxV6 = By.xpath("//div[@class='ant-table-filter-dropdown']/div/div/div[3]/div/div/div/div[8]/span[4]/span");

    public By OKBtn = By.xpath("//span[contains(text(),'OK')]//parent::button");
    public By resetBtn = By.xpath("//span[contains(text(),'Reset')]//parent::button");
    //Variants sau khi filter
    public By colorV1= By.xpath("//tbody/tr[2]/td[3]/li[1]");
    public By sizeV1 = By.xpath("//tbody/tr[2]/td[3]/li[2]");
    public By colorV2= By.xpath("//tbody/tr[3]/td[3]/li[1]");
    public By sizeV2 = By.xpath("//tbody/tr[3]/td[3]/li[2]");
    public By colorV3= By.xpath("//tbody/tr[4]/td[3]/li[1]");
    public By sizeV3 = By.xpath("//tbody/tr[4]/td[3]/li[2]");
    public By selectAll = By.xpath("//table//tr/th//span");
    //bulk varriants
    public By titleBulk = By.xpath("//div[@class='variant_bulk__GhSOq']/div//h5");
    public By priceBulk = By.xpath("//div[@class='variant_bulk__GhSOq']//descendant::input[1]");
    public By comparePriceBulk = By.xpath("//div[@class='variant_bulk__GhSOq']//descendant::input[2]");
    public By applyBtn = By.xpath("//div[@class='variant_bulk__GhSOq']//descendant::button");
    public By iconX = By.xpath("//div[@class='variant_bulk__GhSOq']/div/div[2]");
    public By priceV1 = By.xpath("//tbody/tr[2]/td[4]//descendant::input");
    public By comparePriceV1 = By.xpath("//tbody/tr[2]/td[5]//descendant::input");
    public By priceV2 = By.xpath("//tbody/tr[3]/td[4]//descendant::input");
    public By comparePriceV2 = By.xpath("//tbody/tr[3]/td[5]//descendant::input");
    public By priceV3 = By.xpath("//tbody/tr[4]/td[4]//descendant::input");
    public By comparePriceV3 = By.xpath("//tbody/tr[4]/td[5]//descendant::input");


    //CountDownTimer
    public By sectionCountDownTimer = By.xpath("//div[contains(text(),'Countdown Timer')]");
    public By durationInput = By.xpath("//div[@id='countdown']//descendant::input[1]");
    public By selectBoxDuration = By.xpath("//span[@title='Minutes']");
    public By textSetIfEnd= By.xpath("//div[contains(text(),'After countdown timer ends')]");
    public By option1RadioBtn = By.xpath("//div[@id='countdown']//descendant::label[2]/span[1]");
    public  By valueOption1 = By.xpath("//div[@id='countdown']//descendant::label[2]/span[2]/span");
    public By option2RadioBtn = By.xpath("//div[@id='countdown']//descendant::label[3]/span[1]");
    public  By valueOption2 = By.xpath("//div[@id='countdown']//descendant::label[3]/span[2]/span");
    public By textIfEnd = By.xpath("//input[@placeholder='Show text after it ends']");

    public By textDisplay =By.xpath("//div[contains(text(),'Display timer countdown in')]");
    public By checkboxDays = By.xpath("//div[@id='countdown']//descendant::label[4]/span[1]");
    public By textDays = By.xpath("//div[@id='countdown']//descendant::label[4]/span[2]");

    public By checkboxHours = By.xpath("//div[@id='countdown']//descendant::label[5]/span[1]");
    public By textHours= By.xpath("//div[@id='countdown']//descendant::label[5]/span[2]");

    public By checkboxMinutes = By.xpath("//div[@id='countdown']//descendant::label[6]/span[1]");
    public By textMinutes= By.xpath("//div[@id='countdown']//descendant::label[6]/span[2]");

    public By checkboxSeconds = By.xpath("//div[@id='countdown']//descendant::label[7]/span[1]");
    public By textSeconds= By.xpath("//div[@id='countdown']//descendant::label[7]/span[2]");

    public By checkboxMilisecond= By.xpath("//div[@id='countdown']//descendant::label[8]/span[1]");
    public By textMilisecond= By.xpath("//div[@id='countdown']//descendant::label[8]/span[2]");

    //Setup Upsale
    public By sectionUpsale = By.xpath("//div[@id='upsale']");
    public By upsaleBtn = By.xpath("//button[@id='switch']");
    public By textNoteUpsale = By.xpath("//div[@id='upsale']//parent::form/div[2]/div/span");
    public By hyperlinkAdd = By.xpath("//div[@id='upsale']/div[2]");
    public By textHyperlinkAdd = By.xpath("//div[@id='upsale']/div[2]/div");
    public By headerPoupUpsale = By.xpath("//div[contains(text(),'Set up for upsale page') and @class='ant-modal-title']");
    public By hyperlinkAddSellpage = By.xpath("//span[contains(text(),'Add another sellpage')]");
    public By searchBox = By.xpath("//div[@class='ant-form-item m-0']");
    public By inputSearchBox = By.xpath("//div[@class='ant-form-item m-0']//input");
    public By sellpageUpsale2 = By.xpath("//body/div[12]//div[@title='bra.kinthemain.online']");
    public By searchBox2 = By.xpath("//span[contains(text(),'Select sellpage')]//parent::div//parent::div");
    public By inputsearchBox2 = By.xpath("//span[contains(text(),'Select sellpage')]//parent::div//parent::div//input");
    public By sellpageUpsale1 = By.xpath("//div[@title='revenue3105.kinthemain.online']");
    public By saveUpsaleBtn = By.xpath("//div[@class='ant-modal-footer']//descendant::button[2]");
    public By previewBtn = By.xpath("//div[@class='ant-row ant-row-end']//descendant::button/span");
    //config paygate
    public By addPaygateBtn = By.xpath("//div[contains(text(),'Add paygate')]");
    public By selectPaypalPaygate = By.xpath("//input[@id='paypal']//ancestor::div[1]");
    public By paypalPaygate1 = By.xpath("//div[@title='Paygate Demo']");

    public By requestPaygatePaypal = By.xpath("//div[contains(text(),'Become The Plus One partner')]//parent::div");
    public By selectStripePaygate = By.xpath("//input[@id='stripe']//ancestor::div[1]");
    public By stripePaygate1 = By.xpath("//div[@title='Stripe Demo']");
    public By requestPaygateStripe = By.xpath("//div[@id='stripe_list']//ancestor::div[2]/div/div[@class='rc-virtual-list']//div[contains(text(),'Become The Plus One partner')]");
    public By configBtn = By.xpath("//span[contains(text(),'Config')]//parent::button");
    public By sectionConfigPaygate = By.xpath("//div[contains(text(),'Config Paygate')]//ancestor::div[3]");
    public By status = By.xpath("//div[@role ='status']");
    public By sectionLogo = By.xpath("//div[@id='logo']");

    //Confirm Policy
    public By textConfirmAgreed = By.xpath("//span[contains(text(),'I have read and agreed')]");
    public By checkboxConfirmAgreed = By.xpath("//span[contains(text(),'I have read and agreed')]//ancestor::label");
    public By submitAndRequestBtn = By.xpath("//span[contains(text(),'Submit and request')]//parent::button");
    public By cancelBtn = By.xpath("//span[contains(text(),'Cancel')]//parent::button");






    









}
