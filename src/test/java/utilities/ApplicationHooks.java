package utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mani.factory.DriverFactory;
import com.mani.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() throws IOException {

		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() throws IOException {

		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.int_driver(browserName);

	}

	@After(order = 0)
	public void quitBrowser() throws IOException {

		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {

			// take screen shot

			String screenshotName = scenario.getName().replaceAll("", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}

	}

}
