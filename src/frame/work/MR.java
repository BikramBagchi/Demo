package frame.work;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class MR 
{ 
	public static WebDriver driver ;
	
	Util ref = new Util();
 
	public void Property()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		ref.openURl(driver, "https://www.google.com/", 10);
		
	}
	
	
	protected void GetTiltle()
	{
		String Excepted = "Googleffd";
		String Actual = driver.getTitle();
		SoftAssert a = new SoftAssert();
		a.assertTrue(Actual.equals(Excepted));
		a.assertAll();
	}
	
	
	public void Send()
	{
		ref.sendkeys(driver, "//input[@name=\"q\"]", "automation");
	}
	
	
	public void BrowserClose()
	{
		driver.close();
	}
	
	
	public void screenshot(String Name )
	{
				
		TakesScreenshot shot = ((TakesScreenshot)driver);
		File scrfile = shot.getScreenshotAs(OutputType.FILE);
		File des = new File("./TestNGFrameWork/"+Name+".png");
		try {
			FileUtils.copyFile(scrfile, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
