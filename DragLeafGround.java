package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragLeafGround {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement dragelement = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		dragelement.getLocation().getX();
		dragelement.getLocation().getY();
		Actions dragto = new Actions(driver);
		dragto.dragAndDropBy(dragelement,300,300).perform();

	}

}
