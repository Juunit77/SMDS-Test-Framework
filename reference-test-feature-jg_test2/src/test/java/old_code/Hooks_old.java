//package hooks;
//
//import factory.DriverFactory;
//import io.cucumber.java.AfterAll;
//import io.cucumber.java.BeforeAll;
//import org.openqa.selenium.WebDriver;
//
//public class Hooks_old {
//    private WebDriver driver;
//
//    @BeforeAll
//    public void before() {
//        System.out.println("Test Before All");
//        driver = DriverFactory.initializeDriver();
//    }
//
//    @AfterAll
//    public void after() {
//        System.out.println("Test After All");
//        driver.quit();
//    }
//}
