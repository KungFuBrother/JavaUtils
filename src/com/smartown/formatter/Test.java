package com.smartown.formatter;

public class Test {
	public static void main(String[] args) {
		// testFormat();
		testPattern();
	}

	public static void testFormat() {
		System.out.println(FormatUtils.formatNumber(FormatUtils.NUMBER_DECIMAL_2, 100));
		System.out.println(FormatUtils.formatNumber(FormatUtils.NUMBER_INTEGER_2, 1));
	}

	public static void testPattern() {
		System.out.println(PatternUtils.pattern());
		System.out.println("");
		System.out.println(PatternUtils.split("a1b2c3d4e5f6"));
		System.out.println("");
		System.out.println(PatternUtils.matches("1"));
		System.out.println(PatternUtils.matches("A"));
		System.out.println("");
		System.out.println(PatternUtils.matcher());
		System.out.println("");
		System.out.println(PatternUtils.MatcherUtils.matches("12"));
		System.out.println(PatternUtils.MatcherUtils.matches("1a"));
		System.out.println("");
		System.out.println(PatternUtils.MatcherUtils.lookingAt("1a"));
		System.out.println(PatternUtils.MatcherUtils.lookingAt("a1"));
		System.out.println("");
		System.out.println(PatternUtils.MatcherUtils.find("1a"));
		System.out.println(PatternUtils.MatcherUtils.find("a1"));
		System.out.println(PatternUtils.MatcherUtils.find("ab"));
	}

}
