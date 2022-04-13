package alertsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioBtninselenium {
	@Test
	public void IDDemo() {
		System.setProperty("webdriver.chrome.driver"
				,"D:\\ECLIPSE dxc phase 2\\DXCLaunchChrome\\SeleniumChromeBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/game/COD/RadioButtons%20(1).html");
		
		
		int a = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("NUMBER OF RADIO BTN ARE...."+a);
		

}
}