package test.zohointerview;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        int l = 0;

        for(int r = 0; r < nums.length; r++){
            while(!deque.isEmpty() && nums[r] > deque.getLast()){
                //System.out.println(deque.peek());
                deque.removeLast();
            }
            deque.add(nums[r]);
            if(r-l+1 == k){
                result.add(deque.getFirst());
                int temp = deque.getFirst();
                if(temp == nums[l]) {
                    deque.removeFirst();
                }l++;
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        SlidingWindowMaximum obj = new SlidingWindowMaximum();
        int k = 3;

        int[] nums = {8, 7, 6, 9, 2,3,7,4,5,1};
        System.out.println(Arrays.toString(obj.maxSlidingWindow(nums, k)));
    }
}
