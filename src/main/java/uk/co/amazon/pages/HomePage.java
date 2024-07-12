package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.amazon.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@name='accept']")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//a[@aria-label='Open Menu']")
    WebElement allMenu;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/ul[1]/li[21]/a[1]/i[1]")
    WebElement electronicsComputer;

    public void clickOnAcceptCookies() {
        Reporter.log("Clicking on accept cookies " + cookies.getText() + "<br>");
        log.info("Click on accept cookies : " + cookies.getText());
        clickOnElement(cookies);
    }

    public void clickOnAllMenu() {
        Reporter.log("Clicking on all menu " + allMenu.getText() + "<br>");
        log.info("Click on all menu : " + allMenu.getText());
        clickOnElement(allMenu);
    }

    public void clickOnElectronicAndComputerMenu() {
        Reporter.log("Clicking on Electronic and Computer Menu " + electronicsComputer.getText() + "<br>");
        log.info("Click on electric and computer menu : " + electronicsComputer.getText());
        // Use JavaScript Executor to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", electronicsComputer);

    }


}
