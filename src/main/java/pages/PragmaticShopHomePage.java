package pages;

import org.openqa.selenium.By;
import util.Browser;

public class PragmaticShopHomePage {
    private static final By LOC_MY_ACCOUNT = By.cssSelector("li.dropdown a[href*= 'account/account']");
    private static final By LOC_MY_ACCOUNT_REGISTER = By.cssSelector("a[href*= 'account/register']");

    public static void goTo(){
        Browser.driver.get("http://shop.pragmatic.bg/");
    }


    public static void selectRegisterAccount() {
        Browser.driver.findElement(LOC_MY_ACCOUNT).click();
        Browser.driver.findElement(LOC_MY_ACCOUNT_REGISTER).click();
    }
}
