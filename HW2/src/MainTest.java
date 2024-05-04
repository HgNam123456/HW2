import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testBlowup() {
        String str1 = "a3tx2z";
        assertEquals("attttxzzz", Main.blowup(str1));
    }
    public void testMaxRun() {
        // Test case 1: chuỗi "xxyyyz"
        String str1 = "xxyyyz";
        assertEquals(3, Main.maxRun(str1));
    }

    public void testStringIntersect() {
        // Test case 1: Hai xâu có xâu con chung độ dài 4
        String a1 = "abcdef";
        String b1 = "bcdefg";
        int len1 = 4;
        assertTrue(Main.stringIntersect(a1, b1, len1));
    }

}