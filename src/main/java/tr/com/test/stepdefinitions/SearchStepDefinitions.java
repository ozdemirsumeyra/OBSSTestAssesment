package tr.com.test.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import tr.com.test.pageObjects.HomePagePOM;
import tr.com.test.testBase.TestBase;


public class SearchStepDefinitions extends TestBase {

    Actions action = null;
    int waitTime =10;
    HomePagePOM homePagePOM;

    @Given("open website with \"([^\"]*)\"")
    public void open_site(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver(chromeOptions);
        }else{
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        driver.get("https://obss.com.tr/en/");
        homePagePOM = new HomePagePOM(driver, waitTime);
    }

    @When("Search text with \"([^\"]*)\"")
    public void searchText(String text){
        homePagePOM.acceptCookie();
        homePagePOM.searchText(text);
        homePagePOM.scrollDown();
    }

    @Then("control footer")
    public void controlFooter(){
        homePagePOM.controlFooter();
    }


}
