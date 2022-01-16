package sevenKyu;

import java.util.Arrays;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)


 */

public class isogram {
    public static boolean isIsogram(String str){
        str = str.toLowerCase();
        int length = str.length();

        // Create array of string
        char array[] = str.toCharArray();
        // Sort the array
        Arrays.sort(array);

        // Iterate over the array
        for (int i = 0; i < length-1; i++){

            //if index equals the next index, the string is not an isogram
            if (array[i] == array[i+1]) {
                return false;
            }
        } return true;

/*
        BEST PRACTICE:
        return str.length() == str.toLowerCase().chars().distinct().count();
        _______________________________________________________________________________________
                return str.toLowerCase()
                  .chars()
                  .distinct()
                  .count() == str.length();
        ____________________________________________________________________________________
        return str.length()
                == 0 ? true : str.length()
                == new HashSet<>(Arrays.asList(str.toLowerCase().split(""))).size();
        ____________________________________________________________
        return str.length() == 0 ? true : str.length() == new HashSet<>(Arrays.asList(str.toLowerCase().split(""))).size();
        ____________________________________________________________

        boolean b = false;
        int count = 0;
        String lstr = str.toLowerCase();

        char[] ch = new char[lstr.length()];

        for (int i = 0; i < lstr.length(); i++){
            ch[i] = lstr.charAt(i);
        }

        Arrays.sort(ch);
        int previous = ch[0]-1;
        if (previous >= 0) return true;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == previous){
                count++;
            } else previous = ch[i];
        }

        if (count == 0) b = true;
        if (count < 0) b = false;
        if ("".equals(str)) b = true;


        return b;
*/
    }

}
