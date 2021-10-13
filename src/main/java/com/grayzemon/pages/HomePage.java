package com.grayzemon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/index.html")
public class HomePage extends PageObject {

    public void gotoHomePage() {
        open();
        waitForTextToAppear("Zero Bank");
    }

    public void selectSignIn() {
        findBy("#signin_button").click();
        waitForTextToAppear("Log in to ZeroBank");
    }
}
