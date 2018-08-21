package com.cg.bdd.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"resource"},glue= {"com.cg.bdd.stepDefination"})
public class TestRunner 
{

}
