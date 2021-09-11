package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffLoginPage;
import objectRepository.RediffLoginPagePF;
import objectRepository.RefiffHomePage;

public class LoginApp {
	
	static String chromepath = "D:\\JavaWorkspace\\Drivers\\chromedriver.exe";
	
	@Test
	public void logIn() {
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPagePF loginPage = new RediffLoginPagePF(driver);
		loginPage.getUsername().sendKeys("iamriz007");
		loginPage.getPassword().sendKeys("test123");
		loginPage.signIn().click();
		loginPage.homePage().click();
		RefiffHomePage homePage = new RefiffHomePage(driver);
		homePage.search().sendKeys("product");
		homePage.srchbutton().click();
	}
}