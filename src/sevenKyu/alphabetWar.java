package sevenKyu;
/*
There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.
Task

Write a function that accepts fight string consists of only small letters and return who wins the fight. When the left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.
 */
public class alphabetWar {
    public static String AlphabetWar(String fight){
        String str = fight.toLowerCase();

        int l = str.length();
        char arr[] = str.toCharArray();
        int leftPoints = 0;
        int rightPoints = 0;



        for (int i = 0; i < l; i++){
            if (arr[i] == 'w') leftPoints = leftPoints+4;
            if (arr[i] == 'p') leftPoints = leftPoints+3;
            if (arr[i] == 'b') leftPoints = leftPoints+2;
            if (arr[i] == 's') leftPoints = leftPoints+1;

            if (arr[i] == 'm') rightPoints = rightPoints+4;
            if (arr[i] == 'q') rightPoints = rightPoints+3;
            if (arr[i] == 'd') rightPoints = rightPoints+2;
            if (arr[i] == 'z') rightPoints = rightPoints+1;
        }
        String leftW = "Left side wins!";
        String rightW = "Right side wins!";
        String draw = "Let's fight again!";

        if (leftPoints > rightPoints){
            return leftW;
        } else if (leftPoints < rightPoints){
            return rightW;
        } else return draw;
    }
}

/*
BEST PRACTICE:
SWITCH --
 public static String alphabetWar(String fight){
      int right = 0, left = 0;
      for (char c : fight.toCharArray()) {
        switch (c) {
          case 'w' : left += 4; break;
          case 'p' : left += 3; break;
          case 'b' : left += 2; break;
          case 's' : left += 1; break;

          case 'm' : right += 4; break;
          case 'q' : right += 3; break;
          case 'd' : right += 2; break;
          case 'z' : right += 1; break;
        }
      }
      if (left == right) return "Let's fight again!";
      return (left > right ? "Left" : "Right") + " side wins!";
    }
 ______________________________________________________________________________________________

 */