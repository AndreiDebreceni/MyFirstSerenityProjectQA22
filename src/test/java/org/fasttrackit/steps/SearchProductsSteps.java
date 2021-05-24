package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class SearchProductsSteps{
    private CartPage cartPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ProductsOnHomePage products;
    private Product1Page product1Page;
    private CheckOutPage checkOutPage;
    private SearchResultPage searchResultPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void searchForProduct(String text){
        homePage.setSearchBar(text);
        homePage.clickSearchButton();
    }
    @Step
    public void verifyResultPage(String text){
        Assert.assertTrue("The product was not found !",searchResultPage.isProductInList(text));
    }
    @Step
    public void setSortByPrice(){
        searchResultPage.setSortByDropdown("Price");
    }
    @Step
    public void setSortByName(){
        searchResultPage.setSortByDropdown("Name");
    }
    @Step
    public void setSortByRelevance(){
        searchResultPage.setSortByDropdown("Relevance");
    }

    @Step
    public void verifySortByPriceAscending() {
        setSortByPrice();
        Assert.assertTrue("Price is not sorted ascending",searchResultPage.isSortByPriceAscending());
    }
    @Step
    public void addProdToCartByName(String productName) {
        Assert.assertTrue(searchResultPage.addProductToCart(productName));
    }
    @Step
    public void addProductToCartByName(String productName){
    searchForProduct(productName);
    addProdToCartByName(productName);
    }

}
