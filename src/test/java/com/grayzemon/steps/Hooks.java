package com.grayzemon.steps;

import com.grayzemon.pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    HomePage homePage;

    @Before
    public void beforeCallingEveryScenario() {
        homePage.gotoHomePage();
    }

    @After
    public void afterRunningEveryScenario() {
        homePage.logout();
    }


}
