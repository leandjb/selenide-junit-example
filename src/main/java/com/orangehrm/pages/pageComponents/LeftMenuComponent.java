package com.orangehrm.pages.pageComponents;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;

public class LeftMenuComponent {

    public void  selectOptionFromLeftMenuBar (LeftMenuComponentType menuType){

        Selenide.$(Selectors.byText(menuType.getMenuName())).shouldBe(Condition.enabled).click();

    }
}
