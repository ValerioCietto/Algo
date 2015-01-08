package avltree;

public class Elem implements ObjectWithKey{
	String elem;
	int key;
	
	@Override
	public int key() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Elem( String elem, int key){
		this.elem=elem;
		this.key=key;
	}
	
	@Override
	public String toString() {
	    return "chiave "+key + "; elemento " + elem;
	}
}
