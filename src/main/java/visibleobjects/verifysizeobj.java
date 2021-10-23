package visibleobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.basepage;

public class verifysizeobj extends basepage{
	
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tabTshirt ; 
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a/span")
	private WebElement sizeSmall;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a/span")
	private WebElement sizeMedium;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[3]/label/a/span")
	private WebElement sizeLarge;
	
	
	
	public verifysizeobj(){
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getTabTshirt() {
		tabTshirt.click();
		return tabTshirt;
	}

	public WebElement getSizeSmall() {
		sizeSmall.click();
		return sizeSmall;
	}

	public WebElement getSizeMedium() {
		sizeMedium.click();
		return sizeMedium;
	}

	public WebElement getSizeLarge() {
		sizeLarge.click();
		return sizeLarge;
	}
	
		
	}

