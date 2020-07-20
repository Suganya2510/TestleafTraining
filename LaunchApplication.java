package week2.day1;

import java.util.List;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup property for the driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//create an object for the driver
        ChromeDriver driver = new ChromeDriver();
		
		//Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//find element using id attribute
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		//find element using name attribute
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//find element using ClassName attribute
		driver.findElementByClassName("decorativeSubmit").click();
		
		//find element using LinkText attribute

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestleafSolutions");
		
		//find element by id using WebElement
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("SuganyaShash");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("G");
		
		//find element for drop downs
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Employee");
		WebElement marketingcampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown1 = new Select(marketingcampaign);
		dropdown1.selectByValue("9001");

		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		// WebElement industry =
		// driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown2 = new Select(industry);
		List<WebElement> options = dropdown2.getOptions();
		int size = options.size();
		options.get(size - 2).click();

		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown3 = new Select(ownership);
		dropdown3.selectByIndex(5);

		WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown4 = new Select(Country);
		dropdown4.selectByVisibleText("India");
		driver.findElementByClassName("smallSubmit").click();
		
		
        //To get the current title of the page
		String title = driver.getTitle();
		System.out.println(driver.getTitle());

	}

}
