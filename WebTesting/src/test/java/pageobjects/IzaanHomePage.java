package pageobjects;

import helper.ApplicationHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.izaanschool.browserdriver.BrowserDriver.driver;

public class IzaanHomePage {

    ApplicationHelper helper = new ApplicationHelper();

    @FindBy(how = How.CSS, using = "a.navbar-brand h6")
    WebElement header;

    @FindBy(how = How.CSS, using = "h1.display-2>span")
    WebElement body;
    public IzaanHomePage() {
        PageFactory.initElements(driver,this);
    }

    public String getHeader(){
        String headerText = helper.getText(header,"Page Header");
        // TestLogger.log("Page Title: " + pageTitle);
        return headerText;
    }

    public String getBody(){
        String bodyText = helper.getText(body,"Body Text");
        // TestLogger.log("Page Title: " + pageTitle);
        return bodyText;
    }
}
