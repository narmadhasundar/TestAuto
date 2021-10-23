package testScript;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import utility.basepage;
import visibleobjects.addtocartobj;

public class addtocarttest {

	addtocartobj atc;
basepage bp;
	
	public addtocarttest(){
		atc=new addtocartobj();
		bp=new basepage();
		
	}
	@Test
	public void dresstab(){
		atc.getDress();
		Assert.assertTrue(bp.elementFound(atc.tabDress()));
	}
		
		@Test
	public void dress(){
		atc.getDress();

}
	@Test
	public void  cart(){
		atc.getAddcart();

	}
	@Test
	public void verifycart(){
		WebElement verify = atc.verifyadded();
		Assert.assertTrue(bp.elementFound(verify));
		
	}
		
		@Test
		private void cardClick() {
		WebElement fdfd = atc.getBtnclick();
//		
//		}
		
		
		
	}
	
