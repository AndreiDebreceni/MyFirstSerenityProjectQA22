package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.SearchProductsSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchProduct extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchProductsSteps searchProductsSteps;
    @Test
    public void searchProducts(){
        searchProductsSteps.navigateToHomePage();
        searchProductsSteps.searchForProduct("CHELSEA TEE");

    }

}
