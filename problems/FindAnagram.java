import java.util.Arrays;
//finding  the word in a big string and the anamagrams in it, also the program can find the anagram nested in a word.
//the algorithm prints the starting and the ending index of the anagram found.
public class FindAnagram
{
 
  
  public static void main(String[] args)
  {
    String word = "laoh";
    String wholeUni = "hola ola loah ooooollllaaahhh ooooola  holaaaaa oooolahhhh aollh abcdgeaohoaldfdojd";
    findPattern(word, wholeUni);
 
  }
  public static void findPattern(String word, String wholeString){
     
       if(!word.isEmpty()){
           char[] seq = wholeString.toCharArray();
           String copy =new String(word);
           int total = word.length();
           char tmpC = Character.MIN_VALUE;
           for(int i = 0; i < seq.length; i++){
               if(copy.length() >= 0){
                    int idx = copy.indexOf(seq[i]);
                    int idxr = word.indexOf(seq[i]);
                   if(idx >= 0 ){
                       total--;
                       copy = copy.substring(0, idx) + copy.substring(idx + 1);
                   }else if(idx < 0 && idxr >= 0 && copy.length() == word.length() -1){
                       continue;
                   }else if(idxr >=0 && idx < 0  && word.indexOf(tmpC) >= 0 && tmpC != seq[i]) {
                      total = word.length();
                      copy = word.substring(0, idxr) + word.substring(idxr + 1);
                      copy = copy.substring(0, copy.indexOf(tmpC)) + copy.substring(copy.indexOf(tmpC) + 1);
                      total = copy.length();
                   }
                   else{
                       total = word.length();
                       copy = word;
                   }
                   tmpC = seq[i];
               }
               if(total == 0){
                   System.out.println("Pattern found in: "  +( i - (word.length() -1))  + "-" + i );
               }
               
           }
       }
  }
 
 
 
   public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
 
}