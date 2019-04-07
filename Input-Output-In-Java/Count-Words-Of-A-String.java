/**
 *
 * @author jacksparrow
 */
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsOfAString.java {
    public static void main(String[] args) {
        BufferedReader bufferr = null;
        try {
            bufferr = new BufferedReader(new FileReader("page.html"));
            String str;
            String[] words = null;
            int count = 1;
            while((str = bufferr.readLine()) != null) {
                words = str.split(" ");
                for(int i=0; i<words.length; i++) {
                    if(words[i].equals("")) continue;
                    for(int j=i+1; j<words.length; j++) {
                        if(words[i].equals(words[j])) {
                            words[j] = "";
                            count++;
                        }
                    }
                    System.out.println("'" + words[i] + "'" + " is " + count + " times.");
                    words[i] = "";
                    count = 1;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferr.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
