package com.scp.selenium.seleniumBatchSeven;

import java.util.concurrent.ThreadLocalRandom;

import junit.framework.Assert;

public class AssertionDemo {
	
	public static void main(String[] args) {

		
		String yourPassword = generatePassword(1,6,10);
		/**
		 * Strength -- Low,medium,High
		 * Min -- minimum chars in password
		 * Max -- maximum chars in password
		 * 
		 * 
		 * Low -- Either number/chars
		 * Medium -- numbers+Chars
		 * High -- Number + small char+ cap + special chars
		 * 
		 * 
		 * 
		 * Low 3 8 -- abcdeefg   12345623
		 * Med --     abcd1234  Abcd1231 ABc123dwr
		 * High -- 113Ab#41
		 * 
		 * 
		 * 
		 */
		
		
	}

	private static String generatePassword(int i, int min, int max) {
		String small_chars = "abcdefghijklmnopqrstuvwxyz";//26
		String cap_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_char="!@#$%^&*()";
		String num_char="0123456789";
		
		
		String password ="";
		String strpassword ="";
		String numeric="";
		String specialChar="";
		String pwd="";
		
		for(int p=0;p<max;p++){
			int capCharIndex = ThreadLocalRandom.current().nextInt(0, 26);
			int smallCharIndex = ThreadLocalRandom.current().nextInt(0, 25 + 1);
			int specialCharIndex = ThreadLocalRandom.current().nextInt(0, 9 + 1);
			int numIndex = ThreadLocalRandom.current().nextInt(0, 9 + 1);
			
			strpassword+=cap_chars.substring(capCharIndex, capCharIndex+1)+
					small_chars.substring(smallCharIndex, smallCharIndex+1);
			numeric+=num_char.substring(numIndex, numIndex+1);
			specialChar+=special_char.substring(specialCharIndex, specialCharIndex+1);
		}
		if(i==1){
			
			pwd=numeric.substring(numeric.length()-1, numeric.length())+specialChar.substring(specialChar.length()-1, specialChar.length());
			pwd+=strpassword.substring(0,max-2);
		}else if(i==2){
			
		}else if(i==3){
			
		}else
			Assert.fail("Invalid strength");
		
//System.out.println("Password:-"+pwd);		
		return pwd;
	}

}
