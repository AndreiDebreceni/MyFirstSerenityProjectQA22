package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WaitForAngular;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultPage extends PageObject {
    @FindBy(css = "li.item")
    private List<WebElementFacade> listOfProducts;
    @FindBy(css = ".category-products > .toolbar > .sorter > .sort-by > select[title='Sort By']")
    private WebElementFacade sortByDropdown;

    public boolean isProductInList(String productName){
        Assert.assertNotNull(listOfProducts);
        for (WebElementFacade element : listOfProducts){
            if (element.findElement(By.cssSelector(".product-name"))
                    .getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void setSortByDropdown (String value){
        sortByDropdown.selectByVisibleText(value);
    }
    public boolean isSortByPriceAscending(){

        int firstPrice = getPriceFromProduct(listOfProducts.get(0));
        int lastPrice = getPriceFromProduct(listOfProducts.get(listOfProducts.size()-1));
        if(firstPrice <= lastPrice)
            return true;
        return false;
    }
    //Transform String in int
    private int getPriceFromProduct(WebElementFacade element){
        return Integer.parseInt(element.findElement(By.cssSelector(".price")).getText().replaceAll(",00 RON",""));
    }
    public boolean addProductToCart(String name){
       // System.out.println("this is the list: "+ listOfProducts.size());
        //WaitForAngularRequestToFinish();
    for(WebElementFacade elementFacade: listOfProducts){
       // System.out.println("actual text: " + elementFacade.findElement(By.cssSelector(".product-name")).getText());
        //System.out.println("expected text: " + name);
        if(elementFacade.findElement(By.cssSelector(".product-name")).getText().equalsIgnoreCase(name)){
            elementFacade.findElement(By.cssSelector(".btn-cart")).click();
            return true;
        }
    }
        return false;
    }

}
