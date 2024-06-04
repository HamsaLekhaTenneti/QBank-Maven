package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/raghuram36/Downloads/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		driver.close();
	}

}
