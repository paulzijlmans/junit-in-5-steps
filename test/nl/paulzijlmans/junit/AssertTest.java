package nl.paulzijlmans.junit;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class AssertTest {

    @Test
    public void test() {
        boolean condition = true;
        assertEquals(true,condition);
        assertTrue(condition);
        assertFalse(!condition);
//        assertNotNull();
//        assertNull();
//        assertArrayEquals();
    }
}
