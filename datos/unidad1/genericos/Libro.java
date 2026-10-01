package datos.unidad1.genericos;

public class Libro extends Producto<Integer> {

    public Libro(String nombre, double precio, int paginas) {
        super(nombre, precio, paginas);
    }

    public int getPaginas() {
        return getExtra();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("====================================");
        String datos = "Nombre: " + nombre + 
                       "\nPrecio: $" + precio + 
                       "\nPáginas: " + getExtra();
        System.out.println(datos);
        System.out.println("====================================");
    }
}