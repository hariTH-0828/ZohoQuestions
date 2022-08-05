package test.zohointerview;

import java.util.Scanner;

public class CheckNumberValid {
	
	public void validation(String number) {
		int decimal = 0;
		for(int i = 0; i < number.length(); i++) {
			if(number.charAt(i) == '.') {
				if(i != number.length() - 1 && number.charAt(i+1) >= 48) {
					decimal++;
				}else decimal = 2;
			}	
		}
		if(decimal <= 1) {
			System.out.println("VALID");
		}else System.out.println("INVALID");
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		CheckNumberValid obj = new CheckNumberValid();
		int testcase;
		String number;
		
		System.out.println("Number of testcase : ");
		testcase = scan.nextInt();
		
		while(testcase > 0) {
			number = scan.next();
			obj.validation(number);
			testcase--;
		}
		scan.close();
	}
}
