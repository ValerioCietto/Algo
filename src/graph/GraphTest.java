package graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class GraphTest {
	public static void main(String[] args) {
		DenseGraph<String, Integer> df = new DenseGraph();
		df.addVertex("uno");
		df.addVertex("due");
		df.addEdge("uno", "due", 3, "link");
		df.addVertex("tre");
		df.addVertex("quattro");
		df.addEdge("uno", "tre", 12, "link");
		df.addEdge("due", "tre", 9, "link");
		df.addEdge("tre", "quattro", 5, "link");
		df.addEdge("due", "quattro", 5, "link");
		System.out.println(df.hasVertex("tre"));
		System.out.println(df.hasVertex("quattro"));
		System.out.println(df.hasEdge("tre", "quattro"));
		System.out.println(df.getWeight("tre", "quattro"));
		System.out.println(getTotalWeight(df));
		System.out.println(getMinArc(df));
		System.out.println(getNumberOfArcs(df));
		System.out.println("reading");
		
		
	}
	public static int dumbRoad(DenseGraph<String, Integer> g, String a, String b){
		int roadLenght =0;
		for(int i = 0; i< g.getNodi().size();i++){
			if(((String) g.getNodi().get(i)).equalsIgnoreCase(a)){
				ArrayList<Arco> archi = new ArrayList<Arco>();
				
			}
		}
		return roadLenght;
	}
	/*
	 * cercare la strada
	 * sono arrivato?
	 * no 
	 * 	imbocco il primo arco
	 */
	public static double getTotalWeight(DenseGraph<String, Integer> g){
		double total=0;
		for(int i = 0; i< g.getNodi().size();i++){
			
			for(int x = 0; x< g.neighbors(g.getNodi().get(i)).size();x++){
				Arco<String,Double> a= (Arco<String, Double>) g.neighbors(g.getNodi().get(i)).get(x);
				total = total + a.weight;
			}
		}
		return total;
	}
	public static double getMinArc(DenseGraph<String, Integer> g){
		double min=Double.MAX_VALUE;
		for(int i = 0; i< g.getNodi().size();i++){
			
			for(int x = 0; x< g.neighbors(g.getNodi().get(i)).size();x++){
				Arco<String,Double> a= (Arco<String, Double>) g.neighbors(g.getNodi().get(i)).get(x);
				if(a.weight<min){
					min=a.weight;
				}
					
			}
		}
		return min;
	}
	public static double getNumberOfArcs(DenseGraph<String, Integer> g){
		return g.getNumberOfArcs();
	}
}
