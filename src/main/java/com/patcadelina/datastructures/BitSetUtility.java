package com.patcadelina.datastructures;

import java.util.BitSet;

public class BitSetUtility {

	private BitSetUtility() {

	}

	/* One value in a given an array of integers is duplicate. Find this number. */
	public static int findDuplicate(int[] array) {
		BitSet bitSet = new BitSet();
		for (Integer i : array) {
			if (bitSet.get(i))
				return i;
			else {
				bitSet.set(i);
			}
		}
		return 0;
	}

}
