package lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Habte-Craft\\Desktop\\QA 25\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		// driver object create
		WebDriver driver = new ChromeDriver();  //
		
		//url visit
		driver.get("https://www.facebook.com");
		
		// how to get title 
		String title = driver.getTitle();
		System.out.println(title);
		
		// currently url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
