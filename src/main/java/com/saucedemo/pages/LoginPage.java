package com.saucedemo.pages;

import com.codeborne.selenide.*;

import java.time.Duration;

public class LoginPage {
    private static final SelenideElement USERNAME = Selenide.$(Selectors.byName("user-name"));
    private static final SelenideElement PASSWORD = Selenide.$(Selectors.byAttribute("placeholder", "Password"));
    private static final SelenideElement LOGIN_BTN = Selenide.$("#login-button");

    public HomePage loginToApp(){

        USERNAME.shouldBe(Condition.visible).setValue("Admin");
        PASSWORD.shouldBe(Condition.visible).setValue("Admin123");
        LOGIN_BTN.shouldBe(Condition.enabled, Condition.visible).click(ClickOptions.withTimeout(Duration.ofSeconds(4)));
        return Selenide.page(HomePage.class);
    }
}
