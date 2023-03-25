package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundMenu {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/menu.xhtml");
		WebElement rightclickelmnt = driver.findElement(By.xpath("(//div[@class='card'])[6]/h5"));
		Actions rightclickit = new Actions(driver);
		rightclickit.contextClick(rightclickelmnt).perform();

	}

}
