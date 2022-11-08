package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdidasPage {

    public AdidasPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[3]")
    public WebElement laptopsBtn;

    @FindBy(xpath = "//a[normalize-space()='Sony vaio i5']")
    public WebElement sonyVaioI5;




}
