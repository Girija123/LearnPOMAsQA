package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonFunctions;

public class StoreLocatorPage {

    //public final int a = 5;

    public  StoreLocatorPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="")
    public WebElement storePostCodeSrchTxtFld;

    @FindBy(id="")
    public WebElement findStoresBtn;

    @FindBy
    public WebElement mapOfStores;

    CommonFunctions commonFunctions = new CommonFunctions();

    public void enterPostCodeForStoreSearch(String postcode)
    {
       // storePostCodeSrchTxtFld.sendKeys(postcode);
        commonFunctions.enterDataInTxtFld(storePostCodeSrchTxtFld, postcode);
    }

    public  void clickFindStoresBtn()
    {
        findStoresBtn.click();
    }

    public void validateMapOfStores()
    {
        Assert.assertTrue(mapOfStores.isDisplayed());
    }



}
