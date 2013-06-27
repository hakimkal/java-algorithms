package io.kiiro.algorithm.search;

public class BinarySearch implements Search {

	public int find(int key, int[] items) {
		int resp = -1;
		int lo = 0;
		int hi = items.length - 1;
		while (lo <= hi) {			
			int mid = lo + (hi - lo) / 2;
			if (key < items[mid]) {
				hi = mid - 1;
			} else if (key > items[mid]) {
				lo = mid + 1;
			} else {				
				resp = mid;
				break;
			}
		}
		return resp;
	}

}
