/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patorka.hello;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mariu
 */
public class MessageFormatterTest {
    
    public MessageFormatterTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
   
    /**
     * Test of format method, of class MessageFormatter.
     */
    @org.junit.jupiter.api.Test
    public void testFormat_oneWord_wordExtended() {
        System.out.println("testFormat_oneWord_wordExtended");
        MessageFormatter mf = new MessageFormatter();
        assertEquals("abc!", mf.format("abc"));
    }
    /**
     * Test of format method, of class MessageFormatter.
     */
    @org.junit.jupiter.api.Test
    public void testFormat_emptyString_exclamationMark() {
        System.out.println("testFormat_emptyString_exclamationMark");
        MessageFormatter mf = new MessageFormatter();
        assertEquals("!", mf.format(""));
    }
}
