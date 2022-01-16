package sevenKyu;
/*
Write a function named repeater() that takes two arguments (a string and a number), and returns a new string where the input string is repeated that many times.
Example: (Input1, Input2 --> Output)

"a", 5 --> "aaaaa"

 */
public class Repeater {
    public static String repeat(String string,long n){
        StringBuilder s = new StringBuilder();

        for (long i = 0; i < n; i++){
            s.append(string);
        } return s.toString();
    }
}
/*
  BEST PRACTICE:
  public static String repeat(String string, long n) {
    return string.repeat((int)n);
  }
 */