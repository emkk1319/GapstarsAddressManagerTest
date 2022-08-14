package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.BaseClass;

public class ViewDataPage {
    public WebDriver idriver;

    public ViewDataPage(WebDriver rdriver) {
        idriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//app-view/div/h2")
    @CacheLookup
    WebElement viewDataPageTitle;

    @FindBy(xpath = "//app-view/div/div[1]/div/div[3]/a")
    @CacheLookup
    WebElement btnAddNew;

    String tablePath = "//app-view//ag-grid-angular//div[3]/div[2]/div/div";

    @FindBy(xpath = "//div[@col-id='fullName']/div/span[@ref = 'eMenu']")
    @CacheLookup
    WebElement filterFullName;

    @FindBy(xpath = "//*[@id=\"filterType\"]")
    @CacheLookup
    WebElement filterType;

    @FindBy(xpath = "//*[@id=\"filterText\"]")
    @CacheLookup
    WebElement filterText;

    @FindBy(id = "andId")
    @CacheLookup
    WebElement filterRadioAND;

    @FindBy(id = "orId")
    @CacheLookup
    WebElement filterRadioOR;

    @FindBy(xpath = "//*[@id=\"filterConditionType\"]")
    @CacheLookup
    WebElement filterConditionType;

    @FindBy(xpath = "//*[@id=\"filterConditionText\"]")
    @CacheLookup
    WebElement filterConditionText;

    @FindBy(xpath = "//*[@col-id='country']//span[@ref = 'eMenu']")
    @CacheLookup
    WebElement filterCountry;

    @FindBy(xpath = "//app-root/div/app-view//div[1]//div[1]/input")
    @CacheLookup
    WebElement masterFilterFullName;

    @FindBy(xpath = "//app-root//app-view//div[1]//div[2]/input")
    @CacheLookup
    WebElement masterFilterCountry;

    @FindBy(xpath = "//*[@value = 'Filter']")
    @CacheLookup
    WebElement btnFilter;


    public void clickAddNewButton(){
        btnAddNew.click();
    }

    public String getViewDataPageTitle(){
        BaseClass baseClass = new BaseClass();
        baseClass.UI_scroll_up();
        return viewDataPageTitle.getText();
    }

    public boolean checkNewlyAddedRecord(String tableXpath, String fullName,String country){
        BaseClass baseClass = new BaseClass();

        return baseClass.checkColumnDataOfATable(tablePath, fullName,country,"Both");
    }

    public void clickFilterFullName() {
        filterFullName.click();
    }

    public void selectFilterByFullName(String type, String text, String operation, String conditionType, String conditionText) throws InterruptedException {

        BaseClass baseClass = new BaseClass();

        Select select = new Select(filterType);
        select.selectByVisibleText(type);

        switch(type) {
            case "Equals":
                filterText.sendKeys(text);
                if(operation.equals("AND") || operation.equals("OR")){
                    if(conditionType != null){
                        if(conditionType != null){
                            switch(conditionType){
                                case "Contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Equals":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not equal":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Starts with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Ends with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                            }
                        }
                    }
                }
                break;
             case "Not equal":
                 filterText.sendKeys(text);
                 if(operation.equals("AND") || operation.equals("OR")){
                     if(conditionType != null){
                         if(conditionType != null){
                             switch(conditionType){
                                 case "Contains":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Equals":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Not equal":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Starts with":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Ends with":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Not contains":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                             }
                         }
                     }
                 }
                break;
             case "Starts with":
                 filterText.sendKeys(text);
                 if(operation.equals("AND") || operation.equals("OR")){
                     if(conditionType != null){
                         if(conditionType != null){
                             switch(conditionType){
                                 case "Contains":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Equals":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Not equal":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Starts with":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Ends with":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Not contains":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                             }
                         }
                     }
                 }
                break;
             case "Ends with":
                 filterText.sendKeys(text);
                 if(operation.equals("AND") || operation.equals("OR")){
                     if(conditionType != null){
                         if(conditionType != null){
                             switch(conditionType){
                                 case "Contains":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Equals":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Not equal":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Starts with":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Ends with":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Not contains":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                             }
                         }
                     }
                 }
                break;
            case "Contains":
                filterText.sendKeys(text);
                if(operation.equals("AND") || operation.equals("OR")){
                    if(conditionType != null){
                        if(conditionType != null){
                            switch(conditionType){
                                case "Contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Equals":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not equal":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Starts with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Ends with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                            }
                        }
                    }
                }
                break;
             case "Not contains":
                 filterText.sendKeys(text);
                 if(operation.equals("AND") || operation.equals("OR")){
                     if(conditionType != null){
                         if(conditionType != null){
                             switch(conditionType){
                                 case "Contains":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Equals":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Not equal":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Starts with":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Ends with":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                                 case "Not contains":
                                     Thread.sleep(2000);
                                     filterConditionText.sendKeys(conditionText);
                                     break;
                             }
                         }
                     }
                 }
                break;
        }
    }


        public void selectFilterByCountry(String type, String text, String operation, String conditionType, String conditionText) throws InterruptedException {

        BaseClass baseClass = new BaseClass();

        Select select = new Select(filterType);
        select.selectByVisibleText(type);

        switch(type) {
            case "Equals":
                filterText.sendKeys(text);
                if(operation.equals("AND") || operation.equals("OR")){
                    if(conditionType != null){
                        if(conditionType != null){
                            switch(conditionType){
                                case "Contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Equals":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not equal":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Starts with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Ends with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                            }
                        }
                    }
                }
                break;
            case "Not equal":
                filterText.sendKeys(text);
                if(operation.equals("AND") || operation.equals("OR")){
                    if(conditionType != null){
                        if(conditionType != null){
                            switch(conditionType){
                                case "Contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Equals":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not equal":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Starts with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Ends with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                            }
                        }
                    }
                }
                break;
            case "Starts with":
                filterText.sendKeys(text);
                if(operation.equals("AND") || operation.equals("OR")){
                    if(conditionType != null){
                        if(conditionType != null){
                            switch(conditionType){
                                case "Contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Equals":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not equal":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Starts with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Ends with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                            }
                        }
                    }
                }
                break;
            case "Ends with":
                filterText.sendKeys(text);
                if(operation.equals("AND") || operation.equals("OR")){
                    if(conditionType != null){
                        if(conditionType != null){
                            switch(conditionType){
                                case "Contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Equals":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not equal":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Starts with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Ends with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                            }
                        }
                    }
                }
                break;
            case "Contains":
                filterText.sendKeys(text);
                if(operation.equals("AND") || operation.equals("OR")){
                    if(conditionType != null){
                        if(conditionType != null){
                            switch(conditionType){
                                case "Contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Equals":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not equal":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Starts with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Ends with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                            }
                        }
                    }
                }
                break;
            case "Not contains":
                filterText.sendKeys(text);
                if(operation.equals("AND") || operation.equals("OR")){
                    if(conditionType != null){
                        if(conditionType != null){
                            switch(conditionType){
                                case "Contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Equals":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not equal":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Starts with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Ends with":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                                case "Not contains":
                                    Thread.sleep(2000);
                                    filterConditionText.sendKeys(conditionText);
                                    break;
                            }
                        }
                    }
                }
                break;
        }
    }
    public void clickFilterCountry() {
        filterCountry.click();
    }

    public void enterTextToMasterFilters(String fullName, String country){
        masterFilterFullName.sendKeys(fullName);
        masterFilterCountry.sendKeys(country);
    }

    public void clickFilterButton(){
        btnFilter.click();
    }
    public boolean checkFilteredFullNameData(String tableXpath, String fullName){
        BaseClass baseClass = new BaseClass();

        return baseClass.checkColumnDataOfATable(tablePath, fullName,null,"FullName");
    }


    public boolean checkFilteredCountryData(String tableXpath, String country) {
        BaseClass baseClass = new BaseClass();

        return baseClass.checkColumnDataOfATable(tablePath, null,country,"Country");
    }
    public boolean checkFilteredDataByFullNameAndCountry(String tableXpath, String fullname, String country) {
        BaseClass baseClass = new BaseClass();

        return baseClass.checkColumnDataOfATable(tablePath, fullname,country,"Both");
    }

}