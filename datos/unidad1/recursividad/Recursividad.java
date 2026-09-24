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

    public static void main(String[] args) {
        saludo("Jan", 10); 
    }
}
