package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectRepo {

	WebDriver driver;
	
	int pickupdate=calendar.get(Calendar.DAY_OF_MONTH);
	int dropoffdate=pickupdate+1;
	
	//Web page objects
	//By MenuItemLink= By.xpath("//a[@class='nav_menu-module--nav-item--2PKfV'][@href='/nz/shop-here']");//Without Dynamic value
	By MenuItemLink= By.xpath("//a[@class='nav_menu-module--nav-item--2PKfV'][(text()='Shop')]");//With Dynamic value
	By SearchPageHeader=By.xpath("//h1[contains(text(),'Search, shop, repeat...')]");
	By ShopSearch = By.xpath("//input[@type='search']");
	By ShopSearchResult = By.xpath("//h4[(contains(.,'Heart of Oxford'))]");
	By DirectoryTiles = By.xpath("//a[@class='tile-module--tile--1ZeJx']");
	//By BabyMonitorDirectoryTilelink = By.xpath("//h3[contains(text(),'Protect Me Baby Monitor')]//ancestor::a"); //Explicitly use one directory
	By DirectoryTilelink = By.xpath("//a[@class='tile-module--tile--1ZeJx'][2]");
	
	//Method to click on menu item
	public void clickMenuLink(String menuitem){
        driver.findElement(MenuItemLink).click;
        
        WebDriverWait wait=new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.presenceOfElementLocated(SearchPageHeader));
    }
	
	//Method to search in shops
	public void typeSearchValue(String value){
		driver.findElement(ShopSearch).sendKeys(value);
	        
	    WebDriverWait wait=new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.presenceOfElementLocated(ShopSearchResult));
	}
	
	//Count the number of directories
	public int countDirectoryTiles(){
		int count=0;
        return count=driver.findElements(DirectoryTiles).size();
    }
			
	//Method to click on a directory tile and verify the new window
	public int clickDirectoryTileLinkAndVerifyTheNewWindow(){
		
		String linkValue=DirectoryTilelink.getAttribute("href");
		
		String oldWindow=driver.getWindowHandle();
        driver.findElement(DirectoryTilelink).click;
        Set String allHandles=driver.getWindowHandles();
        
        for (String windowhandle : allHandles)
        {
        	if (!windowHandle.equals(oldWindow))
        	{
        		driver.switchTo().window(windowHandle);
        		windowURL=driver.getCurrentUrl();
        	}
        }
        
        if (linkValue=windowURL)
        {
        	return 0; 
        }
        else
        {
        	return 1;
        }
    }
}
