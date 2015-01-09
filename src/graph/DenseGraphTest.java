package graph;

import static org.junit.Assert.*;

import org.junit.Test;

public class DenseGraphTest {

	@Test
	public void testAddVertex() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();
		assert(test.addVertex("a"));
	}
	@Test
	public void testAddVertex1() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();
		test.addVertex("a");
		assert(test.addVertex("a")==false);
	}
	@Test
	public void testAddEdgeObjectObjectObject() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();
		
	}

	@Test
	public void testAddEdgeObjectObjectDoubleObject() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testAddUndirectedEdgeObjectObjectObject() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testAddUndirectedEdgeObjectObjectDoubleObject() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testHasVertex() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testHasEdge() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testGetWeight() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testVertices() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testNeighbors() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testGetNumberOfArcs() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

	@Test
	public void testGetNumberOfNodes() {
		DenseGraph<String, Double> test = new DenseGraph<String, Double>();

	}

}
