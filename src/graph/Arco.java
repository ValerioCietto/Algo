package graph;

/**
 * 
 * @author valerio
 *
 * @param <V> tipo iniziale
 * @param <E> informazioni sull'arco
 */
public class Arco<V,E>{
	E info;
	V in;
	V fin;
	double weight;
	/**
	 * 
	 * @param in
	 * @param fin
	 */
	public Arco(V in, V fin){
		this.info=null;
		this.in = in;
		this.fin = fin;
		this.weight=1;
	}
	/**
	 * 
	 * @param info
	 * @param in
	 * @param fin
	 */
	public Arco(E info,V in, V fin){
		this.info = info;
		this.in = in;
		this.fin = fin;
		this.weight=1;
	}
	/**
	 * 
	 * @param info
	 * @param in
	 * @param fin
	 * @param weight
	 */
	public Arco(E info,V in, V fin,double weight){
		this.info = info;
		this.in = in;
		this.fin = fin;
		this.weight = weight;
	}
	/**
	 * 
	 * @return
	 */
	double getWeight(){
		return weight;
	}
}