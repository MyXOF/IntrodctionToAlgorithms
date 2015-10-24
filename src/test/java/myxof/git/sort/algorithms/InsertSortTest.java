package myxof.git.sort.algorithms;

import myxof.git.sort.algorithms.DefaultSort;
import myxof.git.sort.algorithms.Sort;
import junit.framework.TestCase;

public class InsertSortTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSortInt() {
		Sort test = new DefaultSort();
		test.addIntData(34);
		test.addIntData(69);
		test.addIntData(67);
		test.addIntData(2);
		test.addIntData(14);
		test.addIntData(7);
		test.addIntData(3);
		test.addIntData(68);
		test.addIntData(96);
		test.addIntData(83);
		test.displayIntArray();
		test.sortInt();
		test.displayIntArray();
		assertTrue(test.getArrayInt(0) == 2);
		assertTrue(test.getArrayInt(3) == 14);
		assertTrue(test.getArrayInt(6) == 68);
		assertTrue(test.getArrayInt(9) == 96);
	}

	public void testSortDouble() {
		Sort test = new DefaultSort();
		test.addDoubleData(0.011963487778376858);
		test.addDoubleData(0.9259847573420875);
		test.addDoubleData(0.6535558703122081);
		test.addDoubleData(0.27724497638219514);
		test.addDoubleData(0.49634141304227697);
		test.addDoubleData(0.8317572161873702);
		test.addDoubleData(0.6026782736000555);
		test.addDoubleData(0.5157151173082298);
		test.addDoubleData(0.8053939514095327);
		test.addDoubleData(0.6198794306333214);
		test.displayDoubleArray();
		test.sortDouble();
		test.displayDoubleArray();
		assertTrue(test.getArrayDouble(0) == 0.011963487778376858);
		assertTrue(test.getArrayDouble(3) == 0.5157151173082298);
		assertTrue(test.getArrayDouble(6) == 0.6535558703122081);
		assertTrue(test.getArrayDouble(9) == 0.9259847573420875);
	}

}
