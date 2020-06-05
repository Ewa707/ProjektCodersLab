package myStrorePages2;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPage {
    private WebDriver driver;

    public BuyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//article")
    private WebElement chooseAddress;

    @FindBy(name = "confirm-addresses")
    private WebElement clickButton;

    @FindBy(id = "delivery_option_1")
    private WebElement choosePrestaShop;

    @FindBy(xpath = "//*[@id='js-delivery']/button")
    private WebElement clickContinueShipping;

    @FindBy(id = "payment-option-1")
    private WebElement clickPayByCheck;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement agreeButton;

    @FindBy(xpath = "//*[@id='payment-confirmation']/div[1]/button")
    private WebElement obligationPay;


    public void setChooseAddress() {
        System.out.println(chooseAddress.getText());
        String actualtext = chooseAddress.getText();
        Assert.assertTrue(actualtext.contains("Blotna"));
        System.out.println("Address confirmation corected");

    }


    public void setButton() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickButton.click();
    }


    public void setChoosePrestaShop() {
        choosePrestaShop.click();
    }


    public void setClickContinueShipping() {
        clickContinueShipping.click();
    }

    public void setClickPayByCheck() {
        clickPayByCheck.click();
    }

    public void setAgreeButton() {
        agreeButton.click();
    }

    public void setObligationPay() {
        obligationPay.click();
    }



}


