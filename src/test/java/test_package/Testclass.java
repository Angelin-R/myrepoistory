package test_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base_package.Baseclass;
import page_package.Pageclass;
import utilities_package.Excelutilsclass;

public class Testclass extends Baseclass {
	@Test
	public void verifyloginwithvalidcred()throws Exception
	{
		
	   	Thread.sleep(2000);
	   	
		Pageclass p2=new Pageclass(d);
		String x1="C:\\Users\\91920\\OneDrive\\Desktop\\sauceproject.xlsx";
		String Sheet="Sheet1";
		int rowcount=Excelutilsclass.getRowCount(x1,Sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String uname=Excelutilsclass.getCellValue(x1, Sheet, i, 0);
			System.out.println("Username----------"+uname);
			
			String pswd=Excelutilsclass.getCellValue(x1, Sheet, i, 1);
			System.out.println("password----------"+pswd);
			       new Pageclass(d);
					p2.setvalues(uname,pswd);
					p2.clickLoginBtn();
					
		}
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		Thread.sleep(2000);
		p2.addToCart();
		 Thread.sleep(5000);
		p2.clickCart();
		 Thread.sleep(5000);
		p2.checkOut();
		 Thread.sleep(5000);
		p2.fillInfo();
		         Thread.sleep(5000);
		//p2.pressContinue();
		         Thread.sleep(5000);
		         WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		         WebElement finishButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("finish")));
		    JavascriptExecutor js1 = (JavascriptExecutor) d;
		    js1.executeScript("\"arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", finishButton);
		p2.pressFinish();
	   }
	    
					@AfterTest
					public void tear()
					{
						d.quit();
					}
}
		
	

