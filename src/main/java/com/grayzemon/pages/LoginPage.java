package com.grayzemon.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

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

    public String getLoginError() {
        waitFor(".alert-error");
        final String alertText = findBy(".alert-error").getText();
        return alertText;
    }

    public void submitLoginPage() {
        find(By.name("submit")).click();
    }

    public  void backToLoginPage() {
        getDriver().navigate().back();
    }

}
