package ex45;
import ex42.formatStrings;
import ex42.inpFile;
import ex42.outFile;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        //Constructors
        //make scanner for name of file
        Scanner userIn = new Scanner(System.in);
        //make input reader
        input inp = new input();
        //make output writer
        output out = new output();
        //make passage processor
        processor process = new processor();
        //construct app to use app methods
        App myApp = new App();

        //prompt and assign the name of the path for the output file
        String path = myApp.readString("What would you like to name your file? (e.g \"myFile\" will create myFile.txt): ", userIn);
        //read the input passage into an arraylist of lines called unprocessed
        ArrayList<String> unprocessed = myApp.readFile(inp);
        //process the arraylist of lines into a single string that replaces all uses with utilizes
        String processed = myApp.processAll(unprocessed, process);
        //write the processed string to the user specified output file
        myApp.writeFile(processed, path, out);
    }
    public String readString(String prompt, Scanner userIn){
        //prompt Input
        System.out.print(prompt);
        //return nextLine as string
        return userIn.nextLine();
    }
    //Method to call the inputFile functions and return the unprocessed lines from the passage
    private ArrayList<String> readFile(input reader){
        //create a scanner for the file
        Scanner read = reader.constructReader();
        //return the arraylist of unprocessed lines from the passage
        return reader.storeInStringArray(read);
    }
    //Method to call the processor functions and return the processed passage as a string
    private String processAll(ArrayList<String> unprocessed, processor process){
        //return the processed passage as a string
        return process.processAll(unprocessed);
    }
    //Method to call the outputFile functions to write the processed passage to the user inputted output file
    private void writeFile(String processedString, String path, output writer) {
        //create a filewriter for the output file
        FileWriter write = writer.constructWriter(path);
        //write the entire processed passage to the output file.
        writer.printToFile(processedString, write);
    }
}
