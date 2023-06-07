import java.util.Scanner;

public class ejercicio011 {
    /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:

        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:

        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        programa, caso contrario se vuelve a mostrar el menú.
    */
    //Mostrar el menu(Switch)
    //Desea salir? (While)

    public static void main(String[] args) {
        int num1, num2, op, suma, resta, multiplicacion, division;
        char salir;
        salir = 'N';
        Scanner leer = new Scanner(System.in);
        suma = 0;
        resta = 0;
        multiplicacion = 0;
        division = 0;
        do {
            do {

                System.out.print("Ingrese x: ");
                num1 = leer.nextInt();
                System.out.print("Ingrese y: ");
                num2 = leer.nextInt();

                System.out.println("MENU\n" +
                        "        1. Sumar\n" +
                        "        2. Restar\n" +
                        "        3. Multiplicar\n" +
                        "        4. Dividir\n" +
                        "        5. Salir\n" +
                        "        Elija opción:");
                op = leer.nextInt();
                if (op < 1 || op > 5) {
                    System.out.println("ERROR: válido de 1 a 5");
                }
            } while (op < 1 || op > 5);

            if (op != 5) {
                switch (op) {
                    case 1:
                        suma = num1 + num2;
                        System.out.println(suma);
                        break;
                    case 2:
                        resta = num1 - num2;
                        System.out.println(resta);
                        break;
                    case 3:
                        multiplicacion = num1 * num2;
                        System.out.println(multiplicacion);
                        break;
                    case 4:
                        division = num1 / num2;
                        System.out.println(division);
                        break;
                }
            } else {
                System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                salir = leer.next().charAt(0);
                if (salir == 'S' || salir == 's') {
                    System.out.println("Saliendo del programa...");
                }
            }

        } while (salir != 'S' && salir != 's');
    }
}


/*do {
                System.out.println("Desea salir? (S/N)");
                salir = leer.next().toUpperCase().charAt(0);
                if (salir != 'S' && salir != 'N') {
                    System.out.println("S: Si, N: No");
                }
            } while (salir != 'S' && salir != 'N');
            System.out.println("");*/