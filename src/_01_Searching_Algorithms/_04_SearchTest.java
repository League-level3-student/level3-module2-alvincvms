package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] a = {"a", "b", "c", "d", "e"};
		String[] b = {"alpha", "beta", "theta"};
		String[] c = {"Alamo", "Betty", "Cindy"};
		assertEquals(2, _00_LinearSearch.linearSearch(a , "c"));
		assertEquals(1, _00_LinearSearch.linearSearch(b , "beta"));
		assertEquals(-1, _00_LinearSearch.linearSearch(c , "Daniel"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {10, 20, 30, 40, 50};
		int[] c = {5, 10, 20};
		assertEquals(0, _01_BinarySearch.binarySearch(a, 0, 4, 1));
		assertEquals(0, _01_BinarySearch.binarySearch(b, 0, 4, 10));
		assertEquals(-1, _01_BinarySearch.binarySearch(c, 0, 1, 20));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 4, 6, 8, 10};
		int[] c = {3, 6, 9, 12, 15};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(a, 3));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(b, 10));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(c, 5));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] b = {1, 3, 5, 8, 13, 43, 65, 78};
		int[] c = {2, 4};
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(a, 1));
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(b, 13));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(c, 69));
	}
}
