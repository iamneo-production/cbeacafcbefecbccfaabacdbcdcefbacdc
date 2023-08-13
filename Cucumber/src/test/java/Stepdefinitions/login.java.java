package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class StepDefinitions {
    WebDriver driver=null;

 @Given("Given the user is on the Home page")
 public void user_is_on_login_page() {
  System.out.println("Inside Step - the user is on login page");
  driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
     driver.navigate().to("https://amazon.com");
 }

 @When("the user navigates to the Login page")
 public void user_enters_username_and_password() {
  System.out.println("Inside Step - the user navigates to the Login page");
 }

 @And("the user enters username and password")
 public void clicks_on_login_button() {
  System.out.println("Inside Step - the user enters username and password");
 }

 @Then("the successful login message is displayed with text:")
 public void user_is_navigated_to_the_home_page() {
  System.out.println("You have successfully logged into your account! There are multiple discount offers waiting for you!!");
 }

}