package base_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	public WebDriver d;

    @BeforeClass
    public void preCondition()
    {
       d = new ChromeDriver();
       d.get("https://www.saucedemo.com/");
       d.manage().window().maximize();
       d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }

    @AfterClass
    public void postCondition() 

    {
                d.quit();
    }

}


