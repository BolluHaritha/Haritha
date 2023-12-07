package com.app.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	@Test
		public void Loginpage() throws InterruptedException 
		{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[@class='logreg']/child::span[1]")).click();
		 driver.findElement(By.xpath("//input[@id='lemail']")).sendKeys("19082001.haritha@gmail.com");
		 driver.findElement(By.xpath("//div[@class='B14_white comm-btn btn-login-continue btn-login-cont-otp']")).click();
		 driver.findElement(By.xpath("//div[@id='verfiedbtn']"));
		 driver.findElement(By.xpath("//div[@class='B14_white comm-btn btn-login-continue']")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div[8]/div/div/div[2]/div[5]/div/div/ul[1]/li[2]/a")).click();
		 driver.findElement(By.xpath("(//div[@class='list_img wifi'])[1]")).click();
		 driver.findElement(By.xpath("//div[@class='size-option-wrap']")).click();
		 driver.findElement(By.xpath("(//span[@class='M16_white'])[4]")).click();
		 driver.findElement(By.xpath("//span[@class='bucket']")).click();
		 driver.findElement(By.xpath("//img[@class='cart-card-img']")).click();
			
		}
}
