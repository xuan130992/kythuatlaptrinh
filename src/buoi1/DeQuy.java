package buoi1;

public class DeQuy {
	
	static void inSo(int n) {
		System.out.println("Gia tri n "+n);
		
		if(n==10)
			return;
		
		inSo(n+1);
		
	}

	public static void main(String[] args) {
	inSo(1);
	}

}
