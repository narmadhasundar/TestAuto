package testScript;
import java.util.Random;
import java.util.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.basepage;
import visibleobjects.verifyemailidobject;

public class verifyemailidtest {
verifyemailidobject vp;
basepage bc;

public verifyemailidtest(){
	vp =new verifyemailidobject();
	bc=new basepage();
	}

	
@Test
public void clickmailbox(){
	vp.getTabemail();
}
@Test
public void entermailid(){
	int randomvalue=new Random().nextInt(1000000);
	String email="narmz"+randomvalue + "@gmail.com";
	vp.enteremail(email);
	}


	@Test
public void verifySuccess(){
	WebElement subscribed = vp.subscribe();
	Assert.assertTrue(bc.elementFound(subscribed));
	}

}
	

