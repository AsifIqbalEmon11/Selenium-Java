import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com/");
		WebElement staticDropdown = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)"));
		Select dropdown =new Select(staticDropdown);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("EUR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("BDT");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("GBP");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
		
	}

}
