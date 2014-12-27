import java.io.IOException;


public class ProvaExec {
	public static void main (String[] args){
		try {
			Process p = Runtime.getRuntime().exec("firefox");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
