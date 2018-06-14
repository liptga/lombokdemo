package at.liptakg.lombokdemo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LombokTest 
{
	@Test
	public void wrongEquals() {
		WrongEntityExample a = new WrongEntityExample("myfoo", 1, "excluded");
		WrongEntityExample b = new WrongEntityExample("myfoo", 1, "does not matter");
		
		assertThat( "AAAAAAAA. Not equals :(", a, not(is(b)));
	}
	
	@Test
	public void goodEquals() {
		GoodEntityExample a = new GoodEntityExample("myfoo", 1, "excluded");
		GoodEntityExample b = new GoodEntityExample("myfoo", 1, "does not matter");
		
		assertThat( "Yeah. Works", a, is(b));
	}
}
