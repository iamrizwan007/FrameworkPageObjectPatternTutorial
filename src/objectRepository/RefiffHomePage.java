package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RefiffHomePage {

	WebDriver driver;
	
	public RefiffHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchBox = By.xpath("//input[@id='srchword']");
	By searchBtn = By.xpath("//input[@aria-label='Search']");
	
	public WebElement search() {
		return driver.findElement(searchBox);
	}
	
	public WebElement srchbutton() {
		return driver.findElement(searchBtn);
	}
}