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
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//@RunWith(Cucumber.class)
public class EventStepDefs {

    @Given("^User is on Unit Summary Page$")
    public void user_is_on_unit_summary_page() throws Throwable {

        System.out.println("user_is_on_unit_summary_page");
    }

    @When("^User navigates to the Active Force Preservation page$")
    public void user_navigates_to_the_active_force_preservation_page() throws Throwable {

        System.out.println("user_navigates_to_the_active_force_preservation_page");
    }

    @When("^User clicks the Add Event Button$")
    public void user_clicks_the_add_event_button() throws Throwable {

        System.out.println("user_clicks_the_add_event_button(");
    }

    @When("^User completes the Event Dialog Form$")
    public void user_completes_the_event_dialog_form() throws Throwable {

        System.out.println("user_completes_the_event_dialog_form");
    }

    @Then("^User is navigated to the Individual Summary Page$")
    public void user_is_navigated_to_the_individual_summary_page() throws Throwable {

        System.out.println("user_is_navigated_to_the_individual_summary_page");
    }

    @Then("^User should be presented with the Event Dialog Form$")
    public void user_should_be_presented_with_the_event_dialog_form() throws Throwable {

        System.out.println("user_should_be_presented_with_the_event_dialog_form");
    }

    @Then("^User should have the option to Submit the Event$")
    public void user_should_have_the_option_to_submit_the_event() throws Throwable {

        System.out.println("user_should_have_the_option_to_submit_the_event");
    }

    @And("^User selects a (.+)$")
    public void user_selects_a(String ForceMember) throws Throwable {

        System.out.println("user_selects_a_Force_Member");
    }

    @And("^the User should be presented with Confirmation Box$")
    public void the_user_should_be_presented_with_confirmation_box() throws Throwable {

        System.out.println("the_user_should_be_presented_with_confirmation_box");
    }

}


