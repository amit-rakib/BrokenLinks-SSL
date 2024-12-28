import java.io.File;
//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class SSLTest {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		
		
		WebDriver driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().deleteCookieNamed("session");
		
		driver.get("https://expired.badssl.com/");
	    System.out.println(driver.getTitle());
	    
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //  FileUtils.copyFile(src, new File("C://ss.png"));
	
	
	
	}

}
