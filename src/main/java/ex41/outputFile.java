/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class outputFile {
    //Create instance file variable
    private static final File out = new File("src/main/java/ex41/exercise42_output.txt");

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
    //printToFile uses the writer to loop through the ArrayList of names and write all of the sorted names to the output file
    public void printToFile(ArrayList<String> sortedNames, FileWriter write){
        //loop for each name in the sorted list of names
        int numNames = sortedNames.size();
        try {
            write.write("Total of " + numNames + " names\n");
            write.write("-----------------\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String name : sortedNames){
            //use try/catch for exceptions
            try {
                //write the name and a new line character
                write.write((name + "\n"));
            } catch (IOException e) {
                //Throw exception if file is not found
                System.out.println("Error, File not found");
                e.printStackTrace();
            }
        }
        //Close the file after the loop has completed
        try {
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
