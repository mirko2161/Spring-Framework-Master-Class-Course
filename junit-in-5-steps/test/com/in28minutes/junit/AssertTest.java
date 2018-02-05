package com.in28minutes.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class AssertTest {

    @Test
    void test() {
        // various assert methods
        boolean condition = true;
        assertEquals(1, 1);
        assertTrue(condition);
        assertNotNull(new Object());
        assertArrayEquals(new int[] { 0 }, new int[] { 0 });
    }

}
