import common.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by admin on 9/4/2016.
 */
public class Login extends Base {

//    @Test(priority = 53)
//
//    public void IgnLogin() throws InterruptedException {
//
//        waitUntilVisible(By.xpath("html/body/header/div/nav/div[3]/div/div/a"));
//        clickByXpath("html/body/header/div/nav/div[3]/div/div/a");
//        iframeHandle(driver.findElement(By.cssSelector("#ignRegistrationModal")));
//        typeByCss("#email", "rselpnt");
//        typeByCssNEnter("#password", "trainpnt");
//        sleepFor(3);
//        driver.switchTo().defaultContent();
//        sleepFor(3);
//        mouseHoverByXpath("html/body/header/div[1]/nav/div[3]/div/div/div[1]");
//        waitUntilVisible(By.xpath("html/body/header/div[1]/nav/div[3]/div/ul/li[1]/a"));
//        clickByXpath("html/body/header/div[1]/nav/div[3]/div/ul/li[1]/a");
//        sleepFor(3);
//    }
@Test

    public void ignLoginPost() throws InterruptedException {



        waitUntilVisible(By.xpath("html/body/header/div/nav/div[3]/div/div/a"));
        clickByXpath("html/body/header/div/nav/div[3]/div/div/a");
        iframeHandle(driver.findElement(By.cssSelector("#ignRegistrationModal")));
//        iFrameHandleCss("#ignRegistrationModal");
        typeByCss("#email", "rselpnt");
        typeByCssNEnter("#password", "trainpnt");
        sleepFor(3);
        driver.switchTo().defaultContent();
        sleepFor(3);
        clickByXpath("html/body/header/div[1]/div/div[3]/a[2]/div");
        waitUntilClickAble(By.xpath("html/body/section[2]/section/article/div[2]/div[1]/div/span[1]"));
        clickByXpath("html/body/section[2]/section/article/div[2]/div[1]/div/span[1]");
        waitUntilVisible(By.xpath("html/body/section[2]/aside/div[1]/div[2]/div[4]"));
        clickByXpath("html/body/section[2]/aside/div[1]/div[2]/div[4]");
        sleepFor(3);
    }


}