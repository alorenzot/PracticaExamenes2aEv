package excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try {
            int a = pedirValor();
            int b = pedirValor();
            double resultado = dividir(a,b);
            System.out.println("El resultado es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("El valor introducido no es válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error matemático");
        }
    }

    public static int pedirValor() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor");
        return sc.nextInt();
    }

    public static double dividir(int valorA, int valorB) throws ArithmeticException{
        return (double) valorA / valorB;
    }
}
