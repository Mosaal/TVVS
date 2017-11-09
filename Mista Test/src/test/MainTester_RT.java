//Warning: The same setUp method is used for multiple initial states.

package test;

import src.*;
import junit.framework.*;

public class MainTester_RT extends TestCase{

	private Main main;
	
	protected void setUp()  throws Exception {
		main = new Main();
		main.onList.add("de");
		main.onList.add("mista");
		main.onList.add("teste");
	}
	
	protected void setUp2()  throws Exception {
		main = new Main();
		main.onList.add("de");
		main.onList.add("mista");
		main.onList.add("teste");
	}
	
	public void test1() throws Exception {
		System.out.println("Test case 1");
		main.removeString("de");
		assertTrue("1_1", main.onList.contains("mista"));
		assertTrue("1_1", main.onList.contains("teste"));
		assertTrue("1_1", main.offList.contains("de"));
		main.addString("de");
		assertTrue("1_1_1", main.onList.contains("de"));
		assertTrue("1_1_1", main.onList.contains("mista"));
		assertTrue("1_1_1", main.onList.contains("teste"));
	}

	public void test2() throws Exception {
		System.out.println("Test case 2");
		main.removeString("de");
		main.removeString("mista");
		assertTrue("1_1_2", main.onList.contains("teste"));
		assertTrue("1_1_2", main.offList.contains("de"));
		assertTrue("1_1_2", main.offList.contains("mista"));
		main.addString("de");
		assertTrue("1_1_2_1", main.onList.contains("de"));
		assertTrue("1_1_2_1", main.onList.contains("teste"));
		assertTrue("1_1_2_1", main.offList.contains("mista"));
	}

	public void test3() throws Exception {
		System.out.println("Test case 3");
		main.removeString("de");
		main.removeString("mista");
		main.addString("mista");
		assertTrue("1_1_2_2", main.onList.contains("mista"));
		assertTrue("1_1_2_2", main.onList.contains("teste"));
		assertTrue("1_1_2_2", main.offList.contains("de"));
	}

	public void test4() throws Exception {
		System.out.println("Test case 4");
		main.removeString("de");
		main.removeString("mista");
		main.removeString("teste");
		assertTrue("1_1_2_3", main.offList.contains("de"));
		assertTrue("1_1_2_3", main.offList.contains("mista"));
		assertTrue("1_1_2_3", main.offList.contains("teste"));
		main.addString("de");
		assertTrue("1_1_2_3_1", main.onList.contains("de"));
		assertTrue("1_1_2_3_1", main.offList.contains("mista"));
		assertTrue("1_1_2_3_1", main.offList.contains("teste"));
	}

	public void test5() throws Exception {
		System.out.println("Test case 5");
		main.removeString("de");
		main.removeString("mista");
		main.removeString("teste");
		main.addString("mista");
		assertTrue("1_1_2_3_2", main.onList.contains("mista"));
		assertTrue("1_1_2_3_2", main.offList.contains("de"));
		assertTrue("1_1_2_3_2", main.offList.contains("teste"));
	}

	public void test6() throws Exception {
		System.out.println("Test case 6");
		main.removeString("de");
		main.removeString("mista");
		main.removeString("teste");
		main.addString("teste");
		assertTrue("1_1_2_3_3", main.onList.contains("teste"));
		assertTrue("1_1_2_3_3", main.offList.contains("de"));
		assertTrue("1_1_2_3_3", main.offList.contains("mista"));
	}

	public void test7() throws Exception {
		System.out.println("Test case 7");
		main.removeString("de");
		main.removeString("teste");
		assertTrue("1_1_3", main.onList.contains("mista"));
		assertTrue("1_1_3", main.offList.contains("de"));
		assertTrue("1_1_3", main.offList.contains("teste"));
		main.addString("de");
		assertTrue("1_1_3_1", main.onList.contains("de"));
		assertTrue("1_1_3_1", main.onList.contains("mista"));
		assertTrue("1_1_3_1", main.offList.contains("teste"));
	}

