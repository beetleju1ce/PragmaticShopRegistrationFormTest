package util;

import org.testng.annotations.DataProvider;
    public class DataProviderClass {

        @org.testng.annotations.DataProvider(name = "userData")
        public static Object[][] getDataFromDataProvider() {
            return new String[][] {
                    new String[] {"ala","bala","ala@asd.com","1290382984","underweight123!"},
                    new String[] {"petkan","petkonov","djsfhdh@abv.com","1265342545", "blabla1234!"},
                    new String[] {"a","boko","dhfgdg@mail.com","436756437","overweight000?"},
            };
        }
    }


