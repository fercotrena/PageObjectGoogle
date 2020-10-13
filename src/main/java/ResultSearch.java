import static utils.WebDriverSupliter.driver;

public class ResultSearch {

    public static Boolean resultSearch(String search) {
        return driver.getPageSource().contains(search);
    }

}
