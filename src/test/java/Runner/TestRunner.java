package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/resources/features/",
                    glue = "src/test/java/org/newFrmwrk/stepDefs",
                    plugin = {"pretty","html:target/cucumber-reports", "json:target/cucumber.json",},
                    monochrome = true,
                    publish = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

    //@override
    @DataProvider(parallel = true)
    public Object[] [] scenario(){
        return super.scenarios();
    }
}
