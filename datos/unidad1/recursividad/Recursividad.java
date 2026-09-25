package datos.unidad1.recursividad;

public class Recursividad {

     public static void saludo(String name, int total) {
        
       if (total <= 0) {
            return;
       }

        // Acción
        System.out.println("Hola: " + name);

        // Llamada recursiva con contador decrementado
        saludo(name, total - 1);
    }
	/*
	*Funcion que resaliza una cuenta regresvia 
	*Valor entero 
	*Gtid244
	*Jan Carlo Martinez artinez 
	*25/09/2026
	*/
	public static void cuentaRegresiva(int n) {
		if(n < 1){
			return;
		}else{
			System.out.println(n+" ");
			cuentaRegresiva(n-1);
		}
	}

    public static void main(String[] args) {
        //saludo("Jan", 100); 
		//cuentaRegresiva(100);
		int[] datos = {10, 4, 5, 6, 7, 8, 4};
		int resultado = suma(datos, datos.length - 1);
        	System.out.println("La suma es: " + resultado);
    }
	/*Suma con recursiva, */
		
	public static int suma(int[] datos, int longitud){
		if (longitud < 0) {
            return 0;
        }
		
		return datos[longitud] + suma(datos, longitud - 1);

		
	}
}
/*public class SumaRecursiva {

    public static void main(String[] args) {
        int[] datos = {10, 4, 5, 6, 7, 8, 4};
        
        // Pasamos el arreglo y el índice del último elemento (7 elementos -> índice 6)
        int resultado = suma(datos, datos.length - 1);
        
        System.out.println("La suma es: " + resultado);
    }

    public static int suma(int[] datos, int indice) {
        // Caso base: cuando hemos procesado todo el arreglo (índice menor a 0)
        if (indice < 0) {
            return 0;
        }
        
        // Paso recursivo: elemento actual + suma de los elementos restantes
        return datos[indice] + suma(datos, indice - 1);
    }
}*/






