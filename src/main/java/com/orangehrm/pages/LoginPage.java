package com.orangehrm.pages;

import com.codeborne.selenide.*;

public class LoginPage {
    private static final SelenideElement USERNAME_TXT = Selenide.$(Selectors.byName("username"));
    private static final SelenideElement PASSWORD_TXT = Selenide.$(Selectors.byAttribute("placeholder", "Password"));
    private static final SelenideElement LOGIN_BTN = Selenide.$(".oxd-button");


    public HomePage loginToApplication(){

        USERNAME_TXT.shouldBe(Condition.visible).setValue("Admin");
        PASSWORD_TXT.shouldBe(Condition.visible).setValue("admin123");
        LOGIN_BTN.shouldBe(Condition.enabled, Condition.visible).click();
        return Selenide.page(HomePage.class);
    }


    public static LoginPage getInstance(){

        return new LoginPage();
    }
}
