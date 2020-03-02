package com.NVDabbewala.rest.webservices.restfulwebservices.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordProtect {

//	To make password more secure
	private static final String mySecretKeyWord = "NVDabbewala";
//	private static byte[] salt = null;

	public static String encryptPassword(String password) throws NoSuchAlgorithmException {

		StringBuilder sb = new StringBuilder();
		String generatedPassword = mySecretKeyWord + password;

		MessageDigest md = MessageDigest.getInstance("SHA-1");

		char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

		byte[] hashedBytes = md.digest(generatedPassword.getBytes());

		for (int i = 0; i < hashedBytes.length; i++) {
			byte b = hashedBytes[i];
			sb.append(digits[(b & 0xf0) >> 4]);
			sb.append(digits[b & 0x0f]);
		}
//		md.update(salt);
//		generatedPassword = md.digest((password + mySecretKeyWord).getBytes()).toString();
		generatedPassword=sb.toString();
		System.out.println("Converted password is " + generatedPassword);
		return generatedPassword;
	}

}
