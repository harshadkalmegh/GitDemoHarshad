import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get();
		driver.close();
		
	}

}