	public void test8() throws Exception {
		System.out.println("Test case 8");
		main.removeString("de");
		main.removeString("teste");
		main.addString("teste");
		assertTrue("1_1_3_2", main.onList.contains("mista"));
		assertTrue("1_1_3_2", main.onList.contains("teste"));
		assertTrue("1_1_3_2", main.offList.contains("de"));
	}

	public void test9() throws Exception {
		System.out.println("Test case 9");
		main.removeString("de");
		main.removeString("teste");
		main.removeString("mista");
		assertTrue("1_1_3_3", main.offList.contains("de"));
		assertTrue("1_1_3_3", main.offList.contains("mista"));
		assertTrue("1_1_3_3", main.offList.contains("teste"));
	}

	public void test10() throws Exception {
		System.out.println("Test case 10");
		main.removeString("mista");
		assertTrue("1_2", main.onList.contains("de"));
		assertTrue("1_2", main.onList.contains("teste"));
		assertTrue("1_2", main.offList.contains("mista"));
		main.addString("mista");
		assertTrue("1_2_1", main.onList.contains("de"));
		assertTrue("1_2_1", main.onList.contains("mista"));
		assertTrue("1_2_1", main.onList.contains("teste"));
	}

	public void test11() throws Exception {
		System.out.println("Test case 11");
		main.removeString("mista");
		main.removeString("de");
		assertTrue("1_2_2", main.onList.contains("teste"));
		assertTrue("1_2_2", main.offList.contains("de"));
		assertTrue("1_2_2", main.offList.contains("mista"));
	}

	public void test12() throws Exception {
		System.out.println("Test case 12");
		main.removeString("mista");
		main.removeString("teste");
		assertTrue("1_2_3", main.onList.contains("de"));
		assertTrue("1_2_3", main.offList.contains("mista"));
		assertTrue("1_2_3", main.offList.contains("teste"));
		main.addString("mista");
		assertTrue("1_2_3_1", main.onList.contains("de"));
		assertTrue("1_2_3_1", main.onList.contains("mista"));
		assertTrue("1_2_3_1", main.offList.contains("teste"));
	}

	public void test13() throws Exception {
		System.out.println("Test case 13");
		main.removeString("mista");
		main.removeString("teste");
		main.addString("teste");
		assertTrue("1_2_3_2", main.onList.contains("de"));
		assertTrue("1_2_3_2", main.onList.contains("teste"));
		assertTrue("1_2_3_2", main.offList.contains("mista"));
	}

	public void test14() throws Exception {
		System.out.println("Test case 14");
		main.removeString("mista");
		main.removeString("teste");
		main.removeString("de");
		assertTrue("1_2_3_3", main.offList.contains("de"));
		assertTrue("1_2_3_3", main.offList.contains("mista"));
		assertTrue("1_2_3_3", main.offList.contains("teste"));
	}

	public void test15() throws Exception {
		System.out.println("Test case 15");
		main.removeString("teste");
		assertTrue("1_3", main.onList.contains("de"));
		assertTrue("1_3", main.onList.contains("mista"));
		assertTrue("1_3", main.offList.contains("teste"));
		main.addString("teste");
		assertTrue("1_3_1", main.onList.contains("de"));
		assertTrue("1_3_1", main.onList.contains("mista"));
		assertTrue("1_3_1", main.onList.contains("teste"));
	}

	public void test16() throws Exception {
		System.out.println("Test case 16");
		main.removeString("teste");
		main.removeString("de");
		assertTrue("1_3_2", main.onList.contains("mista"));
		assertTrue("1_3_2", main.offList.contains("de"));
		assertTrue("1_3_2", main.offList.contains("teste"));
	}

	public void test17() throws Exception {
		System.out.println("Test case 17");
		main.removeString("teste");
		main.removeString("mista");
		assertTrue("1_3_3", main.onList.contains("de"));
		assertTrue("1_3_3", main.offList.contains("mista"));
		assertTrue("1_3_3", main.offList.contains("teste"));
	}

	public void test18() throws Exception {
		System.out.println("Test case 18");
	}

}
