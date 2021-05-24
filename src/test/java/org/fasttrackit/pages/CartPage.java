package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy (css = "#shopping-cart-table > tbody > tr > td.product-cart-actions > input")
    private WebElementFacade quantityField;
    public void setQuantityField (int quantity){
        typeInto(quantityField, String.valueOf(quantity));
    }
    @FindBy (css = ".product-cart-actions > button[name='update_cart_action'] > span > span")
    private WebElementFacade updateQuantity;
    public void setUpdateQuantity(){clickOn(updateQuantity);}

    @FindBy (css = "button#empty_cart_button > span > span")
    private WebElementFacade emptyCartButton;
    public void emptyCart(){clickOn(emptyCartButton);}

    @FindBy(css = "body > div > div.page > div.main-container.col1-layout > div > div > div.cart-empty > p:nth-child(1)")
    private WebElementFacade emptyCartText;

    public void verifyEmptyCart(String message){
        emptyCartText.shouldContainOnlyText(message);
    }

    public boolean isEmptyCartText(String text){
        return emptyCartText.containsOnlyText(text);
    }

    public String getWelcomeText(){
        return emptyCartText.getText();
    }

    @FindBy (css = ".checkout-types.top  button[title='Proceed to Checkout'] > span > span")
    private WebElementFacade checkOutButton;
    public void checkOutButton (){clickOn(checkOutButton);
    }
    @FindBy(css = ".product-cart-price .product")
    private List<WebElementFacade> listOfPrices;
    @FindBy(css = "strong .price")
    private WebElementFacade grandTotalPrice;
    @FindBy(css = "tbody tr:nth-child(2) .a-right .price")
    private WebElementFacade taxPrice;


    public int getProductPricesSum(){
        int priceTotalCalculated = 0;
        for(WebElementFacade element: listOfPrices){
        priceTotalCalculated += getPriceFromCartItems(element);
        }
        return priceTotalCalculated;
    }
    private int getPriceFromCartItems(WebElementFacade elementFacade){
        return Integer.parseInt(elementFacade.getText().replaceAll(" RON","").replaceAll(",",""));
    }
    public int getGrandTotalPriceInt(){
        return getPriceFromCartItems(grandTotalPrice);
    }
    public int getTaxPriceInt(){
        return getPriceFromCartItems(taxPrice);
    }
    public boolean checkTotalPriceSum(){
        System.out.println("price combined: "+ getProductPricesSum());
        System.out.println("tax price: "+ getTaxPriceInt());
        System.out.println("total price: "+ getGrandTotalPriceInt());
        return (getProductPricesSum()+getTaxPriceInt()) == getGrandTotalPriceInt();

    }

}
