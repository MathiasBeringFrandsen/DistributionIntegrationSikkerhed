package opgave72;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Post {
    public static void main(String[] args) throws IOException {


        URL url = new URL("https://dis.students.dk/example3.php");
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = new
                OutputStreamWriter(conn.getOutputStream());
        wr.write("year=2022&month=august");

        Map map = conn.getHeaderFields();
        Set set = map.entrySet();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        wr.flush();
        // Get an InputStream with conn.getInputStream()
        // and read the response like in exercise 1 ...
        wr.close();


    }
}