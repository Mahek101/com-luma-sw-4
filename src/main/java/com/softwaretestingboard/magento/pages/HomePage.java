package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");



    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }
    public void mouseHoverOnJacketsAndClick(){
        mouseHoverToElementAndClick(jackets);
    }
    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
    }
    public void clickOnPants(){
        mouseHoverToElementAndClick(pants);
    }
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    public void mouseHoverOnBagsAndClick(){
        mouseHoverToElementAndClick(bags);
    }
}
