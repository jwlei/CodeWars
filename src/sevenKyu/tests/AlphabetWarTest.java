package sevenKyu.tests;
import org.junit.Test;
import sevenKyu.alphabetWar;

import static org.junit.Assert.assertEquals;

public class AlphabetWarTest {
    @Test
    public void BasicTest() {
        assertEquals("Right side wins!", alphabetWar.AlphabetWar("z"));
        assertEquals("Let's fight again!", alphabetWar.AlphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", alphabetWar.AlphabetWar("zzzzs"));
        assertEquals("Left side wins!", alphabetWar.AlphabetWar("wwwwwwz"));
    }
}