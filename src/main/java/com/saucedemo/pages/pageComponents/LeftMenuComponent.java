package com.saucedemo.pages.pageComponents;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;

public class LeftMenuComponent {

    public void  selectOptionFromLeftMenuBar (String menuOption){

        Selenide.$(Selectors.byText(menuOption)).shouldBe(Condition.enabled).click();
    }
}
