package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class AddProductToCart {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ProductsOnHomePage products;
    private Product1Page product1Page;
    private SearchResultPage searchResultPage;

    @Step
    public void openHomePage(){
        homePage.open();
    }
    @Step
    public void selectProduct(){
        products.clickOnProduct1();
        product1Page.selectColor();
        product1Page.selectSize();}
    @Step
    public void addToCart(){
        product1Page.addToCartButton();
    }

    public void addProdToCartByName(String productName) {
        Assert.assertTrue(searchResultPage.addProductToCart(productName));
    }
}
