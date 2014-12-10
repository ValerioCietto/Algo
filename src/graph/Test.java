package graph;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		SparseGraph<Integer,String> grafo = new SparseGraph<Integer,String>();
		
		grafo.addVertex(4);
		grafo.addVertex(8);
		grafo.addVertex(11);
		grafo.addVertex(3);
		grafo.addVertex(5);
		grafo.addVertex(9);
		
		grafo.addEdge(4, 8, "4->8");
		grafo.addEdge(4, 11,"4->11");
		grafo.addEdge(8, 3, "8->3");
		grafo.addEdge(3, 9, "3->9");
		grafo.addEdge(11, 9, "11->9");
		
		grafo.ToDot("grafo");
		
		GraphVisitImplements<Integer, String> gv = new GraphVisitImplements<Integer, String>();
		VertexAnalyserImplements<Integer> va = new VertexAnalyserImplements<Integer>();
		gv.depthFirst(grafo, 4, va);
	}
}