package PKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.gecko.driver", "G:\\selenium1\\geckodriver-v0.34.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();


	}

}
