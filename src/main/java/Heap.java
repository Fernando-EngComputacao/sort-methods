package main.java;

import main.java.father.Sort;

public class Heap extends Sort {
	
	public void heapSort(Integer[] array) {
		int size = array.length;

		for (int i = size / 2 - 1; i >= 0; i--)
			heapify(array, size, i);

	
		for (int i = size - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			troca++;

			
			heapify(array, i, 0);
		}
	}

	
	public void heapify(Integer[] array, int size, int i) {
		int max = i; 
		int left = 2 * i + 1;
		int right = 2 * i + 2;

	
		comparacao++;
		if (left < size && array[left] > array[max])
			max = left;


		if (right < size && array[right] > array[max])
			max = right;


		if (max != i) {
			int temp = array[i];
			array[i] = array[max];
			array[max] = temp;
			troca++;

			heapify(array, size, max);
		}
	}
	
	public void start(Integer[] matriz) {
		Integer[] vetor = new Integer[matriz.length];
    	System.arraycopy(matriz, 0, vetor, 0, matriz.length);
    	tempo =0; comparacao =0; troca = 0;
    	
    	long tempoInicial = System.currentTimeMillis();
    	heapSort(vetor);
    	tempo = System.currentTimeMillis() - tempoInicial;
    }
}
