package com.grayzemon.pages;

import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DefaultUrl("account-summary.html")
public class AccountsPage extends BasePage {

    public void verifyAccountsPage() {
        final String text = findBy("//*[@id='account_summary_tab']/a").getText();
        System.out.println("account text:" + text);
        assertThat(text,equalTo("Account Summary"));
    }
}
