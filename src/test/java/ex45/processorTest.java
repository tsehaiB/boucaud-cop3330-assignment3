/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex45;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class processorTest {
    @Test
    void processAll_returns_processed_output_as_string() {//also tests the other two methods by calling them
        //given
        processor process = new processor();
        //when
        ArrayList<String> unprocessed = new ArrayList<>();
        unprocessed.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        unprocessed.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        unprocessed.add("utilizes an IDE to write her Java programs\".");
        String expected = """
                One should never use the word "use" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                uses an IDE to write her Java programs".
                """;
        String actual = process.processAll(unprocessed);
        assertEquals(expected, actual);
    }
}