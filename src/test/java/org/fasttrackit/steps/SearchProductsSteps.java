package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class SearchProductsSteps{
    private CartPage cartPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ProductsOnHomePage products;
    private Product1Page product1Page;
    private CheckOutPage checkOutPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void searchForProduct(String text){
        homePage.setSearchBar(text);
        homePage.searchButton();
    }

}
