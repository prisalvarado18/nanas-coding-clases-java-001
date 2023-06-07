import java.util.Scanner;

public class ejercicio016 {
    /*16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
            usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
            numero y si se encuentra repetido*/
    public static void main(String[] args) {
        //Pedir al usuario el tamano del vector
        //Rellenar vector con valores aleatorios
        //Pedir al usuario un numero a buscar
        //Imprimir ubicación y si está repetido
        int voctor[] = new int[3];
        System.out.println(voctor.length);
        int tamanoVector;
        int busqueda;
        int vector[];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        tamanoVector = leer.nextInt();
        vector = rellenarVector(tamanoVector);
        imprimirVector(vector);
        System.out.println("Ingrese el numero a buscar: ");
        busqueda = leer.nextInt();
        buscarPosicion(vector, busqueda);
    }

    public static int[] rellenarVector(int tamano) {
        int vector[];
        int i;

        vector = new int[tamano];

        for (i = 0; i < tamano; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
        return vector;
    }

    public static void buscarPosicion(int vector[], int numABuscar) {
        int i, repetido;
        boolean hallado;
        String[] posicion = new String[vector.length];

        hallado = false;
        repetido = 0;

        for (i = 0; i < vector.length; i++) {
            if (vector[i] == numABuscar) {
                posicion[i] = String.valueOf(i);
                hallado = true;
                repetido++;
            } else {
                posicion[i] = " ";
            }
        }
        if (hallado == false) {
            System.out.println(numABuscar + " no fue encontrado");
        } else {
            System.out.println(numABuscar + " fue encontrado " + repetido + " veces en las siguientes posiciones");
            for (i = 0; i < posicion.length; i++) {
                if (posicion[i] != " ") {
                    System.out.print(posicion[i] + " ");
                }
            }
        }
    }

    public static void imprimirVector(int[] vector) {
        int i;
        for (i = 0; i < vector.length; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
    }
}
