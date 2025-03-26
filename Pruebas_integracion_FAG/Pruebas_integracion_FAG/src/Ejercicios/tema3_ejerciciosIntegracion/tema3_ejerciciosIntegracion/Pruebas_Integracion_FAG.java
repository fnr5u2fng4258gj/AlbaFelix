package Ejercicios.tema3_ejerciciosIntegracion.tema3_ejerciciosIntegracion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Pruebas_Integracion_FAG {

	@Test
	public void Ejercicio_1() {
		Ej1_BaseDeDatos baseDeDatos= new Ej1_BaseDeDatos();
		Ej1_ServicioUsuarios serviciosDeUsuario= new Ej1_ServicioUsuarios(baseDeDatos);
		String nombreDeUsuario="Carlos";
		serviciosDeUsuario.registrarUsuario(nombreDeUsuario);
		Boolean usuarioExiste= serviciosDeUsuario.usuarioRegistrado(nombreDeUsuario);
		assertTrue(usuarioExiste);
	}
	
	@Test
	public void Ejercicio_2() {
		Ej2_ServicioEnvio servicioEnvio= new Ej2_ServicioEnvio();
		Ej2_ServicioPedido servicioPedido= new Ej2_ServicioPedido(servicioEnvio);
		String nombreDePedido= "Pedido123";
		servicioPedido.crearYEnviarPedido(nombreDePedido);
		Boolean envioEnviado= servicioEnvio.enviarPedido(nombreDePedido);
		assertTrue(envioEnviado);
	}
	
	@Test
	public void Ejercicio_3() {
		Ej3_BaseDeDatosProductos baseDeDatosProductos= new Ej3_BaseDeDatosProductos();
		Ej3_GestorProductos gestorDeProductos= new Ej3_GestorProductos(baseDeDatosProductos);
		String producto="caja";
		gestorDeProductos.registrarProducto(producto);
		Boolean productoRegistrado= baseDeDatosProductos.verificarProducto(producto);
		assertTrue(productoRegistrado);
	}
	
	@Test
	public void Ejercicio_4() {
		Ej4_ServicioPagos serviciosPagos= new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes serviciosOrdenes= new Ej4_ServicioOrdenes(serviciosPagos);
		double cantidadDinero=500;
		Boolean dineroPrcesado=serviciosOrdenes.procesarOrden(cantidadDinero);
		assertEquals(500,serviciosPagos.getSaldo());
	}
}
