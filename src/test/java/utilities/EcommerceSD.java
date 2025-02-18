package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mani.factory.DriverFactory;
import com.mani.pages.Ecommerce;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EcommerceSD {

	String login_url = "https://magento.softwaretestingboard.com";
	private WebDriver DRIVER = DriverFactory.getDriver();
	private Ecommerce ECOM = new Ecommerce(DRIVER);

	@Given("user is on home page")
	public void user_is_on_home_page() {
		DRIVER.manage().window().maximize();

		DRIVER.get(login_url);
	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		ECOM.clickSignin();
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		ECOM.user_enters_username(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
		ECOM.user_enters_password(string);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		ECOM.clickLogin();
	}

	@Then("user gets the title as {string}")
	public void user_gets_the_title_as(String expectedTitle) {

		Assert.assertEquals(DRIVER.getTitle(), expectedTitle);
	}

	@Then("user gets the error message")
	public void user_gets_the_error_message() {
		Assert.assertTrue(ECOM.errorMessage());
	}

	@When("user clicks on forgot password")
	public void user_clicks_on_forgot_password() {
		ECOM.clickForgotPassword();
	}

	@Then("user navigates to the new page named {string}")
	public void user_navigates_to_the_new_page_named(String title) throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(DRIVER.getTitle(), title);
	}

	@When("user enters registred email {string}")
	public void user_enters_registred_email(String email) {
		ECOM.enterEmail(email);
	}

	@When("user clicks on Reset My Passoword")
	public void user_clicks_on_reset_my_passoword() {
		ECOM.clickResetPassword();
	}

	@Then("user get sucess message")
	public void user_get_sucess_message() throws InterruptedException {
		Assert.assertTrue(ECOM.successMessage());
	}

	@When("user clicks on sale")
	public void user_clicks_on_sale() {
		ECOM.user_clicks_on_sale();
	}

	@When("user clicks on bags")
	public void user_clicks_on_bags() {
		ECOM.user_clicks_on_bags();
	}

	@When("user clicks on driven backpack")
	public void user_clicks_on_driven_backpack() throws InterruptedException {
		Thread.sleep(5000);
		ECOM.user_clicks_on_driven_Bag();
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() throws InterruptedException {
		ECOM.user_clicks_on_add_to_cart();
	}

	@Then("user gets item added message")
	public void user_gets_item_added_message() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(ECOM.user_gets_the_added_message());
	}

	@When("user clicks on men")
	public void user_clicks_on_men() {
		ECOM.user_clicks_on_men();
	}

	@When("user clicks on jackets")
	public void user_clicks_on_jackets() {
		ECOM.user_clicks_on_jackets();
	}

	@When("user clicks on Montana Wind Jacket")
	public void user_clicks_on_montana_wind_jacket() throws InterruptedException {
		Thread.sleep(3000);
		ECOM.user_clicks_on_montana_wind_jacket();
	}

	@When("user clicks on size {string}")
	public void user_clicks_on_size(String size) {
		ECOM.user_clicks_on_size(size);
	}

	@When("user clicks on colour {string}")
	public void user_clicks_on_colour(String colour) {
		ECOM.user_clicks_on_colour(colour);
	}

	@When("user clicks on cart icon")
	public void user_clicks_on_cart_icon() {
		ECOM.user_clicks_on_cart();
	}

	@When("user clicks on checkOut")
	public void user_clicks_on_check_out() {
		ECOM.user_clicks_on_checkout();
	}

	@When("user clicks on add address")
	public void user_clicks_on_add_address() throws InterruptedException {
		Thread.sleep(5000);
		ECOM.user_clicks_on_address();
	}

	@When("user enters fisrtName {string}")
	public void user_enters_fisrt_name(String fisrtName) throws InterruptedException {
		Thread.sleep(2000);
		ECOM.user_enters_firstName(fisrtName);
	}

	@When("user enters lastName {string}")
	public void user_enters_last_name(String lastName) {
		ECOM.user_enters_lastName(lastName);
	}

	@When("user enters street {string}")
	public void user_enters_street(String street) {
		ECOM.user_enters_street(street);

	}

	@When("user enters city {string}")
	public void user_enters_city(String city) {
		ECOM.user_enters_city(city);
	}

	@When("user chooses country {string}")
	public void user_chooses_country(String country) {
		ECOM.user_chooses_country(country);
	}

	@When("user chooses state {string}")
	public void user_chooses_state(String state) {
		ECOM.user_chooses_state(state);
	}

	@When("user enters pincode {string}")
	public void user_enters_pincode(String pincode) {
		ECOM.user_enters_postcode(pincode);
	}

	@When("user enters phoneNumber {string}")
	public void user_enters_phone_number(String mobile) {
		ECOM.user_enters_phoneNumber(mobile);
	}

	@When("user clicks on ship here button")
	public void user_clicks_on_ship_here_button() {
		ECOM.user_clicks_on_shipbutton();

	}

	@When("user clicks on next button")
	public void user_clicks_on_next_button() {

		ECOM.user_clicks_on_nextbutton();

	}

	@When("user cliks on place order")
	public void user_cliks_on_place_order() throws InterruptedException {
		Thread.sleep(3000);
		ECOM.user_clicks_on_placeorder();
		Thread.sleep(5000);

	}

	@When("user clicks on Continue shopping")
	public void user_clicks_on_continue_shopping() {
		ECOM.user_clicks_on_continueShopping();
	}

	@When("user clicks on Fusion Backpack")
	public void user_clicks_on_fusion_backpack() {
		ECOM.user_clicks_on_fusionBackPack();
	}

	@Then("user get outofstock message")
	public void user_get_outofstock_message() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(ECOM.out_of_stock());
	}
}
