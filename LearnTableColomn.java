package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnTableColomn {

	public static void main(String[] args) {
		//
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//table[@id='tableTopMenu']//input[@id='chkSelectDateOnly']")).click();
		WebElement fromstation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromstation.clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		WebElement deststation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		deststation.clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		driver.findElement(By.xpath("//a[text()='Train Name']")).click();
		WebElement trainnames = driver.findElement(By.xpath("//table[contains(@class,'TrainList')]"));
		List<WebElement> trainlist = trainnames.findElements(By.tagName("td"));
		System.out.println("trainlist Count "+trainlist.size());
		List<WebElement> names =driver.findElements(By.xpath("//table[contains(@class,'DataTable')]//td[@class='Sorted']/a"));
		 	for(int i=0; i < names.size(); i++)
		{
		 		String text = names.get(i).getText();    
		 		System.out.println(i+" "+text);
	      
		}
		 	Set<WebElement> duplicates = new LinkedHashSet<WebElement>(names);
	        System.out.println("set size  "+duplicates.size());
	         
	        if(names.size()==duplicates.size()) {
	        	System.out.println("Duplicate Present");
	        }
	        else {
	        	System.out.println("Duplicate Not present");
	        }
			
			}

}
