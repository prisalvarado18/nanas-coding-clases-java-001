public class ejercicio015 {
    /*15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
          muestre por pantalla en orden descendente.*/

    public static void main(String[] args) {
        mostrarVector();
    }

    public static void mostrarVector() {
        int i, j, numero;
        int[][] numerosEnteros = new int[10][10];
        numero = 1;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                numerosEnteros[i][j] = numero;
                numero++;
            }
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("[ " + numerosEnteros[i][j] + " ]");
            }
            System.out.println(" ");
        }
    }
}
