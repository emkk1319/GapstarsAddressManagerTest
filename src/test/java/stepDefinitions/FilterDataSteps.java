package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;
import pageObjects.AddDataPage;
import pageObjects.ViewDataPage;

import javax.xml.crypto.Data;
import java.util.List;


public class FilterDataSteps extends BaseClass {

    final Logger logger = Logger.getLogger(FilterDataSteps.class);

    @Then("Click on the filter from the Full Name column")
    public void click_on_full_name_filter() {
        viewDataPage = new ViewDataPage(driver);
        viewDataPage.clickFilterFullName();
        logger.info("---- Clicking filter from the full name column ----");
    }

    @When("Filter data by Full Name")
    public void filter_data_by_fullName(DataTable table) throws InterruptedException {
        viewDataPage.clickFilterFullName();

        List<List<String>> listItem = table.asLists(String.class);
        viewDataPage.selectFilterByFullName(listItem.get(1).get(0),
                listItem.get(1).get(1),
                listItem.get(1).get(2),
                listItem.get(1).get(3),
                listItem.get(1).get(4));

        logger.info("---- Filtered by Full Name ----");
    }

    @Then("Click on the filter from the Country column")
    public void click_on_country_filter() {
        viewDataPage = new ViewDataPage(driver);
        viewDataPage.clickFilterCountry();
        logger.info("---- Clicking filter from the country column ----");
    }

    @When("Filter data by Country")
    public void filter_data_by_country(DataTable table) throws InterruptedException {
        viewDataPage.clickFilterFullName();

        List<List<String>> listItem = table.asLists(String.class);
        viewDataPage.selectFilterByCountry(listItem.get(1).get(0),
                listItem.get(1).get(1),
                listItem.get(1).get(2),
                listItem.get(1).get(3),
                listItem.get(1).get(4));

        logger.info("---- Filtered by Country ----");
    }

    @When("Enter Text to Filters")
    public void enter_text_to_master_filters(DataTable table)  {
        viewDataPage = new ViewDataPage(driver);

        List<List<String>> listItem = table.asLists(String.class);
        viewDataPage.enterTextToMasterFilters(listItem.get(1).get(0), listItem.get(1).get(1));
        logger.info("---- Enter data to the master filters  ----");
    }

    @And("Click on Filter button")
    public void click_on_filter_button() throws InterruptedException {
        viewDataPage.clickFilterButton();
        logger.info("---- Click on filter button ----");
    }

    @Then("Check filtered full name data by master filters")
    public void click_filtered_data_by_fullName(DataTable table) throws InterruptedException {
        viewDataPage.clickFilterButton();
        Thread.sleep(2000);
        List<List<String>> listItem = table.asLists(String.class);
        Assert.assertTrue(viewDataPage.checkFilteredFullNameData("", listItem.get(1).get(0)));
        logger.info("---- Click on filter button ----");
    }


    @Then("Check filtered country by master filters")
    public void click_filtered_data_by_country(DataTable table) throws InterruptedException {
        viewDataPage.clickFilterButton();
        List<List<String>> listItem = table.asLists(String.class);
        Assert.assertTrue(viewDataPage.checkFilteredCountryData("", listItem.get(1).get(0)));
        logger.info("---- Click on filter button ----");
    }

    @Then("Check filtered both full name and country by master filters")
    public void click_filtered_data_by_fullName_and_country(DataTable table) throws InterruptedException {
        viewDataPage.clickFilterButton();
        List<List<String>> listItem = table.asLists(String.class);
        Assert.assertTrue(viewDataPage.checkFilteredDataByFullNameAndCountry("", listItem.get(1).get(0), listItem.get(1).get(1)));
        logger.info("---- Click on filter button ----");
    }



}





