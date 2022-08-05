package test.zohointerview;

import java.util.HashMap;
import java.util.Scanner;

public class EquilibriumPoint {
	
	public void PointFinder(int[] arr) {
		HashMap<Integer, Integer> sumRes = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> positionMapper = new HashMap<Integer, Integer>();
		
		int count = 1;
		for(int i = 0; i < arr.length - 1; i++) {
			
			// Store result in sumRes set
			int sum = arr[i] + arr[i+1];
			
			positionMapper.put(sum, i);
			
			// This section is Increase the value count
			if(sumRes.containsKey(sum)) {
				count = sumRes.get(sum) + 1;
				sumRes.put(arr[i]+arr[i+1], count);
			}else {
				sumRes.put(arr[i]+arr[i+1], 1);
			}
		}
		
		for(int key : sumRes.keySet()) {
			if(sumRes.get(key) == 2) {
				if(arr.length % 2 == 0) System.out.println(positionMapper.get(key) - 1);
				else System.out.println(positionMapper.get(key));
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EquilibriumPoint obj = new EquilibriumPoint();
		
		System.out.println("Enter the Array Size : ");
		int N = scan.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		obj.PointFinder(arr);
		scan.close();

	}

}
