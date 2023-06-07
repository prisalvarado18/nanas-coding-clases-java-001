import java.util.Scanner;

public class ejercicio006 {
    //Crear un programa que dado un numero determine si es par o impar
    public static void main(String[] args) {
        int num;
        boolean resultado;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        resultado = esPar(num);
        if (resultado) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }
    }

    public static boolean esPar(int num) {
        return num%2==0;
    }
}
