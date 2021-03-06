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
	 * @param weight
	 */
	public Arco(E info,V in, V fin,double weight){
		this.info = info;
		this.in = in;
		this.fin = fin;
		this.weight = weight;
	}
	public Arco(V in, V fin,double weight){
		this.in = in;
		this.fin = fin;
		this.weight = weight;
	}
	public Arco(E info2, V v1, V v2) {
		this.info = info;
		this.in = in;
		this.fin = fin;
		this.weight = weight;
	}


	public Arco(V source, V dest, double peso, E info2) {
		this.info = info2;
		this.in = source;
		this.fin = dest;
		this.weight = peso;
	}


	/**
	 * 
	 * @return
	 */
	double getWeight(){
		return weight;
	}
}