package com.orangehrm.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.orangehrm.pages.EmployeeInformationPage;
import com.orangehrm.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TextReportExtension.class)
class AddEmployeeTest {

    @Test
    void testAddEmployee(){

        Selenide.open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        new LoginPage()
                .loginToApplication()
                .getLeftMenuComponent()
                .selectOptionFromLeftMenuBar("PIM");

        new EmployeeInformationPage()
                .addNewEmployee()
                .checkWhetherEmployeeCreatedSuccessfully();
    }
}
