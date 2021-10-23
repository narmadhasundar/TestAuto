package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import visibleobjects.homepageobj;
import visibleobjects.productcountobj;

public class productcounttest {
	productcountobj pco;
	homepageobj hp;
	
public productcounttest(){
	pco=new productcountobj();
	hp=new homepageobj();
}
@Test
public void women(){
	pco.getTabwomen();
	Assert.assertTrue(pco.getTabwomen().isSelected());
}
@Test
public void verifyproduct(){
	Assert.assertTrue(pco.getnofromheading()==pco.getListproduct());
}	
}



