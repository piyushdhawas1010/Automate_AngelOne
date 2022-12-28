import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sweety\\eclipse-workspace\\Automate_AngelOne\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hp laptop",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='HP Intel Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14s - dy2508TU Thin and Light Laptop']")).click();
        Set<String> kk=driver.getWindowHandles();
ArrayList<String> ss=new ArrayList<String>(kk);
		for(int i=1;i<ss.size();i++){
			driver.switchTo().window(ss.get(i));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("442907",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='_2KpZ6l _1t_O3S _2ti6Tf']")).click();
		System.out.println("Done");
		}
	
	}

}
