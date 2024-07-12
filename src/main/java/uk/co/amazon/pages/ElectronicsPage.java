package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

public class ElectronicsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ElectronicsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Phones & Accessories']")
    WebElement phoneAccessories;

    public void clickOnPhoneAndAccessoriesMenu() {
        Reporter.log("Clicking on Phone and Accessories Menu " + phoneAccessories.getText() + "<br>");
        log.info("Click on phone and accessories menu : " + phoneAccessories.getText());

        // Use JavaScript Executor to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", phoneAccessories);

    }
}
