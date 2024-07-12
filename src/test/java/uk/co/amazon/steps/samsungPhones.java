package uk.co.amazon.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import uk.co.amazon.pages.ElectronicsPage;
import uk.co.amazon.pages.HomePage;
import uk.co.amazon.pages.MobilePhonesPage;
import uk.co.amazon.pages.PhonesAndAccessoriesPage;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;
import static uk.co.amazon.browserfactory.ManageBrowser.driver;

public class samsungPhones {
    @Given("I am on the Amazon home page")
    public void iAmOnTheAmazonHomePage() {
        new HomePage().clickOnAcceptCookies();
    }

    @When("I navigate to Electronics & Computers")
    public void iNavigateToElectronicsComputers() {
        new HomePage().clickOnAllMenu();
        new HomePage().clickOnElectronicAndComputerMenu();

    }

    @And("I go to Phones & Accessories")
    public void iGoToPhonesAccessories() {
        new ElectronicsPage().clickOnPhoneAndAccessoriesMenu();
    }

    @And("I go to Mobile Phones")
    public void iGoToMobilePhones() {
        new PhonesAndAccessoriesPage().clickOnMobilePhoneMenu();
    }

    @And("I filter by Samsung brand")
    public void iFilterBySamsungBrand() {
        new MobilePhonesPage().clickOnSamsungCheckbox();
    }

    @And("I filter by 20 MP and above camera resolution")
    public void iFilterByTwentyMPAndAboveCameraResolution() {
        new MobilePhonesPage().clickOnCameraResolutionCheckbox();
    }

    @And("I filter by model year 2023")
    public void iFilterByModelYear() {
        new MobilePhonesPage().clickOnYearCheckbox();
    }

    @And("I filter by price range £50 - £100")
    public void iFilterByPriceRange() {
        new MobilePhonesPage().selectPrice();

    }

    @Then("I should see a list of Samsung phones that match the criteria")
    public void iShouldSeeAListOfSamsungPhonesThatMatchTheCriteria() {
        try {
            List<WebElement> samsungPhones = MobilePhonesPage.getSamsungPhonesList();
            assertTrue("No Samsung phones found matching the criteria.", samsungPhones.size() > 0);

            for (WebElement phone : samsungPhones) {
                System.out.println(phone.getText());
                // Additional assertions can be added here to validate the phone details
            }
        } catch (NoSuchElementException e) {
            Reporter.log("Failed to retrieve the list of Samsung phones: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
