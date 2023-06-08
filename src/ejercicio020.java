import java.util.Scanner;

public class ejercicio020 {
    /*20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
            suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
            permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
            El programa deberá comprobar que los números introducidos son correctos, es decir,
            están entre el 1 y el 9.*/

    //Pedir al usuario que ingrese el contenido de la matriz
    //Control de datos: numeros entre 1 y 9
    //Llamar a funcion que determine si la matriz es magica
    public static void main(String[] args) {
        int num, i, j;
        int matriz[][];
        boolean esMagica;
        Scanner leer = new Scanner(System.in);

        matriz = new int[3][3];

        System.out.println("Ingrese 9 números: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                do {
                    num = leer.nextInt();
                    if (num < 1 || num > 9) {
                        System.out.println("ERROR: Ingrese valores entre 1 - 9");
                    }
                } while (num < 1 || num > 9);
                matriz[i][j] = num;
            }
        }

        esMagica = comprobarMatrizMagica(matriz);
        if (esMagica) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica :(");
        }
    }

    public static boolean comprobarMatrizMagica(int[][] matriz) {
        int i, j, sumaFilaSuperior, sumaFilaInferior, sumaColumnaIzquierda, sumaColumnaDerecha, sumaDiagonalPrincipal, sumaDiagonalSecundaria;
        boolean resultado;

        i = 0;
        j = 0;
        sumaFilaSuperior = 0;
        sumaFilaInferior = 0;
        sumaColumnaIzquierda = 0;
        sumaColumnaDerecha = 0;
        sumaDiagonalPrincipal = 0;
        sumaDiagonalSecundaria = 0;
        resultado = false;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                if (i == 0) {
                    sumaFilaSuperior = sumaFilaSuperior + matriz[i][j];
                }
                if (i == matriz.length - 1) {
                    sumaFilaInferior = sumaFilaInferior + matriz[i][j];
                }
                if (j == 0) {
                    sumaColumnaIzquierda = sumaColumnaIzquierda + matriz[i][j];
                }
                if (j == matriz.length - 1) {
                    sumaColumnaDerecha = sumaColumnaDerecha + matriz[i][j];
                }
                if (i == j) {
                    sumaDiagonalPrincipal = sumaDiagonalPrincipal + matriz[i][j];
                }
                if ((i + j) == matriz.length - 1) {
                    sumaDiagonalSecundaria = sumaDiagonalSecundaria + matriz[i][j];
                }
            }
        }
        if (sumaFilaSuperior == sumaFilaInferior && sumaFilaInferior == sumaColumnaIzquierda && sumaColumnaIzquierda == sumaColumnaDerecha && sumaColumnaDerecha == sumaDiagonalPrincipal && sumaDiagonalPrincipal == sumaDiagonalSecundaria && sumaDiagonalSecundaria == sumaFilaSuperior) {
            resultado = true;
        }
        return resultado;
    }
}
