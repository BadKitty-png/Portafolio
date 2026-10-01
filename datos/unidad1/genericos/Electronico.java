package datos.unidad1.genericos;

public class Electronico extends Producto<String> {

    public Electronico(String nombre, double precio, String garantia) {
        super(nombre, precio, garantia); // 'extra' guardará la garantía como String
    }

    public String getGarantia() {
        return getExtra();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("====================================");
        String datos = "Electrónico: " + nombre + 
                       "\nPrecio: $" + precio + 
                       "\nGarantía: " + getExtra();
        System.out.println(datos);
        System.out.println("====================================");
    }
}