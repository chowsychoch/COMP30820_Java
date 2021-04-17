package ma.ma4;

import java.io.File;
import java.util.Date;

public class q2 {
    public static void main(String[] args) {
        // Command Line Argument checking
        if (args.length != 1){
            System.out.println("No filename sent to command-line argument");
            System.exit(1);
        }
        File file = new File(args[0]);
        System.out.println("java Exercise12_06Extra "+file.getAbsolutePath());
        //check if file name exist
        if (file.exists()){
            //invoke the method
            changeName(file);
        }else{
            //error handling
            System.out.println("The file does not exist");
        }
    }
    // invoke method change file name
    public static void changeName(File file){
        Date date = new Date();
        File Rename = new File (file.getAbsoluteFile().toString()+ date.toString().replaceAll(":","_"));
        file.renameTo(Rename);
        System.out.println("Success. New file is "+Rename);
    }
}
