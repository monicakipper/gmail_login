package gmail_login_package;

import org.openqa.selenium.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_login_class {

		
	
	
	
	     // main entry function to our project
		public static void main(String[] args) {
	
		// declare variable name driver of type Webdriver
		WebDriver driver;
		//WebDriver driver2;
		// instantiate a driver of a type chromedriver
		System.setProperty("webdriver.chrome.driver", "/Users/monica.kipper/workspace/server_drivers/chromedriver");
		driver = new ChromeDriver();
		//driver2 = new ChromeDriver();
		// define url where chrome driver will be accessing
		String gmailBaseURL = "http://gmail.com";
		// define string class name that we will be looking to make sure it exists
		String htmlCssClassName = "banner";
		//this line makes the driver go get webpage
		driver.get(gmailBaseURL);
		
		
		/* To be able to check if an element exists by its css class name we have to call
		 * a function named findElement which Webdriver has and its called "findElement"
		 * findElement is expecting a variable that will tell it what to look, that variable
		 * can contain many type of things to find by, for example it could find an element
		 * by its name or id ( <div id="monica"> </div> ) or by other ways
		 * we choose to find the element by its css class name because our object looks like 
		 * this: <div class="banner">
		 *			<h1>
  		 *				One account. All of Google.
		 *			</h1>
		 *		</div>
		 *		
		 *	so.. what are our options here? we can find all div elements in the page
		 *  and then go find that one div element that has a class="banner"
		 *  or we can ask the webdriver to go find an element that has a css class "banner"
		 *  
		 *
		 * 
		 */
		
		
		By ToFindByObject;
		ToFindByObject = By.className(htmlCssClassName);
		
		WebElement WebElementToFind;
		WebElementToFind = driver.findElement(ToFindByObject);
		
		
		//logic
		if(WebElementToFind.isEnabled() == true)
		{
			if(WebElementToFind.isDisplayed() == true)
			{
				 System.out.println("Yay");
				 
				 //By ElementThatActuallyHasTheText;
				 //By.tagName("h1");
				 
				 WebElement H1WebElementWithOurText;
				 
				 H1WebElementWithOurText = WebElementToFind.findElement(By.tagName("h1"));
				 
				 if(H1WebElementWithOurText.isEnabled() && H1WebElementWithOurText.isDisplayed()) {
					 
					 System.out.println(H1WebElementWithOurText.getText());
				 }
				
			}
			else 
			{
				 System.out.println("nay");
			}
		
		}
		else
		{
			 System.out.println("Nay");
			
		}
		
	
	driver.close();
	System.exit(0);
		
		
		
		
	}
	
	
}
