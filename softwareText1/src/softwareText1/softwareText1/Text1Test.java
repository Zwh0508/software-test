package softwareText1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Text1Test extends Test1{
    Test1 test1 = new Test1();
    String enough = "Yes";
    String notEnough = "No";
    

    
	@Test
	public void testMain() {
		String result = Test1.money(27);
		assertEquals(enough, result);
	}

	@Test
	public void testMoney() {
		String result = Test1.money(55);
		assertEquals(notEnough, result);
	}

}
