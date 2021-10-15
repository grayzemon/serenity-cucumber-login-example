package com.grayzemon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.time.temporal.ChronoUnit;

public class BasePage extends PageObject {
    @FindBy(xpath = "//*[@id='settingsBox']/ul/li[3]/a/i")

    WebElementFacade iconuser;

    public void logout() {
        setImplicitTimeout(200,ChronoUnit.MILLIS);
        Boolean logoutShows = iconuser.isPresent();
        resetImplicitTimeout();
        if (logoutShows) {
            iconuser.click();
            findBy("#logout_link").click();
            waitForTextToAppear("Zero Bank");
        }
    }
}
