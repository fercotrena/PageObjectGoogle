import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.ReadFile;
import utils.WebDriverSupliter;

import javax.swing.plaf.synth.SynthTextAreaUI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchShould {


    @BeforeEach
    public void setUp() {
        WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void should_search_a_word_and_find_the_reference() {

        for (String word : ReadFile.getListOfWord()) {
            Search.search(word);
            assertTrue(ResultSearch.resultSearch(word));
        }

    }


}
