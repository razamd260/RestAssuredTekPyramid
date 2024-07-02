package com.ninza.hrm.api.genericutility;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncrypAndDecryptUtility {

	public String encrypt(String input, String secretKey) throws Exception {
	     
		SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(),"AES");
		       IvParameterSpec ivps = new IvParameterSpec("4234567890123456".getBytes());
		       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		       cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivps);
		       byte[] encryptedText = cipher.doFinal(input.getBytes());
		       return Base64.getEncoder().encodeToString(encryptedText);

		   }


		public String decrypt(String input, String secretKey) throws Exception {
		       
		SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(),"AES");
		       IvParameterSpec ivps = new IvParameterSpec("4234567890123456".getBytes());
		       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		       cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivps);
		       byte[] decryptedText = cipher.doFinal(Base64.getDecoder().decode(input));
		       return new String(decryptedText);


		   }
}
