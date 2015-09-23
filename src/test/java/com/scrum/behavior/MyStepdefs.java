package com.scrum.behavior;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MyStepdefs {
    @Given("^User is on Google page$")
    public void User_is_on_Google_page() {
        open(Configuration.baseUrl);
    }

    @When("^User enters \"([^\\\"]*)\" in search field$")
    public void User_enters_in_search_field(String search) {
        $(By.id("lst-ib")).sendKeys(search);
    }

    @And("^User clicks Search button$")
    public void User_clicks_Search_button() {
        $(By.cssSelector("input[name='btnK']")).click();
    }

    @Then("^User clicks \"([^\\\"]*)\" link$")
    public void User_clicks_link(String linkText) throws InterruptedException {
        ElementsCollection col = $$(By.className("r"));
        SelenideElement element = col.find(Condition.hasText(linkText));
        element.click();
        Thread.sleep(5000);
    }
}
