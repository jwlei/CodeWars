package sevenKyu;
/*
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.

 */

public class Troll {
    public static String disemvowel (String str) {
        return str.replaceAll("(?i)[aeiouAEIOU]" , "");
/*
        StringBuilder sb = new StringBuilder(str);

       int length = str.length();
       String newStr = "";
       int newLength = newStr.length();

       for (int i = 0; i < length; i++) {
           char c = str.charAt(i);
           if (c == 'a' || c == 'A' ||
               c == 'e' || c == 'E' ||
               c == 'i' || c == 'I' ||
               c == 'o' || c == 'O' ||
               c == 'u' || c == 'U') {
               sb.deleteCharAt(i);
            }
        }return str;
*/
    }


}

/*
Alternative solutions:
Stream/collectors
import java.util.stream.Collectors;
public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        String vowels = "aeiouAEIOU";
        return str.chars().filter(c -> vowels.indexOf(c) == -1).mapToObj(c->""+(char)c).collect(Collectors.joining(""));
    }
}

// clever
return str.replaceAll("(?i)[aeiou]" , "");
________________________________________________________________________________
 */
