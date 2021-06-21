package ex43;

public class App {
    public static void main(String[] args) {
        //construct website
        Website mySite = new Website();
        //assign variables for the different website function outputs
        //assign name of website
        String name = mySite.readString("Site name: ");
        //assign author name
        String author = mySite.readString("Author: ");
        //Does the author want a JavaScript file?
        boolean js = mySite.readBool("Do you want a folder for JavaScript? ");
        //Does the author want a CSS file?
        boolean css = mySite.readBool("Do you want a folder for CSS? ");
        //use information to make directories.
        mySite.allDirectories(name, author, js, css);
    }
}

