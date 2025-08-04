package buoi1;

import java.awt.dnd.DragGestureRecognizer;
import java.util.Scanner;
import java.util.function.IntConsumer;

public class Cong {
	static void cong1(){
		int a ,b, tong ;
	Scanner scanner = new Scanner(System.in) ;
	System.out.println("Nhap a");
	 a = scanner.nextInt();
	 System.out.println("Nhap b");
	 b = scanner.nextInt();
	 
	 tong = a+b;
	 System.out.println("tong a+b la "+tong);
//	 return tong;
	 
	 }
	static int cong2() {
		int a ,b, tong ;
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Nhap a");
		 a = scanner.nextInt();
		 System.out.println("Nhap b");
		 b = scanner.nextInt();
		 
		 tong = a+b;
		return tong;
	}
	static int tong3(int a, int b) {
		int tong = a+b;
		return tong;
	}
	
	 

	public static void main(String[] args) {
		int k = tong3(3,5);
		
		System.out.println(" gia tri k la "+k);
		System.out.println("ket qua 8+9"+tong3(8,9));
		

	}
}


