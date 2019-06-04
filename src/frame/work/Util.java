package frame.work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Util
{

	public void openURl(WebDriver d , String URL , int time  )
	{
		d.get(URL);
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	protected void sendkeys(WebDriver d , String Xpath , String Value)
	{
		d.findElement(By.xpath(Xpath)).sendKeys(Value);
	}
}
