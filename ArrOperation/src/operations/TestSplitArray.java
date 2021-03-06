package operations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSplitArray {

	ArrOperation test = new ArrOperation();

	@Before
	public void init() {
		test = new ArrOperation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_NegativeElementsInArray() {
		int[] arr = { 1, -1, 2, 3 };
		boolean output = ArrOperation.checkArray(arr);
		assertEquals(false, output);
	}

	@Test
	public void test_When_SingleElementInArray() {
		int arr[] = { 1 };
		int output = test.splitEqual(arr);
		assertEquals(-1, output);
	}

	@Test
	public void test_GreaterThanOneElement() {
		int arr[] = { 1, 2, 3, 6 };
		int output = test.splitEqual(arr);
		assertEquals(3, output);
	}

	@Test
	public void test_ArrayNotSplitted() {
		int arr[] = { 1, 2, 2, 4 };
		int output = test.splitEqual(arr);
		assertEquals(-1, output);
	}

	@Test
	public void negativeTestForSplitArray() {
		int arr[] = { 1, 2, 3, 6 };
		assertFalse(1 == test.splitEqual(arr));
	}

	@Test
	public void arrayIsEmpty_Expected_AssertionError() {
		try {
			int arr[] = {};
			int output = test.noOfClumps(arr);
			assertEquals(0, output);
		} catch (AssertionError e) {
			assertEquals("Array is empty", e.getMessage());
		}
	}

}