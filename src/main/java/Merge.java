package main.java;

import main.java.father.Sort;

//tudo certo

public class Merge extends Sort {
	
	public void mergeSort(Integer[] array, int start, int end) {
		
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(array, start, middle); 
			mergeSort(array, middle + 1, end);
			merge(array, start, middle, end);
		}
	}

	
	public void merge(Integer[] array, int start, int middle, int end) {
		Integer[] leftArray = new Integer[middle - start + 1];
		Integer[] rightArray = new Integer[end - middle];

		
		for (int i = 0; i < leftArray.length; ++i)
			leftArray[i] = array[start + i];


		for (int i = 0; i < rightArray.length; ++i)
			rightArray[i] = array[middle + 1 + i];



		int leftIndex = 0, rightIndex = 0;

		int currentIndex = start;
		
		do {
			
			if (leftArray[leftIndex] <= rightArray[rightIndex]) {
				array[currentIndex] = leftArray[leftIndex];
				leftIndex++;
				troca++;
			} else {
				troca++;
				array[currentIndex] = rightArray[rightIndex];
				rightIndex++;
			}
			currentIndex++;
			comparacao++;
		}
		while (leftIndex < leftArray.length && rightIndex < rightArray.length);

		while (leftIndex < leftArray.length)
			array[currentIndex++] = leftArray[leftIndex++];

	
		while (rightIndex < rightArray.length)
			array[currentIndex++] = rightArray[rightIndex++];
	}
	
	 public void start(Integer[] array) {
		    Integer[] vetor = new Integer[array.length];
	    	System.arraycopy(array, 0, vetor, 0, array.length);
	    	tempo =0; comparacao =0; troca = 0;
	    	
	        long tempoInicial = System.currentTimeMillis();
	        mergeSort(vetor, 0, vetor.length - 1);
	        tempo = System.currentTimeMillis() - tempoInicial;
	    }
}
