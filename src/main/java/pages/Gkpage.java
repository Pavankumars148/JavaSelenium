package pages;

import appmanager.HelperBase;
import org.springframework.beans.factory.annotation.Value;

public class Gkpage extends HelperBase {

    @Value("${Brocolli}")
    public String Brocolli;
    @Value("${Cauliflower}")
    public String Cauliflower;

    @Value("${cart}")
    public String cart;
    @Value("${pro}")
    public String pro;
    @Value("${place}")
    public String place;

    @Value("${dd}")
    public String dd;

    @Value("${check}")
    public String check;

    @Value("${order}")
    public String order;


    public  void userclickfv(){
        sleep(3000);
        clickOn(Brocolli,"Brocolli");
        clickOn(Cauliflower,"Cauliflower");
    }
    public  void userclickoncart(){
        sleep(3000);
        clickOn(cart,"cart");
        clickOn(pro,"pro");
    }
    public  void userclickonplace(){
        sleep(3000);
        clickOn(place,"place");
        selectFromDropdown(dd,"India","IND");
        clickOn(check,"check");
        clickOn(order,"order");
    }

}
