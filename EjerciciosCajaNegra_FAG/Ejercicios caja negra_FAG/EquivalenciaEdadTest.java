package tema3_cajaNegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EquivalenciaEdadTest {

    @Test
    void testEdadMayorDeEdadPositiva() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(25);
        assertEquals(true, resultado, "Error: Debería ser mayor de edad.");
    }

    @Test
    void testEdadMenorDeEdadNegativa() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(-3);
        assertEquals(false, resultado, "Error: La edad negativa no debería ser válida.");
    }

    @Test
    void testEdadPositivaNegativa() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(8);
        assertEquals(false, resultado, "Error: Debería ser menor de edad.");
    }

    @Test
    void testEdadNegativaPositiva() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(2);
        assertEquals(true, resultado, "Error: Debería ser mayor de edad.");
    }

    @Test
    void testEdadCero() {
        Edad edad = new Edad();
        boolean resultado = edad.esMayorDeEdad(0);
        assertEquals(false, resultado, "Error: Debería ser menor de edad.");
    }
}