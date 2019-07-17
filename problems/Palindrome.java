/*
*
    Palindrome class with many methods for checking a palindrome.
    - totalNumberPalin Checks all possible number of ways of form a palindrome --> case insentive, no order needed
    - isPosiblePalin  Checks if a word is a palindrome even if its not ordered --> case insentive, not order needed
    - isPalin classic method that checks  if a word is a palindrome --> case insentive, order needed 
    --- helper functions
    - factorial classic recursive method that returns the fact of a number
    - reversed classic method that returns a reversed array
*
*
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Palindrome {

    public static void main(String[] args){

        System.out.println(totalNumberPalin("LaolAdD"));
        System.out.println(isPalin("AnitaLavaLaTina"));
    }
    //evaluates all posible number of palins in a specified word.
    public static int totalNumberPalin(String word){
        Set<Character> diffChars  = new HashSet<>();
        char[] charArr = word.toLowerCase().toCharArray();
        int dups = 0;
        if(!isPosiblePalin((word))) return 0;

        for(char c : charArr){
            if(!diffChars.add(c)){
                dups += 1;
            }
        }

        return factorial(dups);
    }
    ///evaluates if a word could be a palin (not order needed);
    public static boolean isPosiblePalin(String word){
        char[] charArr = word.toLowerCase().toCharArray();
        Set<Character> charsSet = new HashSet<>();
        int single = 0;
        if(word.equals("")) return false; //if we want to not consider "" as palyn
        for(char c : charArr){
            if(charsSet.add(c)){
                single += 1;
            }else{
                single -= 1;
            }
        }

        return single <= 1;
    }
    //simple factorial function, needed for the total amount of palins in a word
    public static int factorial(Integer n){
        if(n == 0 || n == 1) return n;

        return n * factorial(n -1);
    }
    //function that evaluates if a certain word is a palin ()
    public static boolean isPalin(String word){
        return word.toLowerCase().equals(reversed(word));
    }


    //helper function for reverting an String
    public static String reversed(String word){
        char[] arr = word.toLowerCase().toCharArray();
        char[] result = new char[arr.length];
        for(int i = 1; i <= arr.length; i++){
            result[i-1] = arr[arr.length - i];
        }

        return new String(result);
    }

}