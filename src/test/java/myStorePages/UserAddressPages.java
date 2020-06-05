package myStorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAddressPages {


    public UserAddressPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-link-action='add-address']")
    private WebElement createAddressButton;


    public void clickCreateAddressButton() {
        createAddressButton.click();
    }
}



