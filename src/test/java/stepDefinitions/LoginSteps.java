package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AddDataPage;
import pageObjects.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;
import pageObjects.ViewDataPage;

public class LoginSteps extends BaseClass {

    final Logger logger = Logger.getLogger(LoginSteps.class);

    @Before
    public void setup() throws IOException {

        // Reading properties
        configProp = new Properties();
        FileInputStream configPropfile = new FileInputStream("config.properties");
        configProp.load(configPropfile);

        String br = configProp.getProperty("browser");
        if (br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromePath"));
            driver = new ChromeDriver();
        } else if (br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxPath"));
            driver = new FirefoxDriver();
        }

        logger.info("---- Launching Browser ----");
    }

    //----------Steps related to the Login feature----------

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        loginPage = new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_URL(String appUrl) {
        driver.get(appUrl);
        driver.manage().window().maximize();
        Assert.assertEquals("Welcome", loginPage.getLoginPageTitle());
        logger.info("---- Opening URL ----");
    }

    @And("User enters Username as {string} and Password as {string}")
    public void user_enters_username_and_password(String email, String password) {
        loginPage.setUserName(email);
        loginPage.setPassword(password);
        logger.info("---- Providing login details ----");
    }

    @And("Click on Login")
    public void click_on_Login() {
        loginPage.clickLogin();
        logger.info("---- Clicking on Login button ----");
    }

    @Then("Check Login is success")
    public void check_login_is_success(DataTable table) {
        viewDataPage = new ViewDataPage(driver);
        List<List<String>> listItem = table.asLists(String.class);
        org.testng.Assert.assertEquals(listItem.get(1).get(0), viewDataPage.getViewDataPageTitle());
        logger.info("---- Login success and navigated to View Data page ----");
    }

    @Then("Verify Error in login")
    public void login_error() {
        loginPage = new LoginPage(driver);
        Assert.assertEquals("Invalid Credentials!",loginPage.getLoginError());
        System.out.println("error : " + loginPage.getLoginError());
        logger.info("---- Login success and navigated to View Data page ----");
    }

}





