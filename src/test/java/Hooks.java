import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.CommonFunctions;

import javax.smartcardio.CommandAPDU;

public class Hooks {

    CommonFunctions commonFunctions = new CommonFunctions();

    @Before
    public void beforeTest()
    {
        commonFunctions.openBrowser();
    }

    @After
    public void afterTest()
    {
        commonFunctions.closeBrowser();
    }
}
