package myxof.git.sort.algorithms;

import junit.framework.TestCase;

public class MergeSortTest extends TestCase {

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
		Sort test = new MergeSort();
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
	}

}
