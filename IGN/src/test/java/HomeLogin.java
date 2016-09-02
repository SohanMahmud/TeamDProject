import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by admin on 8/29/2016.
 */
public class HomeLogin extends Base {

//    @Test
//    public void Search() throws InterruptedException {
//
//        typeByCssNEnter("#search-input", "Donkey Kong");
//        sleepFor(3);
//
//    }
//
//    @Test
//    public void ClickShows() throws InterruptedException {
//        clickByXpath(".//*[@id='ign-shows']/a");
//        sleepFor(3);
//
//    }
//    @Test
//public void HoverBrowse() throws InterruptedException {
//    mouseHoverByXpath(".//*[@id='browse-button']");
//    sleepFor(3);
//    mouseHoverByXpath(".//*[@id='ign-shows']/a");
//    sleepFor(3);
//}
//
//
//    @Test
//    public void ClickReviews() throws InterruptedException {
//        clickByXpath(".//*[@id='header-nav']/div[2]/li[3]/a");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void ClickPs4() throws InterruptedException {
//        clickByXpath(".//*[@id='header-nav']/div[2]/li[4]/a");
//        sleepFor(3);
//
//    }
//
//    @Test
//
//    public void ClickXbone() throws InterruptedException {
//        clickByXpath(".//*[@id='header-nav']/div[2]/li[5]/a");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void ClickPc() throws InterruptedException {
//        clickByXpath(".//*[@id='header-nav']/div[2]/li[6]/a");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void ClickWiiU() throws InterruptedException {
//        clickByXpath(".//*[@id='header-nav']/div[2]/li[7]/a");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void ClickMovies() throws InterruptedException {
//        clickByXpath(".//*[@id='header-nav']/div[2]/li[8]/a");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void ClickTv() throws InterruptedException {
//        clickByXpath(".//*[@id='header-nav']/div[2]/li[9]/a");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void scrollToLoadMore() throws InterruptedException {
//        scrollToElementById("loadMore");
//        sleepFor(4);
//        clickById("loadMore");
//        sleepFor(4);
//        clickById("loadMore");
//        sleepFor(3);
//    }
//
//    @Test
//    public void login() throws InterruptedException {
//    sleepFor(5);
//      clickByLink("Sign in");
//        sleepFor(5);
//        clickByXpath(".//*[@id='email']");
//      typeByXpath(".//*[@id='email']", "rselpnt");
//        sleepFor(3);
//        typeByXpathEnter(".//*[@id='password']", "trainpnt");
//        sleepFor(4);
//
//
//
//
//    }
//
//    @Test
//
//    public void contentTeam () throws InterruptedException {
//        clickByXpath(".//*[@id='ignFooter-container']/footer/div[1]/div[1]/div[1]/ul[1]/li[2]/a");
//        sleepFor(3);
//
//        clickByXpath("html/body/div[4]/div[2]/div[2]/div[3]/div[6]/span");
//        sleepFor(3);
//        clickByXpath("html/body/div[4]/div[2]/div[2]/div[3]/div[6]/a");
//        sleepFor(3);
//    }
//    @Test
//
//    public void scrollFiveTimes() throws InterruptedException {
//
//        int x = 5;
//
//        for (x = 1; x <= 5; x++) {
//            scrollToElementById("loadMore");
//            sleepFor(5);
//            clickById("loadMore");
//            sleepFor(5);
//            x++;
//
//        }
//    }
//    @Test
//
//    public void changeRegion() throws InterruptedException {
//
//        clickByXpath("html/body/header/div/div/div[2]");
//        sleepFor(3);
//        clickByClass("local-region.United Kingdom");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void standardsAndPractices() throws InterruptedException {
//
//        clickByLink("Standards and Practices");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void sendUsNews() throws InterruptedException {
//
//        clickByLink("Send Us News");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void siteMap () throws InterruptedException {
//
//        clickByLink("Site Map");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void IgnWorldMap() throws InterruptedException {
//
//        clickByLink("IGN World Map");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void Adria() throws InterruptedException{
//
//        clickByLink("Adira");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void Africa() throws InterruptedException {
//
//        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[5]/a");
//        sleepFor(3);
//    }
//
//    @Test
//
//    public void Australia() throws InterruptedException {
//
//
//        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[6]/a");
//        sleepFor(3);
//
//    }
//
//    @Test
//
//    public void Brazil() throws InterruptedException {
//
//        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[7]/a");
//        sleepFor(3);
//    }

    @Test

    public void Benelux() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[8]/a");
        sleepFor(3);
    }

    @Test

    public void Canada() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[9]/a");
        sleepFor(3);
    }

    @Test

    public void Denmark() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[10]/a");
        sleepFor(3);
    }

    @Test

    public void Finland() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[11]/a");
        sleepFor(3);
    }

    @Test

    public void France() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[12]/a");
        sleepFor(3);
    }

    @Test

    public void Germany() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[13]/a");
        sleepFor(3);
    }

    @Test

    public void Greece() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[14]/a");
        sleepFor(3);
    }

    @Test

    public void Hungary() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[15]/a");
        sleepFor(3);
    }

    @Test

    public void India() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[16]/a");
        sleepFor(3);
    }

    @Test

    public void Ireland() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[17]/a");
        sleepFor(3);
    }

    @Test

    public void Israel() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[18]/a");
        sleepFor(3);
    }

    @Test

    public void Italy() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[19]/a");
        sleepFor(3);
    }

    @Test

    public void Japan() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[20]/a");
        sleepFor(3);
    }

    @Test

    public void LatinAmerica() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[21]/a");
        sleepFor(3);
    }

    @Test

    public void MiddleEast() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[22]/a");
        sleepFor(3);
    }

    @Test

    public void Norway() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[23]/a");
        sleepFor(3);
    }

    @Test

    public void Pakistan() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[24]/a");
        sleepFor(3);
    }

    @Test

    public void Poland() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[25]/a");
        sleepFor(3);
    }

    @Test

    public void Portugal() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[26]/a");
        sleepFor(3);
    }

    @Test

    public void Romania() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[27]/a");
        sleepFor(3);
    }

    @Test

    public void Russia() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[28]/a");
        sleepFor(3);
    }

    @Test

    public void SouthEastAsia() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[29]/a");
        sleepFor(3);
    }

    @Test

    public void Spain() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[30]/a");
        sleepFor(3);
    }

    @Test

    public void Sweden() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[31]/a");
        sleepFor(3);
    }

    @Test

    public void Turkey() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[32]/a");
        sleepFor(3);
    }

    @Test

    public void UnitedKingdom() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[33]/a");
        sleepFor(3);
    }

    @Test

    public void UnitedStates() throws InterruptedException {

        clickByXpath("html/body/div[5]/footer/div[1]/div[1]/div[1]/ul[2]/li[34]/a");
        sleepFor(3);
    }



















}
