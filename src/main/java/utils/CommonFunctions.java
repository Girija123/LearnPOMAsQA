package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonFunctions {

    public static WebDriver driver;

    public void openBrowser()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public void clickElement(WebElement element)
    {
        element.click();
    }

    public  void enterDataInTxtFld(WebElement element, String data)
    {
        element.sendKeys(data);
    }
}
