package testScript;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;
import utility.basepage;
import visibleobjects.homepageobj;

public class homepgtest {
	homepageobj hp;
	basepage bc;

	public homepgtest() {
		hp = new homepageobj();
		bc = new basepage();
	}

	@Test
	public void women() {
		hp.checkWomen();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
		Assert.assertTrue(bc.elementFound(hp.checkWomen()));
	}
	@Test
		public void Dress(){
		hp.checkDresses();
		Assert.assertTrue(hp.getTitlte().contains("Dresses"));
	}
	@Test
		public void Tshirts(){
		hp.checkTshirt();
		Assert.assertTrue(hp.getTitlte().contains("T-shirts"));

	}

}
