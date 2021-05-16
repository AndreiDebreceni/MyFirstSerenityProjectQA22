package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.jquery.ByJQuerySelector;


public class CheckOutPage extends PageObject {

    @FindBy (css = "button#onepage-guest-register-button > span > span")
    private WebElementFacade continueAsGuest;

    public CheckOutPage() {
    }

    public void continueAsGuest(){
        clickOn(continueAsGuest);
    }
    @FindBy (css = "button#onepage-guest-register-button > span > span")
    private WebElementFacade continueButton;
    public void continueButton (){clickOn(continueButton);
    }
    @FindBy(css = "input#billing\\:firstname")
    private WebElementFacade billFirstnameField;
    public void setBillFirstname (String name){
        typeInto(billFirstnameField,name);
    }
    @FindBy(css = "input#billing\\:middlename")
    private WebElementFacade billMiddleNameField;
    public void setBillMiddlename (String midlename){
        typeInto(billMiddleNameField,midlename);
    }
    @FindBy(css = "input#billing\\:lastname")
    private WebElementFacade billLastNameField;
    public void setBillLastname (String lastname){
        typeInto(billLastNameField,lastname);
    }
    @FindBy(css = "input#billing\\:email")
    private WebElementFacade billEmailField;
    public void setBillEmail (String email){
        typeInto(billEmailField,email);
    }
    @FindBy(css = "#billing\\:street1")
    private WebElementFacade adresField;
    public void setAdres (String adres){
        typeInto(adresField,adres);
    }
    @FindBy(css = "input#billing\\:city")
    private WebElementFacade cityField;
    public void setCity (String city){
        typeInto(cityField,city);
    }
    @FindBy(css = "select#billing\\:country_id")
    private WebElementFacade selectCountry;
    public void setValueCountryInDropdown () {
        ByJQuerySelector desiredValue = new ByJQuerySelector("select#billing\\:country_id('" + 15 + "')");
        find(desiredValue).waitUntilVisible().then().click();
    }
    @FindBy(css = "select#billing\\:region_id")
    private WebElementFacade selectRegion;
    public void setValueRegionInDropdown () {
        ByJQuerySelector desiredValue = new ByJQuerySelector("select#billing\\:country_id('" + 304 + "')");
        find(desiredValue).waitUntilVisible().then().click();
    }
    @FindBy(css = "#billing\\:postcode")
    private WebElementFacade zipcodeField;
    public void setzipcodeField (String zipcode) {
        typeInto(zipcodeField, zipcode);
    }
    @FindBy(css = "#billing\\:telephone")
    private WebElementFacade phoneField;
    public void setphoneField (String phone) {
        typeInto(phoneField, phone);
    }
    @FindBy(css = "div#billing-buttons-container > button > span > span")
    private WebElementFacade continueButton2;
    public void continueButton2 () {
        clickOn(continueButton);
    }




}
