package com.grayzemon.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("/login.html")
public class LoginPage extends BasePage {

    public  void gotoLoginPage() {
        open();
    }

    public void login(String userName, String password) {
        if (userName != null && !userName.isEmpty())
            findBy("#user_login").type(userName);
        if(password != null && !password.isEmpty())
            findBy("#user_password").type(password);
        find(By.name("submit")).click();
    }

    public String getLoginError() {
        waitFor(".alert-error");
        return findBy(".alert-error").getText();
    }

    public void submitLoginPage() {
        find(By.name("submit")).click();
    }

    public  void backToLoginPage() {
        getDriver().navigate().back();
    }

}
