package opgave6;

import java.util.Scanner;

public class WriterThread extends Thread{
    private Common common;

    public WriterThread(Common common) {
        this.common = common;
    }

    public void run(){
        String currentString = "";
        Scanner scan = new Scanner(System.in);
        while (!currentString.equalsIgnoreCase("Exit")){
            System.out.println("Indtast en streng: ");
            currentString = scan.nextLine();
            common.setString(currentString);
        }
    }
}
