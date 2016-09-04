package FrontPage;

import Data.SearchItems;
import Data.readDataFromXl;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Polok on 9/4/2016.
 */
public class WikiSearchItems extends Base{
    @Test
    public void searchUsingExcelFile()throws IOException,InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        //Read search.data from excel file
        readDataFromXl itemsToBeSearched = new readDataFromXl();
        String [] value = itemsToBeSearched.getData();
        for(String read:value) {
            search.searchFor(read);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
