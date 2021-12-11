package login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class fist {

	public static void main(String[] args) throws InterruptedException {
		String[] email = {
				"hellobossiamurbossrn1.0@gmail.com",
				"hellobossiamurbossrn.10@gmail.com",
				"hellobossiamurbossrn.1.0@gmail.com",
				"hellobossiamurbossr.n10@gmail.com",
				"hellobossiamurbossr.n1.0@gmail.com",
				"hellobossiamurbossr.n.10@gmail.com",
				"hellobossiamurbossr.n.1.0@gmail.com",
				"hellobossiamurboss.rn10@gmail.com",
				"hellobossiamurboss.rn1.0@gmail.com",
				"hellobossiamurboss.rn.10@gmail.com",
				"hellobossiamurboss.rn.1.0@gmail.com",
				"hellobossiamurboss.r.n10@gmail.com",
				"hellobossiamurboss.r.n1.0@gmail.com",
				"hellobossiamurboss.r.n.10@gmail.com",
				"hellobossiamurboss.r.n.1.0@gmail.com"};
		String password = "123456";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aryan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		for(int i=0; i<email.length;i++) {
			driver.get("https://www.midasbuy.com/midasbuy/ot/login");
			driver.findElement(By.id("loginUsername")).sendKeys(email[i]);
			driver.findElement(By.id("loginPassword")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			TimeUnit.SECONDS.sleep(3);
			driver.get("https://www.midasbuy.com/midasbuy/ot/vipcenter");
			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
			TimeUnit.SECONDS.sleep(4);
			
			driver.findElement(By.className("user-email")).click();
			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.id("headerLogoutButton")).click();

			
		
		
		}
		driver.close();
	}

}
