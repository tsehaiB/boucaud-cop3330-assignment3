/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createIndex {
    //Create instance file variable

    //constructWriter creates a writer for this file
    public FileWriter constructWriter(String path){
        File out = new File(path + "/index.html");
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
    //printToFile uses the writer to write the index.html string to the index.html file
    public void printToFile(FileWriter write, String index){
        //write output to output file
        //use try/catch for exceptions
        try {
        //write the person's attributes and a new line character
             write.write(index);
        } catch (IOException e) {
        //Throw exception if file is not found
             System.out.println("Error, File not found");
             e.printStackTrace();
        }
        //Close the file after the loop has completed
        try {
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
