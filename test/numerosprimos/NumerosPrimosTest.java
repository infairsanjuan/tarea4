package numerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonio
 */
public class NumerosPrimosTest {

    @Test
    public void testGenerarPrimosCero() {
        int[] expected = new int[0];
        int[] result = CribaEratostenes.generarPrimos(0);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGenerarPrimosDos() {
        int[] expected = {2};
        int[] result = CribaEratostenes.generarPrimos(2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGenerarPrimosTres() {
        int[] expected = {2, 3};
        int[] result = CribaEratostenes.generarPrimos(3);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGenerarPrimosCien() {
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] result = CribaEratostenes.generarPrimos(100);
        assertArrayEquals(expected, result);
    }
}
