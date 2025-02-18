package com.mani.utilities;

import org.openqa.selenium.By;

public class Locators {
	public static final By signin = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
	public static final By username = By.id("email");
	public static final By password = By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");
	public static final By login = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
	public static final By error = By
			.xpath("//div[contains(text(),'The account sign-in was incorrect or your account ')]");
	public static final By forgotPassword = By
			.xpath("//a[@class='action remind']//span[contains(text(),'Forgot Your Password?')]");
	public static final By email = By.id("email_address");
	public static final By resetPassword = By.xpath("//span[contains(text(),'Reset My Password')]");
	public static final By suscessMessage = By
			.xpath("//div[contains(text(),'If there is an account associated with example@gma')]");
	public static final By sale = By.xpath("//span[contains(text(),'Sale')]");
	public static final By bags = By.xpath("//a[contains(text(),'Bags')]");
	public static final By drivenBackPack = By.xpath("//a[contains(text(),'Driven Backpack')]");
	public static final By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
	public static final By addedMessage = By.xpath("//body/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
	public static final By mens = By.xpath("//span[contains(text(),'Men')]");
	public static final By jackets = By.xpath("//a[contains(text(),'Jackets')]");
	public static final By montanaWindJacket = By
			.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/strong[1]/a[1]");
	public static final By sizeXS = By.xpath("//div[@id='option-label-size-143-item-166']");
	public static final By sizeS = By.xpath("//div[@id='option-label-size-143-item-167']");
	public static final By sizeM = By.xpath("//div[@id='option-label-size-143-item-168']");
	public static final By sizeL = By.xpath("//div[@id='option-label-size-143-item-169']");
	public static final By sizeXL = By.xpath("//div[@id='option-label-size-143-item-170']");
	public static final By colourBlack = By.xpath("//div[@id='option-label-color-93-item-49']");
	public static final By colourGreen = By.xpath("//div[@id='option-label-color-93-item-53']");
	public static final By colourRed = By.xpath("//div[@id='option-label-color-93-item-58']");
	public static final By cart = By.xpath("//header/div[2]/div[1]/a[1]");
	public static final By checkout = By.xpath("//button[@id='top-cart-btn-checkout']");
	public static final By address = By.xpath("//span[contains(text(),'New Address')]");
	public static final By firstName = By.name("firstname");
	public static final By lastName = By.name("lastname");
	public static final By street = By.name("street[0]");
	public static final By city = By.name("city");
	public static final By postalCode = By.name("postcode");
	public static final By country = By.name("country_id");
	public static final By state = By.name("region_id");
	public static final By phoneNumber = By.name("telephone");
	public static final By shipButton = By.xpath("//span[contains(text(),'Ship here')]");
	public static final By nextButton = By.xpath("//span[contains(text(),'Next')]");
	public static final By placeOrder = By.xpath("//span[contains(text(),'Place Order')]");
	public static final By ContinueShopping = By.xpath("//span[contains(text(),'Continue Shopping')]");
	public static final By saveAddress = By.xpath("//input[@id='shipping-save-in-address-book']");
	public static final By fusionBackPack = By.xpath("//a[contains(text(),'Fusion Backpack')]");
	public static final By OutOfStock = By.xpath("//div[contains(text(),'The requested qty is not available')]");

}
