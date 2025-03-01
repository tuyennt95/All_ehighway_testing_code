package core;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class common_function extends basePage {
    public common_function(WebDriver driver) {
        super(driver);
    }
    public void senKeys(By by, String value)  {
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.clear();
        element.sendKeys(value);
    }
    public void senKeyPrice(By by , String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.click();
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(value);
    }
    public void click(By by){
        WebElement element = wait. until(ExpectedConditions.visibilityOfElementLocated(by));
        element.click();
    }
    public void selectByVisibleText(By by, String text){
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select select =new Select(element);
        select.selectByVisibleText(text);
    }
    public void verifyPage(By by){
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.isDisplayed();

    }
    public void verifySellerPage(By by){
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.isDisplayed();
    }
    public String getValue(By by) {
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        String strValue = null;
        if (element.isDisplayed() && element.isEnabled())
            strValue= element.getAttribute("value");
        return strValue;
    }
    public String getText(By by) {
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        String strText = null;
        if (element.isDisplayed() && element.isEnabled())
            strText= element.getText();
        return strText;
    }
    public void selectDropdown(By by, String value) throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        element.click();
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void verifyElement(By by, String text){
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        String strText = null;
        if (element.isDisplayed() && element.isEnabled())
            strText = element.getText();
        Assert.assertEquals(text,strText);

    }
    public void verifyValueElement(By by, String value){
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        String strValue = null;
        if (element.isDisplayed() && element.isEnabled())
            strValue = element.getAttribute("value");
        Assert.assertEquals(value,strValue);

    }
    public void switchWindowByIndex(int index) {
        ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(window.get(index));
    }
    public void switchIframe (By by){
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.switchTo().frame(element);
    }

    public void switchWindowByTitle(String title){
        for (String windowID: driver.getWindowHandles()){
            String getTile = driver.switchTo().window(windowID).getTitle();
            if (getTile.equals(title)){
                driver.switchTo().window(windowID);
                break;
            }
        }
    }
    public void Hover(By by) {
        Actions action = new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        action.moveToElement(element).perform();
    }
    public  void uploadFile(By by, String filePath) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//        filePath = "D:\\Aion\\logo.png";
//        element.sendKeys(filePath);

        //Click để mở form upload
        element.click();
        Thread.sleep(3);

        // Khởi tạo Robot class
        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // Copy File path vào Clipboard
        StringSelection str = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        Thread.sleep(1000);

        // Nhấn Control+V để dán
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // Xác nhận Control V trên
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        Thread.sleep(1000);

        // Nhấn Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(10000);
    }
    public void scroll(By by) throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }
    public boolean isElementEnabled(WebDriver driver, String yourLocator) {
        try {
            WebElement locator;
            locator = driver.findElement(By.xpath(yourLocator));
            return locator.isEnabled();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public void isElementDisplayed(By by) {
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        System.out.println(element.getSize());
    }
    public void reloadPage(By by){
//        // Khởi tạo WebDriver (sử dụng ChromeDriver)
//        System.setProperty("webdriver.chrome.driver", "đường_dẫn_đến_chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        // Mở trang web
//        driver.get("đường_dẫn_đến_trang_web");
//
//        // ID của phần tử bạn muốn kiểm tra sự hiện diện
//        String elementId = "id_cua_phan_tu";

        // Số lần thực hiện refresh
        int maxRefreshAttempts = 10;

        int refreshCount = 0;
        boolean elementVisible = false;



        while (refreshCount < maxRefreshAttempts) {
            // Kiểm tra sự hiện diện của phần tử
            WebElement element = driver.findElement(by);
//            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            if (element.isDisplayed()) {
                elementVisible = true;
                break;
            }
            // Refresh trang
            driver.navigate().refresh();
            refreshCount++;
        }

        // Kiểm tra kết quả
        if (elementVisible) {
            System.out.println("Phần tử đã xuất hiện.");
        } else {
            System.out.println("Không thể tìm thấy phần tử sau " + maxRefreshAttempts + " lần refresh.");
        }

    }
}
