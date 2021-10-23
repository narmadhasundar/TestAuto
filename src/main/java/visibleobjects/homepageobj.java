package visibleobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.basepage;


public class homepageobj extends basepage{
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement tabwomen;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabDresses;
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tabTshirt ;
	
	public homepageobj(){
		PageFactory.initElements(driver, this);
		
	}	
		public WebElement checkWomen() {
			tabwomen.click();
			return tabwomen ;
		}
		public WebElement checkDresses() {
			tabDresses.click();
			return tabDresses ;
		}
		public WebElement checkTshirt() {
			tabTshirt.click();
			return tabTshirt ;
		}

}



