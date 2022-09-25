package main.java;

public class Main {

	public static void main(String[] args) {
		
		//Shell
		System.out.println("**SHELL");
		Integer[] array = {12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8};
		Shell shell = new Shell();
	    shell.shellSort(array);
	    System.out.println(java.util.Arrays.toString(array));
	    
	    //Bubble
	    System.out.println("**BUBBLE");
	    Integer[] arrayB = {12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8};
	    Bubble bubble = new Bubble();
	    bubble.bubbleSort(arrayB);
	    System.out.println(java.util.Arrays.toString(arrayB));
	    
	    //Heap
	    System.out.println("**HEAP");
	    Integer[] arrayH = { 12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8 };
		Heap heap = new Heap();
		heap.heapSort(arrayH);
		System.out.println(java.util.Arrays.toString(array));
	    
	    //Merge
		System.out.println("**MERGE");
		Integer[] arrayM = { 12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8 };
		Merge merge = new Merge();
		merge.mergeSort(arrayM, 0, arrayM.length - 1);
		System.out.println(java.util.Arrays.toString(arrayM));
		
		//Quick
		System.out.println("**QUICK");
		Integer[] arrayQ = { 12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8 };
		Quick quick = new Quick();
		quick.quickSort(arrayQ, 0, arrayQ.length - 1);
		System.out.println(java.util.Arrays.toString(arrayQ));
	}
}
