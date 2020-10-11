package PSPProject.PSPProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginAndAddPatient {
	
	@BeforeTest

	public void openURL ()
	{
		String chromePath = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://psp-test.objectsdev.com/login");
	  }
}
