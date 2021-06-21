/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex45;

import ex41.outputFile;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class outputFileTest {

    @Test
    void constructWriter_returns_new_writer_given_valid_path() throws IOException {
        //given
        output writer = new output();
        String txtName = "myPath";
        String path = "src/main/java/ex45/myPath.txt";
        //when
        File output = new File(path);
        FileWriter expected = new FileWriter(output);
        FileWriter actual = writer.constructWriter(txtName);
        //then
        assertEquals(expected.getEncoding(), actual.getEncoding());
    }
}