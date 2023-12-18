package Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CheckoutCustomer {
    WebDriver driver;
    WebDriverWait expliciWait;
    String emailAddress = getEmailAddress();
    String Phone = getPhoneNumber();
    Actions action;
    String Address = getAddress();
    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void TC_01_Url() {
        // Open Site
        driver.get("https://dev-shop-poc.drberg.com/");
        sleepInSeconds(5);
        action = new Actions(driver);

        // Login
        driver.findElement(By.xpath("//button[@aria-label='profile']")).click();
        sleepInSeconds(2);
        driver.findElement(By.xpath("//input[@name='popup-email']")).sendKeys("hung.ngo@mgisolutions.com");
        sleepInSeconds(2);
        driver.findElement(By.xpath("//button[text()=' CONTINUE WITH EMAIL ']")).click();
        sleepInSeconds(2);
        action.click(driver.findElement(By.xpath("//input[@class='input-password']"))).perform();
        sleepInSeconds(2);
        driver.findElement(By.xpath("//input[@class='input-password']")).sendKeys("Admin@123");
        sleepInSeconds(2);
        driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
        sleepInSeconds(10);

        // Add product to Cart
        By addToCart = By.xpath("//a[text()='Chewable Vitamin C Complex']/parent::div/parent::div/following-sibling::div//button");
        JavascriptExecutor jsExcutor = (JavascriptExecutor) driver;
        jsExcutor.executeScript("arguments[0].click();",driver.findElement(addToCart));
        sleepInSeconds(5);
        driver.findElement(By.xpath("//div[@class='alert-content notification-animation']/button")).click();
        sleepInSeconds(2);
        // Open Cart page
        driver.findElement(By.xpath("//button[@aria-label='cart']")).click();
        sleepInSeconds(8);
        driver.findElement(By.xpath("//a[text() = 'View cart']")).click();

        // Open Checkout page
        driver.findElement(By.xpath("//span[contains(text(),'Checkout with credit card')]")).click();
        sleepInSeconds(15);

        // Choose shipping method
        driver.findElement(By.xpath("//span[text()='USPS Ground Advantage (2-5 days) TN']")).click();

        // Input Card information
        WebElement CheckoutButton = driver.findElement(By.xpath("//div[@class='payment_container flex flex-col']//following-sibling::button"));
        WebElement iframeCCN = driver.findElement(By.xpath("//div[@data-bluesnap='ccn']/iframe"));
        driver.switchTo().frame(iframeCCN);
        driver.findElement(By.xpath("//input[@id='ccn']")).sendKeys("4111111111111111");
        driver.switchTo().defaultContent();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckoutButton);

        By cardholderName =  By.xpath("//input[@id='cardholder-name']");
        driver.findElement(cardholderName).sendKeys("MGI");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckoutButton);

        WebElement iframeEXP = driver.findElement(By.xpath("//div[@data-bluesnap='exp']/iframe"));
        driver.switchTo().frame(iframeEXP);
        driver.findElement(By.xpath("//input[@id='exp']")).sendKeys("06/26");
        driver.switchTo().defaultContent();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckoutButton);

        WebElement iframeCVV = driver.findElement(By.xpath("//div[@data-bluesnap='cvv']/iframe"));
        driver.switchTo().frame(iframeCVV);
        driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("315");
        driver.switchTo().defaultContent();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckoutButton);
        sleepInSeconds(3);
        // Selected checkbox
        driver.findElement(By.xpath("//label[text()='Save card to my wallet for future purchases']//preceding-sibling::div//input")).click();
        sleepInSeconds(3);

        // Place Order
        //By checkoutButton = By.xpath("//div[@class='payment_container flex flex-col']//following-sibling::button");
        //driver.findElement(checkoutButton).click();
        jsExcutor.executeScript("arguments[0].click();", CheckoutButton);
        sleepInSeconds(30);
    }

    @Test
    public void TC_02_Url() {

    }
    public void sleepInSeconds(long timeInSecond) {
        try {
            Thread.sleep(timeInSecond * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public String getEmailAddress(){
        Random rand = new Random();
        return "automation" + rand.nextInt(99999) + "@gmail.net";
    }
    public String getPhoneNumber(){
        Random rand = new Random();
        return "" + rand.nextInt(999) + rand.nextInt(999) + rand.nextInt(9999) + "";
    }
    public String getAddress(){
        Random rand = new Random();
        return rand.nextInt(99) + " Denali Highway";
    }
    public void selectItemdropdown(String parentXpath, String childItemXpath, String itemTextExpected){
        driver.findElement(By.xpath(parentXpath)).click();
        sleepInSeconds(5);
        List<WebElement> allItems = driver.findElements(By.xpath(childItemXpath));
        for (WebElement items: allItems){
            if (items.getText().equals(itemTextExpected)){
                items.click();
                break;
            }
        }
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
