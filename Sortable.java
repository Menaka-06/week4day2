package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frameid = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameid);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		Actions sortable = new Actions(driver);
		sortable.dragAndDrop(item1, item6).perform();

	}

}
