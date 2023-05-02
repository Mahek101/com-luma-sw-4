package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homepage = new HomePage();
    JacketsPage jacketsPage = new JacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.mouseHoverOnJacketsAndClick();
        jacketsPage.selectProductNameFilter("Product Name");
        Assert.assertEquals(jacketsPage.getProductList1(), jacketsPage.getProductList2());
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.mouseHoverOnJacketsAndClick();
        jacketsPage.selectProductNameFilter("Price");
        Assert.assertEquals(jacketsPage.getPriceList1(), jacketsPage.getPriceList2());
    }
}
