package buoi1;

import java.util.Scanner;


public class NhapGiaTriPhanTu {
	
	
	public static int[] Nhap(int n) {
	Scanner scanner = new Scanner(System.in);
	int a[]=new int[n];
	
	for (int i=0;i< n;i++) {
		System.out.println("Nhâp i [ "+i+"]");
		 a[i] = scanner.nextInt();
	}
	return a;
	
}
	
	static void xuat(int arr[],int n) {
		
		for(int i=0;i < n;i++) {
			System.out.print(arr[i]+" ");
	}
		}

	public static void main(String[] args) {
		int n=0;
		int m=0;
		
		Scanner scanner = new Scanner(System.in);
		System.err.println("nhap n đi");
		
		 n = scanner.nextInt();
		 int a[] =Nhap(n);
		 
		 xuat(a, n);
		 
		 System.out.println("Nhap m di");
		 m =scanner.nextInt();
		 int b[]=Nhap(m);
	
		 xuat(b,m);

	}

}
