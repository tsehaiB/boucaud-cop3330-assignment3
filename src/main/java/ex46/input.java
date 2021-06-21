/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class input {
    //Create instance file variable
    private static final File inp = new File("src/main/java/ex45/exercise45_input.txt");
    //constructReader creates a reader for this file
    public Scanner constructReader(){
        //use try/catch for exceptions
        try {
            //create and return new Scanner variable with file as Input
            return new Scanner(inp);
        } catch (FileNotFoundException e) {
            //Throw exception if file is not found
            System.out.println("Error, File not found");
            e.printStackTrace();
        }
        return null;
    }
    //storeInStringArray uses the reader to loop through the file and store all of the lines as strings in an ArrayList
    public ArrayList<String> storeInStringArray(Scanner reader){
        //create new Array List of Strings
        ArrayList<String> passage = new ArrayList<String>();
        //loop through the file with the scanner until all lines have been read
        while(reader.hasNextLine()){
            //append all lines to an unprocessed list of all of the lines in the passage
            passage.add(reader.nextLine());
        }
        //return unprocessed list of all lines in the input passage
        return passage;
    }
}
