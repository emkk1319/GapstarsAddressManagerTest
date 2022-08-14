package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;
import pageObjects.AddDataPage;
import pageObjects.ViewDataPage;

import java.util.List;

public class ResetDataSteps extends BaseClass {

    final Logger logger = Logger.getLogger(ResetDataSteps.class);

    @And("Click on Reset button" )
    public void click_on_reset(){
        addDataPage = new AddDataPage(driver);
        addDataPage.clickResetButton();
        logger.info("---- Clicking on Reset button ----");
    }

    @And("Check that the entered form data cleared" )
    public void check_form_data_cleared(){
       Assert.assertTrue(addDataPage.isFieldsAreEmpty());
        logger.info("---- Form data get cleared----");
    }


}





