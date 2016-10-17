package com.smartown.formatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtils {

	public static String pattern() {
		Pattern pattern = Pattern.compile("\\w+");
		return pattern.pattern();
	}

	public static String split(String s) {
		final Pattern pattern = Pattern.compile("\\d+");
		final String[] splitResult = pattern.split(s);
		String result = "";
		for (int i = 0; i < splitResult.length; i++) {
			result += ((result.length() > 0 ? "\n" : "") + "result[" + i + "]" + splitResult[i]);
		}
		return result;
	}

	public static boolean matches(String s) {
		return Pattern.matches("\\d+", s);
	}

	public static String matcher() {
		final Pattern pattern = Pattern.compile("\\w+");
		final Matcher matcher = pattern.matcher("123");
		return matcher.pattern().pattern();
	}

	public static class MatcherUtils {

		/**
		 * 对整个字符串进行匹配,只有整个字符串都匹配了才返回true
		 * 
		 * @param s
		 * @return
		 */
		public static boolean matches(String s) {
			final Pattern pattern = Pattern.compile("\\d+");
			final Matcher matcher = pattern.matcher(s);
			return matcher.matches();
		}

		/**
		 * 对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
		 * 
		 * @param s
		 * @return
		 */
		public static boolean lookingAt(String s) {
			final Pattern pattern = Pattern.compile("\\d+");
			final Matcher matcher = pattern.matcher(s);
			return matcher.lookingAt();
		}

		/**
		 * 对字符串进行匹配,匹配到的字符串可以在任何位置
		 * 
		 * @param s
		 * @return
		 */
		public static boolean find(String s) {
			final Pattern pattern = Pattern.compile("\\d+");
			final Matcher matcher = pattern.matcher(s);
			return matcher.find();
		}

	}

}
