package buoi1;

import java.util.Scanner;

public class NhapSoNguyenDuong {

	public static void main(String[] args) {
		int n =0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhap n di");
			n = scanner.nextInt();
			
		}
		while( n <= 0); 
			System.out.println("gia tri n"+n);
			
		
		
	}

}
