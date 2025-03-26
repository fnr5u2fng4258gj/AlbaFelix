package Ejercicios.tema3_ejerciciosIntegracion.tema3_ejerciciosIntegracion;

import java.util.ArrayList;
import java.util.List;

public class Ej3_BaseDeDatosProductos {
    private List<String> productos;

    public Ej3_BaseDeDatosProductos() {
        this.productos = new ArrayList<>();
    }

    public boolean conectar() {
        return true;
    }

    public void agregarProducto(String producto) {
        if (conectar()) {
            productos.add(producto);
        }
    }

    public boolean verificarProducto(String producto) {
        return productos.contains(producto); 
    }
}
