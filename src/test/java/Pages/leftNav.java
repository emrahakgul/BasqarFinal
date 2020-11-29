package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class leftNav extends parent {

    public leftNav() {
        PageFactory.initElements(driver, this);
    }


    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

        }

        clickFunction(myElement);
    }
}