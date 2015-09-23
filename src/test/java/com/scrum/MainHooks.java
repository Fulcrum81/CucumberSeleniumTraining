package com.scrum;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;


/**
 * Cucumber hooks are executed before or after each scenario
 * @author Andrii.Dzynia
 */
public class MainHooks {
    private static final String URL = "http://www.google.com";

    @Before
    public void prepare() {
        Configuration.baseUrl = URL;
        Configuration.timeout = 10000;
    }
}

