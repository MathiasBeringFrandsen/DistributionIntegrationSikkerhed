package opgave6;

public class ReaderThread extends Thread{
    private Common common;

    public ReaderThread(Common common) {
        this.common = common;
    }

    public void run() {
        String currentString = common.getString();
        while (!currentString.equalsIgnoreCase("Exit")) {
            try {
                this.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentString = common.getString();
            System.out.println(currentString);
        }
    }
}
