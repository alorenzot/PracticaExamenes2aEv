package excepciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gatoMain {
    public static void main(String[] args) {
        List<gato> gatoList = new ArrayList<>();
        do {
            try {
                String name=askName();
                int age=askAge(name);
                gatoList.add(new gato(name,age));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (gatoList.size()<=5);

        System.out.println(gatoList);
    }

    private static int askAge(String nombre) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad de " + nombre + ":");
        if (!sc.hasNextInt()) throw new Exception("La edad debe de ser un número.");
        return sc.nextInt();
    }

    private static String askName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del gato:");
        return sc.next();
    }
}
