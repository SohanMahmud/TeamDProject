package SearchFB;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 8/29/2016.
 */
public class HomeLogIn extends Base {


    //1.users are able to click on on the email box
    @Test
    public void ClickEmailBox() throws InterruptedException {
        sleepFor(30);
        clickByCss("#email");
        sleepFor(10);

      }

    // 2.users are able to click and input an email
     @Test
    public void clickAndEnterEmailBox() throws InterruptedException {
        sleepFor(20);
    typeByCss("#email", "teamdautomation@gmail.com");
    sleepFor(10);


      }

    // 3.user are able to click on the password box
    @Test
    public void ClickPassBox() throws InterruptedException {
        sleepFor(20);
      clickByCss("#pass");
        sleepFor(20);

      }

//    4.users are able to click and input password
    @Test
    public void ClickAndInputPass() throws InterruptedException {
        sleepFor(10);
        typeByCss("#pass", "teamd123");
        sleepFor(20);

      }

//
//    users are able to click on the logIn button
//
//
//    5.Users are able to log in with userName and password
    @Test
    public void UserIDAndPass() throws InterruptedException {
//        typeByCss("#email","");
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(20);

     }
//



   // users are able to click on the 'whats on your mind' status box
      @Test
    public void ClickOnTheStatusBox() throws InterruptedException {
        sleepFor(20);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        //status update
        clickByXpath("//textarea[@class='uiTextareaAutogrow _3en1']");
        sleepFor(10);
      }

//    users are able to click and input a value on the 'whats on your mind' status box
      @Test

    public void ClickAndInputAValue() throws InterruptedException {
        sleepFor(20);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        //status update
        typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Automation update");
        sleepFor(10);
    }


//    users able to click on the post button
      @Test

    public void ClickOnThePostButton() throws InterruptedException {
        sleepFor(20);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
      sleepFor(10);
    }



   // users are able to update a status
      @Test

    public void StatusUpdate() throws InterruptedException {
        sleepFor(20);
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        //status update
        typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Automation update");
        sleepFor(10);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
      sleepFor(10);
    }




   // users are able to click on the drop down menu for status privacy
        @Test
    public void DropDownPrivacyMenu() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        clickByCss("._55pe");
        sleepFor(10);
}



    //users are able to click on public on the privacy drop down menu
        @Test
    public void ClickONPublic() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        clickByCss("._55pe");
        sleepFor(10);
        clickByCss("._54nh._4chm._48u0");
        sleepFor(10);
}



   // users are able to click on only for friends on the drop down menu for privacy of a post
            @Test
    public void ClickOnJustForFriends() throws InterruptedException {
    typeByCss("#email", "teamdautomation@gmail.com");
    sleepFor(10);
    typeByCssNEnter("#pass", "teamd123");
    sleepFor(10);
//  clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
//  sleepFor(5);
    clickByCss("._55pe");
    sleepFor(10);
    clickByCss(".mrs.img.sp_btuBr4BxNJk.sx_f17616");
    sleepFor(10);
}




    //user are ble to click on the only for me option on the drop down privacy box
        @Test
    public void ClickOnlyForMeStatus() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        clickByCss("._55pe");
        sleepFor(10);
        clickByCss(".mrs.img.sp_btuBr4BxNJk.sx_f55148");
        sleepFor(10);
    }




     //     users are able to change the privacy of a status to public
    @Test
    public void PublicStatus() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
//       clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
//        sleepFor(5);
        typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Using Automation to update a public status");
        sleepFor(10);
        clickByCss("._55pe");
        sleepFor(10);
        clickByCss("._54nh._4chm._48u0");
        sleepFor(10);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
        sleepFor(10);
}

//    users are able to change the privacy of the status to friends only
        @Test
        public void StatusJustForFriends() throws InterruptedException {
    typeByCss("#email", "teamdautomation@gmail.com");
    sleepFor(10);
    typeByCssNEnter("#pass", "teamd123");
    sleepFor(10);
//       clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
//        sleepFor(5);
    typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Using Automation to update a status just for my friends");
    sleepFor(10);
    clickByCss("._55pe");
      sleepFor(10);
    clickByCss(".mrs.img.sp_btuBr4BxNJk.sx_f17616");
            sleepFor(10);
    clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
    sleepFor(10);
}


//    users are able to click and post a status with the privacy setting only for me
    @Test
    public void OnlyForMeStatus() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
