package fletning;

import java.util.ArrayList;
import java.util.List;

public class MergeThread extends Thread{

    private int low;
    private int high;
    private List<Integer> list;
    FletteSortering fletteSortering = new FletteSortering();


    public MergeThread(int low, int high, List<Integer> list){
        this.low = low;
        this.high = high;
        this.list = list;
    }

    public void run(){
        fletteSortering.mergesort(list,low,high);
    }
}