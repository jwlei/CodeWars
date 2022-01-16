package sevenKyu;
/*
Your job at E-Corp is both boring and difficult. It isn't made any easier by the fact that everyone constantly wants to have a meeting with you, and that the meeting rooms are always taken!

In this kata, you will be given an array. Each value represents a meeting room. Your job? Find the first empty one and return its index (N.B. There may be more than one empty room in some test cases).

'X' --> busy
'O' --> empty
 */
public class TheOffice {
    public static Object meeting(char[] x) {
        
        for (int i = 0; i < x.length; i++){
                if (x[i] == 'O') {
                    return i;

                } else if (x[i] == 'X'){
                    continue;
                } else {
                    return "None available!";
                }
            }
        return "None available!";
    }
}

/*
BEST PRACTICE:
public class TheOffice {

  public static Object meeting(char[] x) {
    int i = new String(x).indexOf('O');
    return i < 0 ? "None available!" : i;
  }

}
________________________________________________
public class TheOffice {
  public static Object meeting(char[] x) {
    int room = new String(x).indexOf("O");
    if (room == -1) {
      return "None available!";
    }
    else {
      return room;
    }
  }
}
________________________________________________
class TheOffice {
  static Object meeting(char[] x) {
    for (int i = 0; i < x.length; i++) {
      if (x[i] == 'O') return i;
    }
    return "None available!";
  }
}______________________________________________
 */