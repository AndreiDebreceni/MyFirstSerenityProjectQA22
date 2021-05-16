package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;


public class AddMultipleProductsToCart {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ProductsOnHomePage products;
    private Product1Page product1Page;
    private Product2Page product2Page;
    @Step
    public void openHomepage(){
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
    @Step
    public void openHomepage2(){
        homePage.open();
    }
    @Step
    public void selectProduct2(){
        products.clickOnProduct2();
        product2Page.selectSize2();
        product2Page.selectColor2();
    }
    @Step
    public void addToCart2(){
        product1Page.addToCartButton();
    }


}
