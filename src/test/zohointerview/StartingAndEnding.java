package test.zohointerview;

import java.util.Scanner;
import java.util.Stack;

public class StartingAndEnding {

    public String StartingEnding(int[] array, int number){

        Stack<Integer> position = new Stack<>();
        for(int i = 0; i < array.length; i++){
            if(number == array[i]) position.push(i);
        }

        if(position.isEmpty()){
            return -1+" "+-1;
        }else{
            return position.elementAt(0)+"  "+position.peek();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StartingAndEnding obj = new StartingAndEnding();

        System.out.println("Enter the size of Array : ");
        int size = scan.nextInt();

        System.out.println("Enter the number to be find : ");
        int num = scan.nextInt();

        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        System.out.println(obj.StartingEnding(array, num));
    }
}
