import java.util.Scanner;

public class ejercicio008 {
    /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    Nota: investigar la función Lenght() en Java.*/
    public static void main(String[] args) {
        String palabra;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        palabra = leer.nextLine();
        if (palabra.length() == 8){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
