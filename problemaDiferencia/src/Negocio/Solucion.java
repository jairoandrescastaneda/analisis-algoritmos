package Negocio;

public class Solucion {
	
	
	static int vector[] = new int[50000];
	static int[]arreglopar = new int[2];
	
	

	static void generateVector() {
		for(int i=0;i<vector.length;i++) {
			vector[i] = (int)(Math.random()*50000)+1;
		}
		
	}
	
	
	static void getDif(){
		
		int menor = vector[0];
		int mayor = vector[0];
		int n = vector.length;
		
		
		for (int i =0;i<n;i++) {
			
			if (mayor<vector[i]) {
				mayor = vector[i];
			}
			else if(menor>vector[i]) {
				menor = vector[i];
			}
			
			
		}
		
		
		arreglopar[0] = mayor;
		arreglopar[1] = menor;
		
		
	}
	
	
	public static void main(String[] args) {
		generateVector();
		getDif();
		
		System.out.println(arreglopar[0]+" - " +arreglopar[1]);
		
	}

}
