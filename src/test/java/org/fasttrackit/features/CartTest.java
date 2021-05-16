package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    }
    @Test
    public void addMultipleItemsToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    }
}
