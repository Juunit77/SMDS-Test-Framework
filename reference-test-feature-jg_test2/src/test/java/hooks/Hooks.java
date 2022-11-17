package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import static factory.DriverFactory.*;

public class Hooks {


    @Before
    public void setup() {
        getDriver();

    }

    @AfterStep
    public void captureExceptionImage(Scenario scenario) {
        if (scenario.isFailed()) {

            byte[] screenshot = captureScreen();
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

    @After
    public void tearDown() {
        cleanupDriver();

    }
}



//    @AfterStep
//    public void captureExceptionImage(Scenario scenario) {
//        if (scenario.isFailed()) {
//            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//            String timeMilliseconds = Long.toString(timestamp.getTime());
//
//            byte[] screenshot = ((TakesScreenshot) getDriver())
//                    .getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", timeMilliseconds);
//
//        }
//    }