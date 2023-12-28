package com.orangehrm.pages;

import com.codeborne.selenide.*;

import java.time.Duration;

public class LoginPage {
    private static final SelenideElement USERNAME = Selenide.$(Selectors.byName("username"));
    private static final SelenideElement PASSWORD = Selenide.$(Selectors.byAttribute("placeholder", "Password"));
    private static final SelenideElement LOGIN_BTN = Selenide.$(".oxd-button");

    public HomePage loginToApp(){

        USERNAME.shouldBe(Condition.visible).setValue("Admin");
        PASSWORD.shouldBe(Condition.visible).setValue("admin123");
        LOGIN_BTN.shouldBe(Condition.enabled, Condition.visible).click(ClickOptions.withTimeout(Duration.ofSeconds(4)));
        return Selenide.page(HomePage.class);
    }
}
