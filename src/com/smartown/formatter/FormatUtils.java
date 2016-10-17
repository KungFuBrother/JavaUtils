package com.smartown.formatter;

public class FormatUtils {

	public final static int NUMBER_INTEGER_2 = 1;
	public final static int NUMBER_DECIMAL_2 = 2;

	public static String formatNumber(int type, Number value) {
		switch (type) {
		case NUMBER_INTEGER_2:
			return String.format("%02d", value.intValue());
		case NUMBER_DECIMAL_2:
			return String.format("%.2f", value.doubleValue());
		}
		return "";
	}

}
