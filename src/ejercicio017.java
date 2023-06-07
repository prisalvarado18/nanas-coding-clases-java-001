import java.util.Scanner;

public class ejercicio017 {
    /*17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
          de 2 dígitos, etcétera (hasta 5 dígitos).*/
    public static void main(String[] args) {
        int vector[];
        int tamano, i, cantidadDigitos, unDig, dosDig, tresDig, cuatroDig, cincoDig;
        unDig = 0;
        dosDig = 0;
        tresDig = 0;
        cuatroDig = 0;
        cincoDig = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamano del vector: ");
        tamano = leer.nextInt();
        vector = rellenarVector(tamano);
        imprimirVector(vector);
        for (i = 0; i < vector.length; i++) {
            cantidadDigitos = contarDigitos(vector[i]);
            if (cantidadDigitos == 1) {
                unDig++;
            } else if (cantidadDigitos == 2) {
                dosDig++;
            } else if (cantidadDigitos == 3) {
                tresDig++;
            } else if (cantidadDigitos == 4) {
                cuatroDig++;
            } else if (cantidadDigitos == 5) {
                cincoDig++;
            }
        }
        System.out.println("Existen " + unDig + " nums con un digito, " + dosDig + " con dos, " + tresDig + " con tres, " + cuatroDig + " con cuatro y " + cincoDig + " con 5 digs.");
    }

    public static int contarDigitos(int numero) {
        int cantidadDigitos;
        cantidadDigitos = 0;
        while (numero > 0) {
            numero = numero / 10;
            cantidadDigitos++;
        }
        return cantidadDigitos;
    }

    public static int[] rellenarVector(int tamano) {
        int vector[];
        int i;

        vector = new int[tamano];

        for (i = 0; i < tamano; i++) {
            vector[i] = (int) (Math.random() * 99999) + 1;
        }
        return vector;
    }

    public static void imprimirVector(int[] vector) {
        int i;
        for (i = 0; i < vector.length; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println(" ");
    }
}
