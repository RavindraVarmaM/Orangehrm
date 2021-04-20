package OHpagefactory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class pagefactory {

		WebDriver driver;
		
		@FindBy(name="txtUsername")
		@CacheLookup
		WebElement username;

		//using how class
		@FindBy(how=How.NAME, using="txtPassword")
		@CacheLookup
		WebElement password;

	   @FindBy(how=How.NAME, using="Submit")
		@CacheLookup
		WebElement loginbutton;
	   
	   @FindBy(how=How.ID, using="menu_pim_viewPimModule")
	   @CacheLookup
	   WebElement Pimmodule;
	   
	   @FindBy(how=How.ID, using="menu_core_viewDefinedPredefinedReports")
	   @CacheLookup
	   WebElement Report;
	   
	   @FindBy(how=How.NAME, using="btnAdd")
	   @CacheLookup
	   WebElement addreport;
	   
	   @FindBy(how=How.NAME, using="report[report_name]")
	   @CacheLookup
	   WebElement reportname;
	   
	   @FindBy(how=How.NAME, using="report[criteria_list]")
	   @CacheLookup
	   WebElement reportcriteria;
	   
	   @FindBy(xpath="//*[@id=\"report_include_comparision\"]")
	   @CacheLookup
	   WebElement reportcriteriainclude;
	   
	   @FindBy(how=How.NAME, using="report[display_groups]")
	   @CacheLookup
	   WebElement reportdisplay;
	   
	   @FindBy(xpath="//*[@id=\"btnAddDisplayField\"]")
	   @CacheLookup
	   WebElement reportfield;
	   
	   @FindBy(xpath="//*[@id=\"display_group_1\"]")
	   @CacheLookup
	   WebElement reporttick;
	   
	   
	   @FindBy(how=How.ID, using="btnSave")
	   @CacheLookup
	   WebElement reportsave;
	   
	   @FindBy(how=How.NAME, using="search[search]")
	   @CacheLookup
	   WebElement reportnamesearch;
	   
	   @FindBy(how=How.NAME, using="searchBtn")
	   @CacheLookup
	   WebElement reportsearch;
	   
	   @FindBy(xpath="/html/body/div[1]/div[2]/ul/li[1]/a/b")
	   @CacheLookup
	   WebElement adminmodule;
	   
	   @FindBy(how=How.NAME, using="searchSystemUser[userType]")
	   @CacheLookup
	   WebElement userrole;
	   
	   @FindBy(how=How.NAME, using="_search")
	   @CacheLookup
	   WebElement usersearch;
	   
	   public pagefactory(WebDriver driver) 
		{
			this.driver =driver;
	        PageFactory.initElements(driver,this);
		}
	  
	   
	   public void setUsername(String n) {
			username.sendKeys(n);
		}
		public WebElement getUsername() {
			return username;
		}
		public void setPassword(String pass) {
			password.sendKeys(pass);
		}
		public WebElement getPassword() {
			return password;
		}
		public void setLoginbutton() {
			loginbutton.click();
		}
		public void setPimModule() {
			Pimmodule.click();
		}
		public void setreport() {
			Report.click();
		}
		public void setAddReport() {
			addreport.click();
		}
		public void setReportname(String name) {
			reportname.sendKeys(name);
		}
		public void setReportCriteria(String name) {
			reportcriteria.sendKeys(name);
		}
		public void setReportinlude(String n) {
			reportcriteriainclude.sendKeys(n);
		}
		public void  setReportdisplay(String name) {
			reportdisplay.sendKeys(name);
		}
		public void setReportfield() {
			reportfield.click();
		}
		public void setReporttick() {
			reporttick.click();
		}
		public void setReportSave() {
			reportsave.click();
		}
		public void setReportnamesearch(String name) {
			reportnamesearch.sendKeys(name);
		}
		public void setReportsearch() {
			reportsearch.click();
		}
		public void setAdminmodule() {
			adminmodule.click();
		}
		public void setUserrole(String name) {
			userrole.sendKeys(name);
		}
		public void setUsersearch() {
			usersearch.click();
		}	

	}
	
