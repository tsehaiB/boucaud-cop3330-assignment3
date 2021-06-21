package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Directories {
    //construct indexFile so that we can call its methods later.
    private static final indexFile makeIndex = new indexFile();
    //method to make index file
    public void addIndex(String author, String name, String path){
        String index = makeIndex.generateIndex(author, name);
        makeIndex.makeIndex(index, path);
        printConfirm(name + "/" + "index.html");
    }
    //method to make root directories website and websiteName
    public String makeRootDir(String name){
        //create string containing root path, add website name to it
        String rootPath = "C:\\Users\\Art3mis\\IdeaProjects\\boucaud-cop3330-assignment3\\website\\" + name;
        //create new file for the website located at the root path
        File website = new File(rootPath);
        //test to see if directory was made with boolean variable
        boolean bool = website.mkdirs();
        if(bool){
            //call print confirm function with directory name if the directory was made
            printConfirm(name);
        }
        else{
            //print out an error otherwise
            System.out.println("Error Found!");
        }
        //return the root path as a string, since it will be used in the future
        return rootPath;
    }
    //function that makes all other directories (to be called three times)
    public boolean makeDir(String root, String newDir, String name){
        //create new path my adding root path to new directory name
        String path = root + "\\" + newDir;
        //create new file located at new path
        File website = new File(path);
        //test to see if directory was made
        boolean bool = website.mkdir();
        if(bool){
            //if the directory was made, print out confirmation message
            printConfirm(name + "/" + newDir);
        }
        else{
            //otherwise, print out error message
            System.out.println("Error Found!");
        }
        return bool;
    }
    //printConfirm method for printing confirmation messages
    private void printConfirm(String path) {
        //print confirmation message
        System.out.println("Created ./website/" + path);
    }
}
