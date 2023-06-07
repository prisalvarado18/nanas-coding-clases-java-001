import java.util.Scanner;

public class ejercicio014 {
    /*14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
            introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
            función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
            una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
            (void).
            El cambio de divisas es:
            * 0.86 libras es un 1 €
            * 1.28611 $ es un 1 €
            * 129.852 yenes es un 1 €*/
    public static void main(String[] args) {
        int input, opcion;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros: ");
        input = leer.nextInt();

        System.out.println("1. Euros a dólares\n" +
                "2. Euros a yenes\n" +
                "3. Euros a libras\n");

        opcion = leer.nextInt();

        cambiarMoneda(input, opcion);
    }

    public static void cambiarMoneda(int euros, int opcion) {
        //dolares
        //yenes
        //libras
        float dolares, yenes, libras;

        switch (opcion) {
            case 1:
                dolares = euros * (float) 1.28611;
                System.out.println(euros + " euro(s) equivale a " + dolares + " dolar(es)");
                break;
            case 2:
                yenes = euros * (float) 129.852;
                System.out.println(euros + " euro(s) equivale a " + yenes + " yen(es)");
                break;
            case 3:
                libras = euros * (float) 0.86;
                System.out.println(euros + " euro(s) equivale a " + libras + " libra(s)");
                break;
        }

    }
}
