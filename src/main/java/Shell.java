package main.java;

import main.java.father.Sort;

//tudo certo

public class Shell extends Sort {

	public void shellSort(Integer[] array)	{
	    
	    for (int gapSize = array.length / 2; gapSize > 0; gapSize /= 2){
	        for (int currentIndex = gapSize; currentIndex < array.length; currentIndex++){
	            // save the currentIndex
	            int currentIndexCopy = currentIndex;
	            // save the value of the currentIndex
	            int item = array[currentIndex];
	            
	            int contador = 0;
	            
	            comparacao++;
	            while (currentIndexCopy >= gapSize && array[currentIndexCopy - gapSize] > item) {
	                array[currentIndexCopy] = array[currentIndexCopy - gapSize];
	                currentIndexCopy -= gapSize;
	                comparacao++;contador++;
	                
	                if (contador > 1) troca++;
	            }

	            array[currentIndexCopy] = item;
	            troca++;
	        }
	    }
	}
	
	public void start(Integer[] matriz) {
		Integer[] vetor = new Integer[matriz.length];
    	System.arraycopy(matriz, 0, vetor, 0, matriz.length);
    	tempo =0; comparacao =0; troca = 0;
    	
    	long tempoInicial = System.currentTimeMillis();
    	shellSort(vetor);
    	tempo = System.currentTimeMillis() - tempoInicial;
	}
}
