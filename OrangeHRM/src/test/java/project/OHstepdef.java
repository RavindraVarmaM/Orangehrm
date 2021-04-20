package project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import OHpagefactory.pagefactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import com.google.common.io.Files;

public class OHstepdef {
	
	static WebDriver driver;
	pagefactory n;
    static int i = 1;

	@Given("^User is logins to OrangeHRM application$")
	public void user_is_logins_to_OrangeHRM_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();	

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		n  = new pagefactory(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();
		n.setUsername("Admin");
		n.setPassword("admin123");
	}

	@When("^User clicks on login$")
	public void user_clicks_on_login() throws Throwable {
		 n.setLoginbutton();
	}

	@Then("^User viewas homepage$")
	public void user_viewas_homepage() throws Throwable {
		 n.setPimModule();
		 screenShot();
		 driver.close();
	}

	@When("^User click on pim module$")
	public void user_click_on_pim_module() throws Throwable {
		 n.setLoginbutton();
		 n.setPimModule();
		 WebDriverWait wait=new WebDriverWait(driver,40);
		
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[4]/a")));
		
	   	n.setreport();
	   	screenShot();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[1]/input[1]")));
		   n.setAddReport();
		   screenShot();
		   n.setReportname("Pim module");
		 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		   n.setReportCriteria("Education");
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset[4]/ol/li[2]/select")));
		 
		   n.setReportdisplay("Personal");
		   driver.navigate().refresh();
		   n.setReportfield();
		   n.setReporttick();
		   screenShot();

	}

	@Then("^user view report option$")
	public void user_view_report_option() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,80);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/div/input[1]")));
			
		n.setReportSave();
		screenShot();
		driver.close();
	}

	@When("^user opens admin option$")
	public void user_opens_admin_option() throws Throwable {
		 n.setLoginbutton();
		 WebDriverWait wait=new WebDriverWait(driver,80);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")));
	   n.setAdminmodule();
	   screenShot();
	}

	@Then("^user able to use userrole$")
	public void user_able_to_use_userrole() throws Throwable {
	    n.setUserrole("ESS");
	    screenShot();
	    driver.close();
	}

	@When("^ESS supervior clicks ess$")
	public void ess_supervior_clicks_ess() throws Throwable {
		 n.setLoginbutton();
		 
		   n.setAdminmodule();
	   n.setUsersearch();
	   screenShot();
	}

	@Then("^USer view on ESS details$")
	public void user_view_on_ESS_details() throws Throwable {
	   driver.close();
	}
	
	static void screenShot() throws IOException
	{
	    File scrFile;
	    scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(scrFile, new File("C:\\Users\\Ravindra Varma\\Desktop\\Orange HRM SS//step" + i + ".jpeg"));
	    i++;
	}


}