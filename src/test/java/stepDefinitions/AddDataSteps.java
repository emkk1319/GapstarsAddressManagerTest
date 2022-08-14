package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import org.testng.Assert;
import pageObjects.AddDataPage;
import pageObjects.ViewDataPage;

import java.util.List;


public class AddDataSteps extends BaseClass {

    final Logger logger = Logger.getLogger(AddDataSteps.class);

    //Add Data---------------------------
    @When("User clicks on Add New Button")
    public void user_clicks_on_add_new_button() {
        viewDataPage = new ViewDataPage(driver);
        viewDataPage.clickAddNewButton();
        logger.info("---- Click on Add New button ----");
    }

    @Then("User navigated to Add Data page")
    public void user_navigated_to_add_data_page(DataTable table) {
        addDataPage = new AddDataPage(driver);
        List<List<String>> listItem = table.asLists(String.class);
        Assert.assertEquals(listItem.get(1).get(0),  addDataPage.getAddDataPageTitle());
        logger.info("---- User navigates to  on Add Data page ----");
    }

    @When("Enter User details")
    public void user_add_new_record(DataTable table) throws InterruptedException {
        addDataPage = new AddDataPage(driver);
        List<List<String>> listItem = table.asLists(String.class);
        addDataPage.enterFullName(listItem.get(1).get(0));
        addDataPage.enterAge(listItem.get(1).get(1));
        addDataPage.enterAddress(listItem.get(1).get(2));
        addDataPage.selectBirthday(listItem.get(1).get(3));
        addDataPage.selectCountry(listItem.get(1).get(4));
        addDataPage.selectExpertise(listItem.get(1).get(5));
        addDataPage.selectExpertise(listItem.get(2).get(5));
        addDataPage.selectGender(listItem.get(1).get(6));

        logger.info("---- User enters user details ----");
    }


    @And("Click on Submit button" )
    public void click_on_submit(){
        addDataPage = new AddDataPage(driver);
        addDataPage.clickSubmitButton();
        logger.info("---- Clicking on submit button ----");
    }

    @Then("User redirected to the View Data page" )
    public void user_redirected_to_the_view_data_page(DataTable table){
        List<List<String>> listItem = table.asLists(String.class);
        Assert.assertEquals(listItem.get(1).get(0), viewDataPage.getViewDataPageTitle());
        logger.info("---- User directs to the View Data page ----");
    }

    @Then("Check that the New record Successfully added to the system" )
    public void new_record_successfully_added_to_the_system(DataTable table){
        List<List<String>> listItem = table.asLists(String.class);
        Assert.assertTrue(viewDataPage.checkNewlyAddedRecord("", listItem.get(1).get(0),listItem.get(1).get(1)));

        logger.info("---- New record added to the system successfully ----");
    }

    @And("Check that the address field is mandatory")
    public void check_that_the_address_field_is_mandatory() throws InterruptedException {
        addDataPage.checkAddressFieldIsMandatory();
        logger.info("---- Address field is mandatory ----");
    }
}





