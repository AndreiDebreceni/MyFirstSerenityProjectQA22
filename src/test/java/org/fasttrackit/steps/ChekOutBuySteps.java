package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;

public class ChekOutBuySteps {
    private CartPage cartPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ProductsOnHomePage products;
    private Product1Page product1Page;
    private CheckOutPage checkOutPage;

    @Step
    public void goToCheckOut(){
        cartPage.checkOutButton();
    }
    @Step
    public void continueToCheckout(){
        checkOutPage.continueAsGuest();

    }
    @Step
    public void registerCheckOut(String city,String phoneNumber ,String email, String name,
                                 String Email,String adres, String middleName, String lastName, String zipcode) {
        checkOutPage.setBillFirstname(name);
        checkOutPage.setBillMiddlename(middleName);
        checkOutPage.setBillLastname(lastName);
        checkOutPage.setBillEmail(email);
        checkOutPage.setAdres(adres);
        checkOutPage.setzipcodeField(zipcode);
        checkOutPage.setphoneField(phoneNumber);
        checkOutPage.setCity(city);
        checkOutPage.setValueCountryInDropdown();
        checkOutPage.setValueRegionInDropdown();
    }

        @Step
        public void submitcheckOut(){
            checkOutPage.continueButton2();
        }



}
