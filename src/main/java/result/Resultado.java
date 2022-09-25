package main.java.result;

import main.java.Bubble;
import main.java.Element;
import main.java.Heap;
import main.java.Merge;
import main.java.Quick;
import main.java.Shell;

//matriz[0] -> desordenado
// matriz[1] -> ASC
// matriz[2] -> DES
// bubble, merge, quick, shell, heap

public class Resultado {

	public static void main(String[] args) {
		
		//Métodos
		Bubble bubble = new Bubble();
		Quick quick = new Quick();
		Merge merge = new Merge();
		Shell shell = new Shell();
		Heap heap = new Heap();
		
		//Elementos
		Element a = new Element(1000);
		Element b = new Element(5000);
		Element c = new Element(10000);
		Element d = new Element(15000);
		Element e = new Element(20000);
		Element f = new Element(25000);
		Element g = new Element(30000);
		Element h = new Element(35000);
		Element i = new Element(40000);
		Element j = new Element(45000);
		Element k = new Element(50000);
//		
//		for (int t=1000; t <= 50000; t += 5000) {
//			t += (t == 1000 ? 4000 : 0);
//			Element element = new Element(t);
//			System.out.println(t);
//			for (int u=0; u < 3; u++) {
//				System.out.println(u);
//			}
//		}
		
		System.out.println("**Bubble");
		bubble.start(a.matriz[0]);
		bubble.start(a.matriz[1]);
		bubble.start(a.matriz[2]);
		
//		System.out.println("**Quick");
//		quick.start(e10.matriz[0]);
//		quick.start(e10.matriz[1]);
//		quick.start(e10.matriz[2]);
		
//		System.out.println("**Merge");
//		merge.start(e10.matriz[0]);
//		merge.start(e10.matriz[1]);
//		merge.start(e10.matriz[2]);
		
//		System.out.println("**Shell");
//		shell.start(e10.matriz[0]);
//		shell.start(e10.matriz[1]);
//		shell.start(e10.matriz[2]);
		
//		System.out.println("**Heap");
//		heap.start(e10.matriz[0]);
//		heap.start(e10.matriz[1]);
//		heap.start(e10.matriz[2]);
		

	}
}
