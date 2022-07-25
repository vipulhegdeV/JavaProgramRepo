package newprojectjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchrome {

public static void main(String[] args) {
	
	//InitializingWebsiteelementforTest
	
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://aiforevery1.com/demo-site/");
driver.manage().window().maximize();

//testautomationbegins

String act_title=driver.getTitle();    //Testcasefortitle
System.out.println(act_title);
String exp_title="Demo Site � Registration Form � NxtGen A.I Academy";
int err=0;
if(act_title.equals(exp_title)) {
	System.out.println(" 1. TITLE VERIFICATION CASE PASSED");
}
else {
	System.out.println("1.TITLE VERIFICATION CASE FAILED");
	err=err+1;  //Error value increments by one if any error is encountered
}
driver.findElement(By.id("vfb-5")).sendKeys("KTR"); //passingfirstnametestcase

driver.findElement(By.id("vfb-7")).sendKeys("sop");  //passlastnametestcase

driver.findElement(By.id("vfb-8-1")).click();  //clickgendertestcase
driver.findElement(By.id("vfb-13-address")).sendKeys("4th LANE");

//TestcaseforURLverification

String act_url=driver.getCurrentUrl();
String exp_url="https://aiforevery1.com/demo-site/";
if(exp_url==act_url) {
	System.out.println("2. URL VERIFICATION CASE PASSED");    
} 
else {
	System.out.println("2. URL VERIFICATION CASE FAILED");
	err=err+1;
}
//Verify page source length
String pg_source=driver.getPageSource();
int pg_length=pg_source.length();
System.out.println("Page source length is :"+pg_length);

//Count Number of errors till now if any
System.out.println("Errors : "+err);  
 //closetest
	}
}
