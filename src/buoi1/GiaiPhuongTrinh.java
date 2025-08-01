package buoi1;

public class GiaiPhuongTrinh {

	public static void main(String[] args) {
		int a ,b ;
		
		
		a=3;
		b=5;
		if(a==0 && b==0) {
			System.out.println("Phuong trinh vo so nghiem");
		}
		else if (a==0 && b!=0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		else  {
			System.out.println("x ="+(-b/(double)a));
		}
		
	}

}
