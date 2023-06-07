import java.rmi.UnexpectedException;

public class ejercicio018 {
    /*18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
            traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
            cambiando sus filas por columnas (o viceversa).*/
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[4][4];
        rellenarMatriz4x4(matriz);
        imprimirMatriz(matriz);
        System.out.println("**********************");
        imprimirMatriz(obtenerTraspuesta(matriz));
    }

    public static void rellenarMatriz4x4(int[][] matriz) {
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        int i, j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }
    }

    public static int[][] obtenerTraspuesta(int[][] matriz) {
        int i, j;
        int traspuesta[][] = new int[matriz.length][matriz.length];
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }
}
