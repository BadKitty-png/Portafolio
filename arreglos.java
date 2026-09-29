package datos2.practicos.ejercicio1;

public class arreglos {

    public static void main(String[] args) {

        // =========================================================
        // AUDITORÍA DEL SISTEMA LOGÍSTICO GLOBAL
        // Arreglos 1D, 2D y 3D
        // Número de control: 1225100330
        // Último dígito (X): 0
        // =========================================================

        // =========================================================
        // FASE 1: ARREGLO UNIDIMENSIONAL
        // =========================================================

        System.out.println("FASE 1 - ARREGLO UNIDIMENSIONAL");
        System.out.println("======================================");

        // X = 0, porque el último dígito del número de control es 0
        int[] temperaturas = {12, -3, 4, 8, -1, 0, 15, 2};

        double promedio = promedioPositivas(temperaturas);

        System.out.println("Temperaturas:");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Índice " + i + ": " + temperaturas[i] + "°C");
        }

        System.out.println("\nPromedio de temperaturas positivas: "
                + promedio + "°C");

        System.out.println("\nÍndices donde la temperatura está bajo cero:");

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < 0) {
                System.out.println("Índice: " + i
                        + " -> " + temperaturas[i] + "°C");
            }
        }

        /*
         * PREGUNTA CONCEPTUAL 1.2:
         *
         * ¿Por qué en Java un arreglo unidimensional no puede cambiar
         * de tamaño en tiempo de ejecución?
         *
         * En Java, un arreglo tiene un tamaño fijo desde el momento
         * en que se crea. La cantidad de posiciones se establece en
         * memoria y no puede modificarse posteriormente.
         *
         * Si necesitamos una estructura cuyo tamaño pueda crecer o
         * disminuir, podemos utilizar estructuras como ArrayList.
         *
         * ¿Qué ocurre al intentar acceder a temperaturas[8]?
         *
         * El arreglo tiene 8 elementos, por lo que sus índices válidos
         * van del 0 al 7. Al intentar acceder a temperaturas[8],
         * Java genera una excepción:
         *
         * ArrayIndexOutOfBoundsException
         *
         * Esto ocurre porque estamos intentando acceder a una posición
         * que no existe dentro del arreglo.
         */


        // FASE 2: ARREGLO BIDIMENSIONAL
        // =========================================================

        System.out.println("\n\n======================================");
        System.out.println("FASE 2 - ARREGLO BIDIMENSIONAL");
        System.out.println("======================================");

        int[][] inventario = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {12, 22, 32, 42},
                {18, 28, 38, 48}
        };

        System.out.println("Matriz de inventario:");

        for (int i = 0; i < inventario.length; i++) {

            for (int j = 0; j < inventario[i].length; j++) {
                System.out.print(inventario[i][j] + "\t");
            }

            System.out.println();
        }

        // ---------------------------------------------------------
        // Tarea 2.1 - Total de stock por cada sucursal
        // ---------------------------------------------------------

        System.out.println("\nTotal de stock por sucursal:");

        for (int i = 0; i < inventario.length; i++) {

            int total = 0;

            for (int j = 0; j < inventario[i].length; j++) {
                total += inventario[i][j];
            }

            System.out.println("Sucursal " + (i + 1)
                    + ": " + total);
        }

        // ---------------------------------------------------------
        // Tarea 2.1 - Diagonal principal
        // ---------------------------------------------------------

        System.out.println("\nDiagonal principal:");

        for (int i = 0; i < inventario.length; i++) {
            System.out.println("inventario[" + i + "][" + i + "] = "
                    + inventario[i][i]);
        }

        /*
         * PREGUNTA CONCEPTUAL 2.2:
         *
         * ¿Cuál es la diferencia entre un arreglo bidimensional
         * regular y un arreglo dentado (jagged array)?
         *
         * Un arreglo bidimensional regular tiene la misma cantidad
         * de columnas en cada fila.
         *
         * Ejemplo:
         *
         * int[][] matriz = new int[4][4];
         *
         * Todas las filas tienen 4 columnas.
         *
         * En un arreglo dentado, cada fila puede tener una cantidad
         * diferente de elementos.
         *
         * Ejemplo:
         *
         * int[][] matrizDentada = {
         *     {1, 2},
         *     {3, 4, 5},
         *     {6, 7, 8, 9}
         * };
         *
         * En este caso, las filas tienen diferente longitud.
         *
         * En memoria, Java maneja un arreglo bidimensional como un
         * arreglo de referencias hacia otros arreglos. Por eso,
         * un arreglo dentado puede tener filas de diferentes tamaños.
         */


        // =========================================================
        // FASE 3: ARREGLO TRIDIMENSIONAL
        // =========================================================


        System.out.println("FASE 3 - ARREGLO TRIDIMENSIONAL");
        System.out.println("======================================");

        // Dimensiones:
        // [Edificio][Piso][Pasillo]
        // [2][3][3]

        int[][][] contenedores = new int[2][3][3];

        // ---------------------------------------------------------
        // Tarea 3.1
        // Llenar el arreglo utilizando:
        // Edificio + Piso + Pasillo + X
        // X = 0
        // ---------------------------------------------------------

        for (int edificio = 0; edificio < contenedores.length; edificio++) {

            for (int piso = 0; piso < contenedores[edificio].length; piso++) {

                for (int pasillo = 0;
                     pasillo < contenedores[edificio][piso].length;
                     pasillo++) {

                    contenedores[edificio][piso][pasillo]
                            = edificio + piso + pasillo + 0;
                }
            }
        }

        System.out.println("Valores del arreglo tridimensional:");

        for (int edificio = 0; edificio < contenedores.length; edificio++) {

            for (int piso = 0; piso < contenedores[edificio].length; piso++) {

                for (int pasillo = 0;
                     pasillo < contenedores[edificio][piso].length;
                     pasillo++) {

                    System.out.println(
                            "Edificio [" + edificio +
                            "], Piso [" + piso +
                            "], Pasillo [" + pasillo +
                            "] = " +
                            contenedores[edificio][piso][pasillo]
                    );
                }
            }
        }

        // ---------------------------------------------------------
        // Tarea 3.2
        // Imprimir únicamente las coordenadas cuyo valor sea par
        // ---------------------------------------------------------

        System.out.println("\nCoordenadas donde el valor es PAR:");

        for (int edificio = 0; edificio < contenedores.length; edificio++) {

            for (int piso = 0; piso < contenedores[edificio].length; piso++) {

                for (int pasillo = 0;
                     pasillo < contenedores[edificio][piso].length;
                     pasillo++) {

                    int valor = contenedores[edificio][piso][pasillo];

                    if (valor % 2 == 0) {

                        System.out.println(
                                "[" + edificio + "][" +
                                piso + "][" +
                                pasillo + "] = " +
                                valor
                        );
                    }
                }
            }
        }

        /*
         * PREGUNTA CONCEPTUAL 3.3:
         *
         * Si el sistema creciera a 100 edificios, 50 pisos y
         * 50 pasillos, el arreglo tendría:
         *
         * 100 x 50 x 50 = 250,000 posiciones.
         *
         * Un arreglo tridimensional puede ser útil cuando la
         * estructura de los datos es sencilla y las dimensiones
         * están claramente definidas. Sin embargo, conforme el
         * sistema crece, puede resultar más difícil de leer,
         * mantener y comprender.
         *
         * También se deben considerar los recursos de memoria
         * necesarios para almacenar una gran cantidad de datos.
         *
         * En comparación, la Programación Orientada a Objetos
         * permite representar los elementos del sistema mediante
         * objetos, por ejemplo, objetos Edificio, Piso y Pasillo.
         * Esto puede hacer que el código sea más organizado y
         * fácil de mantener cuando el sistema se vuelve grande
         * y complejo.
         */


        // =========================================================
        // FIN DEL PROGRAMA
        // =========================================================

        System.out.println("\n======================================");
        System.out.println("AUDITORÍA FINALIZADA");
        System.out.println("======================================");
    }


    // =============================================================
    // MÉTODO PARA CALCULAR EL PROMEDIO DE TEMPERATURAS POSITIVAS
    // =============================================================

    public static double promedioPositivas(int[] temperaturas) {

        int suma = 0;
        int cantidad = 0;

        for (int temperatura : temperaturas) {

            if (temperatura > 0) {
                suma += temperatura;
                cantidad++;
            }
        }

        if (cantidad == 0) {
            return 0;
        }

        return (double) suma / cantidad;
    }
}