package io.kiiro.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {

	@Test
	public void sortTest() {

		// create an unsorted list
		Integer[] items = { 45, 1, 2, 67, 43, 39, 3 };

		assertFalse(isSorted(items));

		Sort shellSort = new ShellSort();
		shellSort.sort(items);

		assertTrue(isSorted(items));

	}

	private boolean isSorted(Integer... items) {

		boolean resp = true;

		for (int i = 0; i < items.length - 1; ++i) {
			if (items[i].compareTo(items[i + 1]) > 0) {
				resp = false;
				break;
			}
		}

		return resp;

	}

}
