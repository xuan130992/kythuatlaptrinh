package buoi1;

public class KhaiBaoVaKhoiTao {

	public static void main(String[] args) {
		
		int[] a = {1,2,7};
		int[]c = {1,5,7,8,3,5,24,56};
		double[]b = {3.6,6,2.6,4.5};
		c[1]=2;
		
		c[3]=10+c[1]+c[4];
		
		
		System.out.println("Gia tri a"+a[1]);
		System.out.println("gia tri b"+b[3]);
		System.out.println("gia tri c[1]"+c[1]);
		System.out.println("gia tri c[3]"+c[3]);
	}
}
