/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 * El algoritmo es bastante simple: Dado un vector de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin
 * tachar son números primos.
 */
package numerosprimos;

public class CribaEratostenes {

    /**
     *
     * Genera un array de números primos desde 1 hasta el valor máximo dado.
     *
     * @param maximoValor el valor máximo hasta el cual se generarán los números
     * primos.
     *
     * @return un array de números primos.
     */
    public static int[] generarPrimos(int maximoValor) {
        int[] primos;
        if (maximoValor < 2) {
            primos = new int[0]; // vacío
        } else {
            boolean[] esPrimo = inicializarArray(maximoValor);
            criba(maximoValor, esPrimo);
            primos = obtenerNumerosPrimos(maximoValor, esPrimo);
        }
        return primos;
    }

    /**
     *
     * Inicializa un array de tamaño max+1, donde todos los valores son true,
     * excepto el primer y segundo elemento que
     *
     * @param max el tamaño del array a crear.
     *
     * @return un array inicializado con todos los valores en true.
     */
    private static boolean[] inicializarArray(int max) {
        int dim = max + 1;
        boolean[] esPrimo = new boolean[max + 1];

        for (int i = 0; i < dim; i++) {
            esPrimo[i] = true;
        }

        esPrimo[0] = esPrimo[1] = false;

        return esPrimo;
    }

    /**
     *
     * Elimina los valores del array que no son primos, utilizando la técnica de
     * la Criba de Eratóstenes.
     *
     * @param max el valor máximo hasta el cual realizar la criba.
     *
     * @param esPrimo el array a cribar.
     */
    private static void criba(int max, boolean[] esPrimo) {
        int dim = max + 1;

        for (int i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (esPrimo[i]) {
                for (int j = 2 * i; j < dim; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
    }

    /**
     *
     * Obtener un array con los valores que son primos.
     *
     * @param max el valor máximo hasta el cual se generaron los números primos.
     *
     * @param esPrimo el array con los valores que se determinaron como primos.
     *
     * @return un array con los valores que son primos.
     */
    private static int[] obtenerNumerosPrimos(int max, boolean[] esPrimo) {
        int dim = max + 1;
        int cuenta = 0;

        for (int i = 0; i < dim; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }

        int[] primos = new int[cuenta];

        for (int i = 0, j = 0; i < dim; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }

        return primos;
    }
}
