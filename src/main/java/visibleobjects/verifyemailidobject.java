package visibleobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.basepage;

public class verifyemailidobject extends basepage {
	
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement tabemail;
	
	@FindBy(xpath="//*[@id='newsletter_block_left']/div/form/div/button")
	private WebElement arrowbtn;
	
	@FindBy(xpath="//*[@class = 'alert alert-success']")
	private WebElement verifytext;
	
	public verifyemailidobject(){
		PageFactory.initElements(driver, this);
		
		}

	public WebElement getTabemail() {
		tabemail.click();
		return tabemail;
	}
public void enteremail(String email){
	setText(tabemail,email);
	arrowbtn.click();
	
	}
public WebElement subscribe(){
	return verifytext;
	}

	
}
	
	

