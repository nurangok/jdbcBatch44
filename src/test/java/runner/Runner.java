package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features="src/test/resources/features",
        glue = "dbStepdefinitions",
        tags="@db",
        dryRun = false
)

// Raporlama icin runner dan calistirmak gerekir


public class Runner {

}