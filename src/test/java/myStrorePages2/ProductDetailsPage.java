package myStrorePages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
    private WebDriver driver;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "group_1")
    private WebElement sizeOfProduct;

    @FindBy(id = "quantity_wanted")
    private WebElement productQuantity;

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement addToCart;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement proceedToCheckout2;


    public void setProductSize(String size) {
        sizeOfProduct.click();
        sizeOfProduct.sendKeys(size);

    }


    public void setProductQuantity(String quantity) {
        productQuantity.clear();
        productQuantity.sendKeys(quantity);

    }


    public void setAddToCart() {
        addToCart.click();

    }

    public void setProceedToCheckout() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        proceedToCheckout.click();
    }

    public void setProceedToCheckout2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        proceedToCheckout2.click();
    }

}
