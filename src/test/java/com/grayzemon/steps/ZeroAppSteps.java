package com.grayzemon.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import com.grayzemon.pages.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ZeroAppSteps {
    public static final String INVALID_LOGIN_MESSAGE = "Login and/or password are wrong.";
    HomePage homePage;
    LoginPage loginPage;
    AccountsPage accountsPage;
    List<String> errorMessages = new ArrayList<>();

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

    @Then("the expected login error message will show in each case")
    public void theLoginErrorMessageWillShow() {
        for (String errorMessage : errorMessages) {
            assertThat(errorMessage, is(equalTo(INVALID_LOGIN_MESSAGE)));
        }
    }

    @And("I enter the invalid usernames and passwords")
    public void iEnterTheInvalidUsernameAndPassword(DataTable dataTable) {
        final List<List<String>> cells = dataTable.cells();
        errorMessages.clear();
        for (List<String> cell : cells) {
            loginPage.login(cell.get(0),cell.get(1));
            errorMessages.add(loginPage.getLoginError());
            loginPage.backToLoginPage();
        }
    }

    @When("I submit the login page")
    public void iSubmitTheLoginPage() {
        loginPage.submitLoginPage();
    }
}
