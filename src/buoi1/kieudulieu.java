package buoi1;



public class kieudulieu {

	public static void main(String[] args) {
		int a =5;
		int b =9;
		int c;
		int dtb =1, drl=4;
		//a= a+2;
		//a+=2;
		++b;
		a =b++;
		c=a+3;
		System.out.println( "gia tri cua c " + c);
		System.out.println("Gias tri cua a"+a);
		int x =35,y;
		x++;
		y= ++x;
		
		System.out.println("gia tri cua x" +x);
		System.out.println("Gia tric cua b"+b);
		System.out.println("Gia tri cua y"+y);
		
	boolean dk1=	dtb>=5;
	boolean dk2= drl>6;
	System.out.println("Dieu kien 1" +dk1);
	System.out.println("Dieu kien 2"+dk2);
	boolean totnghiep = (dk1 && dk2);
	System.out.println("ban co tot nghiep ko"+totnghiep);
	}

}
