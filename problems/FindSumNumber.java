/*
*
Find the sum of a specific number (sumNumber) in an arrayList (arr) as input.
*
*
*
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindSumNumber{

    public static void main(String[] args){
      ArrayList<Integer> arr = new ArrayList<>();
      //first case,
      arr.add(2);
      arr.add(1);
      arr.add(4);
      arr.add(3);
      arr.add(3);
      arr.add(4);
      System.out.println(findSumNumber(arr, 8));
      arr.clear();
      //second case, 0 is considered.
      arr.add(0);
      arr.add(4);
      arr.add(3);
      arr.add(8);
      arr.add(1);
      arr.add(7);
      System.out.println(findSumNumber(arr, 8));
      arr.clear();
      //third case, negative numbers considered.
      arr.add(12);
      arr.add(0);
      arr.add(3);
      arr.add(6);
      arr.add(5);
      arr.add(-4);
      System.out.println(findSumNumber(arr, 8));
      arr.clear();
      //there is not sum found.
      arr.add(12);
      arr.add(0);
      arr.add(1);
      arr.add(6);
      arr.add(5);
      arr.add(4);
      System.out.println(findSumNumber(arr, 8));
    }


    public static boolean findSumNumber(ArrayList<Integer> arr, int sumNumber){
        HashSet<Integer> complements = new HashSet<>();
        int a = 0;
        int b = arr.size();
        //Collections.sort(arr); not longer needed, since adds n*log(n) complexity.

        while(a < b){
            if(complements.contains(arr.get(a))){
                return true;
            }else{
                complements.add(sumNumber - arr.get(a));
                a += 1;
            }
            
        }

        return false;
    }
}

