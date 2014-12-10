import java.util.Random;


public class ProvaOperatoriInLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		System.out.println((1==1) ? ((1==1) ? "2" : "1") : "0");
	}
	
	
	public static void provaNonTernario(){
		Random in = new Random();
		int x=0;
		String s ="";
		for (int i = 0; i < 1000; i++) {
			x = i;//in.nextInt(100);
			if(x>50){
				if(x>75){
					if(x>90){
						s="";
					}
					
				}
				
			}
			
			

		}
	}
	public static void provaTernario(){
		Random in = new Random();
		int x=0;
		String s ="";
		for (int i = 0; i < 1000; i++) {
			x = i;//in.nextInt(100);
			s = (x>50)? ((x>75)? ((x>90)?"":""):""): "" ;
			

		}
	}

}
