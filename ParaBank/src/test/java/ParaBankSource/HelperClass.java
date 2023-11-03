package ParaBankSource;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class HelperClass {
		
		
		private static HelperClass helperClass;
		private static WebDriver driver;
		private static WebDriverWait wait;
		public final static int TIMEOUT=10;
		
		HelperClass(){
			driver=new EdgeDriver();
			wait=new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
			driver.manage().window().maximize();
			
		}
		public static void OpenPage(String url) {
			driver.get(url);
		}
		public static WebDriver getDriver() {
			return driver;
		}
		public static void SetUpDriver() {
			if(helperClass==null) {
				helperClass=new HelperClass();
			}
			
		}
		public static void TearDown() {
			if(driver!=null) {
				driver.close();
				driver.quit();
			}
			helperClass=null;
		}

	}


