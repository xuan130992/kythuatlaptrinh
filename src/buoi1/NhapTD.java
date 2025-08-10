package buoi1;

import java.security.SecureRandom;
import java.sql.Time;

public class NhapTD {
	public static int [] NhapTD(int n) {
		SecureRandom srd = new SecureRandom();
		
		int a[]= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]= srd.nextInt(8);
		}
		
		return a ;
		
	}
	static boolean tim(int a[],int n, int value) {
		for(int i=0; i<n;i++) {
			if(a[i]==value) {
				return true;
			}
			
		}
		return false;
		
	}
	

	public static void main(String[] args) {
		SecureRandom srd = new SecureRandom();
	
		int n= srd.nextInt(5);
		int a[] =NhapTD(n);
		NhapTD(0);
		NhapGiaTriPhanTu.xuat(a, n);
		boolean b = tim(a,n,3);
		System.out.println("ket qua tim"+b);
		System.out.println("ket qua tim"+tim(a, n, 4));

	}

}
