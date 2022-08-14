package pageObjects;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepDefinitions.BaseClass;

public class AddDataPage {
    public WebDriver idriver;

    public AddDataPage(WebDriver rdriver) {
        idriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//app-add/div/h2")
    @CacheLookup
    WebElement addDataPageTitle;

    @FindBy(id = "fullName")
    @CacheLookup
    WebElement txtFullName;

    @FindBy(id = "age")
    @CacheLookup
    WebElement txtAge;

    @FindBy(id = "address")
    @CacheLookup
    WebElement txtAddress;

    String datePickerBirthday = "//form/div[3]/input";

    @FindBy(xpath = "//*[@id=\"country\"]")
    @CacheLookup
    WebElement drpdownCountry;

    @FindBy(xpath = "//app-add//div[5]/input")
    @CacheLookup
    WebElement checkboxExpertiseAngular;

    @FindBy(xpath = "//app-add//div[6]/input")
    @CacheLookup
    WebElement checkboxExpertiseJava;

    @FindBy(xpath = "//app-add//div[7]/input")
    @CacheLookup
    WebElement checkboxExpertiseCSharp;

    @FindBy(xpath = "//app-add//div[8]/input")
    @CacheLookup
    WebElement checkboxExpertiseGit;

    @FindBy(xpath = "//app-add//div[9]/input")
    @CacheLookup
    WebElement checkboxExpertiseHtml;

    @FindBy(id = "Male")
    @CacheLookup
    WebElement radioBtnGenderMale;

    @FindBy(id = "Female")
    @CacheLookup
    WebElement radioBtnGenderFemale;

    @FindBy(xpath = "//*[@value=\"Submit\"]")
    @CacheLookup
    WebElement btnSubmit;

    @FindBy(xpath = "//*[@value=\"Reset\"]")
    @CacheLookup
    WebElement btnReset;


    public String getAddDataPageTitle(){
        return addDataPageTitle.getText();
    }

    public void enterFullName(String fullName){
        txtFullName.sendKeys(fullName);
    }

    public void enterAge(String age){
        txtAge.sendKeys(age);
    }

    public void enterAddress(String address){
        txtAddress.sendKeys(address);
    }

    public void selectBirthday(String birthday){
        BaseClass baseClass = new BaseClass();
        baseClass.selectDateFromBasicDatePicker(datePickerBirthday, birthday);
    }

    public void selectCountry(String country){
        Select select = new Select(drpdownCountry);
        select.selectByVisibleText(country);
    }

    public void selectExpertise(String expertise) {
            switch(expertise) {
                case "ANGULAR" :
                    checkboxExpertiseAngular.click();
                    break;

                case "JAVA" :
                    checkboxExpertiseJava.click();
                    break;

                case "C#" :
                    checkboxExpertiseCSharp.click();
                    break;

                case "GIT" :
                    checkboxExpertiseGit.click();
                    break;

                case "HTML" :
                    checkboxExpertiseHtml.click();
                    break;
            }
    }

    public void selectGender(String gender) {
        switch(gender) {
            case "MALE":
                radioBtnGenderMale.click();
                break;
            case "FEMALE":
                radioBtnGenderFemale.click();
                break;
        }
    }

    public void clickSubmitButton(){
        btnSubmit.click();
    }

    public void clickResetButton() {
        btnReset.click();
    }

    public boolean isFieldsAreEmpty(){
        boolean fieldsAreEmpty = true;

        if(!txtFullName.getText().isEmpty()){
            fieldsAreEmpty = false;
        }
        if(!txtAge.getText().isEmpty()){
            fieldsAreEmpty = false;
        }
        if(!txtAddress.getText().isEmpty()){
            fieldsAreEmpty = false;
        }
        if(!datePickerBirthday.isEmpty()){
            fieldsAreEmpty = false;
        }
        if(checkboxExpertiseAngular.isSelected()){
            fieldsAreEmpty = false;
        }
        if(checkboxExpertiseJava.isSelected()){
            fieldsAreEmpty = false;
        }
        if(checkboxExpertiseCSharp.isSelected()){
            fieldsAreEmpty = false;
        }
        if(checkboxExpertiseGit.isSelected()){
            fieldsAreEmpty = false;
        }
        if(checkboxExpertiseHtml.isSelected()){
            fieldsAreEmpty = false;
        }
        if(radioBtnGenderMale.isSelected()){
            fieldsAreEmpty = false;
        }
        if(radioBtnGenderFemale.isSelected()){
            fieldsAreEmpty = false;
        }
        if(!drpdownCountry.getText().isEmpty()){
            fieldsAreEmpty = false;
        }
        return fieldsAreEmpty;
    }

    public void checkAddressFieldIsMandatory() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("1px solid rgb(255, 0, 0)" ,txtAddress.getCssValue("border"));
    }


}