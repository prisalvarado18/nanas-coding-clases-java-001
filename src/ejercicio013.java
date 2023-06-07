import java.util.Scanner;

public class ejercicio013 {
    /*13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
     */
    public static void main(String[] args) {
        //Declarar una matriz
        //Inicializar matriz
        //Dibujar el cuadrado

        int input, i, j;
        String[][] cuadrado;

        Scanner leer = new Scanner(System.in);

        input = leer.nextInt();

        cuadrado = new String[input][input];

        for (i = 0; i < input; i++) {
            for (j = 0; j < input; j++) {
                if (i == 0 || i == input - 1 || j == 0 || j == input - 1) {
                    cuadrado[i][j] = "*";
                } else {
                    cuadrado[i][j] = " ";
                }
            }
        }

        for (i = 0; i < input; i++) {
            for (j = 0; j < input; j++) {
                System.out.print(cuadrado[i][j]);
            }
            System.out.println(" ");
        }
    }
}
