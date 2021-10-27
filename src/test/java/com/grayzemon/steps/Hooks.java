package com.grayzemon.steps;

import com.grayzemon.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

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
