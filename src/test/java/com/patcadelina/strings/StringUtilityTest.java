package com.patcadelina.strings;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilityTest {

	@Test
	public void shouldReverseString() {
		String input = "I love this game";
		String EXPECTED = "emag siht evol I";
		String actual = StringUtility.reverseString(input);
		Assert.assertTrue(EXPECTED.equals(actual));
	}

}
