
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
public class TableTest {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.edge.driver", "E:/Webdriver/msedgedriver.exe");

WebDriver driver=new EdgeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.manage().window().maximize();

JavascriptExecutor js = (JavascriptExecutor)driver;

js.executeScript("window.scrollBy(0,500)");
List<WebElement>numberOfRow =driver.findElements(By.cssSelector(".table-display tr"));
System.out.println(numberOfRow.size());
List<WebElement>numberOfColumn =driver.findElements(By.cssSelector(".table-display th"));
System.out.println(numberOfColumn.size());
//List<WebElement>valueOfRow =driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
//for(int i =0;i<valueOfRow.size();i++) {
//System.out.println(valueOfRow.get(i).getText());}

System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());

	}

}
