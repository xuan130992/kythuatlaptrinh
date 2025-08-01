package buoi1;

public class TongDieuKien {
	
	public static void main(String[] args) {
		int i=100;
		int tong = 0;
	while (i<1000) {
		if(i%3==0) {
		
			tong = tong +i;
		
		}
		i++;
	}
	System.out.println("gia tri cua tong la"+tong);
	}
	
	


}