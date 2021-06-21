/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex42;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class outFile {
    //Create instance file variable
    private static final File out = new File("src/main/java/ex42/exercise42_output.txt");

    //constructWriter creates a writer for this file
    public FileWriter constructWriter(){
        //use try/catch for exceptions
        try {
            //create and return new FileWriter variable with file as output
            return new FileWriter(out);
        } catch (IOException e) {
            //Throw exception if file is not found
            System.out.println("Error, File not found");
            e.printStackTrace();
        }
        return null;
    }
    //printToFile uses the writer to write the formatted strings to the output file
    public void printToFile(String formattedStrings, FileWriter write){
        //write output to output file
        //use try/catch for exceptions
        try {
        //write the formatted strings to the file
             write.write(formattedStrings);
        } catch (IOException e) {
        //Throw exception if file is not found
             System.out.println("Error, File not found");
             e.printStackTrace();
        }
        //Close the file after the formatted strings have been written to the file
        try {
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
