import java.util.Scanner;

public class ejercicio007 {
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.*/
    public static void main(String[] args) {
        String palabra;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        palabra = leer.nextLine();
        if (palabra.equals("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
