package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeStepDefinition {

    public static WebDriver driver;

    @Given("I navigate to the home page")
    public void i_navigate_to_the_home_page() {
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }
    @When("Navigate Forgot password link")
    public void navigate_forgot_password_link() {
        driver.findElement(By.xpath("//u[text()='Forgot Password?']")).click();
    }
    @Then("I should see forgot password page")
    public void i_should_see_forgot_password_page() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "Password help assistance");
        driver.quit();
    }
}
