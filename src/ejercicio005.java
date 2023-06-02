import java.util.Scanner;

public class ejercicio005 {
    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
      doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
    public static void main(String[] args) {
        float input;
        Scanner leer = new Scanner(System.in);
        input = leer.nextFloat();
        System.out.println("El doble de " + input + " es " + calcularDoble(input));
        System.out.println("El triple de " + input + " es " + calcularTriple(input));
        System.out.println("La raiz cuadrada de " + input + " es " + calcularRaizCuadrada(input));

    }

    public static float calcularDoble(float num) {
        return num*2;
    }

    public static float calcularTriple(float num) {
        return num*3;
    }

    public static float calcularRaizCuadrada(float num) {
        return (float)(Math.sqrt(num));
    }
}
