package graph;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * 
 * @author valerio
 *
 * @param <V>
 * @param <E>
 */
public class SparseGraphSimple<V,E> implements Graph<V,E>{
	private class Nodo<V, E>{
		ArrayList<Nodo> vicini;
		ArrayList<E> infoVicini;
		ArrayList<Double> pesiVicini;
		V dato;
		public Nodo(V d){
			dato = d;
		}
		public void addEdge(Nodo vicino, E info, double distanza){
			if(vicini.contains(vicino)){
				infoVicini.add(info);
				pesiVicini.add(distanza);
			}
		
		}
	}
	
	ArrayList<Nodo<V,E>> nodi;	
	int n;
	int m;
	/**
	 * 
	 */
	public SparseGraphSimple(){
		nodi = new ArrayList<Nodo<V, E>>();
		n = 0;
		m = 0;
	}
	/**
	 * 
	 */
	@Override
	public boolean addVertex(V vertex) {
		if(!nodi.contains(vertex)){
			nodi.add(new Nodo(vertex));
			n++;
			return true;
		}
		
		return false;
	}
	/**
	 * 
	 */
	@Override
	public boolean addEdge(V v1, V v2, E info) {
		return addEdge(v1,v2,0.0,info);
	}

	@Override
	public boolean addEdge(V v1, V v2, double weight, E info) {
		if(nodi.contains(v1)){
			if(!nodi.contains(v1)) addVertex(v1);
			if(!nodi.contains(v2)) addVertex(v2);
			int v1index = nodi.indexOf(v1);
			int v2index = nodi.indexOf(v2);
			nodi.get(v1index).addEdge(nodi.get(v2index), info, weight);
			m++;
			return true;
		}
		return false;
	}

	@Override
	public boolean addUndirectedEdge(V v1, V v2, E info) {
		addEdge(v1,v2,info);
		addEdge(v2,v1,info);
		return true;
	}

	@Override
	public boolean addUndirectedEdge(V v1, V v2, double weight, E info) {
		addEdge(v1,v2,weight,info);
		addEdge(v2,v1,weight,info);
		return true;
	}

	@Override
	public boolean hasVertex(V vertex) {
		if(nodi.contains(vertex))
			return true;
		return false;
	}

	@Override
	public boolean hasEdge(V v1, V v2) {
		if(nodi.contains(v1)){
			if(nodi.contains(v2)){
				if(nodi.get(nodi.indexOf(v1)).vicini.contains
						(nodi.get(nodi.indexOf(v2)))){
				    return true;
				}
			}
		}
		return false;
	}

	@Override
	public double getWeight(V source, V dest) {
		return getEdge(source,dest).getWeight();
	}

	@Override
	public ArrayList<V> vertices() {
		ArrayList<V> out = new ArrayList<V>();
		for(int i = 0; i< nodi.size();i++){
			out.add(nodi.get(i).dato);
		}
		return out;
	}

	@Override
	public ArrayList<V> neighbors(V vertex) {
	    if(nodi.contains(vertex)){
		    ArrayList<V> neighbors = new ArrayList<V>();
		    int indice = nodi.indexOf(vertex);
		    for(int i = 0; i< nodi.get(indice).vicini.size();i++){
				neighbors.add((V)nodi.get(indice).vicini.get(i).dato);
			}
		    return neighbors;
	    }
	    return null;
	}
	
	public Arco<V, E> getEdge(V source, V dest){
		if(nodi.contains(source)){
			if(nodi.contains(dest)){
				int index = nodi.indexOf(source);
				int indexDest = nodi.get(index).vicini.indexOf(dest);
				
				double peso = nodi.get(index).pesiVicini.get(indexDest);
				E info = nodi.get(index).infoVicini.get(indexDest);
				Arco<V, E> arco = new Arco<V, E>(source, dest, peso, info);
				return arco;
			}
		}
		return null;
	}

	public void printVertex(){
		
	}
	public void printNeighbors(int vertex){
		
	}
	/**
	 * 
	 * @param GraphName
	 * @throws IOException
	 */
	public void ToDot(String GraphName) throws IOException{
	  String Graph = GraphName+".dot"; 
	  FileWriter outFile = new FileWriter(Graph, false);
	  PrintWriter out = new PrintWriter(outFile);
	  out.println("digraph "+GraphName+"{");
//	  for(V i : nodi){
//	  	ArrayList<Arco> neighbors = (ArrayList<Arco>)archi.get(i);
//			for(Arco<V,E> a : neighbors){
//				out.println(a.in+" -> "+a.fin+";");
//			}
//	  }
	  out.println("}");
	  out.close();
	}
}