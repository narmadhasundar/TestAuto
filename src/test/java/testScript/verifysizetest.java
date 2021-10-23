package testScript;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.basepage;
import visibleobjects.verifysizeobj;

public class verifysizetest {
	verifysizeobj vso;
	basepage bc;
	
	public verifysizetest(){
	vso=new verifysizeobj();
	bc=new basepage();
}
	
	
	@Test
	public void Tshirt(){
		vso.getTabTshirt();		
		Assert.assertTrue(bc.elementFound(vso.getTabTshirt()));
	}
	@Test
	public void small(){
		vso.getSizeSmall();
		Assert.assertTrue(bc.elementFound(vso.getSizeSmall()));
		
	}
	@Test
	public void medium(){
		 vso.getSizeMedium();
		Assert.assertTrue(bc.elementFound(vso.getSizeMedium()));
		
	}
	@Test
		public void large(){
		vso.getSizeLarge();
		Assert.assertTrue(bc.elementFound(vso.getSizeLarge()));
	}
}
