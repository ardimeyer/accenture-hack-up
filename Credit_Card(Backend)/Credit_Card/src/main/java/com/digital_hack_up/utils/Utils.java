package com.digital_hack_up.utils;

public class Utils {
	public static String getEducation(String param) {
		String str = "";
		switch (param) {
		case "1":
			str = "graduate school";
			break;
		case "2":
			str = "university";
			break;
		case "3":
			str = "high school";
			break;
		case "4":
			str = "others";
			break;
		case "5":
			str = "unknown";
			break;
		case "6":
			str = "unknown";
			break;
		default:
			str = "unknown";
			break;
		}
		return str;
	}
	
	public static String getSex(String param) {
		String str = "";
		switch (param) {
		case "1":
			str = "male";
			break;
		case "2":
			str = "female";
			break;
		default:
			str = "other";
			break;
		}
		return str;
	}
	
	public static String getMarriage(String param) {
		String str = "";
		switch (param) {
		case "1":
			str = "married";
			break;
		case "2":
			str = "single";
			break;
		case "3":
			str = "others";
			break;
		default:
			str = "unknown";
			break;
		}
		return str;
	}
	public static String getPay(String param) {
		String str = "";
		switch (param) {
		case "-2":
			str = "pay duly";
			break;
		case "-1":
			str = "pay duly";
			break;
		case "0":
			str = "No Payment Delay";
			break;
		case "1":
			str = "payment delay for one month";
			break;
		case "2":
			str = "payment delay for two month";
			break;
		case "3":
			str = "payment delay for three month";
			break;
		case "4":
			str = "payment delay for four month";
			break;
		case "5":
			str = "payment delay for five month";
			break;
		case "6":
			str = "payment delay for six month";
			break;
		case "7":
			str = "payment delay for seven month";
			break;
		case "8":
			str = "payment delay for eight month";
			break;
		case "9":
			str = "payment delay for nine month";
			break;
		default:
			str = "unknown";
			break;
		}
		return str;
	}
	
	public static String getDefaultAmount(String param) {
		String str = "";
		switch (param) {
		case "1":
			str = "Yes";
			break;
		case "0":
			str = "No";
			break;
		default:
			str = "other";
			break;
		}
		return str;
	}
	
}
