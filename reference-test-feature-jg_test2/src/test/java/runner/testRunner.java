package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepdefinitions",
        tags = "@Functional", //@Smoke or @Regression or @Functional or @Exploratory
        plugin = {"junit:target/cucumber/result.xml",
                "junit:target/cucumber/result.csv",
                "json:target/cucumber/result.json",
                "html:target/cucumber/result.html",
                "pretty"}
)

public class testRunner {

}
