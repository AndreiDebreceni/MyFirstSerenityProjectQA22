package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.SearchProductsSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchProductTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchProductsSteps searchProductsSteps;
    @Test
    public void searchByKeyWords(){

        searchProductsSteps.navigateToHomePage();
        searchProductsSteps.searchForProduct("neck");
        searchProductsSteps.verifyResultPage("LAFAYETTE CONVERTIBLE DRESS");

    }

    @Test
    public void verifySortByPrice() {
        searchProductsSteps.navigateToHomePage();
        searchProductsSteps.searchForProduct("neck");
        searchProductsSteps.verifySortByPriceAscending();
    }

}
