package Ejercicios.tema3_ejerciciosIntegracion.tema3_ejerciciosIntegracion;

public class Ej1_ServicioUsuarios {
    private Ej1_BaseDeDatos baseDeDatos;

    public Ej1_ServicioUsuarios(Ej1_BaseDeDatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public void registrarUsuario(String usuario) {
        baseDeDatos.agregarUsuario(usuario);
    }

    public boolean usuarioRegistrado(String usuario) {
        return baseDeDatos.verificarUsuario(usuario);
    }
}

