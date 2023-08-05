package com.examly.springapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class SpringApplicationTests {

	
    WebDriver driver = new ChromeDriver();

    @Given("the user is on the Home page")
    public void the_user_is_on_the_home_page() {
        driver.get("https://example.com");
    }

    @When("the user navigates to the Login page")
    public void the_user_navigates_to_the_login_page() {
        driver.findElement(By.linkText("Login")).click();
    }

    @And("the user enters username and password")
    public void the_user_enters_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("your_username");
        driver.findElement(By.id("password")).sendKeys("your_password");
        driver.findElement(By.id("login-button")).click();
    }

    @Then("the successful login message is displayed")
    public void the_successful_login_message_is_displayed() {
        String expectedMessage = "You have successfully logged into your account! There are multiple discount offers waiting for you!!";
        String actualMessage = driver.findElement(By.id("success-message")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
