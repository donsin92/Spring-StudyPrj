package main;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class PassAEST {

	public static String key = "abcefgijkmnopxyz";
	public static String target = "donsin"; 
	
	public static String encrypt(byte[] target, byte[] key){
		SecretKeySpec keySpec = null;
		
		keySpec = new SecretKeySpec(key, "AES");
		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance("AES");
		} catch (NoSuchAlgorithmException e) {
			return null;
		} catch (NoSuchPaddingException e) {
			return null;
		}
		
		try {
			cipher.init(Cipher.ENCRYPT_MODE, keySpec);
		} catch (InvalidKeyException e) {
			return null;
		}
		
		try {
			Encoder encoder = Base64.getEncoder();
			return new String(encoder.encode(cipher.doFinal(target)));
		} catch (IllegalBlockSizeException e) {
			
		} catch (BadPaddingException e) {
			
		}
		return null;
	}
	
	
	public static String decrypt(byte[] target, byte[] key){
		SecretKeySpec keySpec = null;
		
		keySpec = new SecretKeySpec(key, "AES");
		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance("AES");
		} catch (NoSuchAlgorithmException e) {
			
			return null;
		} catch (NoSuchPaddingException e) {
			return null;
		}
		
		try {
			cipher.init(Cipher.DECRYPT_MODE, keySpec);
		} catch (InvalidKeyException e) {
			
			return null;
		}
		
		try {
			Decoder encoder = Base64.getDecoder();
			return new String(cipher.doFinal(encoder.decode(target)));
		} catch (IllegalBlockSizeException e) {
			System.out.println("err");
		} catch (BadPaddingException e) {
	
		}
		return null;
	}
}
