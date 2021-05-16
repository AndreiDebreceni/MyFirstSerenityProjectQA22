package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class RegisterSteps {
    private CartPage cartPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ProductsOnHomePage products;
    private Product1Page product1Page;
    private CheckOutPage checkOutPage;
    private RegisterPage registerPage;

    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickOnRegister();
    }
    @Step
    public void enterRegisterCredentials(String firstName,String lastname, String password, String confPassword, String email){
        registerPage.registerFirstName(firstName);
        registerPage.registerLastName(lastname);
        registerPage.registerPassword(password);
        registerPage.confirmPassword(confPassword);
        registerPage.registerEmail(email);

    }
    @Step
    public void submitRegistration(){
        registerPage.setSubscribe();
        registerPage.registerAccount();
    }
    @Step
    public void checkRegisterMessage(String message){
        registerPage.getRegisterText(message);


    }
}
