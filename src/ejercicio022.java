public class ejercicio022 {
    public static void main(String[] args) {
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

        boolean encontrada = false;
        int encontradaFila = -1;
        int encontradaColumna = -1;

        for (int fila = 0; fila <= matrizPrincipal.length - subMatriz.length; fila++) {
            for (int columna = 0; columna <= matrizPrincipal[0].length - subMatriz[0].length; columna++) {
                if (esSubmatriz(matrizPrincipal, subMatriz, fila, columna)) {
                    encontrada = true;
                    encontradaFila = fila;
                    encontradaColumna = columna;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        if (encontrada) {
            System.out.printf("La submatriz fue hallada en la posición: [%d, %d]\n", encontradaFila, encontradaColumna);
        } else {
            System.out.println("La submatriz no fue hallada");
        }
    }

    private static boolean esSubmatriz(int[][] matrizPrincipal, int[][] subMatriz, int fila, int columna) {
        for (int i = 0; i < subMatriz.length; i++) {
            for (int j = 0; j < subMatriz[0].length; j++) {
                if (matrizPrincipal[fila + i][columna + j] != subMatriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
