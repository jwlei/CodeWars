package sixKyu;

import java.util.stream.IntStream;

public class MultiplesOf3or5 {
    public int solution(int number) {
        //Find all unique numbers dividable by 3 or 5
        //Add together these numbers
        return IntStream.range(0, number)
               .filter(n -> (n%3==0) || (n%5==0))
               .sum();
    }
}
/*
package SIXKyu;

public class MultiplesOf3or5 {
    public int solution(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++){
            //Find all unique numbers dividable by 3 or 5
            if (i % 3 == 0 && i % 5 == 0){
                sum += i;
                //Find all unique numbers dividable by 3 or 5
            } else if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                //Add together these numbers
            }
        }return sum;
    }
}
/*
BEST PRACTICE:
 public int solution(int number) {
    int sum=0;

    for (int i=0; i < number; i++){
      if (i%3==0 || i%5==0){sum+=i;}
    }
    return sum;
  }
  _____________________________________
    public int solution(int number) {
    return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
  }
 */
// return IntStream.range(1, n+1).filter(i -> n%i==0).count();