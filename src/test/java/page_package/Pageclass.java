package page_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageclass {
	
WebDriver d;
	
    By uname=By.id("user-name");
    By pswd=By.id("password");
    By loginBtn=By.id("login-button");
    By clickcart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    
    public Pageclass(WebDriver d)

    {
               this.d=d;
    }
    public void clickLoginBtn()
    {
    	 d.findElement(loginBtn).click();
                
    }
    //Specifiying email and psswd
    public void setvalues (String UN,String PWD)

    {
    	    d.findElement(uname).clear();
            d.findElement(uname).sendKeys(UN);
            d.findElement(pswd).clear();
            d.findElement(pswd).sendKeys(PWD);     
    }
    
    public void addToCart()
    {
    	d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    	d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    	d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    	d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
    	d.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
    	d.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
    	
    }
    public void clickCart() throws InterruptedException
    {
    	 Thread.sleep(5000);
    	 d.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    	 JavascriptExecutor js = (JavascriptExecutor) d;
	     js.executeScript("window.scrollBy({ top: 2000, left: 0, behavior: 'smooth' });");
                
    }
    public void checkOut() throws InterruptedException
    {
    	Thread.sleep(5000);
    	d.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }
    public void fillInfo() throws InterruptedException
    {
       Thread.sleep(5000);
       d.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Angelin",Keys.ENTER);
       Thread.sleep(5000);
       d.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("R",Keys.ENTER);
       Thread.sleep(5000);
       d.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("R",Keys.ENTER);
       d.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }
    
//    	 public void pressContinue()
//    	 {	
//    	    d.findElement(By.name("continue")).click();
//         }
//    	 
    	 public void pressFinish()
    	 {	
    	    d.findElement(By.name("finish")).click();
         }
    	 public void backHome()
    	 {	
    	    d.findElement(By.name("back-to-products")).click();
         }
    
}
	
	


