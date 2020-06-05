package myStrorePages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {
    private WebDriver driver;


    public LoginPage2(WebDriver driver) {
        this.driver = driver;

    }

    public void loginAs(String email, String password) {

        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();




        //@FindBy wtedy sie usuwa drivera
        //@FindBy(name = "email")
        //private WebElement loginInput;

        //@FindBy(name = "password")
        //private WebElement passwordInput;

        //@FindBy(id = "submit-login")
        //private WebElement signInButton;

        //@FindBy(xpath = "//*[@id=\"_desktop_logo\"]/a/img")
        //private WebElement myStoreButton;
    }


    public String getLoggedUserName() {
        WebElement loggedUserName = driver.findElement(By.xpath("//a[@class='account']"));
        return loggedUserName.getText();
    }


}


