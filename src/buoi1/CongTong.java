package buoi1;

import java.util.Scanner;

public class CongTong {

	static void cong1() {
		int a,b, tong;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a");
		a= scanner.nextInt();
		System.out.println("Nhap b");
		b = scanner.nextInt();
		tong = a+b;
		System.out.println("gia tri cua tong la "+tong);
	}
	static int cong2() {
		int a,b, tong;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a");
		a= scanner.nextInt();
		System.out.println("Nhap b");
		b = scanner.nextInt();
		tong = a+b;
		return tong;
		
	}
	static int cong3(int a, int b) {
		int tong = a+b;
		return tong;
	}
	
	public static void main(String[] args) {
		int k = cong3(1,3);
		 int x=6;
		 int y =7;
		 k=cong3(x,y);
				 
		System.out.println("gia tri tong la "+k);
		System.out.println("gia tri tong la "+cong3(3,5));
		System.out.println("k="+k);
		

	
	}
}
