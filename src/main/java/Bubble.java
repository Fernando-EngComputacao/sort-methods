package main.java;

import main.java.father.Sort;

//Tudo certo

public class Bubble extends Sort {
	
    public void bubbleSort(Integer[] matriz) {
    	
        int n = matriz.length;
        
        while (n > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                comparacao++;
                if (matriz[currentIndex - 1] > matriz[currentIndex]){
                    troca++;
                    int temp = matriz[currentIndex - 1];
                    matriz[currentIndex - 1] = matriz[currentIndex];
                    matriz[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }        
    }

    public void start(Integer[] matriz) {
    	Integer[] vetor = new Integer[matriz.length];
    	System.arraycopy(matriz, 0, vetor, 0, matriz.length);
    	tempo =0; comparacao =0; troca = 0;
    	
    	long tempoInicial = System.currentTimeMillis();
    	bubbleSort(vetor);
    	tempo = System.currentTimeMillis() - tempoInicial;
    
    }
    
}

//System.out.println("[ inicio ] troca["+troca+"] comparacao["+comparacao+"] tempo["+tempo+"]");
//System.out.println("[ fim ] troca["+troca+"] comparacao["+comparacao+"] tempo["+tempo+"]");
