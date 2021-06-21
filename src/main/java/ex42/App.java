/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex42;

import ex41.inputFile;
import ex41.nameSort;
import ex41.outputFile;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        //CONSTRUCTORS
        //Construct App Instance
        App myApp = new App();
        //Construct InputFile Instance
        inpFile reader = new inpFile();
        //Construct OutputFile Instance
        outFile writer = new outFile();
        //Construct NameSort Instance
        formatStrings formatter = new formatStrings();

        //Create ArrayList unsorted names to process the file input into
        ArrayList<String> unformatted = myApp.readFile(reader);
        //Create ArrayList of sorted names to process the name sorter into
        String output = myApp.formatAll(unformatted, formatter);
        //Write output file using ArrayList of sorted names as input.
        myApp.writeFile(output, writer);
    }
    //Method to call the inputFile functions and return the unsorted list of names
    private ArrayList<String> readFile(inpFile reader){
        //create a scanner for the file
        Scanner read = reader.constructReader();
        //return the arraylist of unsorted names from the file
        return reader.storeInStringArray(read);
    }
    //Method to call the NameSorter functions and return the sorted list of names
    private String formatAll(ArrayList<String> unformatted, formatStrings formatter){
        //return sorted list of names from the originally unsorted list
        formatter.createPeople(unformatted);
        return formatter.addHeader(formatter.formatAll());
    }
    //Method to call the outputFile functions to write the sorted list of names to the output file
    private void writeFile(String formattedOut, outFile writer) {
        //create a filewriter for the output
        FileWriter write = writer.constructWriter();
        //write the entire ArrayList of sorted names to the output file.
        writer.printToFile(formattedOut, write);
    }

}
