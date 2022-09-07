package opgave71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ScraperValuta {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://m.valutakurser.dk");
        InputStreamReader r = new InputStreamReader(url.openStream());
        BufferedReader in = new BufferedReader(r);
        String str;
        while ((str = in.readLine()) != null) {
            if (str.contains("3859"))
                System.out.println(str.substring(279, 285));

        }
        in.close();
    }
}

