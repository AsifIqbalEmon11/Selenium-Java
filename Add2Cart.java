import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add2Cart {
	
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "E:/Webdriver/chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				String[] items = {"Brocolli","Carrot","Tomato","Cucumber","Brocolli","Carrot"};
				
				driver.get("https://rahulshettyacademy.com/seleniumPractise/");
				driver.manage().window().maximize();
				
				
				Thread.sleep(3000L);
				
				List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
				int j = 0;
				for (int i =0; i<60;i++) {
					
					String[] name = products.get(i).getText().split("-");
					String formatName = name[0].trim();
					List itemsList = Arrays.asList(items);
					
					
					
				if(itemsList.contains(formatName)) {
				
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					Thread.sleep(6000L);
					
				}
					
				/*	
				    int x=0;
					for(int y= i+1;y<products.size();y++) {
						if(itemsList.get(i).equals(itemsList.get(y))) {
							x++;
							driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
							Thread.sleep(3000L);
						}
						else if(x==items.length) {
							break;
						}
					} */
				
				else if(j==items.length) {
					break;
					
				}
				}
				
	}
}
