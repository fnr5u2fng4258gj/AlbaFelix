package tema3_cajaNegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class LimiteEdadTest {

    @Test
    void testEdadMinimaValida() {
        Edad edad = new Edad();
        assertEquals(true, edad.esMayorDeEdad(18), "Error: Debería ser mayor de edad.");
    }

    @Test
    void testEdadMaximaValida() {
        Edad edad = new Edad();
        assertEquals(true, edad.esMayorDeEdad(100), "Error: Debería ser mayor de edad.");
    }

    @Test
    void testEdadInferiorLimite() {
        Edad edad = new Edad();
        assertEquals(false, edad.esMayorDeEdad(17), "Error: Debería ser menor de edad.");
    }

    @Test
    void testEdadCero() {
        Edad edad = new Edad();
        assertEquals(false, edad.esMayorDeEdad(0), "Error: Debería ser menor de edad.");
    }
}