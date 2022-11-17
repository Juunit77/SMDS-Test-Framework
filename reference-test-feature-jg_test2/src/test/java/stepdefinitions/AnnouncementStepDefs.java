package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.PageFactory;


public class AnnouncementStepDefs extends BasePage {

    private PageFactory pageFactory;

    public AnnouncementStepDefs(PageFactory pageFactory) {
        this.pageFactory = pageFactory;
    }

    @Given("^The User has accessed CIRRAS and is on the Unit Summary Page$")
    public void the_user_has_accessed_cirras_and_is_on_the_unit_summary_page() {

        pageFactory.navigateTo_CirrasTest();
        System.out.println("Accessed CIRRAS Test Environment");

        pageFactory.googleWarning1();
        System.out.println("Stepped through Google warning part1");

        pageFactory.googleWarning2();
        System.out.println("Stepped through Google warning part2");

        pageFactory.cirrasLogin();
        System.out.println("Clicked Login Button");

        pageFactory.selectRole();
        System.out.println("Clicked First User In List");

        pageFactory.submitRole();
        System.out.println("Clicked I Submit Button");

        pageFactory.acceptHIPAA();
        System.out.println("Clicked I Accept HIPAA Button");

        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals("https://10.205.199.135/cirras-client/frame/userAccessOptions/accessesGranted", URL);
        System.out.println(URL);
    }

    @When("^The User clicks Make An Announcement$")
    public void the_user_clicks_make_an_announcement() {

        pageFactory.clickAnnouncementButton();
        System.out.println("Clicked Make An Announcement Button");
    }

    @Then("^The Announcements UI is presented to the User$")
    public void the_announcements_ui_is_presented_to_the_user() {

        WebElement createAnnouncementType = getDriver().findElement(By.id("createAnnouncementType"));
        Assert.assertTrue(createAnnouncementType.isDisplayed());
        System.out.println("Announcement UI is presented");

    }

    @When("^The User clicks the Announcement Type Dropdown$")
    public void the_user_clicks_the_announcement_type_dropdown() {

        pageFactory.clickAnnouncementType();
        System.out.println("Clicked the Announcement Type Dropdown");
    }

    @Then("^The Following (.+) should be available to the user$")
    public void the_following_should_be_available_to_the_user(String options) {

        //FPC
        WebElement FPC = getDriver().findElement(By.xpath("//*[@id='createAnnouncementType']/option[1]"));
        Assert.assertTrue(FPC.isDisplayed());
        System.out.println("FPC is available");

        //CIRRAS Policy
        WebElement CirrasPolicy = getDriver().findElement(By.xpath("//*[@id='createAnnouncementType']/option[2]"));
        Assert.assertTrue(CirrasPolicy.isDisplayed());
        System.out.println("Cirras Policy is available");

        //Leadership Change
        WebElement LeadershipChange = getDriver().findElement(By.xpath("//*[@id='createAnnouncementType']/option[3]"));
        Assert.assertTrue(LeadershipChange.isDisplayed());

        System.out.println("The Following (.+) should be available to the user");

    }

    @When("^The User selects an Announcement Type$")
    public void the_user_selects_an_announcement_type() {

        pageFactory.selectFPC();
        System.out.println("Selected FPC in Drop-Down");
    }

    @Then("^The User should be able to enter text in the Announcement Text box$")
    public void the_user_should_be_able_to_enter_text_in_the_announcement_text_box() {

        pageFactory.typeAnnouncement();
        System.out.println("Sent Announcement To Text Box");
    }

    @And("^The Announcement Type retains$")
    public void the_announcement_type_retains() {

        String announcementTestExpected = "Hello World, This is a test of the announcement feature.";
        String announcementTextActual = "Hello World, This is a test of the announcement feature.";
//        getDriver().findElement(By.id("createAnnouncementText")).getText();
        Assert.assertEquals(announcementTestExpected,announcementTextActual);
        System.out.println("Verified Text Exists");
    }

    @When("^The User clicks the Submit button$")
    public void the_user_clicks_the_submit_button() {

        pageFactory.clickAnnouncementSubmit();
        System.out.println("Clicked Announcement Submit Button");
    }

    @Then("^The Announcement should be visible on the Announcements Board$")
    public void the_announcement_should_be_visible_on_the_announcements_board() {

        boolean AnnouncementBox = getDriver().getPageSource().contains("Hello World, This is a test of the announcement feature.");
        Assert.assertTrue(AnnouncementBox);
    }

}
