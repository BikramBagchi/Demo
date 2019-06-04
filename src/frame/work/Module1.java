package frame.work;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(InterfacesMethods.class)
public class Module1 
{
	
	MR ref = new MR();
	
    @BeforeMethod
    public void property()
    {
    	ref.Property();
    }


    @Test(priority = 0 , enabled = true , description ="Type text in Google search engine")
    public void testcasenumber() throws Exception
    {
    	ref.GetTiltle();
    	ref.screenshot("asdsadasd");
    }
    
    
    @AfterMethod
    public void CloseBrowser()
    {
    	ref.BrowserClose();
    }
}
