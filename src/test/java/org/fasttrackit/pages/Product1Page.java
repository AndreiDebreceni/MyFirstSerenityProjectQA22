package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Product1Page extends PageObject {
    @FindBy (css = "img[alt='Blue']")
    private WebElementFacade color;
    @FindBy (css = "a[name='8'] > .swatch-label")
    private WebElementFacade size;
    @FindBy(css = ".product-shop button[title='Add to Cart'] > span > span")
    private WebElementFacade addToCart;

    public void selectColor(){clickOn(color);}
    public void selectSize(){clickOn(size);}
    public void addToCartButton(){clickOn(addToCart);}

}
