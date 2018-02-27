import java.io.*;
import java.nio.BufferUnderflowException;

/**
 * Created by User on 20/02/2018.
 */
public class SystemIO {

    public void saveToFile(String text, String fileName){
        try{
            FileWriter fw = new FileWriter(fileName,true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(text);
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Result saved!");
        }
        catch(IOException e){
            System.out.println("Error saving to database");
        }
    }

    public String readFromFile(String fileName){
        String secretMessage = "";
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            secretMessage = br.readLine().trim();

            br.close();
            fr.close();
            System.out.println("Text recognised");

        }
        catch(IOException e){
            System.out.println("Error reading the input");
        }
        return secretMessage;
    }
}
