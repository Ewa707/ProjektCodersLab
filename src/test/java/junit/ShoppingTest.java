package junit;

import myStrorePages2.BuyPage;
import myStrorePages2.LoginPage2;
import myStrorePages2.ProductDetailsPage;
import myStrorePages2.ShoppingPage;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ShoppingTest {
    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://prod-kurs.coderslab.pl/index.php");

    }

    @Test
    public void shopTest() {
        LoginPage2 loginPage2 = new LoginPage2(this.driver);
        ShoppingPage shoppingPage = new ShoppingPage(this.driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(this.driver);
        BuyPage buyPage = new BuyPage(this.driver);


        loginPage2.loginAs("roujhcvaispqndcwux@awdrt.org", "coderslab");
        //Assert.assertEquals("Ewa Gumowska", loginPage2.getLoggedUserName());

        WebElement myStoreButton = driver.findElement(By.xpath("//*[@id='_desktop_logo']//a"));
        myStoreButton.click();

        shoppingPage.setClickSearch("Sweater");
        shoppingPage.setClickLoop();
        shoppingPage.setSetSweater();

        productDetailsPage.setProductQuantity("5");
        productDetailsPage.setProductSize("M");
        productDetailsPage.setAddToCart();
        productDetailsPage.setProceedToCheckout();
        productDetailsPage.setProceedToCheckout2();

        buyPage.setChooseAddress();
        buyPage.setButton();
        buyPage.setChoosePrestaShop();
        buyPage.setClickContinueShipping();
        buyPage.setClickPayByCheck();
        buyPage.setAgreeButton();
        buyPage.setObligationPay();



        File screenshotConfirmated = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshotConfirmated, new File("C:\\Users\\EWA_G\\IdeaProjects\\seenshot.png"));
        } catch (Exception e) {
            System.out.println("Plik screenshot został zapisany.");
        }
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }


}



