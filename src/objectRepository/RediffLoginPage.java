package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By username = By.xpath("//input[@id='login1']");
	By password = By.name("passwd");
	By signIn = By.name("proceed");
	By homepage = By.linkText("rediff.com");
	
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement signIn() {
		return driver.findElement(signIn);
	}
	
	public WebElement homePage() {
		return driver.findElement(homepage);
	}
	
}
