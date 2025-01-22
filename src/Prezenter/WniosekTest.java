package Prezenter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WniosekTest {
    private Wniosek wniosek;
    @BeforeEach
    void setUp() {
        wniosek = new Wniosek() {
        };
    }

    @Test
    void testSetKeyAndGetKey() {
        wniosek.setkey("key1", "value1");
        assertEquals("value1", wniosek.getkey("key1") );
    }

    @Test
    void testGetKeyNotExisting() {
        assertNull(wniosek.getkey("nieklucz"));
    }

    @Test
    void testGetKeys() {
        wniosek.setkey("key1", "value1");
        wniosek.setkey("key2", "value2");
        String[] keys = wniosek.getkeys();
        assertEquals(2, keys.length);
        assertTrue(Arrays.asList(keys).contains("key1"));
        assertTrue(Arrays.asList(keys).contains("key2"));
    }

    @Test
    void testToString() {
        wniosek.setkey("key1", "value1");
        String expectedOutput = "Wniosek{data={key1=value1}}";
        assertEquals(expectedOutput, wniosek.toString());
    }
}