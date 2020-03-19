package myJunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class stringTest {

	/*
	 * case 1:input - "a"
	 * case 2:input - "b"
	 * case 3:input - ""
	 * case 4:input - "aA"
	 * case 5:input - "bb"
	 * case 6:input - "Aabcd"
	 * case 7:input - "qwertyasd"
	 */
	
	public static StringManipulate sM;
	@BeforeAll
    public static void init(){
		sM=new StringManipulate();
    }
	
	@Test
	public void test1() {
		assertEquals("",sM.man("a"));
	}
	
	@Test
	public void test2() {
		
		assertEquals("b",sM.man("b"));
	}
	
	@Test
	public void test3() {
		assertEquals("",sM.man(""));
	}
	
	@Test
	public void test4() {
		assertEquals("",sM.man("aA"));
		assertEquals("bAA",sM.man("AAbAA"));
	}
	
	@Test
	public void test5() {
		assertEquals("bb",sM.man("bb"));
	}
	
	@Test
	public void test6() {
		assertEquals("bcd",sM.man("Aabcd"));
	}
	
	@Test
	public void test7() {
		assertEquals("qwertyasd",sM.man("qwertyasd"));
	}
}
