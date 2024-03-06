package ficheros.Ex1;

import java.io.*;
import java.util.List;

public class Gato implements Serializable {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception{
        setNombre(nombre);
        setEdad(edad);

        this.nombre = nombre;
        this.edad = edad;
    }

    public static void save(List<Gato> gatoList, String fichero){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(fichero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Gato> load(String fichero) {
        List<Gato> aux;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            aux = (List<Gato>) ois.readObject();
            return aux;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception{
        if (nombre.length()<3) throw new Exception("El nombre debe tener al menos 3 caracteres.");

        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if (edad<0) throw new Exception("La edad no puede ser negativa.");
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}'+"\n";
    }
}