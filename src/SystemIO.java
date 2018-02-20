import java.io.*;
import java.nio.BufferUnderflowException;

/**
 * Created by User on 20/02/2018.
 */
public class SystemIO {
    public String inputFile = "input.txt";
    public String result = "output.txt";

    public void saveToFile(String value){
        try{
            FileWriter fw = new FileWriter(result,true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(value);
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("Result saved!");
        }
        catch(IOException e){
            System.out.println("Error saving to database");
        }
    }

    public String readFromFile(){
        String secretMessage = "";
        try{
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            secretMessage = br.readLine().trim();

            br.close();
            fr.close();
            System.out.println("Secret key taken");

        }
        catch(IOException e){
            System.out.println("Error reading the input");
        }
        return secretMessage;
    }
}
