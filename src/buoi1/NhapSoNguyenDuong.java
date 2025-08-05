package buoi1;

import java.util.Scanner;

public class NhapSoNguyenDuong {
	

	static int KiemTraNguyenDuong(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhap n di");
			n= scanner.nextInt();
		}
		
		while(n<=0);
		System.out.println("gia tri n la"+n);
		return n;
	}
	public static void main(String[] args) {
//		int a= KiemTraNguyenDuong(args);
//		int b =KiemTraNguyenDuong(args);
//		int c =KiemTraNguyenDuong(args);
		System.out.println("gia tri a"+ KiemTraNguyenDuong(args));
		System.out.println("gia tri b"+ KiemTraNguyenDuong(args));
	}

}
