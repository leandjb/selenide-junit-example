package com.orangehrm.tests;


import com.codeborne.selenide.Selenide;
import com.orangehrm.pages.LoginPage;
import org.junit.jupiter.api.Test;

class AddEmployeeTest {

    @Test
    void testAddEmployee(){
        Selenide.open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        new LoginPage()
                .loginToApp();
//                .getLeftMenuComponent()
//                .selectOptionFromLeftMenuBar("PIM");


    }

}
