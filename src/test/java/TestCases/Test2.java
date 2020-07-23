package TestCases;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test2 {
	
		public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//FF
	driver.get("http://157.245.106.175:8000/");
	 driver.manage().window().maximize();
	
	 Thread.sleep(2000);
	
	 WebElement fileUpload = driver.findElement(By.xpath("//input[@id='pdf-file']"));
	
	 
	 WebDriverWait wait = new WebDriverWait(driver, 20);
	
	 fileUpload.sendKeys("C:\\Users\\admin\\Downloads\\8220_NY_mscs llc  ny law vsa 3.8.16 fully executed.pdf");
	 Thread.sleep(2000);
	 //fileUpload.sendKeys("D:\\8220_NY_mscs llc  ny law vsa 3.8.16 fully executed.pdf");
	  WebElement testDropDown = driver.findElement(By.id("ctype"));  
	  Select dropdown = new Select(testDropDown);
	  Select agreementType1 = new Select(driver.findElement(By.id("ctype")));
	  dropdown.selectByValue("VRG");
	 // Thread.sleep(1000);
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='data']/button"))));
	  driver.findElement(By.xpath("//*[@id='data']/button")).click();
	  
	
	  Thread.sleep(3000);
	  
	  wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//table[@id='res']//tr"))));
	  List<WebElement> rows= driver.findElements(By.xpath("//table[@id='res']//tr"));
	 
	  System.out.println(rows.size());
	  
	  String BeforeXpath="//th[@id='key_value_";
	  String AfterXpath="']";
   
  	  
	
	  String Value_BeforeXpath="//td[@id='val";
	  String Value_AfterXpath="']";
	  
	
	  HashMap<String, String> Data_values = new HashMap<String, String>();
	  
	  for (int i=0;i<=rows.size()-2;i++) {
		  
		  String Key= BeforeXpath+i+AfterXpath;
		 String Value= Value_BeforeXpath+i+Value_AfterXpath;
		  
		String DataPoints=  driver.findElement(By.xpath(Key)).getText();
		String Value_Obtained	=  driver.findElement(By.xpath(Value)).getText();
		
		Data_values.put(DataPoints, Value_Obtained);
		//Data_values.keySet();
		
		
	//	System.out.println("Data Points	: " + DataPoints + "   " + " Value Obtained	: " + Value_Obtained);
		
		//System.out.println(DataPoints + " :  "  + Value_Obtained);
			 
		
	  }
	  for (String j : Data_values.keySet()) {
	      System.out.println("key: " + j + " value: " + Data_values.get(j));
	    }
	
	  
	 // driver.quit();
	  
	 
	  }
	 
	  
	

	}

	
	


