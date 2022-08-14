package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseClass;

public class LoginPage {
    public WebDriver idriver;

    public LoginPage(WebDriver rdriver) {
        idriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    By loginPageTitle = By.xpath("//form/h1");

    @FindBy(name = "username")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(name = "password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    @CacheLookup
    WebElement btnLogin;


    public String getLoginPageTitle(){
        return idriver.findElement(loginPageTitle).getText();
    }

    public void setUserName(String username){
        txtUsername.sendKeys(username);
    }

    public void setPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickLogin(){
        btnLogin.click();
    }


    public String getLoginError() {
        BaseClass baseClass = new BaseClass();
       return baseClass.readAlert();
    }
}