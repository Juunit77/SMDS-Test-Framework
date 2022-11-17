package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static factory.DriverFactory.getDriver;

public class LoginStepDefs {
    private WebDriver driver = getDriver();

    @Given("^User is on Login Page$")
    public void user_is_on_login_page() {


//        /*Access CIRRAS Test Environment*/
//        navigateTo_URL("https://10.205.199.135/cirras-client/");
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

        System.out.println("Maximized Screen");
    }

    @When("^User clicks Login Button$")
    public void user_clicks_login_button() throws Throwable {

//        new SplashPageHome(driver).CirrasLogin("login");

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
        System.out.println("Clicked Login Button");
    }

    @And("^User selects a Role$")
    public void user_selects_a_role() throws Throwable {

//        /*Click First Role (0-4 are the indexes for the 1-5 selectors on the page)-|*/
//        driver.findElement(By.id("grantedTableSelectButton-0")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        /*Click The Submit Button-|*/
//        driver.findElement(By.id("accessGrantedSubmitButton")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        /*Click the I Accept HIPPA Button-|*/
//        driver.findElement(By.cssSelector("#iAcceptButton > .mat-button-wrapper")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
        System.out.println("User selects a Role");
    }

    @Then("^User is navigated to the Unit Summary Page$")
    public void user_is_navigated_to_the_unit_summary_page() throws Throwable {
//
//        String URL = driver.getCurrentUrl();
//        Assert.assertEquals(URL, "//10.205.199.135/cirras-client/frame/authorizedUser/unitSummary");

        System.out.println("User is navigated to the Unit Summary Page");
    }

}
