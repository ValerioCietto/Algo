package graph;


public class VertexAnalyserImplements<V> implements VertexAnalyser<V>{
	/**
	 * it prints out vertex values
	 */
	@Override
	public void analyse(V vertex) {
		System.out.println(vertex);
	}
	
}