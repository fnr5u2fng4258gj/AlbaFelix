package Ejercicios.tema3_ejerciciosIntegracion.tema3_ejerciciosIntegracion;

public class Ej3_GestorProductos {
    private Ej3_BaseDeDatosProductos baseDeDatos;

    public Ej3_GestorProductos(Ej3_BaseDeDatosProductos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public void registrarProducto(String producto) {
        if (producto == null || producto.isEmpty()) {
            System.out.println("El producto no puede estar vacío");
            return;
        }
        baseDeDatos.agregarProducto(producto); 
    }	

    public boolean productoRegistrado(String producto) {
        return baseDeDatos.verificarProducto(producto);  
    }
}
