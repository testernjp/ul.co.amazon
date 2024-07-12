package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

public class PhonesAndAccessoriesPage extends Utility {

    private static final Logger log = LogManager.getLogger(PhonesAndAccessoriesPage.class.getName());

    @CacheLookup
    @FindBy(id = "a-autoid-0-announce")
    WebElement mobilePhone;

    public void clickOnMobilePhoneMenu() {
        Reporter.log("Clicking on Mobile Phone Menu " + mobilePhone.getText() + "<br>");
        log.info("Click on mobile phone menu : " + mobilePhone.getText());
        clickOnElement(mobilePhone);
    }
}
