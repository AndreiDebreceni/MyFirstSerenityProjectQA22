package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.AddProductToCart;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.SearchProductsSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchProductsSteps searchProductsSteps;
    @Steps
    private AddProductToCart addProductToCart;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCart(){

        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    }
    @Test
    public void addMultipleItemsToCart(){

        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    }
    @Test
    public void verifyProductPriceInCart(){

      searchProductsSteps.navigateToHomePage();
        searchProductsSteps.addProductToCartByName("3-YEAR WARRANTY");
      searchProductsSteps.addProductToCartByName("SWING TIME EARRINGS");
      searchProductsSteps.addProductToCartByName("SILVER DESERT NECKLACE");
      cartSteps.checkTotalPrice();

    }
}
