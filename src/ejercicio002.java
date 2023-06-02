import java.util.Scanner;

public class ejercicio002 {
    /*
    * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
      pantalla.*/
    public static void main(String[] args) {
        String nombre;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.println("Hola " + nombre);
    }
}
