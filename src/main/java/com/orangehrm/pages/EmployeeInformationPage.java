package com.orangehrm.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class EmployeeInformationPage {
     private static final SelenideElement ADD_EMPLOYEE_BTN = $(Selectors.byTagAndText("a", "Add Employee"));
     private static final SelenideElement FIRST_NAME_TXT = $(Selectors.byName("firstName"));
     private static final SelenideElement LAST_NAME_TXT = $(Selectors.byName("lastName"));
     private static final SelenideElement MIDDLE_NAME_TXT = $(Selectors.byName("middleName"));
     private static final SelenideElement IMAGE_BOX = $(Selectors.byAttribute("type", "file"));

     public void addNewEmployee(){

          ADD_EMPLOYEE_BTN.shouldBe(Condition.visible).click();
          FIRST_NAME_TXT.shouldBe(Condition.visible).setValue("Nombre");
          MIDDLE_NAME_TXT.shouldBe(Condition.visible).setValue("Segundo Nombre");
          LAST_NAME_TXT.shouldBe(Condition.visible).setValue("Apellido");
          IMAGE_BOX.shouldBe(Condition.visible).uploadFromClasspath("src/test/resources/darth.jpg");
     }
}
