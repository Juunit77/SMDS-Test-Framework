package pages;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;

public class PageFactory extends BasePage {

    public PageFactory() {
        super();
    }

    public void navigateTo_CirrasTest() {
        navigateTo_URL("https://10.205.199.135/cirras-client/");
    }

    public void navigateTo_CirrasUAT() {
        navigateTo_URL("https://10.205.199.145/cirras-client/");
    }

    public void googleWarning1() {
        waitForWebElementAndClickBy(id("details-button"));
    }

    public void googleWarning2() {
        waitForWebElementAndClickBy(id("proceed-link"));
    }

    public void cirrasLogin() {
        waitForWebElementAndClickBy(id("login-button"));
    }

    public void selectRole() {
        waitForWebElementAndClickBy(id("grantedTableSelectButton-0"));
    }

    public void submitRole() {
        waitForWebElementAndClickBy(id("accessGrantedSubmitButton"));
    }

    public void acceptHIPAA() {
        waitForWebElementAndClickBy(By.cssSelector("#iAcceptButton > .mat-button-wrapper"));
    }

    public void clickAnnouncementButton() {
        waitForWebElementAndClickBy(By.xpath("//button[@id='makeAnnouncementButton']"));
    }

    public void clickAnnouncementType() {
        waitForWebElementAndClickBy(id("createAnnouncementType"));
    }

    public void selectFPC() {
        waitForWebElementAndClickBy(By.xpath("//*[@id='createAnnouncementType']/option[1]"));
    }

    public void selectCirrasPolicy() {
        waitForWebElementAndClickBy(By.xpath("//*[@id='createAnnouncementType']/option[2]"));
    }

    public void selectLeadershipChange() {
        waitForWebElementAndClickBy(By.xpath("//*[@id='createAnnouncementType']/option[3]"));
    }

    public void typeAnnouncement() {
        sendKeysBy(By.id("createAnnouncementText"), "Hello World, This is a test of the announcement feature.");
    }

    public void clickAnnouncementSubmit(){
        waitForWebElementAndClickBy(By.xpath("//button[@id='createAnnouncementSubmitButton']"));
    }

}

