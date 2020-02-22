// Assignement 1410_A03
// Program CodingBatTest
// Author Christian Makoma
// Created Nov 30, 2019


package a03;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CodingBatTest {

	@Test
	public void test1() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zpXzp", tester.zipZap("zipXzap"));
		
	}
	
	@Test
	public void test2() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zpzp", tester.zipZap("zopzop"));
		
	}
	
	@Test
	public void test3() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zzzpzp", tester.zipZap("zzzopzop"));
		
	}
	
	@Test
	public void test4() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zibzp", tester.zipZap("zibzap"));
		
	}
	
	@Test
	public void test5() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zp", tester.zipZap("zip"));
		
	}
	
	@Test
	public void test6() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zi", tester.zipZap("zi"));
		
	}
	
	@Test
	public void test7() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "z", tester.zipZap("z"));
		
	}
	
	@Test
	public void test8() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "", tester.zipZap(""));
		
	}
	
	@Test
	public void test9() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "zp", tester.zipZap("zzp"));
		
	}
	
	@Test
	public void test10() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "abcppp", tester.zipZap("abcppp"));
		
	}
	
	@Test
	public void test11() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "azbcppp", tester.zipZap("azbcppp"));
		
	}
	
	@Test
	public void test12() {
		
		CodingBat tester = new CodingBat();
		assertEquals("Result", "azbcpzp", tester.zipZap("azbcpzpp"));
		
	}
	
	
	
	
	

}
