package sixKyu;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findOdd {
    public static int findIt(int[] a){

        Map<Integer, Long> appearance = IntStream.of(a).boxed()
                .collect(
                        Collectors.groupingBy(Function.identity(),
                        Collectors.counting())
                        );

        return appearance.entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

    }
}

/*
BEST PRACTICE:
public class FindOdd {
  public static int findIt(int[] A) {
    int xor = 0;
    for (int i = 0; i < A.length; i++) {
      xor ^= A[i];
    }
    return xor;
  }
 _________________________________________________________
 import static java.util.Arrays.stream;

public class FindOdd {
  public static int findIt(int[] arr) {
    return stream(arr).reduce(0, (x, y) -> x ^ y);
  }
}
_________________________________________________________
import java.util.HashMap;
import java.util.Map;

public class FindOdd {
  public static int findIt(int[] a) {
    Map<Integer, Integer> counts = new HashMap<>(a.length);
    for(int i : a) {
      if(!counts.containsKey(i)) counts.put(i, 1);
      else counts.put(i, counts.get(i) + 1);
    }
    for(Map.Entry<Integer, Integer> entry : counts.entrySet()) if(entry.getValue() % 2 == 1) return entry.getKey();
    return 0;
  }
}
 */
