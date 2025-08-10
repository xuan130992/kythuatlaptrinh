package buoi1;

import java.security.SecureRandom;
import java.sql.Time;


public class Rand {

	public static void main(String[] args) {
		SecureRandom srd = new SecureRandom();
		int x= srd.nextInt(31)+70;
		System.out.println("gia tri random la "+x);
		System.out.println( "gia tri string la "+srd);

	}}


		

