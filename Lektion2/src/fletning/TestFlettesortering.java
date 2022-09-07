package fletning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestFlettesortering {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new ArrayList<Integer>();
		Random r=new Random();
		for (int i=0;i<1000000;i++) {
			list.add(Math.abs(r.nextInt()%10000));
		};
		
//		System.out.println(list);
		
		FletteSortering sort = new FletteSortering();
		MergeThread t1 = new MergeThread(0, 12, list);
		MergeThread t2 = new MergeThread(13,24,list);
		long l1,l2;
		l1 = System.nanoTime();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		sort.merge(list, 0,(list.size() - 1) / 2 , list.size() - 1);
		l2 = System.nanoTime();
		System.out.println();
		System.out.println("Køretiden var " + (l2-l1)/1000000);
		System.out.println();
//		System.out.println(list);
	}

}
