package newStart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Classes\\Set up\\geckodriver-v0.24.0-win64.zip\\geckodriver-v0.24.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.yahoo.com/");
		
		List<WebElement> trennw = driver.findElements(By.xpath("//li[@class ='trending-list selected']/ul/li"));
		
		System.out.println(trennw.size());
		
	}

}
