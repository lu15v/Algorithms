import java.util.BitSet;

//find the missing number in array and print it
public class FindMissingNumber{
    
    public static void main(String... args){
        printMissings(new int[]{2, 3, 4}, 6);
    }

    //this just works if it's just missing one number
    public static void printMissing(int[] numbers, int total){
        BitSet bs = new BitSet(total);
        for(int i : numbers){
            bs.set(i -1);
        }
        System.out.println(bs.nextClearBit(0) + 1);
    }
    
    //this will print all the missing numbers in the array given a range (assumming 0 to total)
    public static void printMissings(int[] numbers, int total){
        BitSet bs = new BitSet(numbers.length);
        for(int i : numbers){
            bs.set(i -1);
        }
        int diff = total - numbers.length;
        for(int i = 0; i < diff; i++ ){
            int missing = bs.nextClearBit(0);
            System.out.println(missing + 1);
            bs.set(missing);
        }
        
    }

}