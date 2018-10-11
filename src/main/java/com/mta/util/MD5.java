package com.mta.util;

import java.security.MessageDigest;

import org.apache.log4j.Logger;

public class MD5 {
	private static final transient Logger logger = Logger.getLogger(MD5.class);
	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	/**
	 * 转换字节数组为16进制字串
	 * 
	 * @param b
	 *            字节数组
	 * @return 16进制字串
	 */
	public static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}
	/**
	 * MD5加密
	 * @param paramStr
	 * @return
	 */
	public static String MD5Encode(String paramStr) {
		String resultString = paramStr;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(resultString
					.getBytes()));
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("MD5加密失败" + ex.getMessage());
		}
		return resultString;
	}
	public static void main(String[] args) {
		String password = "123456";
		System.out.println(MD5Encode(password));
	}
}
