package main.java;

import main.java.father.Sort;

//Tudo certo

public class Quick extends Sort {
	public void quickSort(Integer[] array, int startIndex, int endIndex) {
        
        if (startIndex < endIndex) {
            
            int pivotIndex = partition(array, startIndex, endIndex);
            quickSort(array, startIndex, pivotIndex);
            quickSort(array, pivotIndex + 1, endIndex);
        }
    }

    public int partition(Integer[] array, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        int pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true) {
        	comparacao++;
            // start at the FIRST index of the sub-array and increment
            // FORWARD until we find a value that is > pivotValue
            do {
            	startIndex++;
            	comparacao++;
            	 // start at the FIRST index of the sub-array and increment
                // FORWARD until we find a value that is > pivotValue
            	} 
            while (array[startIndex] < pivotValue);

            // start at the LAST index of the sub-array and increment
            // BACKWARD until we find a value that is < pivotValue
            do {
            	endIndex--;
            	comparacao++;
            } while (array[endIndex] > pivotValue);

            if (startIndex >= endIndex) {
            	troca++; comparacao++;
            	return endIndex;
            	
            }

            // swap values at the startIndex and endIndex
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            troca++;
        }
    }
    
    public void start(Integer[] array) {
    	Integer[] vetor = new Integer[array.length];
    	System.arraycopy(array, 0, vetor, 0, array.length);
    	tempo =0; comparacao =0; troca = 0;
    	
        long tempoInicial = System.currentTimeMillis();
        quickSort(vetor, 0, vetor.length - 1);
        tempo = System.currentTimeMillis() - tempoInicial;
    }
}


//public class Quick extends Sort {
//
//    public  void quickSort(Integer[] array, int inicio, int fim) {
//        if (inicio < fim) {
//            int posicaoPivo = separar(array, inicio, fim);
//            quickSort(array, inicio, posicaoPivo - 1);
//            quickSort(array, posicaoPivo + 1, fim);
//        }
//    }
//
//    public int separar(Integer[] vetor, int inicio, int fim) {
//        int pivo = vetor[inicio];
//        int i = inicio + 1, f = fim;
//        while (i <= f) {
//            comparacao++;
//            if (vetor[i] <= pivo)
//                i++;
//            else if (pivo < vetor[f])
//                f--;
//            else {
//                troca++;
//                int troca = vetor[i];
//                vetor[i] = vetor[f];
//                vetor[f] = troca;
//                i++;
//                f--;
//            }
//        }
//        troca++;
//        vetor[inicio] = vetor[f];
//        vetor[f] = pivo;
//        return f;
//    }

//    public void start(Integer[] array) {
//        tempo = comparacao = troca = 0;
//        long tempoInicial = System.currentTimeMillis();
//        quickSort(array, 0, array.length - 1);
//        tempo = System.currentTimeMillis() - tempoInicial;
//    }
//}
