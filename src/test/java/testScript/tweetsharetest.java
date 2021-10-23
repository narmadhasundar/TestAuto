package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.basepage;
import visibleobjects.tweetshareobj;

public class tweetsharetest {
tweetshareobj tso;
basepage bp;

public tweetsharetest(){
	tso=new tweetshareobj();
	bp=new basepage();
}
@Test
public void fbook(){
	tso.getFb();
	Assert.assertTrue(tso.getFb().isDisplayed());
}
@Test
public void tweet(){
	tso.getTweet();
	Assert.assertTrue(tso.getTweet().isDisplayed());
}
@Test
public void ytube(){
	tso.getYoutube();
	Assert.assertTrue(tso.getYoutube().isDisplayed());
}
@Test
public void google(){
	tso.getGoogle();
	Assert.assertTrue(tso.getGoogle().isDisplayed());
}


	
}
