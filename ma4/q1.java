package ma.ma4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) throws FileNotFoundException {

        // Command Line Argument checking
        if (args.length != 1){
            System.out.println("No filename sent to command-line argument");
            System.exit(1);
        }

        File file = new File(args[0]);
        //check if filename exists
        if (!file.exists()){
            System.out.println("Source file "+args[0]+" does not exist.");
            System.exit(2);
        }

        // Create a Scanner
        Scanner input = new Scanner(file);

        int lines = 0;
        int wordsCount = 0;
        int character= 0;

        while (input.hasNext()){
            String line = input.nextLine();
            lines++;
            wordsCount += countWords(line);
        }

        input.close();
        System.out.println("File "+file+ " has ");
        System.out.println(file.length()+ " characters");
        System.out.println(wordsCount + " words");
        System.out.println(lines + " lines");
    }

    private static int countWords(String line){
        String[] words = line.split("[ \\t\\n\\r]");
        int count = 0;

        for (String word: words){
            if (word.length() > 0)
                count++;
        }
        return count;

    }

}
