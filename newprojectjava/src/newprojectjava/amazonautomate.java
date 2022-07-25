package newprojectjava;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonautomate {
	
	public static void main(String[] args) throws InterruptedException {
		
//Initializing Web Element for Test AND SETTING UP DRIVER AS OBJECT REFERENCE VARIABLE
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http:amazon.com");
	
	//test begins
	driver.manage().window().maximize();
	int err=0;      //store number of errors encountered
	
	//Popup Display Functionality
	
	WebElement pop_dismiss = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/div/div/div[3]/span[1]/span/input"));
	if(pop_dismiss.isDisplayed()) {
	System.out.println("DISMISS POPUP DISPLAY : PASSED ");}
	else {
		System.out.println("DISMISS POPUP DISPLAY : FAILED");
		err=err+1;    //Error value increments by one if any error is encountered

	}
	
	//Dismiss Popup Functionality
	
	pop_dismiss.click();
	if(pop_dismiss.isSelected()) {
		
	System.out.println("DISMISS POPUP FUNCTIONALITY : PASSED ");
	}
	else {
		System.out.println("DISMISS POPUP FUNCTIONALITY  : FAILED ");
		err=err+1;
		 //wait for 10 seconds before next test to start
		
		//GameAccessories Display functionality
	}
	WebElement Game_accsr = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[1]/div"));
	if(Game_accsr.isDisplayed()) {
	System.out.println("ACCESSORIES DISPLAY : PASSED");
	}
	else {
		System.out.println("ACCESSORIES DISPLAY : FAILED");
		err=err+1;
	}
	
	Thread.sleep(3000);
	
	//SearchBox Display Functionality
	
	WebElement search_prod = driver.findElement(By.id("twotabsearchtextbox"));
	if(search_prod.isDisplayed()) {
	System.out.println("PRODUCT SEARCH IS DISPLAYED : PASSED ");
	}
	else {
		System.out.println("PRODUCT SEARCH FAILs TO SURFACE : FAILED");
		err=err+1;
	}
	Thread.sleep(3000);
	
	//Search Box Data input Functionality
	
	search_prod.sendKeys("Appple iPhone X");
	if(search_prod.isEnabled()) {
		System.out.println("PRODUCT SEARCH  BUTTON IS ENABLED : PASS");
	}
	else {
		System.out.println("PRODUCT SEARCH INPUT TEST CASE FAILED");
		err=err+1;
	}
	WebElement prod_clk = driver.findElement(By.id("nav-search-submit-button"));
	prod_clk.click();
	
	
	//Navigate back to previous page check

	driver.navigate().back();
	driver.navigate().to("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
	
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
	
	//TEST RESULT WITH ERROR COUNT AND SIGNOFF CRITERIA
	
	System.out.println("ERRORS ENCOUNTERED DURING AUTOMATION : "+err);
	if(err<2) {
		System.out.print("CONDITIONAL SIGNOFF POSSIBLE WITH : " +err+" ERRORS\n");
	}
	else {
		System.out.print("FIX & RETEST REQUIRED"); 
	}
	
	//Last test for Wrap up
	WebElement all_work = driver.findElement(By.id("nav-hamburger-menu"));
	all_work.click();
	driver.findElement(By.xpath("html/body/div[3]/div[2]/div/ul[1]/li[7]/a")).click();
	
	Thread.sleep(8000);
	driver.quit();	}}

