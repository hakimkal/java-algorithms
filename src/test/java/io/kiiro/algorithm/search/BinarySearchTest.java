package io.kiiro.algorithm.search;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	// create an items array
	int[] items = { 1, 2, 4, 6, 8, 10, 14, 16, 18, 20, 22, 25, 27, 29 };
	
	Search search = new BinarySearch();

	@Test
	public void should_find_the_key_in_the_sorted_items_array() {		

		assertNotSame(-1, search.find(16, items));
	}
	
	@Test
	public void should_not_find_the_key_in_the_sorted_items_array() {		

		assertSame(-1, search.find(17, items));
	}

}
