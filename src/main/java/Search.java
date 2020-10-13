import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utils.WebDriverSupliter.driver;

public class Search {


    public static void search(String search) {

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(search);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
