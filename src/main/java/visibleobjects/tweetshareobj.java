package visibleobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.basepage;

public class tweetshareobj extends basepage {
	
	@FindBy(xpath="//section[@id='social_block']/ul/li[1]")
	private WebElement fb;
	
	@FindBy(xpath="//*[@id='social_block']/ul/li[2]/a")
	private WebElement tweet;
	
	@FindBy(xpath="//*[@id='social_block']/ul/li[3]")
	private WebElement youtube;
	
	@FindBy(xpath="//*[@id='social_block']/ul/li[4]")
	private WebElement google;
	
	
	public tweetshareobj(){
		PageFactory.initElements(driver, this);
	}


	public WebElement getFb() {
		return fb;
	}


	public WebElement getTweet() {
		return tweet;
	}


	public WebElement getYoutube() {
		return youtube;
	}


	public WebElement getGoogle() {
		return google;
	}
	

}
