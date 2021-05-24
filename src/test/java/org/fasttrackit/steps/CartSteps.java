package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CartPage;
import org.junit.Assert;

public class CartSteps {
    private CartPage cartPage;
    @Step
    public void checkTotalPrice() {
        Assert.assertTrue(cartPage.checkTotalPriceSum());
    }
}
