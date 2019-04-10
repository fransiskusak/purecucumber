package com.mycompany.purecucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "test.java.com.mycompany.purecucumber",features="src/test/resources/features/consult_dictionary/LookupADefinition.feature")

//@CucumberOptions(features="src/test/resources/features/consult_dictionary/LookupADefinition.feature")
//@CucumberOptions(glue = "smoketests.stepdefinitions", features = "classpath:features")

public class DefinitionTestSuite2 {}
