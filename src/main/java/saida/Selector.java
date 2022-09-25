package main.java.saida;

import main.java.Bubble;
import main.java.Heap;
import main.java.Merge;
import main.java.Quick;
import main.java.Shell;

public class Selector {
	public static void main(String[] args) {

		// Métodos
		Bubble bubble = new Bubble();
		Quick quick = new Quick();
		Merge merge = new Merge();
		Shell shell = new Shell();
		Heap heap = new Heap();

		// Principal
		Matricial matriz = new Matricial();
		matriz.instancia();

		// Saída de dados

		System.out.println("**Bubble");
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 3; j++) {
				bubble.start(matriz.matricial[i][j]);
				bubble.write3x((j == 2 ? "\n" : ""));
			}
		}
		System.out.println("**Quick");
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 3; j++) {
				quick.start(matriz.matricial[i][j]);
				quick.write3x((j == 2 ? "\n" : ""));
			}
		}
		System.out.println("**Merge");
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 3; j++) {
				merge.start(matriz.matricial[i][j]);
				merge.write3x((j == 2 ? "\n" : ""));
			}
		}
		System.out.println("**Shell");
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 3; j++) {
				shell.start(matriz.matricial[i][j]);
				shell.write3x((j == 2 ? "\n" : ""));
			}
		}
		System.out.println("**Heap");
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 3; j++) {
				heap.start(matriz.matricial[i][j]);
				heap.write3x((j == 2 ? "\n" : ""));
			}
		}
	}
}
