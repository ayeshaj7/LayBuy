package ShopSearch;

import java.util.concurrent.TimeUnit;
import static org.testng.AssertJUnit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.ObjectRepo;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LayBuyShopSearch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		ObjectRepo objectrepo= new ObjectRepo(driver);
		
	@Given("^user has navigate to LayBuy$") 
	public void user_has_navigate_to_laybuy() throws Throwable
	{
		driver.get("https://www.laybuy.com");
	}
	
	@Given("^user click and navigate to the {arg} page$")
	public void user_click_and_navigate_to_the_page(menuitem) throws Throwable
	{
		//Click and navigate to the page
		objectrepo.clickMenuLink(menuitem);
	}
	
	@When("^user search {arg} as the shop$") 
	public void user_search_as_the_shop(searchvalue) throws Throwable
	{
		 //Search the shop
		objectrepo.typeSearchValue(searchvalue);
	}	
	
	@Then("^user verify the number of directory tiles$")
	public void user_verify_the_number_of_directory_tiles () throws Throwable
	{
		//Verify the number of directory tiles are more than 2
		softAssert.assertTrue(objectrepo.countDirectoryTiles()>2);
	}
	
	@And("^user clicks on a directory tile and verify new window with correct merchant website$")
	public void user_clicks_on_a_directory_tile_and_verify_new_window_with_correct_merchant_website () throws Throwable
	{
		//Click on a directory tile and verify the new window
		int result=0;
		result=objectrepo.clickDirectoryTileLinkAndVerifyTheNewWindow();
		assertEquals(result, 0);
	}
		
	driver.close();
	}
}
