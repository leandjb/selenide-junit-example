package com.orangehrm.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.orangehrm.pages.EmployeeInformationPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.pageComponents.LeftMenuComponentType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TextReportExtension.class)
class AddEmployeeTest {

    @Test
    void testAddEmployee(){

        Selenide.open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage.getInstance()
                .loginToApplication()
                .getLeftMenuComponent()
                .selectOptionFromLeftMenuBar(LeftMenuComponentType.PIM);

        new EmployeeInformationPage()
                .addNewEmployee()
                .checkWhetherEmployeeCreatedSuccessfully();
    }
}
