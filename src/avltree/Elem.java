package avltree;

public class Elem implements ObjectWithKey{
	String elem;
	int key;
	
	@Override
	public int key() {
		return key;
	}
	
	public Elem( String elem, int key){
		this.elem=elem;
		this.key=key;
	}
	
	@Override
	public String toString() {
	    return ""+key + "; " + elem;
	}
}
