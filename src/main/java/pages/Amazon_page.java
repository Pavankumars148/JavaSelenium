package pages;

import appmanager.HelperBase;
import org.springframework.beans.factory.annotation.Value;

public class Amazon_page extends HelperBase {

    @Value("${searchtext}")
    public String searchtext;
    @Value("${submitbutton}")
    public String submitbutton;

    @Value("${pen}")
    public String pen;

    @Value("${cart}")
    public String cart;

    @Value("${cart1}")
    public String cart1;

    @Value("${add}")
    public String add;

    public void search() {
        sleep(3000);
        entertext(searchtext, "pen", "pen");
        clickOn(submitbutton, "submitbutton");

    }
    public void cart(){
        sleep(3000);
        clickOn(pen, "pen");
        clickOn(cart, "cart");
        clickOn(cart1, "cart1");
        clickOn(add, "add");
    }
    public void cart1(){
        sleep(3000);
        clickOn(cart1, "cart1");
        clickOn(add, "add");
    }
}