//       clickByCss("._42ft._4jy0._ej1._4jy3._4jy1.selected._51sy");
//        sleepFor(5);
        typeByXpath("//textarea[@class='uiTextareaAutogrow _3en1']", "Using Automation to update a status only for me");
        sleepFor(10);
        clickByCss("._55pe");
        sleepFor(10);
        clickByCss(".mrs.img.sp_btuBr4BxNJk.sx_f55148");
        sleepFor(10);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
        sleepFor(10);
    }



       // users are able to click on their profile
    @Test
    public void ClickProfile()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(5);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(5);
        clickByCss("._2s25");
        sleepFor(5);
    }

  //  users are able to click on home button

    public void ClickHome()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(5);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(5);
        clickByCss("#u_0_3");
        sleepFor(5);
    }



 //   users are able to click on find friends button
    @Test
    public void ClickFindFriends()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(5);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        clickByCss("#findFriendsNav");
        sleepFor(10);
        clickById("findFriendsNav");
        sleepFor(10);
    }



 //       users are able to click on news feed
    @Test
    public void ClickNewsFeed1()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(5);
        clickByCss("._5afe");
        sleepFor(10);
    }


 //   users are able to click on news feed
    @Test
    public void ClickNewsFeed2()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(5);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(5);
        clickByCss(".linkWrap.noCount>span");
        sleepFor(10);
    }



  //  users are able to click on the messages on the left hand side
    @Test
     public void ClickMessage()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(5);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(20);
       clickByCss(".img.sp_szkJYLAG68n.sx_0faec1");
    sleepFor(10);

    }





 //   users are able check their friend requests
    @Test
    public void CheckFriendRequest()throws InterruptedException{
        typeByCss("#email","teamdautomation@gmail.com");
        sleepFor(5);
        typeByCssNEnter("#pass","teamd123");
        sleepFor(5);
        clickByCss("._2n_9");
        sleepFor(5);
    }


  //  users are ablet to click on the message box from the top right hand side
    @Test
    public void CheckMessagesFromTheTopRightCorner()throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(20);
        clickByXpath("//*[@id='u_0_f']/I");
        sleepFor(10);
    }




  //  users are able to click on search for friends
        @Test
    public void ClickOnSearchForFriendBox() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        clickByCss("._1frb");
      sleepFor(10);
}


 //   users are able to input a friends name on the search box
   @Test
    public void ClickAndEnterAFriendsName() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        typeByCss("._1frb", "sohan mahmud");
        sleepFor(5);
    }

    //  6.users are able to search for friends on facebook

    @Test
    public void SearchFriends() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        typeByCssNEnter("._1frb", "sohan mahmud");
        sleepFor(5);
    }


  //  7.users are able to send friend requests
    @Test
    public void SendFriendRequest() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        typeByCssNEnter("._1frb", "sohan mahmud");
        sleepFor(5);
        clickByCss("._42ft._4jy0.FriendRequestAdd.addButton._4jy3._517h._51sy");
    }


//    users are able to click on friend's names
        @Test
    public void ClickOnFriends() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10); sleepFor(10);
        typeByCssNEnter("._1frb", "sohan mahmud");
        sleepFor(5);
        clickByCss("._5d-5");
        sleepFor(5);

}


 //   users are able to search and click on friends names
    @Test
        public void SearchAndClickOnFriends() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        sleepFor(10);
        typeByCssNEnter("._1frb", "soren essen");
        sleepFor(5);
        clickByCss("._5d-5");
        sleepFor(5);
    }



 //   users are able to post on friend's wall
    @Test
    public void postOnFriendsWall() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        sleepFor(10);
        typeByCssNEnter("._1frb", "Shamima Akthar Kaya");
        sleepFor(5);
        clickByCss("._5d-5");
        sleepFor(5);
        typeByCss("._4h98", "using automation to post on your wall-kaya");
        sleepFor(10);
        clickByCss("._1mf7._4jy0._4jy3._4jy1._51sy.selected._42ft");
        sleepFor(10);


    }


 //   users are able to like a post in their news feed
    @Test
    public void LikeAPostOnNewsFeed() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        clickByCss(".UFILikeLink._4x9-._4x9_._48-k");
   }


   // users are able to like a post on friends wall
      @Test
    public void LikeAPostOnFriendsWall()throws InterruptedException {
          sleepFor(20);
          typeByCss("#email", "teamdautomation@gmail.com");
          sleepFor(10);
          typeByCssNEnter("#pass", "teamd123");
          sleepFor(10);
          sleepFor(10);
          typeByCssNEnter("._1frb", "Shamima Akthar Kaya");
          sleepFor(10);
          clickByCss("._5d-5");
          sleepFor(10);
          scrollPageDown400();
          sleepFor(10);
          clickByCss(".UFILikeLink._4x9-._4x9_._48-k");
          sleepFor(10);
   }

  //  users are able to comment on a post on the news feed
    @Test
    public void CommentOnAPostOnNewsFeed() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        scrollPageDown400();
        sleepFor(10);
        clickByCss(".comment_link._5yxe");
        sleepFor(10);
        typeByCssNEnter("._1p1v","usuing automation to comment on your own pic-kaya");
        sleepFor(10);
    }


  //  users are able to comment on a friend's post
    @Test
    public void CommentOnAPostOnFriendsWall() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        typeByCssNEnter("._1frb", "Shamima Akthar Kaya");
        sleepFor(10);
        clickByCss("._5d-5");
        sleepFor(10);
        scrollPageDown400();
        sleepFor(10);
        clickByCss(".comment_link._5yxe");
        sleepFor(10);
        typeByCssNEnter("._1p1v","usuing automation to comment on your own pic-kaya");
        sleepFor(10);
}

    //users are able to open the chat box on the bottom right hand side
        @Test
    public void OpenChatBox() throws InterruptedException {
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(10);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(10);
        clickByCss(".fbNubButton");
            sleepFor(10);
}

  //  users are able to open chat with a friend
        @Test
    public void MessageFriends()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(5);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(20);
       clickByXpath("//*[@id='u_0_f']/I");
    sleepFor(10);
    clickByXpath("//*[@id='u_0_g']/div/div[3]/div/div[1]/div/div/ul/li[2]/a/div/div[2]/div/div[2]/div/div[1]/strong/span");
}

    //users are able to send messages(this does not work yet)
        @Test
     public void SendMessages()throws InterruptedException{
        typeByCss("#email", "teamdautomation@gmail.com");
        sleepFor(5);
        typeByCssNEnter("#pass", "teamd123");
        sleepFor(20);
       clickByCss(".img.sp_szkJYLAG68n.sx_0faec1");
    sleepFor(10);
    typeByXpath("//*[@id='js_21']","hey");

    }


}




