package com.grayzemon.steps;

import cucumber.api.java.en.Given;
import com.grayzemon.pages.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZeroAppSteps {
    HomePage homePage;
    LoginPage loginPage;
    AccountsPage accountsPage;

    @Given("I select sign-in from the homepage")
    public void iAmOnTheHomepage() {
        homePage.selectSignIn();
    }

    @Given("I go directly to the login page")
    public void iGoDirectlyToTheLoginPage() {
        loginPage.gotoLoginPage();
    }

    @When("I enter valid user credentials")
    public void iEnterMyUserCredentials() {
        loginPage.login("username","password");
    }

    @Then("I will be on the accounts page")
    public void iWillBeOnTheAccountsPage() {
        accountsPage.verifyAccountsPage();
    }

    @When("I enter the username {string} and password {string}")
    public void iEnterTheUsernameAndPassword(String userName, String password) {
        loginPage.login(userName,password);
    }

    @Then("the login error message will show")
    public void theLoginErrorMessageWillShow() {
        loginPage.verifyLoginError();
    }

}
