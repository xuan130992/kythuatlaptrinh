package buoi1;
 

public class TongHieu {
	static int tinh(int a, int b , InReft h) {
		h.value = a-b;
		return a+b;
	}

	public static void main(String[] args) {
		int x=2, y=9, tong;
		InReft hieu = new InReft();
		tong = tinh(x,y,hieu);
System.out.println("tong = "+tong);
System.out.println("hieu=" +hieu.value);
	}

}
