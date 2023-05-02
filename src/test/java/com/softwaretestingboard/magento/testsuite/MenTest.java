package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        homePage.mouseHoverOnMenMenu();
        Thread.sleep(1000);
        homePage.mouseHoverOnBottoms();
        Thread.sleep(1000);
        homePage.clickOnPants();
        Thread.sleep(1000);
        pantsPage.mouseHoverOnCronusYogaPant();
        pantsPage.clickOnSize32();
        pantsPage.clickOnBlackColour();
        pantsPage.clickOnAddToCart();
        Assert.assertEquals(pantsPage.getActualText(),"You added Cronus Yoga Pant to your shopping cart.","Text is not displayed");
        pantsPage.clickOnShoppingCartLink();
        Assert.assertEquals(shoppingCartPage.getActualText(),"Shopping Cart","Text is not displayed");
        Assert.assertEquals(shoppingCartPage.getProductName(),"Cronus Yoga Pant","Product name is not displayed");
        Assert.assertEquals(shoppingCartPage.getSize(),32,"Size is not displayed");
        Assert.assertEquals(shoppingCartPage.getColour(),"Black","Colour is not displayed");
    }
}
