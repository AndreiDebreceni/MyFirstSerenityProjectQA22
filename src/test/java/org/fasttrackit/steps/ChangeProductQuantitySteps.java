package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;

public class ChangeProductQuantitySteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ProductsOnHomePage products;
    private Product1Page product1Page;
    private CartPage cartPage;


    @Step
    public void navigateToCart(){
       homePage.open();
       homePage.clickAccountLink();
       homePage.clickMyCartLink();
    }
    @Step
    public void changeProductQty(int quantity){
        cartPage.setQuantityField(quantity);
        cartPage.setUpdateQuantity();
    }

}
