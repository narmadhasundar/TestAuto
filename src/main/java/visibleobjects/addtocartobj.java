package visibleobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.basepage;

public class addtocartobj extends basepage {

	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabdress;

	
	@FindBy(xpath="(//img[@alt='Printed Chiffon Dress'])[1]")
private WebElement dress;

	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addcart;
	
	@FindBy(xpath="//h2/i[@class='icon-ok']")
	private WebElement verify;
	
	public addtocartobj(){
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement tabDress() {
	 tabdress.click();
		return dress;
	}

	public WebElement getDress() {
		dress.click();
		return dress;
	}

	public WebElement getAddcart() {
		addcart.click();
		return addcart;
	}


	public WebElement verifyadded() {

		return verify;
	}
	
	
	
	
	
	
}
