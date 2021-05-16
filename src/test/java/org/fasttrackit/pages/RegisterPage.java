package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {
    @FindBy(css = "#firstname")
    private WebElementFacade firstName;
    public void registerFirstName(String firstnameText){
        typeInto(firstName, firstnameText);
    }
    @FindBy (css = "#lastname")
    private WebElementFacade lastName;
    public void registerLastName(String lastnameText){
        typeInto(lastName,lastnameText);
    }
    @FindBy (css = "#email_address")
    private WebElementFacade regEmail;
    public void registerEmail(String email){
        typeInto(regEmail,email);
    }
    @FindBy(css = "#password")
    private WebElementFacade regPassword;
    public void registerPassword(String password){
        typeInto(regPassword,password);
    }
    @FindBy(css = "#confirmation")
    private WebElementFacade confirmPassword;
    public void confirmPassword(String confirmPass){
        typeInto(confirmPassword,confirmPass);
    }
    @FindBy(css = "input#is_subscribed")
    private WebElementFacade subscribe;
    public void setSubscribe(){
        clickOn(subscribe);
    }
    @FindBy (css = "button[title='Register'] > span > span")
    private WebElementFacade registerButton;
    public void registerAccount(){
      clickOn(registerButton);
    }
    @FindBy(css = ".messages  ul > li")
    private WebElementFacade welcomeRegisterText;

    public void verifyRegisterText(String message){
        welcomeRegisterText.shouldContainOnlyText(message);
    }

    public boolean isWelcomeRegisterText(String text){
        return welcomeRegisterText.containsOnlyText(text);
    }

    public String getRegisterText(String message){
        return welcomeRegisterText.getText();
    }

}
