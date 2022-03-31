package commonUtils;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class UtilElement {
	
	public void mouseHover(WebDriver driver ,WebElement target) {
		Actions action= new Actions(driver);
		action.moveToElement(target).perform();
		
	}
	
	public void jsclick(WebDriver driver ,WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public Wait<WebDriver> fluenwait(WebDriver driver) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)                            
				.withTimeout(Duration.ofSeconds(50))          
		 		.pollingEvery(Duration.ofSeconds(2))          
				.ignoring(NoSuchElementException.class);    
		
		return wait;
	}
	
	public void visiblityOfElement(WebDriver driver, WebElement element) {
		Wait<WebDriver> wait = fluenwait(driver);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void scrollPageDown(WebDriver driver) {
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	public void switchToTab(WebDriver driver) {
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
	}
	
	public void nweWindow(){
		
	}
	
	

}
