package util;


import org.testng.Assert;

public class CommonVerification {
     public static void verifyTitle(String expectedTitle, String errorMessage){
         String actualTitle = Browser.driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle, errorMessage);
     }
}
