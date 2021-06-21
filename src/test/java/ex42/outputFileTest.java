/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex42;

import ex41.outputFile;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class outputFileTest {

    @Test
    void constructWriter_returns_new_writer_given_valid_file() throws IOException {
        //given
        outFile writer = new outFile();
        //when
        File output = new File("src/main/java/ex42/exercise42_output.txt");
        FileWriter expected = new FileWriter(output);
        FileWriter actual = writer.constructWriter();
        //then
        assertEquals(expected.getEncoding(), actual.getEncoding());
    }
}