package Selenium;

import org.apache.xmlbeans.impl.util.Base64;

public class DecodeAndEncode {
public static void main(String[] args) {
	
	String str="A12345";
	
	byte[] b=Base64.encode(str.getBytes());
	System.out.println("Encoded String=  "+b);
	
	byte[] c=Base64.decode(b);
	System.out.println("Decoded string=   "+new String(c));
}
}
