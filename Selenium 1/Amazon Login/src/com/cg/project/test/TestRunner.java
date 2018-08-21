package com.cg.project.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"resource"},glue= {"com.cg.project.stepDefination"})

public class TestRunner 
{

}
