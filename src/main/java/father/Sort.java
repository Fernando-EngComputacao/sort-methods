package main.java.father;

public class Sort {

	protected long tempo = 0;
	protected long comparacao = 0;
	protected long troca = 0;
	
	
	public void start(Integer[] array) {
		
	}
	
	
	public void write3x(String text) {
    	if (text.equals("\n")) {
    		System.out.println(tempo+"\t"+comparacao+"\t"+troca+"\t");
    	} else {
    		System.out.print(tempo+"\t"+comparacao+"\t"+troca+"\t");
    	}
    }
}
