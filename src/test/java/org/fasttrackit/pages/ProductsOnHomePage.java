package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ProductsOnHomePage extends PageObject {
    @FindBy (css = ".product-info  a[title='Lafayette Convertible Dress']")
    private WebElementFacade product1;
    @FindBy (css = ".product-info  a[title='Chelsea Tee']")
    private WebElementFacade product2;

    public void clickOnProduct1(){clickOn(product1);}
    public void clickOnProduct2(){clickOn(product2);}

}
