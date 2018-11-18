package action;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.java.After;
import pageObj.StorePageObj;

public class StoreAction {
	private static WebDriver driver = null;
	private static String browser = System.getProperty("browserName");
	private static String os = System.getProperty("os.name");
	private static String driverPath = null;

	public static void init() {

		try {
			String platform = System.getProperty("os.name");
			System.out.println("OS Platform: " + platform);

			if (os.contains("Windows")) {
				driverPath = "D:\\selenium-jars\\chromedriver_win32\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", driverPath);
			}

			System.out.println("OS IS::: " + os);
			System.out.println("path:" + driverPath);
		} catch (NullPointerException e) {
			System.out.println("FAILED TO READ PLATFORM.");
			e.printStackTrace();
		}
	}

	private static WebDriver createChromeDriver(boolean headless) {
		ChromeOptions options = new ChromeOptions();

		if (headless) {
			options.addArguments("--privileged");
			options.addArguments("--headless");
			options.addArguments("--window-size=1200x600");
			options.addArguments("--disable-web-security");
			// options.setAcceptInsecureCerts(true);
			options.addArguments("--ignore-certificate-errors");

		} else {
			options.addArguments("--start-maximized");
			options.addArguments("--disable-web-security");
			options.addArguments("--no-proxy-server");
			options.addArguments("--allow-running-insecure-content");
		}
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		// capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver chromeDriver = new ChromeDriver(capabilities);
		chromeDriver.manage().deleteAllCookies();
		chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return chromeDriver;
	}

	public static WebDriver launchBrowser() {
		StoreAction.init();
		try {
			browser = System.getProperty("browserName");
			if (browser == null) {
				browser = "chrome";
			}
		} catch (Exception e1) {
			System.out.println("FAILED TO READ BROWSER NAME.");
			e1.printStackTrace();
		}

		try {

			switch (browser) {
			case "chrome":
				System.out.println("CHROME BROWSER SELECTED");
				setDriver(createChromeDriver(false));
				break;

			case "chromeHeadless":
				System.out.println("HEADLESS CHROME BROWSER SELECTED.");
				setDriver(createChromeDriver(true));
				break;
			}
		} catch (Exception e) {
			System.out.println("*** FAILED TO LAUNCH BROWSER ***");
			e.printStackTrace();
			Assert.assertTrue(false, "*** FAILED TO LAUNCH BROWSER ***");
		}

		return getDriver();
	}

	public static void navigateToURL(String url) {

		try {
			System.out.println("URL IS::: " + url);
			getDriver().navigate().to(url);
		} catch (Exception e) {
			System.out.println("FAILED TO NAVIGATE TO THE URL.");
			Assert.assertTrue(false, "FAILED TO NAVIGATE TO THE URL.");
		}

	}

	public void clickOnSamplePg() {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", StorePageObj.samplePageLink);
			StorePageObj.samplePageLink.click();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void enterCommentsEmail(Boolean incorrectEmail) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", StorePageObj.commentTxtArea);
			StorePageObj.commentTxtArea.sendKeys("Comments Text goes here");
			StorePageObj.setCommentTxtArea(StorePageObj.commentTxtArea);
			StorePageObj.nameTxt.sendKeys("Nametext");
			if (incorrectEmail) {
				StorePageObj.emailTxt.sendKeys("wrongemail");
				StorePageObj.postSubmitBtn.click();
			} else {
				StorePageObj.emailTxt.clear();
				StorePageObj.emailTxt.sendKeys("correctemail@abc.com");
				StorePageObj.postSubmitBtn.click();
			}

		} catch (Exception e) {
			Assert.fail("FAILED TO ENTER COMMENTS AND EMAIL ");
		}
	}

	public void validateErrorMsg() {
		try {
			Assert.assertEquals("Entered email is incoorect", StorePageObj.errorPage.getText(),
					"ERROR: please enter a valid email address.");
		} catch (Exception e) {
			Assert.fail("FAILED TO VALIDATE ERROR MESSAGE");
		}
	}

	public void navigateBack() {
		try {
			StorePageObj.backBtn.click();
		} catch (Exception e) {
			Assert.fail("FAILED TO NAVIGATE BACK PAGE");
		}
	}

	public void validateComments() {
		try {
			String expectedCommnent = StorePageObj.getCommentTxtArea().getText().trim();

			Assert.assertEquals("FAILED TO ADD COMMENTS : ", StorePageObj.addedCommentsStr, expectedCommnent);
		} catch (Exception e) {
			Assert.fail("FAILED TO VALIDATE ERROR MESSAGE");
		}
	}

	@After
	public static void closeBrowser() {
		try {
			if (getDriver() != null)
				getDriver().quit();
		} catch (Exception e) {
			Assert.fail("BROWSER NOT FOUND!?" + e.toString());
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		StoreAction.driver = driver;
	}

}
