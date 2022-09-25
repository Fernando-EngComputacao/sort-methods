package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Element {

    //Atributos
    Integer number;
    public Integer[][] matriz = new Integer[3][1];
    List<Integer> original = new ArrayList<Integer>();


    //Construtor
    public Element(Integer number) {
        this.number = number;
        sobeMatriz();
    }

    //Metodos
    public void geraVetor() {
        for(int a = 0; a < this.number; a++) {
            original.add((int) (1 + (Math.round(Math.random() * 1000000))));
        }
        matriz[0] = (Integer[]) original.toArray(new Integer[number]);
    }


    public void ordenaASC() {
        Collections.sort(original);
        matriz[1] = (Integer[]) original.toArray(new Integer[number]);
    }

    public void ordenaDES() {
        Collections.sort(original, Collections.reverseOrder());
        matriz[2] = (Integer[]) original.toArray(new Integer[number]);
    }

    public void sobeMatriz() {
        geraVetor();
        ordenaASC();
        ordenaDES();
    }

    public void write(Integer[] a, Integer[] b, Integer[] c) {
        System.out.println(java.util.Arrays.toString(a));
        System.out.println(java.util.Arrays.toString(b));
        System.out.println(java.util.Arrays.toString(c));
    }


    //Main
    public static void main(String[] args) {
        Element e = new Element(1500);


        e.sobeMatriz();
    }
}
