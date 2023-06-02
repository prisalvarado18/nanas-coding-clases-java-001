import java.util.Scanner;

public class ejercicio004 {
    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
      Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    public static void main(String[] args) {
        int centigrados, fahrenheit;
        Scanner leer = new Scanner(System.in);
        centigrados = leer.nextInt();
        fahrenheit = convertirCF(centigrados);

        System.out.println(centigrados+"C" + " equivale a " + fahrenheit+"F");
    }

    public static int convertirCF(int gradosC) {
        int gradosF = (gradosC * 9/5) +32;
        return gradosF;
    }
}
