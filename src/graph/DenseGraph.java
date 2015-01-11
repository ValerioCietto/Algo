package graph;


import java.util.ArrayList;
import java.util.HashMap;
/**
 * 
 * @author valerio
 * 
 * 
 * @param <V>
 * @param <E>
 */
public class DenseGraph<V, E> implements Graph{
	private ArrayList<V> nodi;	
	private HashMap<V,ArrayList<Arco<V,E>>> archi;
	private int n;//numero di nodi
	private int m;//numero di archi
	
	/**
	 * inizializza un grafo vuoto
	 */
	public DenseGraph(){
		nodi = new ArrayList<V>();
		archi = new HashMap<V, ArrayList<Arco<V,E>>>();
		n = 0;
		m = 0;
	}
	/**
	 * Aggiunge un vertice se non è già presente
	 * @param vertex oggetto da aggiungere
	 * @return true se è stato inserito, false se già presente
	 */
	@Override
	public boolean addVertex(Object vertex) {
		if(!nodi.contains(vertex)){
			nodi.add((V) vertex);
			n++;
			ArrayList<Arco<V, E>> neighbors = new ArrayList<Arco<V,E>>();
			archi.put((V)vertex, neighbors);
			return true;
		}
		return false;
	}
	/**
	 * aggiunge un arco al grafo se non è già presente
	 * @param v1 vertice da cui esce l'arco
	 * @param v2 vertice in cui entra l'arco
	 * @param info nome arco o altro
	 * @return true se è stato inserito, false altrimenti
	 */
	@Override
	public boolean addEdge(Object v1, Object v2, Object info) {
		
		if(!nodi.contains(v1)) addVertex(v1);
		if(!nodi.contains(v2)) addVertex(v2);
		Arco<V,E> a = new Arco<V, E>((E)info,(V)v1,(V)v2,0.0);
		ArrayList<Arco<V, E>> neighbors = (ArrayList<Arco<V, E>>)archi.get(v1);
		neighbors.add(a);
		m++;
		return true;
		
		
	}
	/**
	 * aggiunge un arco al grafo se non è già presente
	 * aggiunge anche il peso.
	 * @param v1
	 * @param v2
	 * @param weight
	 * @param info
	 * @return true se è stato inserito, false altrimenti
	 */
	@Override
	public boolean addEdge(Object v1, Object v2, double weight, Object info) {
		if(nodi.contains(v1)){
			if(!nodi.contains(v1)) addVertex(v1);
			if(!nodi.contains(v2)) addVertex(v2);
			Arco<V,E> a = new Arco<V, E>((E)info,(V)v1,(V)v2,weight);
		
			ArrayList<Arco<V,E>> neighbors = (ArrayList<Arco<V,E>>)archi.get(v1);
			neighbors.add(a);
			m++;
			return true;
		}
		return false;
	}
	/**
	 * aggiunge un arco in due direzioni
	 * al grafo tra v1 e v2, se non è già presente
	 * @param v1
	 * @param v2
	 * @param info
	 * @return true se almeno un arco è stato inserito,
	 *  false altrimenti
	 */
	@Override
	public boolean addUndirectedEdge(Object v1, Object v2, Object info) {
		boolean arco1 = addEdge(v1,v2,0.0,info);
		boolean arco2 = addEdge(v2,v1,0.0,info);
		return arco1||arco2;
	}
	/**
	 * aggiunge un arco in due direzioni
	 * al grafo tra v1 e v2, se non è già presente
	 * @param v1
	 * @param v2
	 * @param double
	 * @param info
	 * @return true se almeno un arco è stato inserito,
	 *  false altrimenti
	 */
	@Override
	public boolean addUndirectedEdge(Object v1, Object v2, double weight,
			Object info) {
		boolean arco1 = addEdge(v1,v2,weight,info);
		boolean arco2 = addEdge(v2,v1,weight,info);
		return arco1||arco2;
	}
    /**
     * controlla se un vertice esiste
     * necessario perchè nodi è privato
     * @return true se esiste, false altrimenti
     */
	@Override
	public boolean hasVertex(Object vertex) {
		if(nodi.contains(vertex))
			return true;
		return false;
	}
    /**
     * controlla se un arco tra v1 e v2 esiste
     * @return true se esiste, false altrimenti
     */
	@Override
	public boolean hasEdge(Object v1, Object v2) {
		if(nodi.contains(v1)){
			if(nodi.contains(v2)){
				ArrayList<Arco<V,E>> neighbors = (ArrayList<Arco<V,E>>)archi.get(v1);
				if(neighbors.contains(new Arco(v1,v2)));
				return true;
			}
		}
		return false;
	}
	/**
	 * @return peso dell'arco tra vertice source e vertice dest
	 */
	@Override
	public double getWeight(Object source, Object dest) {
		return getEdge((V)source,(V)dest).getWeight();
		
	}
    /**
     * Ottiene un oggetto arco generico
     * @param source
     * @param dest
     * @return un oggetto di tipo Arco
     */
	private Arco<V, E> getEdge(V source, V dest) {
		ArrayList<Arco<V, E>> neighbors = new ArrayList<Arco<V, E>>();
		neighbors = (ArrayList<Arco<V, E>>)archi.get(source);
		
		for(Arco<V,E> a : neighbors){
			
			if((a.fin.equals(dest))&&(a.in.equals(source))){
				
				return a;
			}	
		}
		return null;
	}
    /**
     * ottiene una lista dei nodi adiacenti
     */
	public ArrayList neighbors(Object vertex) {
		if(nodi.contains(vertex)){
			ArrayList<Arco<V,E>> neighbors = (ArrayList<Arco<V,E>>)archi.get(vertex);
			return neighbors;
		}
		return null;
	}
	
	@Override
	public ArrayList vertices() {
		return nodi;
		
	}
	public ArrayList getNodi(){
		return nodi;
	}
	public HashMap getArchi(){
		return archi;
	}
	
	public int getNumberOfArcs(){
		return this.m;
	}
	
	public int getNumberOfNodes(){
		return this.n;
	}
	
	

}