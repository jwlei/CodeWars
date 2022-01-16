package sixKyu.tests;
import sixKyu.MultiplesOf3or5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesOf3or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3or5().solution(10));
    }
}
