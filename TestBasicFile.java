//James Vega
//COP3337
//Assignment 3 - File System
//Was tested and confirmed using Assignment3 instructions as .txt file


import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class TestBasicFile {

    public static void main(String[] args) {

        boolean done =false;
        BasicFile f = new BasicFile();

        while(!done){

            String menu = "Make your selection \n1. Copy a file \n2. Append to a file \n3. Overwrite a file \n4. File attributes \n5. Display the file \n7. Search word on file \n8. Tokenize the file\n6. Quit";
            String s = JOptionPane.showInputDialog(menu);

            try{
                int i = Integer.parseInt(s);
                switch (i) {
                    case 1 -> f.saveFile();
                    case 2 -> f.appendToFile();
                    case 3 -> f.overWrite();
                    case 4 -> {
                        ArrayList<String> lines = new ArrayList<String>();
                        f.listRecursive(lines);
                        f.initialized(lines);
                    }
                    case 5 -> f.displayFIle();
                    case 6 -> done = true;
                    case 7 -> f.getLinesForWord();
                    case 8 -> f.TokenizerStream();
                    default -> System.out.println(" ");
                }

            } catch ( NumberFormatException | NullPointerException | IOException e) {
                System.out.println(e);
            }


        }

    }
}





