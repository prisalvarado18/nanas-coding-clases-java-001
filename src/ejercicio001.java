import java.util.Scanner;

public class ejercicio001 {
    /* 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma*/
    public static void main(String[] args) {
        int num1, num2, suma;

        Scanner leer = new Scanner(System.in);

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        suma = sumar(num1, num2);

        System.out.println("Resultado: " + suma);

    }

    public static int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
}
