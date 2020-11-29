package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class dialogContent extends parent {

    WebElement myElement;

    public dialogContent() {

        PageFactory.initElements(driver, this);
    }

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndFindVerifyContainsText(String elementName, String text) {
        switch (elementName) {

        }

        verifyElementContainsText(myElement, text);
    }


        }
