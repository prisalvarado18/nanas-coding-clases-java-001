import java.util.Scanner;

public class ejercicio019 {
    /*19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
            matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
            signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
            denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
    public static void main(String[] args) {
        int matriz[][];
        int tamano, numero, i, j;
        boolean esTraspuesta;

        Scanner leer = new Scanner(System.in);

        esTraspuesta = false;

        System.out.println("Ingrese el tamano de la matriz: ");
        tamano = leer.nextInt();
        matriz = new int[tamano][tamano];
        System.out.println("Ingrese " + tamano * tamano + " numeros: ");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        imprimirMatriz(matriz);
        System.out.println("");
        imprimirMatriz(obtenerTraspuesta(matriz));
        esTraspuesta = comprobarAntiSimetria(matriz, obtenerTraspuesta(matriz));
        if (esTraspuesta) {
            System.out.println("La matriz ingresada es antiasimetrica");
        } else {
            System.out.println("La matriz ingresada no es antiasimetrica");
        }
    }

    public static int[][] obtenerTraspuesta(int[][] matriz) {
        int i, j;
        int[][] traspuesta = new int[matriz.length][matriz.length];
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                traspuesta[j][i] = -matriz[i][j];
            }
        }
        return traspuesta;
    }

    public static boolean comprobarAntiSimetria(int[][] matrizOriginal, int[][] matrizTraspuesta) {
        int i, j, cantidad;
        boolean respuesta = false;

        cantidad = 0;

        for (i = 0; i < matrizOriginal.length; i++) {
            for (j = 0; j < matrizOriginal.length; j++) {
                if (matrizOriginal[i][j] == -matrizTraspuesta[i][j]) {
                    cantidad++;
                }
            }
        }
        if (cantidad == matrizOriginal.length) {
            respuesta = true;
        }
        return respuesta;
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
}
