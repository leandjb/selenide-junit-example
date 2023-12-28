package com.saucedemo;


import com.codeborne.selenide.Selenide;
import com.saucedemo.pages.LoginPage;
import org.junit.jupiter.api.Test;

class TestEnterUser {

    @Test
    void testEnterUser(){
        Selenide.open("https://www.saucedemo.com/v1/");

        new LoginPage()
                .loginToApp();
//                .getLeftMenuComponent()
//                .selectOptionFromLeftMenuBar("PIM");


    }

}
