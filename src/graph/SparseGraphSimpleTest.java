package graph;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class SparseGraphSimpleTest {

	@Test
	public void testAddVertex() {
		Graph g = new SparseGraphSimple();
		assert(g.addVertex("12"));
	}

	@Test
	public void testAddEdgeVVE() {
		Graph<String, Integer> g = new SparseGraphSimple<String, Integer>();
		assert(g.addEdge("1", "2", 2));
	}

	@Test
	public void testAddEdgeVVDoubleE() {
		Graph<String, Integer> g = new SparseGraphSimple<String, Integer>();
		assert(g.addEdge("1", "2", 1.0, 1));
	}

	@Test
	public void testAddUndirectedEdgeVVE() {
		Graph<String, Integer> g = new SparseGraphSimple<String, Integer>();
		assert(g.addUndirectedEdge("1", "2", 1));
	}

	@Test
	public void testHasVertex() {
		Graph g = new SparseGraphSimple();
		g.addVertex("12");
		assert(g.hasVertex("12"));
	}

	@Test
	public void testHasEdge() {
		Graph<String, Integer> g = new SparseGraphSimple<String, Integer>();
		g.addEdge("1", "2", 2);
		assert(g.hasEdge("1", "2"));
	}

	@Test
	public void testGetWeight() {
		Graph<String, Integer> g = new SparseGraphSimple<String, Integer>();
		Random rn = new Random();
		double peso = rn.nextDouble();
		g.addEdge("1", "2", peso , 2);
		assert(g.getWeight("1", "2")==peso);
	}

	@Test
	public void testVertices() {
		Graph<String, Integer> g = new SparseGraphSimple<String, Integer>();
		g.addVertex("1");
		g.addVertex("2");
		g.addVertex("3");
		g.addVertex("4");
		g.addVertex("5");
		assert(g.vertices().get(2).equalsIgnoreCase("3"));
	}

	@Test
	public void testNeighbors() {
		Graph<String, Integer> g = new SparseGraphSimple<String, Integer>();
		g.addEdge("1","2",0);
		g.addEdge("1","3",1);
		g.addEdge("1","4",2);
		g.addEdge("1","5",3);
		g.addEdge("1","5",4);
		assert(g.neighbors("1").get(2)!=null);
	}

	@Test
	public void testGetEdge() {
		Graph<String, Integer> g = new SparseGraphSimple<String, Integer>();
		g.addEdge("1","2",0);
		g.addEdge("1","3",1);
		g.addEdge("1","4",2);
		g.addEdge("1","5",3);
		g.addEdge("1","5",4);
		fail("not yet implemented");
	}

}
