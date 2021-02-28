package stepDefinitons;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Header;
import pageObjects.StoreLocatorPage;
import utils.CommonFunctions;

public class StoreSearchSteps extends CommonFunctions {

    Header header = new Header(driver);
    StoreLocatorPage storeLocatorPage = new StoreLocatorPage(driver);


    @Given("^I'm on Home Page \"([^\"]*)\"$")
    public void i_m_on_Home_Page(String url) throws Throwable {
      driver.get(url);
    }

    @When("^I click store locator link$")
    public void i_click_store_locator_link() throws Throwable {
       header.clickStoreLocatorLink();
    }

    @When("^I enter postcode \"([^\"]*)\" as searchTerm$")
    public void i_enter_postcode_as_searchTerm(String postcode) throws Throwable {
      storeLocatorPage.enterPostCodeForStoreSearch(postcode);
    }

    @When("^I click find stores button$")
    public void i_click_find_stores_button() throws Throwable {
      storeLocatorPage.clickFindStoresBtn();
    }

    @Then("^I should see map of stores$")
    public void i_should_see_map_of_stores() throws Throwable {
      storeLocatorPage.validateMapOfStores();
    }
}
