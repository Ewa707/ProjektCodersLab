package myStrorePages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
    private WebDriver driver;

    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "s")
    private WebElement clickSearch;

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/button/i/font/font")
    private WebElement clickLoup;

    @FindBy(xpath = "//*[@id='js-product-list']/div[1]/article/div/a/img")
    private WebElement setSweter;


    public void setClickSearch(String productSearch) {
        clickSearch.click();
        clickSearch.sendKeys("Sweater");
    }

    public void setClickLoop() {
        clickLoup.click();
    }

    public void setSetSweater() {
        setSweter.click();
    }

}


