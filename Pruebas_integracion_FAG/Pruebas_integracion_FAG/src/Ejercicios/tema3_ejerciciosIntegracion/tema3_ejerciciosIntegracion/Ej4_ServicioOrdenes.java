package Ejercicios.tema3_ejerciciosIntegracion.tema3_ejerciciosIntegracion;

public class Ej4_ServicioOrdenes {
    private Ej4_ServicioPagos servicioPagos;

    public Ej4_ServicioOrdenes(Ej4_ServicioPagos servicioPagos) {
        this.servicioPagos = servicioPagos;
    }

    public boolean procesarOrden(double montoOrden) {
        if (montoOrden <= 0) {
            System.out.println("Monto de la orden inválido.");
            return false;
        }

        // Intentar procesar el pago
        boolean pagoExitoso = servicioPagos.procesarPago(montoOrden);
        if (!pagoExitoso) {
            System.out.println("Error en el pago.");
            return false;
        }

        System.out.println("Orden procesada correctamente.");
        return true; 
    }
}

