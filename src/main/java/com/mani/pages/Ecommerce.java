package com.mani.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mani.utilities.Locators;

public class Ecommerce {
	private WebDriver driver;

	public Ecommerce(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignin() {
		WebElement element = driver.findElement(Locators.signin);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(d -> element.isDisplayed());
		element.click();
	}

	public void user_enters_username(String user) {
		driver.findElement(Locators.username).sendKeys(user);
	}

	public void user_enters_password(String pass) {
		driver.findElement(Locators.password).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(Locators.login).click();
	}

	public boolean errorMessage() {
		return driver.findElement(Locators.error).isDisplayed();
	}

	public void clickForgotPassword() {
		driver.findElement(Locators.forgotPassword).click();
	}

	public void enterEmail(String emailId) {
		driver.findElement(Locators.email).sendKeys(emailId);
	}

	public void clickResetPassword() {
		driver.findElement(Locators.resetPassword).click();
	}

	public boolean successMessage() {
		return driver.findElement(Locators.suscessMessage).isDisplayed();
	}

	public void user_clicks_on_sale() {
		driver.findElement(Locators.sale).click();
	}

	public void user_clicks_on_bags() {
		driver.findElement(Locators.bags).click();
	}

	public void user_clicks_on_driven_Bag() {

		driver.findElement(Locators.drivenBackPack).click();
	}

	public void user_clicks_on_add_to_cart() {

		driver.findElement(Locators.addToCart).click();
	}

	public boolean user_gets_the_added_message() {
		return driver.findElement(Locators.addedMessage).isDisplayed();
	}

	public void user_clicks_on_men() {
		driver.findElement(Locators.mens).click();
	}

	public void user_clicks_on_jackets() {
		driver.findElement(Locators.jackets).click();
	}

	public void user_clicks_on_montana_wind_jacket() {

		driver.findElement(Locators.montanaWindJacket).click();
	}

	public void user_clicks_on_size(String size) {
		switch (size.toUpperCase()) {
		case "XS":
			driver.findElement(Locators.sizeXS).click();
			break;
		case "S":
			driver.findElement(Locators.sizeS).click();
			break;
		case "M":
			driver.findElement(Locators.sizeM).click();
			break;
		case "L":
			driver.findElement(Locators.sizeL).click();
			break;
		case "XL":
			driver.findElement(Locators.sizeXL).click();
			break;
		}
	}

	public void user_clicks_on_colour(String colour) {
		switch (colour) {
		case "Black":
			driver.findElement(Locators.colourBlack).click();
			break;
		case "Green":
			driver.findElement(Locators.colourGreen).click();
			break;
		case "Red":
			driver.findElement(Locators.colourRed).click();
			break;
		}
	}

	public void user_clicks_on_cart() {
		driver.findElement(Locators.cart).click();
	}

	public void user_clicks_on_checkout() {
		driver.findElement(Locators.checkout).click();
	}

	public void user_clicks_on_address() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = driver.findElement(Locators.address);
		wait.until(d -> element.isDisplayed());
		element.click();
	}

	public void user_enters_firstName(String firstname) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Locators.firstName));
		element.clear();
		element.sendKeys(firstname);
	}

	public void user_enters_lastName(String lastname) {
		driver.findElement(Locators.lastName).clear();
		driver.findElement(Locators.lastName).sendKeys(lastname);
	}

	public void user_enters_street(String street) {
		driver.findElement(Locators.street).sendKeys(street);
	}

	public void user_enters_city(String city) {
		driver.findElement(Locators.city).sendKeys(city);
	}

	public void user_enters_postcode(String postcode) {
		driver.findElement(Locators.postalCode).sendKeys(postcode);
	}

	public void user_chooses_country(String country) {
		WebElement element = driver.findElement(Locators.country);
		Select countryDropDown = new Select(element);
		countryDropDown.selectByVisibleText(country);
	}

	public void user_chooses_state(String state) {
		WebElement element = driver.findElement(Locators.state);
		Select stateDropDown = new Select(element);
		stateDropDown.selectByVisibleText(state);
	}

	public void user_enters_phoneNumber(String telephone) {
		driver.findElement(Locators.phoneNumber).sendKeys(telephone);
		driver.findElement(Locators.saveAddress).click();
	}

	public void user_clicks_on_shipbutton() {
		driver.findElement(Locators.shipButton).click();
	}

	public void user_clicks_on_nextbutton() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = driver.findElement(Locators.nextButton);
		wait.until(d -> element.isDisplayed());
		element.click();
	}

	public void user_clicks_on_placeorder() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = driver.findElement(Locators.placeOrder);
		wait.until(d -> element.isDisplayed());
		element.click();
	}

	public void user_clicks_on_continueShopping() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = driver.findElement(Locators.ContinueShopping);
		wait.until(d -> element.isDisplayed());
		element.click();
	}

	public void user_clicks_on_fusionBackPack() {
		driver.findElement(Locators.fusionBackPack).click();
	}

	public boolean out_of_stock() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = driver.findElement(Locators.OutOfStock);
		wait.until(d -> element.isDisplayed());
		return element.isDisplayed();

	}
}
