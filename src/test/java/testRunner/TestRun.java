package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {".//Features/Login.feature", ".//Features/AddData.feature", ".//Features/ResetData.feature", ".//Features/FilterData.feature"},
        glue = "stepDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:test-output"},
        tags = {}
)
public class TestRun {
}
