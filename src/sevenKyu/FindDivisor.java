package sevenKyu;

public class FindDivisor {
    public long numberOfDivisors(int n) {
        int roof = 500001;
        int count = 0;

        for (int i = 1; i < roof; i++ ){
            if (n % i == 0) count++;
        } return count;
    }
}
/*
BEST PRACTICE:
  public long numberOfDivisors(int n) {
      long counter = 0;
      for(int i=1; i<=n; i++){
          if(n % i == 0){
          counter++;
          }
      }
      return counter;
  }
  ________________________________________________
public class FindDivisor {
  public long numberOfDivisors(int n) {
    return IntStream.range(1, n+1).filter(i -> n%i==0).count();
  }
 */