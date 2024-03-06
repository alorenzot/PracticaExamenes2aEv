package ficheros.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> gatitos = new ArrayList<>();
        try{
            gatitos.add(new Gato("Luna",3));
            gatitos.add(new Gato("Pomelo",4));
            gatitos.add(new Gato("Gatillo",5));
            gatitos.add(new Gato("Miseria",6));
            gatitos.add(new Gato("Bomboclat",1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Gato.save(gatitos,"misgatos.txt");


    }
}