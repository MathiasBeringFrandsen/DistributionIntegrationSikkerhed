package opgave6;

public class App {
    public static void main(String[] args) {
        Common common = new Common();
        ReaderThread t1 = new ReaderThread(common);
        WriterThread t2 = new WriterThread(common);
        t1.start();
        t2.start();
    }
}
