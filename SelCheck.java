import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "E:/Webdriver/chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/angularpractice/");
Thread.sleep(1000L);
driver.findElement(By.name("name")).sendKeys("Asif");
Thread.sleep(1000L);
driver.findElement(By.name("email")).sendKeys("emon@gamil.com.com");
Thread.sleep(1000L);
driver.findElement(By.id("exampleInputPassword1")).sendKeys("111");
Thread.sleep(1000L);
driver.findElement(By.id("exampleCheck1")).click();
Thread.sleep(1000L);
WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

Select abc = new Select(dropdown);
Thread.sleep(1000L);
abc.selectByVisibleText("Male");
Thread.sleep(1000L);
driver.findElement(By.id("inlineRadio2")).click();
Thread.sleep(1000L);
driver.findElement(By.name("bday")).sendKeys("01/02/1998");
Thread.sleep(1000L);
driver.findElement(By.cssSelector(".btn-success")).click();
Thread.sleep(1000L);
System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
