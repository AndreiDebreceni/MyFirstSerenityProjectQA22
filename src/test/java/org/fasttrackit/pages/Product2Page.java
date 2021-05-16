package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Product2Page extends PageObject {
    @FindBy (css = "img[alt='Blue']")
    private WebElementFacade color;
    public void selectColor2(){clickOn(color);}

    @FindBy (css = "a[name='m'] > .swatch-label")
    private WebElementFacade size;
    public void selectSize2(){clickOn(size);}


}
