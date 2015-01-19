package priorityqueue;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeapPriorityQueueTest {

	@Test
	public void testIsEmpty() {
		PriorityQueue<String> hp = new HeapPriorityQueue<String>();
		assert(hp.isEmpty());
	}

	@Test
	public void testInsert() {
		PriorityQueue<String> hp = new HeapPriorityQueue<String>();
		hp.insert("ciao", 1.0);
		hp.insert("due", 0.1);
		assert(hp.extractfirst().equalsIgnoreCase("due"));
	}

	@Test
	public void testRialloca() {
		PriorityQueue<String> hp = new HeapPriorityQueue<String>();
		for(int i = 100; i> 5;i--){
			hp.insert("a", i+5.0);
		}
		hp.insert("b", 0.0);
		assert(hp.getFirst().equalsIgnoreCase("b"));
	}

	@Test
	public void testExtractfirst() {
		PriorityQueue<String> hp = new HeapPriorityQueue<String>();
		hp.insert("ciao", 1.0);
		hp.insert("due", 0.1);
		hp.insert("hello", 4.0);
		assert(hp.extractfirst().equalsIgnoreCase("due"));
	}

	@Test
	public void testGetFirst() {
		PriorityQueue<String> hp = new HeapPriorityQueue<String>();
		hp.insert("ciao", 1.0);
		hp.insert("due", 0.1);
		hp.insert("hello", 4.0);
		assert(hp.getFirst().equalsIgnoreCase("due"));
	}

	@Test
	public void testDecreasePriority() {
		PriorityQueue<String> hp = new HeapPriorityQueue<String>();
		hp.insert("ciao", 1.0);
		hp.insert("due", 0.1);
		hp.insert("hello", 4.0);
		hp.decreasePriority("hello", 0.0);
		assert(hp.getFirst().equalsIgnoreCase("hello"));
	}

	@Test
	public void testRemove() {
		PriorityQueue<String> hp = new HeapPriorityQueue<String>();
		hp.insert("ciao", 1.0);
		hp.insert("due", 0.1);
		hp.insert("hello", 4.0);
		hp.remove("due");
		assert(hp.getFirst().equalsIgnoreCase("ciao"));
	}

}
