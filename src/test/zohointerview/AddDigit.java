package test.zohointerview;
import java.util.Arrays;
import java.util.Scanner;

public class AddDigit {
	
	public int[] Plusone(int[] digit) {
		int n = digit.length;
		int carry = 0;
		for(int i = n-1; i >= 0; i--) {
			if(digit[i] < 9) {
				digit[i]++;
				carry = 0;
				return digit;
			}
			digit[i] = 0;
			carry = 1;
		}
		if(carry == 1) {
			digit = Arrays.copyOf(digit, n+1);
			digit[0] = 1;
		}
		return digit;
	}
	
	public static void main(String args[]) {
		AddDigit add = new AddDigit();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		String digStr = scan.nextLine();
		int[] digit = new int[digStr.length()]; 
		for(int i = 0; i < digStr.length(); i++) {
			digit[i] = digStr.charAt(i) - '0';
		}
		
		System.out.println(Arrays.toString(add.Plusone(digit)));
		scan.close();
	}
}