package com.patcadelina.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class BitSetUtilityTest {

	@Test
	public void shouldFindDuplicate() {
		int DUPLICATE = 3;
		int[] array = { 1, 2, DUPLICATE, 4, 5, 6, DUPLICATE, 7, 8 };
		int actual = BitSetUtility.findDuplicate(array);
		Assert.assertEquals(DUPLICATE, actual);
	}

}
