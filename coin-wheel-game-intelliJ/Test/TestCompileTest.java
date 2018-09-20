import org.junit.Test;

import static org.junit.Assert.*;

public class TestCompileTest {

    @Test
    public void testMethod() {
        TestCompile tc = new TestCompile();
        assertEquals(tc.TestMethod(), 0);
    }
}