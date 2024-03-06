package excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        double[] array = new double[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = rellenarArray("Introduce un valor");
        }
        System.out.println(Arrays.toString(array));

    }

    public static double rellenarArray(String mensaje) {
        do {

            try {
                System.out.println(mensaje);
                Scanner sc = new Scanner(System.in);
                return sc.nextDouble();
            } catch (Exception e) {
                System.out.println("El valor introducido no es válido");
            }

        } while (true);
    }


}
