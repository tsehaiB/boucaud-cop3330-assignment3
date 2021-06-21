/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex41;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class outputFileTest {

    @Test
    void constructWriter_returns_new_writer_given_valid_file() throws IOException {
        //given
        outputFile writer = new outputFile();
        //when
        File output = new File("src/main/java/ex41/exercise42_output.txt");
        FileWriter expected = new FileWriter(output);
        FileWriter actual = writer.constructWriter();
        //then
        assertEquals(expected.getEncoding(), actual.getEncoding());
    }
}