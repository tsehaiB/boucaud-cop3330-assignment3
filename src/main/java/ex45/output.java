/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class output {

    //constructWriter creates a writer for this file
    public FileWriter constructWriter(String fileName){
        //Create file variable
        File out = new File("src/main/java/ex45/" + fileName + ".txt");
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
    //printToFile to output the passage to a user inputted file
    public void printToFile(String processedPassage, FileWriter write){
        //write output to output file
        //use try/catch for exceptions
        try {
        //write the passage to our file
             write.write(processedPassage);
        } catch (IOException e) {
        //Throw exception if file is not found
             System.out.println("Error, File not found");
             e.printStackTrace();
        }
        //Close the file after the passage has been written
        try {
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
