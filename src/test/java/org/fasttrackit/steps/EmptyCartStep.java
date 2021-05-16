package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.CartPage;
import org.junit.Assert;

public class EmptyCartStep {
    private CartPage cartPage;
    private AccountPage accountPage;
    @Step
    public void emptyCart(){
        cartPage.emptyCart();
    }
    @Step
    public void checkEmptyCart(String message){
        cartPage.verifyEmptyCart(message);
        Assert.assertTrue(cartPage.isEmptyCartText(message));

    }
}
