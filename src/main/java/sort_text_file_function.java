
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class sort_text_file_function {
    sort_text_file_function(String filename) throws FileNotFoundException, IOException{
        try{
            //function of sorting
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            ArrayList<String> str = new ArrayList<>();
            String line = "";
            while((line=reader.readLine())!=null){
                            str.add(line);
            }
            reader.close();
            Collections.sort(str);
            FileWriter writer = new FileWriter("/Users/khaixenliew/NetBeansProjects/CarRentalSystem/src/main/java/file_temp.txt");
            for(String s: str){
                            writer.write(s);
                            writer.write("\r\n");
            }
            writer.close();

            //function of deleting old files
            File f = new File(filename);
            f.delete();

            //rename the temp file to the old name
            // File (or directory) with old name
            File file = new File("/Users/khaixenliew/NetBeansProjects/CarRentalSystem/src/main/java/file_temp.txt");

            // File (or directory) with new name
            File file2 = new File(filename);

            if (file2.exists())
               throw new java.io.IOException("file exists");

            // Rename file (or directory)
            boolean success = file.renameTo(file2);

            if (!success) {
               // File was not successfully renamed
            }
        }
        catch(Exception e){
            System.out.print("Somethings wrong...");
        }
    }
}
