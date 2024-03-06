package ficheros.Ex2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class MaxMin {
    public static void main(String[] args) {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Documentos/numeros.txt"))){
                        

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
