package forth_selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f_selenium_first_script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\LEAPWORK\\Studio\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mendix.com");

	}

}
