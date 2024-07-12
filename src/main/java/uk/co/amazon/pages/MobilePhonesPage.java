package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

import java.util.List;

public class MobilePhonesPage extends Utility {


    private static final Logger log = LogManager.getLogger(MobilePhonesPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']")
    WebElement samsungPhone;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'20 MP & above')]")
    WebElement cameraResolution;

    @CacheLookup
    @FindBy(xpath = "//span[@class='a-size-base a-color-base'][normalize-space()='2023']")
    WebElement year2023;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'£50 to £100')]")
    WebElement slider;

    @CacheLookup
    @FindBy(xpath = "//div[@class='a-section s-range-input-container s-upper-bound']")
    WebElement maxPrice;

    @CacheLookup
    @FindBy(css = ".s-result-list .s-title")
    List<WebElement> samsungPhonesList;


    public void clickOnSamsungCheckbox() {
        Reporter.log("Clicking on Samsung Checkbox " + samsungPhone.getText() + "<br>");
        log.info("Click on mobile phone menu : " + samsungPhone.getText());
        clickOnElement(samsungPhone);
    }

    public void clickOnCameraResolutionCheckbox() {
        Reporter.log("Clicking on Mobile Phone Menu " + cameraResolution.getText() + "<br>");
        log.info("Click on mobile phone menu : " + cameraResolution.getText());
        clickOnElement(cameraResolution);
    }

    public void clickOnYearCheckbox() {
        Reporter.log("Clicking on Year Checkbox " + year2023.getText() + "<br>");
        log.info("Click on year checkbox : " + year2023.getText());
        clickOnElement(year2023);
    }

    public void selectPrice() {
        Reporter.log("Selecting on Minimum Price Range " + slider.getText() + "<br>");
        log.info("Selecting minimum price range : " + slider.getText());
        clickOnElement(slider);

    }

    public static List<WebElement> getSamsungPhonesList() {
        return driver.findElements(By.xpath(".//span[contains(text(), 'Samsung')]"));
    }


}
