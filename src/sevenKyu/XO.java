package sevenKyu;

import java.util.*;


public class XO {

    /*
    Count X and O in a string and see if they are equal in number
     */

    public static boolean getXO (String str) {
        String lc = str.toLowerCase();

        Map<String, Integer> map = new HashMap<>();
        map.put("x",0);
        map.put("o",0);

        for (int i = 0; i < lc.length(); i++){
            char c = lc.charAt(i);

            if (c == 'x')
                map.put("x", map.get("x")+1);

            if (c == 'o')
                map.put("o", map.get("o")+1);

        } return map.get("x")==map.get("o");
    }
}

/* Alternative solutions
 int exCount = (int) str.chars().mapToObj(c -> (char) c).filter(a -> Character.toLowerCase(a) == 'x').count();
    int ohCount = (int) str.chars().mapToObj(c -> (char) c).filter(a -> Character.toLowerCase(a) == 'o').count();
    return exCount == ohCount;
___________________________________________________________
public class XO {

  public static boolean getXO (String str) {
    str = str.toLowerCase();
    return str.replace("o","").length() == str.replace("x","").length();

  }
}
_________________________________________________________________
public class XO {
  public static boolean getXO(String str) {
    int x = 0, o = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.toUpperCase().charAt(i) == 'O') o++;
      if(str.toUpperCase().charAt(i) == 'X') x++;
    }
    return x == o;
  }
}
_____________________________________________________________________
public class XO {

  public static boolean getXO (String str) {
    int x = 0;
    int o = 0;
    for (int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      if (c == 'x' || c == 'X') {
        x++;
      }
      else if (c == 'o' || c =='O') {
        o++;
      }
    }
    return x == o;
  }
}


 */
