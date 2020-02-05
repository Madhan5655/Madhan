package hotelpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\EFL Toshiba\\\\eclipse-workspace\\\\Adactin\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public  void fill(WebElement element, String name) {
		element.sendKeys(name);
	}
	
	public   void btnclick(WebElement element) {
		element.click();
	}
	public  static void dropdown(Select s, String text) {
		s.selectByVisibleText(text);
	}

		
	}


