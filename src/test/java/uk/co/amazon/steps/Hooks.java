package uk.co.amazon.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import uk.co.amazon.propertyreader.PropertyReader;
import uk.co.amazon.utility.Utility;

/**
 * Created by Nishit Patel
 */
public class Hooks extends Utility {

    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        closeBrowser();
    }
}