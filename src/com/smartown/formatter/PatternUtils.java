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
		 * �������ַ�������ƥ��,ֻ�������ַ�����ƥ���˲ŷ���true
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
		 * ��ǰ����ַ�������ƥ��,ֻ��ƥ�䵽���ַ�������ǰ��ŷ���true
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
		 * ���ַ�������ƥ��,ƥ�䵽���ַ����������κ�λ��
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
