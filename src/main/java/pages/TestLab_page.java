package pages;

import appmanager.HelperBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;

import static appmanager.ApplicationManager.getWebDriver;

public class TestLab_page extends HelperBase {
    @Value("${us}")
    public String us;

    @Value("${pwd}")
    public String pwd;

    @Value("${log}")
    public String log;

    @Value("${p1}")
    public String p1;

    @Value("${add1}")
    public String add1;

    @Value("${cart2}")
    public String cart2;

    @Value("${che}")
    public String che;

    @Value("${fist}")
    public String fist;

    @Value("${las}")
    public String las;

    @Value("${por}")
    public String por;

    @Value("${conti}")
    public String conti;

    @Value("${sbmit}")
    public String sbmit;

    @Value("${val}")
    public String val;
    @Value("${dd}")
    public String dd;

    @Value("${li}")
    public String li;

    @Value("${phno}")
    public String phno;

    @Value("${pwdd}")
    public String pwdd;

    @Value("${jon}")
    public String jon;


    public  void userlogin(){
        sleep(3000);
        enterText(us,"standard_user", "us");
        enterText(pwd,"secret_sauce", "pwd");
        clickOn(log,"log");

    }
    public  void useraddtocart(){
        sleep(3000);

        WebElement a = getWebElement(li);
       System.out.print(a.getText());
        clickOn(li,"li");

//        ArrayList<String>  Al= new ArrayList<>(getWebDriver().getWindowHandles());
//        getWebDriver().switchTo().window(Al.get(1));
//        enterText(phno, "1234567890", "phno");
//        enterText(pwdd, "paaaapapa", "pwdd");
        clickOn(jon, "jon");
       selectFromDropdown(dd,2,"dd2");
        clickOn(p1,"p1");
        clickOn(add1,"add1");
        clickOn(cart2,"cart2");
        clickOn(che,"che");
    }

    public  void userorderpro(){
        sleep(3000);
        enterText(fist,"a", "fist");
        enterText(las,"b", "las");
        enterText(por,"12", "por");
        clickOn(conti,"conti");
        clickOn(sbmit,"sbmit");
        String s="THANK YOU FOR YOUR ORDER";
        System.out.println(s);
        String z = getTextValue(val);
        System.out.println(z);
        if(s.equals(z))
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
  }


}
