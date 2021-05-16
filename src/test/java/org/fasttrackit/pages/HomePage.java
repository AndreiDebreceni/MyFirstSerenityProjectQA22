package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(css = "a[title='My Cart (1 item)']")
    private WebElementFacade myCartLink;

    public void clickAccountLink(){
        clickOn(accountLink);
    }

    public void clickLogInLink(){
        clickOn(logInLink);
    }

    public void clickMyCartLink(){clickOn(myCartLink);}

    @FindBy(css = "input#search")
    private WebElementFacade searchBar;
    public void setSearchBar(String text){
        typeInto(searchBar, text);
    }
    @FindBy (css = "button[title='Search']")
    private WebElementFacade searchButton;
    public void searchButton(){
        clickOn(searchButton);
    }

    @FindBy (css = "a[title='Register']")
    private WebElementFacade registerButton;
    public void clickOnRegister(){
        clickOn(registerButton);
    }
}
