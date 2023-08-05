package com.examly.springapp;




import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/login.feature", glue = "SpringApplicationTests.java")
public class glue {
}
