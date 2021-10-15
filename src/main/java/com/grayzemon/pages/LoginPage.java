package com.grayzemon.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("/login.html")
public class LoginPage extends BasePage {

    public  void gotoLoginPage() {
        open();
    }

    public void login(String userName, String password) {
        findBy("#user_login").type(userName);
        findBy("#user_password").type(password);
        find(By.name("submit")).click();
    }

    public void verifyLoginError() {
        waitFor(".alert-error");
        final String alertText = findBy(".alert-error").getText();
        assertThat(alertText,containsText("Login and/or password are wrong."));
    }

}
