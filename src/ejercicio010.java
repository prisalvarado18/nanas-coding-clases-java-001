import java.util.Scanner;

public class ejercicio010 {
    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial. */

    //Solicitar limite
    //Solicite numeros hasta que la suma supere el limite
    public static void main(String[] args) {
        int limite, numero, suma;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el limite: ");
        limite = leer.nextInt();
        suma=0;
        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            suma = suma + numero;
        }while(suma<limite);

    }
}
