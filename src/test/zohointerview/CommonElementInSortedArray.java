package test.zohointerview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElementInSortedArray {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> firstArr = new ArrayList<Integer>();
		ArrayList<Integer> secondArr = new ArrayList<Integer>();
		ArrayList<Integer> thirdArr = new ArrayList<Integer>();
		
		// N1 Inputs
		System.out.println("First Array : N1 : ");
		int temp = 0;
		do {
			temp = scan.nextInt();
			firstArr.add(temp);
		}while(temp != -1);
		
		// N2 Inputs 
		System.out.println("Second Array : N2 : ");
		temp = 0;
		do {
			temp = scan.nextInt();
			secondArr.add(temp);
		}while(temp != -1);
		
		//N3 Inputs
		System.out.println("Third Array : N3 : ");
		temp = 0;
		do {
			temp = scan.nextInt();
			thirdArr.add(temp);
		}while(temp != -1);

		// First array N1 and array N2 check which elements are Intersect
		int j = 0;
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		for(int i = 0; i < firstArr.size(); ) {
			if(firstArr.get(i) < secondArr.get(j)) {
				i++;
			}else if(firstArr.get(i) == secondArr.get(j)) {
				tempArr.add(firstArr.get(i));
				i++;
				j++;
			}else {
				j++;
			}
		}
		
		
		// Now check with temparr and N3 which are intersect and return the result
		j = 0;
		//Set<Integer> result = new HashSet<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < tempArr.size();) {
			if(tempArr.get(i) > thirdArr.get(j)) {
				j++;
			}else if (tempArr.get(i) == thirdArr.get(j)) {
				result.add(tempArr.get(i));
				i++;
				j++;
			}else i++;
		}
		
		if(result.get(result.size() - 1) == -1) result.remove(result.size() - 1);
		Set<Integer> results = new HashSet<Integer>(result);
		System.out.println(results);
		
		scan.close();
	}
	
	/*
	 * 1 5 10 20 40 80 -1
	 * 6 7 20 80 100 -1
	 * 3 4 15 20 30 70 80 120 -1
	 * 
	 * 20 80 80 90 -1
	 * 10 20 60 80 90 -1
	 * 20 60 80 90 -1
	 */
}
