package tr.com.test.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePagePOM {


    WebDriver driver;
    WebDriverWait wait;


    @FindBy(id="cookieAcceptance")
    WebElement cookie;
    @FindBy(id="search-icon")
    WebElement searchIcon;
    @FindBy(id="search-box")
    WebElement searchBox;
    @FindBy(linkText="Testing & Automation")
    WebElement firstLink;
    @FindBy(tagName = "footer")
    WebElement footer;


    public HomePagePOM(WebDriver driver, int waitTime) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait= new WebDriverWait(driver, waitTime);
    }


    public void acceptCookie(){
        if(cookie.isDisplayed())
            wait.until(ExpectedConditions.elementToBeClickable(cookie)).click();

    }

    public void searchText(String text){
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys(text);
        wait.until(ExpectedConditions.elementToBeClickable(searchBox)).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(firstLink)).click();
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void controlFooter(){
        Assert.assertTrue(footer.isDisplayed());
        this.driver.close();
    }

}
