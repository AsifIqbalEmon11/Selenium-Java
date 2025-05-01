import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggesDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "E:/Webdriver/msedgedriver.exe");

WebDriver driver=new EdgeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();
driver.findElement(By.id("autocomplete")).sendKeys("unit");
Thread.sleep(3000L);
List<WebElement>options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));

for(WebElement option : options) {
	
	if(option.getText().equalsIgnoreCase("United Arab Emirates")) {
		
		option.click();
		break;
	}	
//	if(option.getText().equalsIgnoreCase("United Kingdom (UK)")) {
		
	//	option.click();
	//}
}
	}
}
