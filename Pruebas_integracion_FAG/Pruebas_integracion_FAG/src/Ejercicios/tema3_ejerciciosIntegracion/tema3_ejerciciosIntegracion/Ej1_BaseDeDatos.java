package Ejercicios.tema3_ejerciciosIntegracion.tema3_ejerciciosIntegracion;

import java.util.ArrayList;
import java.util.List;

public class Ej1_BaseDeDatos {
    private List<String> usuarios;

    public Ej1_BaseDeDatos() {
        this.usuarios = new ArrayList<>();
    }

    public boolean conectar() {
        return true;
    }

    public void agregarUsuario(String usuario) {
        if (conectar()) {
            usuarios.add(usuario);
        }
    }

    public boolean verificarUsuario(String usuario) {
        return usuarios.contains(usuario);
    }
}
