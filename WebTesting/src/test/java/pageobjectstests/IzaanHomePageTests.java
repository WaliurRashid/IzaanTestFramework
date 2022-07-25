package pageobjectstests;

import com.izaanschool.browserdriver.BrowserDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.IzaanHomePage;

public class IzaanHomePageTests extends BrowserDriver {
    IzaanHomePage homePage;

    @Test
    public void headerAssertion () {
        homePage = new IzaanHomePage();
        Assert.assertEquals(homePage.getHeader(),"Izaan School","Ensure that the Header is correct");
        System.out.println("Test Header Assertion Passed");
    }

    @Test
    public void assertionBodyText () {
        homePage = new IzaanHomePage();
        Assert.assertEquals(homePage.getBody(),"Izaan School of Engineering","Ensure that the Body is correct");
        System.out.println("Test Body Assertion Passed");
    }
}
