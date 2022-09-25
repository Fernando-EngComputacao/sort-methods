package main.java.saida;

import main.java.Element;

public class Matricial {
	Integer[][][] matricial = new Integer[11][3][1];
	
	public void instancia() {
		int cont = 0;
		for (int t=1000; t <= 50000; t += 5000) {
			t = (t == 6000 ? 5000 : t);
			Element element = new Element(t);
			for(int i=0; i < 3; i++) {
				matricial[cont][i] = element.matriz[i];
			}
			cont++;
		}
	}
	
//	public static void main(String[] args) {
//		Matricial ma = new Matricial();
//		ma.instancia();
//		
//		System.out.println(java.util.Arrays.toString(ma.matricial[0][0]));
//		System.out.println(java.util.Arrays.toString(ma.matricial[0][1]));
//		System.out.println(java.util.Arrays.toString(ma.matricial[0][2]));
//		System.out.println(ma.matricial[0][0].length);
//		System.out.println(ma.matricial[0][1].length);
//		System.out.println(ma.matricial[0][2].length);
//	}
}
