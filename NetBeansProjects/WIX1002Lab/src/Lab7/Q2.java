import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
         try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner input = new Scanner(stream);
            
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("index.html"));
            while(input.hasNextLine()){
                outputStream.println(input.nextLine());
            }
            
            outputStream.close();
         } catch(IOException e){
             System.out.println("IO Error: " + e.getMessage());
         }
    }
}
