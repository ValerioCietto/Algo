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
	ArrayList<V> nodi;	
	HashMap<V,ArrayList<Arco<V,E>>> archi;
	private int n;//numero di nodi
	private int m;//numero di archi
	
	public DenseGraph(){
		nodi = new ArrayList<V>();
		archi = new HashMap<V, ArrayList<Arco<V,E>>>();
		n = 0;
		m = 0;
	}
	
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

	@Override
	public boolean addUndirectedEdge(Object v1, Object v2, Object info) {
		addEdge(v1,v2,0.0,info);
		addEdge(v2,v1,0.0,info);
		return false;
	}

	@Override
	public boolean addUndirectedEdge(Object v1, Object v2, double weight,
			Object info) {
		addEdge(v1,v2,weight,info);
		addEdge(v2,v1,weight,info);
		return false;
	}

	@Override
	public boolean hasVertex(Object vertex) {
		if(nodi.contains(vertex))
			return true;
		return false;
	}

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
	@Override
	public double getWeight(Object source, Object dest) {
		return getEdge((V)source,(V)dest).getWeight();
		
	}

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

	@Override
	public ArrayList vertices() {
		return nodi;
		
	}

	
	public ArrayList neighbors(Object vertex) {
		if(nodi.contains(vertex)){
			ArrayList<Arco<V,E>> neighbors = (ArrayList<Arco<V,E>>)archi.get(vertex);
			return neighbors;
		}
		return null;
	}
	
	public int getNumberOfArcs(){
		return this.m;
	}
	
	public int getNumberOfNodes(){
		return this.n;
	}
	
	

}