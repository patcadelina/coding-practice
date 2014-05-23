package com.patcadelina.strings;

public class StringUtility {

	private StringUtility() {

	}

	public static String reverseString(String input) {
		StringBuilder sb = new StringBuilder();
		char[] array = input.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			sb.append(array[i]);
		}
		return sb.toString();
	}

}
