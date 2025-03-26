package Ejercicios.tema3_ejerciciosIntegracion.tema3_ejerciciosIntegracion;

public class Ej4_ServicioPagos {
    private double saldo;

    public Ej4_ServicioPagos() {
        this.saldo = 1000.0;  
    }

    public boolean procesarPago(double monto) {
        if (monto <= 0 || monto > saldo) {
            System.out.println("Pago rechazado. Verifique el monto.");
            return false;  
        }
        saldo -= monto;
        return true;  
    }
    
    // faltaba el getSaldo para hacer el assertEquals
    public double getSaldo() {
    	return saldo;
    }
}

