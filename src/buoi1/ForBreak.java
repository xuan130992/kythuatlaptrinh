package buoi1;

import java.text.BreakIterator;

public class ForBreak {

	public static void main(String[] args) {
		int i;
		for (i =1; i<100;i++) {
			if(i%3 ==0 && i%6 ==0 && i %9 ==0) {
			
			continue;
		}
			System.out.println("xuat ra gia tri i "+i);
	}

}}
