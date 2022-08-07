package test.zohointerview;

import java.util.Scanner;

public class FindWord {

    public int wordFind(String word, String subWord){

        int j = 0, l = 0;

        for(int i = 0; i < word.length(); ){
            if(j < subWord.length()) {
                if (word.charAt(i) != subWord.charAt(j) && j == 0) i++;
                else if (word.charAt(i) == subWord.charAt(j)) {
                    l = i;
                    j++;
                    i++;
                } else {
                    j = 0;
                }
            }else{
                return l - (subWord.length() - 1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FindWord obj = new FindWord();

        System.out.println("Enter the word : ");
        String word = scan.nextLine();


        System.out.println("Enter the word to be find in String : ");
        String subWord = scan.nextLine();

        System.out.println(obj.wordFind(word,subWord));

    }
}
