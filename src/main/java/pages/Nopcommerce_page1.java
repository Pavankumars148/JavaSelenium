package pages;

import appmanager.HelperBase;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.Arrays;
import java.util.List;

public class Nopcommerce_page1 extends HelperBase {
    @Value("${REG}")
    public String REG;

    @Value("${ddSelectCurrency}")
    public String ddSelectCurrency;

    @Value("${ImgLogo}")
    public String ImgLogo;

    @Value("${headerLinks}")
    public String headerLinks;

    @Value("${topMenu}")
    public String topMenu;

    public void validateAllTheComponentsInHomePage(){
//        verifyElementDisplayed(ddSelectCurrency,"Select Currency");
//        verifyElementDisplayed(ImgLogo,"Non Commerce logo");
        List<WebElement> wElements = getWebElements(headerLinks);
        String [] realWebElements= {"register","login","wishlist","cart"};
        List<String> list = Arrays.asList(realWebElements);
        for(WebElement wElement:wElements){
            String wElementText=wElement.getAttribute("class").split("-")[1];
            Assert.assertTrue(list.contains(wElementText),wElementText+" element validation successfully done");
        }

        String [] realMenuItemsWebElements={"Computers ","Electronics ","Apparel ","Digital downloads ","Books ","Jewelry ","Gift Cards "};
       Arrays.stream(realMenuItemsWebElements).map(n->{
           Assert.assertEquals(n, getText(n), "validation successful for " + n);
           System.out.println(n);
           return null;
       });

//        List<WebElement> topMenuItems = getWebElements(topMenu);
//
//        topMenuItems.stream().map(n->getText(n));

    }

}