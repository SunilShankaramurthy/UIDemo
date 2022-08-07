package com.UI_Automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty", "html:reports/cucumber-reports.html",
                "com.UI_Automation.Listeners.extentReports.CustomReportListener",
        },
        features = "features",
        glue = "com.UI_Automation.stepdef",
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    // private DriverFactory driverFactory;
    // private WebDriver driver;


}
