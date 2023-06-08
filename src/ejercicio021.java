public class ejercicio021 {
    /*21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
            3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
            dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
            se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
            que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
            la matriz M en la cual empieza el primer elemento de la submatriz P.*/

            //Mejorar la presente resolución hecha en grupo ---> ejercicio022
    public static void main(String[] args) {
        int i, j, leerColumnas, contadorColumnas, leerFilas, contadorFilas, contadorSimilitudes, a, b, encontradaFila, encontradaColumna;
        boolean encontrada;
        encontrada = false;

        int[][] matrizPrincipal = {
                {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
                {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
                {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
                {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
                {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}
        };

        int[][] subMatriz = {
                {36, 5, 67},
                {89, 90, 75},
                {14, 22, 26}
        };

        contadorColumnas = 0;
        contadorFilas = 0;
        contadorSimilitudes = 0;
        encontradaFila = 0;
        encontradaColumna = 0;

        for (leerFilas = 0; leerFilas < 8; leerFilas++) {
            for (leerColumnas = 0; leerColumnas < 8; leerColumnas++) {
                for (i = 0 + contadorFilas; i < 3 + contadorFilas; i++) {
                    for (j = 0 + contadorColumnas; j < 3 + contadorColumnas; j++) {
                        /*System.out.print(matrizPrincipal[i][j]);*/
                        for (a = 0; a < subMatriz.length; a++) {
                            for (b = 0; b < subMatriz.length; b++) {
                                if (matrizPrincipal[i][j] == subMatriz[a][b]) {
                                    contadorSimilitudes++;
                                }
                            }
                        }
                    }
                    /*System.out.println("Primera vuelta");*/
                }
                /*System.out.println("Segunda vuelta");*/
                if (contadorSimilitudes == 9) {
                    encontrada = true;
                    /*System.out.println("El anterior es la submatriz");*/
                    if (encontrada) {
                        encontradaFila = leerFilas;
                        encontradaColumna = leerColumnas;
                    }
                }
                contadorSimilitudes = 0;
                contadorColumnas++;
            }

            contadorFilas++;
            contadorColumnas = 0;

        }
        if (encontrada) {
            System.out.printf("%40s%2d%1s%2d%2s", "La submatriz fue hallada en la posición: [", encontradaFila, ",", encontradaColumna, "]");
        } else {
            System.out.println("La submatriz no fue hallada");
        }
    }
}
