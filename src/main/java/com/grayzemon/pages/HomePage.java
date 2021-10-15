package com.grayzemon.pages;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/index.html")
public class HomePage extends BasePage {

    public void gotoHomePage() {
        open();
        waitForTextToAppear("Zero Bank");
    }

    public void selectSignIn() {
        findBy("#signin_button").click();
        waitForTextToAppear("Log in to ZeroBank");
    }
}
