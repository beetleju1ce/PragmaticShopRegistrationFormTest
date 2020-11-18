package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Browser;

public class RegistrationPage {
    private static final By LOC_FIRST_NAME = By.cssSelector("input#input-firstname");
    private static final By LOC_LAST_NAME = By.cssSelector("input#input-lastname");
    private static final By LOC_EMAIL = By.cssSelector("input#input-email");
    private static final By LOC_TELEPHONE = By.cssSelector("input#input-telephone");
    private static final By LOC_PASSWORD = By.cssSelector("input#input-password");
    private static final By LOC_PASS_CONFIRM = By.cssSelector("input#input-confirm");
    private static final By LOC_AGREE_CHECKBOX = By.name("agree");
    private static final By LOC_CONTINUE = By.cssSelector("input.btn.btn-primary");

    public static void completeRegistration(String firstName, String lastName, String email, String telephone, String password){
        Browser.driver.findElement(LOC_FIRST_NAME).clear();
        Browser.driver.findElement(LOC_FIRST_NAME).sendKeys(firstName);

        Browser.driver.findElement(LOC_LAST_NAME).clear();
        Browser.driver.findElement(LOC_LAST_NAME).sendKeys(lastName);

        Browser.driver.findElement(LOC_EMAIL).clear();
        Browser.driver.findElement(LOC_EMAIL).sendKeys(email);

        Browser.driver.findElement(LOC_TELEPHONE).clear();
        Browser.driver.findElement(LOC_TELEPHONE).sendKeys(telephone);

        Browser.driver.findElement(LOC_PASSWORD).clear();
        Browser.driver.findElement(LOC_PASSWORD).sendKeys(password);

        Browser.driver.findElement(LOC_PASS_CONFIRM).clear();
        Browser.driver.findElement(LOC_PASS_CONFIRM).sendKeys(password);

        WebElement checkBox = Browser.driver.findElement(By.name("agree"));

        if(!checkBox.isSelected()){
            checkBox.click();
        }

        Browser.driver.findElement(LOC_CONTINUE).click();
    }

}
