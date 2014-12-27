package graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GraphTest {
	public static void main(String[] args) {
		DenseGraph df = new DenseGraph();
		df.addEdge(1, 2, 3);
		
		BufferedReader in = null;
		String text = "";
		try {
			in = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = in.readLine()) != null) {
				process text = text + line;
			}
		} catch (FileNotFoundException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		} finally {
			if (in != null)
				in.close();
		}
		
	}
	
}
