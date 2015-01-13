import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ListGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = listGenerate(100);
		System.out.println(list.toString());
	}
	
	public static List listGenerate(int lenght){
		ArrayList list = new ArrayList();
		Random rn = new Random();
		
		int x=0;
		for (int i = 0;i<lenght;i++) {
			x= rn.nextInt(4)+x;
			list.add(x);
		}
		return list;
	}
	public static List listGenerate(int lenght, boolean random){
		if(random){
			ArrayList list = new ArrayList();
			Random rn = new Random();
		
			int x=0;
			for (int i = 0;i<lenght;i++) {
				x= rn.nextInt(4)+x;
				list.add(x);
			}
			return list;
		}
		else{
			return null;
		}
	}
	
	// Implementing Fisher–Yates shuffle
	static void shuffleArray(int[] ar){
	    Random rnd = new Random();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	}
	
	

}
