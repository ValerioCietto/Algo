package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphWeighted  {

	ArrayList<String> nodi;	
	HashMap<String,ArrayList> archi;
	int n;//numero di nodi
	int m;//numero di archi
	
	
	public boolean addVertex(String vertex) {
		if(!nodi.contains(vertex)){
			nodi.add( vertex);
			n++;
			ArrayList neighbors = new ArrayList();
			archi.put( vertex, neighbors);
			return true;
		}
		
		return false;
	}

	
	public boolean addEdge(String v1, String v2, int info) {
		if(nodi.contains(v1)){
			if(!nodi.contains(v1)) addVertex(v1);
			if(!nodi.contains(v2)) addVertex(v2);
			Arco<String,Integer> a = new Arco<String, Integer>(info,v1,v2);
			ArrayList<Arco> neighbors = archi.get(v1);
			neighbors.add(a);
			m++;
			return true;
		}
		return false;
	}

	
	public boolean addEdge(String v1, String v2, double weight, int info) {
		if(nodi.contains(v1)){
			if(!nodi.contains(v1)) addVertex(v1);
			if(!nodi.contains(v2)) addVertex(v2);
			Arco<String,Integer> a = new Arco<String, Integer>(info,v1,v2);
			ArrayList<Arco> neighbors = (ArrayList<Arco>)archi.get(v1);
			neighbors.add(a);
			m++;
			return true;
		}
		return false;
	}

	
	public boolean addUndirectedEdge(String v1, String v2, int info) {
		if(nodi.contains(v1)){
			if(!nodi.contains(v1)) addVertex(v1);
			if(!nodi.contains(v2)) addVertex(v2);
			Arco<String,Integer> a = new Arco<String,Integer>(info,v1,v2);
		
			ArrayList<Arco<String,Integer>> neighbors = (ArrayList<Arco<String,Integer>>)archi.get(v1);
			neighbors.add(a);
			m++;
			return true;
		}
		return false;
	}

	
	public boolean addUndirectedEdge(String v1, String v2, double weight, int info) {
		addEdge(v1,v2,info);
		addEdge(v2,v1,info);
		return false;
	}

	
	public boolean hasVertex(String vertex) {
		if(nodi.contains(vertex))
			return true;
		return false;
	}

	
	public boolean hasEdge(String v1, String v2) {
		if(nodi.contains(v1)){
			if(nodi.contains(v2)){
				ArrayList<Arco<String, Integer>> neighbors = (ArrayList<Arco<String, Integer>>)archi.get(v1);
				if(neighbors.contains(new Arco(v1,v2)));
				return true;
			}
		}
		return false;
	}

	
	public int getWeight(String source, String dest) {
		return (int) getEdge(source,dest).getWeight();
		
	}
	private Arco<String, Integer> getEdge(Object source, Object dest) {
		ArrayList<Arco> neighbors = (ArrayList<Arco>)archi.get(source);
		Arco find = new Arco(source,dest);
		for(Arco<String, Integer> a : neighbors){
			if((a.fin.equals(find.fin))&&(a.in.equals(find.in)))
				return a;
		}
		return null;
	}
	
	public ArrayList<String> vertices() {
		return nodi;
	}
	//############
	public ArrayList neighborsOf(Object vertex) {
		if(nodi.contains(vertex)){
			ArrayList<Arco> neighbors = (ArrayList<Arco>)archi.get(vertex);
			ArrayList nodiVicini = new ArrayList();
			for(int i = 0; i< neighbors.size();i++){
				nodiVicini.add(neighbors.get(i).fin);
			}
			return nodiVicini;
		}
		return null;
	}
	
	public ArrayList<String> neighbors(String vertex) {
		if(nodi.contains(vertex)){
			ArrayList<String> neighbors = (ArrayList<String>)archi.get(vertex);
			return neighbors;
		}
		
		return null;
	}

}
