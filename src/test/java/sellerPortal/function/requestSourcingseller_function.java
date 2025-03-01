package sellerPortal.function;

import core.basePage;
import core.common_function;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.requestSourcing_page;

import java.io.IOException;

public class requestSourcingseller_function extends basePage {
    public requestSourcingseller_function(WebDriver driver) {
        super(driver);
    }
    public String numberRequest1 = "";
    common_function commonFunction =new common_function(driver);
    requestSourcing_page requestSourcingPage = new requestSourcing_page();
    public String getNumberRequest() {
        return numberRequest1;
    }

    public void addRequestSourcing() throws InterruptedException, IOException {
//        String s = commonFunction.getText(requestSourcingPage.numberRequest);
//        System.out.println(s);
//        String s1 = s.substring(4);
//        int number= Integer.parseInt(s1);
//        int number1 = number + 1;
//        String s2 =String.valueOf(number1);
//        if(s1.startsWith("009")){
//            numberRequest1 = "TAE-010";
//        }else
//            if (s1.startsWith("00")){
//            numberRequest1 = "TAE-00"+s2;
//        }else
//            if(s1.startsWith("099")){
//                numberRequest1 = "TAE-100";
//            }else
//            if(s1.startsWith("0")){
//            numberRequest1 = "TAE-0"+s2;
//        }else{
//            numberRequest1 = "TAE-"+s2;
//        }
//        saveValueToSystem("requestNumber",numberRequest1);
//        System.out.println(numberRequest1);
        commonFunction.click(requestSourcingPage.addRequestSourcingBtn);
        commonFunction.senKeys(requestSourcingPage.productNameInput,"Quick Dry Sport Jacket");
        commonFunction.senKeys(requestSourcingPage.linkInput,"https://alfawears.com/collections/blazers-jackets/products/quick-dry-sport-jacket");
        commonFunction.uploadFile(requestSourcingPage.addImage,"D:\\AION\\ảnh test\\áo\\áo tím.webp");
//        commonFunction.uploadFile(requestSourcingPage.addImage,"E:\\Aion\\ảnh test\\áo\\áo xám.webp");
//        commonFunction.uploadFile(requestSourcingPage.addImage,"E:\\Aion\\ảnh test\\áo\\áo xanh.webp");
        commonFunction.senKeys(requestSourcingPage.description,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR");
        commonFunction.click(requestSourcingPage.requestBtn);
//        driver.navigate().refresh();
//        commonFunction.verifyPage(requestSourcingPage.status);
//        driver.navigate().refresh();
        Thread.sleep(3000);
        numberRequest1 = commonFunction.getText(requestSourcingPage.numberRequest);
//        commonFunction.verifyElement(requestSourcingPage.numberRequest,numberRequest1);
    }

//    public void saveValueToSystem(String key, String data) throws IOException {
//        Path confDir = Paths.get("/e2way");
//        Files.createDirectories(confDir);
//        Path confFile = confDir.resolve("data.props");
//        if (Files.exists(confFile)) {
//            try (InputStream in = Files.newInputStream(confFile)) {
//                Properties props = new Properties();
//                props.load(in);
//                props.setProperty(key, data);
//                OutputStream output = Files.newOutputStream(confFile);
//                props.store(output, "Propertis");
//                output.close();
//            }
//        }else{
//            Files.createFile(confFile);
//        }
//        System.setProperty("application.property",data);
//    }
//    public void verifyRequestSourcing(){
//       String s = commonFunction.getText(requestSourcingPage.numberRequest);
//       System.out.println(s);
//       String s1 = s.substring(4);
//       int number= Integer.parseInt(s1);
//       int number1 = number + 1;
//        String s2 =String.valueOf(number1);
//        String numberRequest = "TAE-"+s2;
//        System.out.println(numberRequest);
//        commonFunction.verifyElement(requestSourcingPage.numberRequest,numberRequest);
//    }
public void searchRequest(){
    commonFunction.senKeys(requestSourcingPage.searchRequest,numberRequest1);
}
public void verifyRequestDetail(){
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.numberRequestDetail,numberRequest1);
        commonFunction.verifyElement(requestSourcingPage.productRequestDetail,"Quick Dry Sport Jacket");
        commonFunction.verifyElement(requestSourcingPage.fulfiller,"The Plus One partner");
        commonFunction.verifyElement(requestSourcingPage.statusDetail,"Opening");
        commonFunction.verifyElement(requestSourcingPage.linkProductRequest,"Quick Dry Sport Jacket");
        commonFunction.click(requestSourcingPage.linkProductRequest);
        commonFunction.verifyValueElement(requestSourcingPage.productNameRequest,"Quick Dry Sport Jacket");
        commonFunction.verifyValueElement(requestSourcingPage.linkRequest,"https://alfawears.com/collections/blazers-jackets/products/quick-dry-sport-jacket");
        commonFunction.verifyValueElement(requestSourcingPage.descriptionRequest,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional\n" +
                "Material: NYLON\n" +
                "Material: spandex\n" +
                "Feature: Anti-Wrinkle\n" +
                "Feature: Anti-Pilling\n" +
                "Feature: Waterproof\n" +
                "Feature: Quick Dry\n" +
                "Feature: Windproof\n" +
                "Collar: MANDARIN COLLAR");
}
    public void verifyRespondByNewProductFromFulfill(){
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.textDescription,"New offer. Please check!");
        commonFunction.verifyElement(requestSourcingPage.linkProductRespondByFulfill
                ,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
    }
    public void verifyRespondFromListProductByFulfill(){
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.textDescription,"New offer. Please check!");
        commonFunction.verifyElement(requestSourcingPage.linkProductRespondByFulfill,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
    }
    public void verifyRespondRejectRequestFromFulfill(){
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.textRejectedDetail,"Rejected");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReason1Detail,"Temporary Out of Stock");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReason2Detail,"Product is no longer manufactured");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReason3Detail,"Product cannot be manufactured");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReason4Detail,"Policy Violation");
        commonFunction.verifyElement(requestSourcingPage.valueQuickReasonInputDetail,"Test reject Request");
        commonFunction.verifyElement(requestSourcingPage.statusDetail,"Rejected");
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
        commonFunction.verifyElement(requestSourcingPage.textCloseRequest,"This request was closed");
    }
    public void sellerRejectRequest() throws InterruptedException {
        commonFunction.click(requestSourcingPage.linkProductRespondByFulfill);
        commonFunction.verifyPage(requestSourcingPage.rejectBtn);
        commonFunction.verifyPage(requestSourcingPage.acceptBtn);
        commonFunction.click(requestSourcingPage.rejectBtn);
        commonFunction.verifyElement(requestSourcingPage.textQuickReason,"Reason");
        commonFunction.verifyElement(requestSourcingPage.textReason1,"Price is higher than exceptation");
        commonFunction.verifyElement(requestSourcingPage.textReason2,"Product does not match the requirements");
        commonFunction.verifyElement(requestSourcingPage.textReason3,"I don't want to sell this anymore");
        commonFunction.click(requestSourcingPage.checkboxReason1);
        commonFunction.click(requestSourcingPage.checkboxReason2);
        commonFunction.click(requestSourcingPage.checkboxReason3);
        commonFunction.senKeys(requestSourcingPage.reasonOtherInput,"Seller reject Request");
        commonFunction.click(requestSourcingPage.rejectCloseBtn);
        commonFunction.click(requestSourcingPage.confirmBtn);
        Thread.sleep(5000);
        commonFunction.verifyElement(requestSourcingPage.statusDetail,"Rejected");
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
        commonFunction.verifyElement(requestSourcingPage.textCloseRequest,"This request was closed");
    }
    public void sellerAcceptRespond() throws InterruptedException {
        commonFunction.click(requestSourcingPage.linkProductRespondByFulfill);
        commonFunction.click(requestSourcingPage.acceptBtn);
        Thread.sleep(5000);
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
        commonFunction.verifyElement(requestSourcingPage.statusDetail,"Accepted");
        commonFunction.verifyElement(requestSourcingPage.textCloseRequest,"This request was closed");
    }
    public void respondAccept(){
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.textHeader,"This is last offer for the same product. Please check!");
        commonFunction.click(requestSourcingPage.linkProductName);
        commonFunction.click(requestSourcingPage.AcceptBtn);
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
        commonFunction.verifyElement(requestSourcingPage.statusRequest,"Accepted");
    }
    public void verifyRespondFulfill() throws InterruptedException {
        commonFunction.verifyElement(requestSourcingPage.productNameRespond,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        //variant1
//        commonFunction.verifyElement(requestSourcingPage.variant1,"PurpleS");
//        commonFunction.click(requestSourcingPage.variant1);
//        commonFunction.click(requestSourcingPage.colorPuple);
//        commonFunction.click(requestSourcingPage.sizeS);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$6.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$18.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234561");
        //variant2
        commonFunction.click(requestSourcingPage.sizeM);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$7.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$21.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234562");
        //variant3
        commonFunction.click(requestSourcingPage.sizeL);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$8.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$24.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234563");
        //variant4
        commonFunction.click(requestSourcingPage.colorGray);
        commonFunction.click(requestSourcingPage.sizeS);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$6.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$18.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234564");
        //variant5
        commonFunction.click(requestSourcingPage.colorGray);
        commonFunction.click(requestSourcingPage.sizeM);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$7.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$21.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234565");
        //variant6
        commonFunction.click(requestSourcingPage.colorGray);
        commonFunction.click(requestSourcingPage.sizeL);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$8.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$24.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234566");
        //variant7
        commonFunction.click(requestSourcingPage.colorBlue);
        commonFunction.click(requestSourcingPage.sizeS);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$6.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$18.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234567");
        //variant8
        commonFunction.click(requestSourcingPage.colorBlue);
        commonFunction.click(requestSourcingPage.sizeM);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$7.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$21.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234568");
        //variant9
        commonFunction.click(requestSourcingPage.colorBlue);
        commonFunction.click(requestSourcingPage.sizeL);
        commonFunction.verifyElement(requestSourcingPage.productCost,"$8.33");
        commonFunction.verifyElement(requestSourcingPage.suggestPrice,"$24.99");
        commonFunction.verifyElement(requestSourcingPage.sku,"Test1234569");
        //description
        commonFunction.scroll(requestSourcingPage.sectionDescription);
        commonFunction.verifyElement(requestSourcingPage.getDescription1,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.verifyElement(requestSourcingPage.getDescription2,"Material: NYLON");
        commonFunction.verifyElement(requestSourcingPage.getDescription3,"Material: spandex");
        commonFunction.verifyElement(requestSourcingPage.getDescription4,"Feature: Anti-Wrinkle");
        commonFunction.verifyElement(requestSourcingPage.getDescription5,"Feature: Anti-Pilling");
        commonFunction.verifyElement(requestSourcingPage.getDescription6,"Feature: Waterproof");
        commonFunction.verifyElement(requestSourcingPage.getDescription7,"Feature: Quick Dry");
        commonFunction.verifyElement(requestSourcingPage.getDescription8,"Feature: Windproof");
        commonFunction.verifyElement(requestSourcingPage.getDescription9,"Collar: MANDARIN COLLAR");

    }
    public void respondByEditSellerProduct() throws InterruptedException {
        commonFunction.click(requestSourcingPage.numberRequest);
        commonFunction.verifyElement(requestSourcingPage.textHeader,"This is last offer, please check!");
        commonFunction.verifyElement(requestSourcingPage.linkProductName,"Zipper Quick Dry Sport Jacket Outwear For Yoga Gym Professional");
        commonFunction.click(requestSourcingPage.linkProductName);
        verifyRespondFulfill();
        commonFunction.click(requestSourcingPage.AcceptBtn);
        commonFunction.verifyPage(requestSourcingPage.textCloseRequest);
        commonFunction.verifyElement(requestSourcingPage.statusRequest,"Accepted");
    }
}
