package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By actualTextShoppingCart = By.xpath("//span[@class='base']");
    By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//dd[contains(text(),'32')]");
    By colour = By.xpath("//dd[contains(text(),'Black')]");
    By name = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By quantity = By.xpath("//input[@title='Qty']");
    By price = By.xpath("(//span[@class='cart-price']//span)[2]");
    By changeQuantity = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By updatePrice = By.xpath("(//span[@class='cart-price']//span)[2]");

    public String getActualText(){
        return getTextFromElement(actualTextShoppingCart);
    }
    public String getProductName(){
        return getTextFromElement(productName);
    }
    public int getSize(){
        return getNumberFromElement(size);
    }
    public String getColour(){
        return getTextFromElement(colour);
    }
    public String getName(){
        return getTextFromElement(name);
    }
    public int getQuantity(){
        return getNumberFromElement(quantity);
    }
    public String getPrice(){
        return getTextFromElement(price);
    }
    public void changeQuantityTo5(String quantity){
        sendTextToElement(changeQuantity,quantity);
    }
    public void updateShoppingCart(){
        clickOnElement(updateCart);
    }
    public String verifyProductPrice(){
        return getTextFromElement(updatePrice);
    }


}
