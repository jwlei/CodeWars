package sevenKyu.tests;
import sevenKyu.Capitalization;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
public class CapitalizationTest {

        @Test
        public void basicTests(){
            assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, Capitalization.capitalize("abcdef"));
            assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, Capitalization.capitalize("codewars"));
            assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, Capitalization.capitalize("abracadabra"));
            assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, Capitalization.capitalize("codewarriors"));
        }
    }

