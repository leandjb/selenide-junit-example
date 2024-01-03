package com.orangehrm.pages;

import com.orangehrm.pages.pageComponents.LeftMenuComponent;

public class HomePage {
    private LeftMenuComponent leftMenuComponent;


    public HomePage(){

        this.leftMenuComponent = new LeftMenuComponent();
    }


    public LeftMenuComponent getLeftMenuComponent() {

        return leftMenuComponent;
    }
}
