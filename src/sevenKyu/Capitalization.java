package sevenKyu;

public class Capitalization {
    public static String[] capitalize(String s){
        String str = s.toUpperCase();
        char[] even = new char[s.length()], odd = new char[s.length()];
        char[] c = str.toCharArray();


        //even TO UPPER CASE
        for (int i = 0; i < str.length(); i++){
            if(i%2 == 0){
                even[i] = Character.toUpperCase(c[i]);
            } else {
                even[i] = Character.toLowerCase(c[i]);
            }

        }

        //odd TO UPPER CASE
        for (int i = 0; i < str.length(); i++){
            if(i%2 == 0){
                odd[i] = Character.toLowerCase(c[i]);
            } else {
                odd[i] = Character.toUpperCase(c[i]);
            }
        }

        String even1 = String.valueOf(even);
        String odd1 = String.valueOf(odd);
        String[] ans = new String[] {even1, odd1};

        return ans;
    }
}
/*
BEST PRACATICE:
import java.util.stream.IntStream
class Solution{
    public static String[] capitalize(String s){
        StringBuilder sb1 = new StringBuilder(s),
                      sb2 = new StringBuilder(s.toUpperCase());
        IntStream.range(0, s.length())
                 .filter(  i -> (i&1)==0 )
                 .forEach( i -> { sb1.setCharAt(i, sb2.charAt(i));
                                  sb2.setCharAt(i, s.charAt(i)); });
        return new String[] {sb1.toString(), sb2.toString()};
    }
}
_______________________________________________________________________________
class Solution{
    public static String[] capitalize(String s){

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            String letter = s.substring(i, i+1);

            if (i % 2 == 1) {
                // Even
                builder1.append(letter.toUpperCase());
                builder2.append(letter);
            } else {
                // Odd
                builder1.append(letter);
                builder2.append(letter.toUpperCase());
            }
        }
        return new String[] { builder2.toString(), builder1.toString()};
    }
 */