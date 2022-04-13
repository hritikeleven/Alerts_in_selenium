package alertsinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CasestudyoftheDAY {
	@Test
	public void IDDemo() {
		System.setProperty("webdriver.chrome.driver"
				,"D:\\ECLIPSE dxc phase 2\\DXCLaunchChrome\\SeleniumChromeBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/");
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"cse-search-box\"]/span[2]/button")).click();
		
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int Linksnum = Links.size();
		System.out.println("Number of links are :"+ Linksnum);
		//if a certain link exist in the Website than print that link
		for(int i=0; i<=Links.size(); i++) {
			System.out.println(Links.get(i).getText());
			
			String str =Links.get(i).getText();
			String str1 = "Love Calculator";
			
			if(str.equals(str1)){
				
				driver.findElement(By.linkText("Aws Certification in Bangalore")).click();
				driver.findElement(By.xpath("//*[@id=\"e1\"]/div[1]/a")).click();
			}
		}
}}

