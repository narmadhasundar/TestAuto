package visibleobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utility.basepage;

public class productcountobj extends basepage {
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement tabwomen;
	
	@FindBy(xpath="//*[@id='center_column']/h1/span[2]")
	private WebElement txtproductcount;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
	private List<WebElement> listproduct;
		
	public productcountobj(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTabwomen() {
		tabwomen.click();
		return tabwomen;
	}

	public int getnofromheading(){
		String text = txtproductcount.getText();
		String split[]  = text.split(" ");
		text=split[2];
		int parseInt = Integer.parseInt(text);
		return parseInt;
		}


	public int getListproduct() {
		return listproduct.size();
	}
		
		}
	
	
	
	

