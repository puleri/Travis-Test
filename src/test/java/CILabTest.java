import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        // Test with all capitals: "USA"
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest2() {
        // Test with all lowercase: "leetcode"
        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        // Test with only the first letter capital: "Google"
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4() {
        // Test with lowercase and uppercase letters: "OpenAI"
        myString.setString("OpenAI");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest5() {
        // Test with an empty string
        myString.setString("");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest6() {
        // Test with a null string
        myString.setString(null);
        assertTrue(myString.detectCapitalUse());
    }
}
