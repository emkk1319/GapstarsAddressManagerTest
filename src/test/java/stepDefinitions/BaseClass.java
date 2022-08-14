package stepDefinitions;

import org.apache.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.AddDataPage;
import pageObjects.LoginPage;

import java.util.List;
import java.util.Properties;

import pageObjects.ViewDataPage;

public class BaseClass {

    public static WebDriver driver;
    public LoginPage loginPage;
    public AddDataPage addDataPage;
    public ViewDataPage viewDataPage;
    public Properties configProp;

    final Logger logger = Logger.getLogger(BaseClass.class);

    //Select date picker for the given date
    public void selectDateFromBasicDatePicker(String datePickerXpath, String selectDate) {

        String day;
        String month;
        String year;
        String monthInThree;


        String yearSplitter[] = selectDate.split("-");
        year = yearSplitter[0];

        System.out.println("------year : " + year);
        month = yearSplitter[1];
        System.out.println("------month : " + month);
        day = yearSplitter[2];
        System.out.println("------day : " + day);

        monthInThree = month.substring(0, 3);

        System.out.println(monthInThree);

        driver.findElement(By.xpath(datePickerXpath)).click();

        // Select year
        List<WebElement> yearLists = driver.findElements(
                By.xpath("//ngb-datepicker-navigation-select/select[2]"));

        for (WebElement yearList : yearLists) {

            if (year.equals(yearList.getText())) {
                yearList.click();
            }

        }

        // Select month
        List<WebElement> monthLists = driver.findElements(
                By.xpath("//ngb-datepicker-navigation-select/select[1]"));

        for (WebElement monthList : monthLists) {

            if (monthInThree.equals(monthList.getText())) {
                monthList.click();
            }

        }

        // Select date
        List<WebElement> days = driver.findElements(
                By.xpath("//ngb-datepicker-month-view"));
        for (WebElement d : days) {
            if (d.getText().equals(day)) {
                d.click();
            }
        }
    }


    //Scroll to a selected element
    public static void UI_scroll_IntoView(final WebElement element) {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            System.err.format("" + e);
        }

    }

    //Scroll the page up
    public static void UI_scroll_up() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-200)");

    }

    // Get no of rows in a table
    public Integer getNoOfRowsInATable(String xpathVal) {

        List<WebElement> ElementCollectionHead = driver.findElements(By.xpath(xpathVal));
        int rowCount = ElementCollectionHead.size();

        System.out.println("rows = " + rowCount);

        return rowCount;
    }

    // Get no of columns in a table
    public Integer getNoOfColumnsInATable(String xpathVal) {

        List<WebElement> ElementCollectionHead = driver.findElements(By.xpath(xpathVal));
        int rowCount = ElementCollectionHead.size();

        System.out.println("rows = " + rowCount);

        List<WebElement> ElementCollectionHead1 = ElementCollectionHead.get(0).findElements(By.tagName("div"));
        int columnCount = ElementCollectionHead1.size();

        System.out.println("columns = " + columnCount);

        return columnCount;
    }


    //Check Records in Full Name and Country
    public boolean checkColumnDataOfATable(String xpathToTable, String fullName, String country, String filter) {
        boolean returnVal = false;
        int rowVal = getNoOfRowsInATable(xpathToTable + "/div");

        String sColValue = null;

        if(((rowVal == 0) && (fullName.equals(""))) || ((rowVal == 0) && (country.equals("")))){
            System.out.println("Search successful !");
            returnVal = true;
        }else{

            int column = getNoOfColumnsInATable(xpathToTable + "/div");
            for (int j = 1; j <= column; j++) {

                for (int i = 1; i < rowVal+1 ; i++) {
                    String sNameValue = "";
                    String sCountryValue = "";

                    switch (filter){
                        case "FullName":
                            sNameValue = driver.findElement(By.xpath(xpathToTable+"/div["+i+"]/div[1]")).getText();
                            System.out.println("sNameValue full name = " + sNameValue);
                            if(sNameValue.equalsIgnoreCase(fullName))  {
                                System.out.println("Search successful !");
                                returnVal = true;
                                return returnVal;
                            }
                            break;
                            case "Country":
                                sCountryValue = driver.findElement(By.xpath(xpathToTable+"/div["+i+"]/div[6]")).getText();
                                System.out.println("sCountryValue country = " + sCountryValue);
                            if(sCountryValue.equalsIgnoreCase(country))  {
                                System.out.println("Search successful !");
                                returnVal = true;
                                return returnVal;
                            }
                            break;
                            case "Both":
                                sNameValue = driver.findElement(By.xpath(xpathToTable+"/div["+i+"]/div[1]")).getText();
                                sCountryValue = driver.findElement(By.xpath(xpathToTable+"/div["+i+"]/div[6]")).getText();
                                System.out.println("sNameValue both = " + sNameValue);
                                System.out.println("sCountryValue both = " + sCountryValue);
                            if((sNameValue.equalsIgnoreCase(fullName)) && (sCountryValue.equalsIgnoreCase(country)))  {
                                System.out.println("Search successful !");
                                returnVal = true;
                                return returnVal;
                            }
                            break;


                    }



                    // System.out.println("Search successful ! : " + sRowValue);
                }

            }
        }
        System.out.println("Search unsuccessful ! ");
        return returnVal;
    }

    public String readAlert(){
       return driver.switchTo().alert().getText();
    }



    @After
    public void close_Browser(){
        driver.quit();
    }



}
