package com.co.dafiti.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/makePurchase.feature",
        tags = "@makeAPurchase",
        glue = "com/co/dafiti/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class DafitiAutomationRunner {

}