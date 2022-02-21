package smoke.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import smoke.utilities.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "smoke/step_definition",
        tags = "@Smoke"
)


public class Cukerunner {
        @AfterClass
        public static void teardown() {
                Driver.closeDriver();
        }
}
