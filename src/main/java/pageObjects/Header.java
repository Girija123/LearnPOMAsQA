package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonFunctions;

public class Header {

    public Header(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    CommonFunctions commonFunctions = new CommonFunctions();

    @FindBy(xpath="//a[text()='Store Locator']")
    public WebElement storeLocatorLink;

    public void clickStoreLocatorLink()
    {
        //storeLocatorLink.click();
        commonFunctions.clickElement(storeLocatorLink);
    }
}
