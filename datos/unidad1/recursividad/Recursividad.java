package datos.unidad1.recursividad;

public class Recursividad {
		

	public static void saludo(int total) {//Condicion base
		if(total <= 0)
			return;
		else{//Condicion recursiva o repetitiva
			System.out.println("Hola");
			saludo(total - 1);
		}
	}

	public static void main(String[] a){
		saludo(10);
	}
}
