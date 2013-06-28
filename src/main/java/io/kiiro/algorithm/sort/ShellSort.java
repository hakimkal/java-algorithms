package io.kiiro.algorithm.sort;

import java.util.List;

public class ShellSort implements Sort {

	public void sort(Integer... items) {

		int increment = items.length / 2;
		while (increment > 0) {
			for (int i = increment; i < items.length; i++) {
				int j = i;
				int temp = items[i];
				while (j >= increment && items[j - increment] > temp) {
					items[j] = items[j - increment];
					j = j - increment;
				}
				items[j] = temp;
			}
			if (increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
	}

	
}
