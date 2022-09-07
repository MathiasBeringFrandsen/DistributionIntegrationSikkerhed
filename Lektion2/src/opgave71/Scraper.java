package opgave71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;

public class Scraper {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://dis.students.dk/example1.php");
        InputStreamReader r = new InputStreamReader(url.openStream());
        BufferedReader in = new BufferedReader(r);
        String str;
        while ((str = in.readLine()) != null) {
            if (str.equalsIgnoreCase("<body>")) {
                String[] string = in.readLine().split(" ");
                System.out.println(string[5]);
            }
        }
        in.close();
    }
}