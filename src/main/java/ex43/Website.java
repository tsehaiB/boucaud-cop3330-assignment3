/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex43;
import java.util.Scanner;
public class Website {
    //construct scanner for user input
    private static final Scanner inp = new Scanner(System.in);
    //method that returns strings from user input
    public String readString(String prompt){
        //prompt Input
        System.out.print(prompt);
        //return nextLine as string
        return inp.nextLine();
    }
    //method that returns boolean from user input
    public boolean readBool(String prompt){
        //prompt Input
        System.out.print(prompt);
        //loop until valid input 'y' or 'n'
        while(!inp.hasNext("y") && !inp.hasNext("n"))
        {
            //re-prompt user
            System.out.print("Please enter 'y' if you would like this folder, and 'n' if you would not ");
            //eat next line
            inp.nextLine();
        }
        //return with valid input, if 'y', true, else false.
        return(inp.next().equals("y"));
    }
    //method that makes directories given inputs
    public void allDirectories(String name, String author, boolean js, boolean css){
        //create directories object
        Directories make = new Directories();
        String root = make.makeRootDir(name);
        if(js)
            make.makeDir(root, "js", name);
        if(css)
            make.makeDir(root, "css", name);
        make.addIndex(author, name, root);
    }
}
