package graph;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		SparseGraph<Integer,String> grafo = new SparseGraph<Integer,String>();
		
		grafo.addVertex(4);
		grafo.addVertex(2);
		grafo.addVertex(15);
		grafo.addVertex(14);
		grafo.addVertex(18);
		grafo.addVertex(19);
		grafo.addVertex(42);
		grafo.addVertex(16);
		grafo.addVertex(32);
		grafo.addVertex(31);
		grafo.addVertex(34);
		grafo.addVertex(24);
		grafo.addVertex(20);
		grafo.addVertex(8);
		grafo.addVertex(11);
		grafo.addVertex(3);
		grafo.addVertex(5);
		grafo.addVertex(1);
		
		grafo.addEdge(8, 20, "8->20");
		grafo.addEdge(4, 11,"4->11");
		grafo.addEdge(8, 3, "8->3");
		grafo.addEdge(3, 9, "3->9");
		grafo.addEdge(42, 16, "42->16");
		grafo.addEdge(42, 8, "42->8");
		grafo.addEdge(19, 20,"19->20");
		grafo.addEdge(18, 3, "18->3");
		grafo.addEdge(11, 9, "11->9");
		grafo.addEdge(20, 18, "20->18");
		grafo.addEdge(16, 4, "16->4");
		grafo.addEdge(42, 19, "42->19");
		grafo.addEdge(19, 4, "19->4");
		
		
		grafo.ToDot("grafo");
		
		GraphVisitImplements<Integer, String> gv = new GraphVisitImplements<Integer, String>();
		VertexAnalyserImplements<Integer> va = new VertexAnalyserImplements<Integer>();
		gv.depthFirst(grafo, 4, va);
	}
}