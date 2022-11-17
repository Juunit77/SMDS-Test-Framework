package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

//@RunWith(Cucumber.class)
public class LogoutStepDefs {
    //    private WebDriver driver;
    @Given("User is on the Unit Summary Page")
    public void user_is_on_the_unit_summary_page() {

//        /*Access CIRRAS Test Environment*/
//        driver = DriverFactory.getDriver();
//        driver.get("https://10.205.199.135/cirras-client/");
//
//        System.out.println("Accessed CIRRAS Test Environment");
//
//        /*Step through Google warning part1*/
//        driver.findElement(By.id("details-button")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        System.out.println("Stepped through google warning part1");
//
//        /*Step through Google warning part2*/
//        driver.findElement(By.id("proceed-link")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        System.out.println("Stepped through google warning part2");
//
//        //UTILITY CLASS - Maximize Screen
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        System.out.println("Maximized Screen");
//
//        /*Click Login Button-|*/
//        driver.findElement(By.id("login-button")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        System.out.println("Clicked Login Button");
//
//        /*Click First Role (0-4 are the indexes for the 1-5 selectors on the page)-|*/
//        driver.findElement(By.id("grantedTableSelectButton-0")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        System.out.println("Clicked First User In List");
//
//        /*Click The Submit Button-|*/
//        driver.findElement(By.id("accessGrantedSubmitButton")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        System.out.println("Clicked I Submit Button");
//
//        /*Click the I Accept HIPPA Button-|*/
//        driver.findElement(By.cssSelector("#iAcceptButton > .mat-button-wrapper")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        System.out.println("Clicked I Accept HIPPA Button");
//
//        /*Verify user is on Unit Summary Page*/
//        String URL = driver.getCurrentUrl();
//        Assert.assertEquals(URL, "//10.205.199.135/cirras-client/frame/authorizedUser/unitSummary");

        System.out.println("User is on the Unit Summary Page");
    }

    @When("^User clicks Logout Button$")
    public void user_clicks_logout_button() throws Throwable {

//        /*Click Logout Button*/
//        driver.findElement(By.id("topNavbar-logout")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        System.out.println("Clicked The Logout Button");
    }

    @And("^User confirms they want to logout$")
    public void user_confirms_they_want_to_logout() throws Throwable {

//        /*Confirm Logout*/
//        driver.findElement(By.xpath(
//        "//mat-dialog-container[@id='mat-dialog-3']/modal-confirmation-dialog/div/form/div[2]/div/div/div/button[1]/span[1]")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        System.out.println("User confirmed they want to logout");
    }

    @Then("^User is navigated to the Splash Page$")
    public void user_is_navigated_to_the_splash_page() throws Throwable {

//        String URL = driver.getCurrentUrl();
//        Assert.assertEquals(URL, "https://10.205.199.135/cirras-client/frame/splashPage/splashPageHome");

        System.out.println("User is navigated to the Splash Page");
    }

}
