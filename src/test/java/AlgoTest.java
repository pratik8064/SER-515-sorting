/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import main.java.Item;
import main.java.SortAlgos;

/**
 * @author Pratik Suryawanshi
 *
 */
 
public class AlgoTest {

	
	// this test case will cover all cases except case 3 in edge coverage 
	@Test
	public void bubbleTest1() {
		
		Item[] arr = new Item[5];
		
		arr[0] = new Item(1);
		arr[1] = new Item(5);
		arr[2] = new Item(3);
		arr[3] = new Item(2);
		arr[4] = new Item(6);

		SortAlgos.bubbleSort(arr);
		
		Item[] res = new Item[5];
		res[0] = new Item(1);
		res[1] = new Item(2);
		res[2] = new Item(3);
		res[3] = new Item(5);
		res[4] = new Item(6);
		
		boolean flag = true;
		for(int i = 0;i < res.length;i++) {
			if(res[i].key != arr[i].key) {
				flag = false;
			}
		}
		assertTrue(flag);	
	}

	// this test case will cover case 3 in edge coverage
	@Test(expected = NullPointerException.class)
	public void bubbleTest2() {
		Item[] arr = null;
		SortAlgos.bubbleSort(arr);				
	}
	
	@Test
	public void quickSortTest1() {
		
		Item[] arr = new Item[5];
		
		arr[0] = new Item(1);
		arr[1] = new Item(5);
		arr[2] = new Item(3);
		arr[3] = new Item(2);
		arr[4] = new Item(6);

		SortAlgos.quickSort(arr);
		
		Item[] res = new Item[5];
		res[0] = new Item(1);
		res[1] = new Item(2);
		res[2] = new Item(3);
		res[3] = new Item(5);
		res[4] = new Item(6);
		
		boolean flag = true;
		for(int i = 0;i < res.length;i++) {
			if(res[i].key != arr[i].key) {
				flag = false;
			}
		}
		assertTrue(flag);	
	}
	
	@Test
	public void selectionSortTest1() {
		
		Item[] arr = new Item[5];
		
		arr[0] = new Item(1);
		arr[1] = new Item(5);
		arr[2] = new Item(3);
		arr[3] = new Item(2);
		arr[4] = new Item(6);

		SortAlgos.selectionSort(arr);
		
		Item[] res = new Item[5];
		res[0] = new Item(1);
		res[1] = new Item(2);
		res[2] = new Item(3);
		res[3] = new Item(5);
		res[4] = new Item(6);
		
		boolean flag = true;
		for(int i = 0;i < res.length;i++) {
			if(res[i].key != arr[i].key) {
				flag = false;
			}
		}
		assertTrue(flag);	
	}
	
	@Test
	public void insertionSortTest1() {
		
		Item[] arr = new Item[5];
		
		arr[0] = new Item(1);
		arr[1] = new Item(5);
		arr[2] = new Item(3);
		arr[3] = new Item(2);
		arr[4] = new Item(6);

		SortAlgos.insertionSort(arr);
		
		Item[] res = new Item[5];
		res[0] = new Item(1);
		res[1] = new Item(2);
		res[2] = new Item(3);
		res[3] = new Item(5);
		res[4] = new Item(6);
		
		boolean flag = true;
		for(int i = 0;i < res.length;i++) {
			if(res[i].key != arr[i].key) {
				flag = false;
			}
		}
		assertTrue(flag);	
	}
	
	@Test
	public void mergeSortTest1() {
		
		Item[] arr = new Item[5];
		
		arr[0] = new Item(1);
		arr[1] = new Item(5);
		arr[2] = new Item(3);
		arr[3] = new Item(2);
		arr[4] = new Item(6);

		SortAlgos.mergeSort(arr);
		
		Item[] res = new Item[5];
		res[0] = new Item(1);
		res[1] = new Item(2);
		res[2] = new Item(3);
		res[3] = new Item(5);
		res[4] = new Item(6);
		
		boolean flag = true;
		for(int i = 0;i < res.length;i++) {
			if(res[i].key != arr[i].key) {
				flag = false;
			}
		}
		assertTrue(flag);	
	}
	
	@Test
	public void heapSortTest1() {
		
		Item[] arr = new Item[5];
		
		arr[0] = new Item(1);
		arr[1] = new Item(5);
		arr[2] = new Item(3);
		arr[3] = new Item(2);
		arr[4] = new Item(6);

		SortAlgos.heapSort(arr);
		
		Item[] res = new Item[5];
		res[0] = new Item(1);
		res[1] = new Item(2);
		res[2] = new Item(3);
		res[3] = new Item(5);
		res[4] = new Item(6);
		
		boolean flag = true;
		for(int i = 0;i < res.length;i++) {
			if(res[i].key != arr[i].key) {
				flag = false;
			}
		}
		assertTrue(flag);	
	}
	
}
