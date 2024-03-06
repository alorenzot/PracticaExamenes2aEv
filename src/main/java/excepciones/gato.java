package excepciones;

public class gato {
    private String nombre;
    private int edad;

    public gato(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    private void setNombre(String nombre) throws Exception{
        if (nombre.length()>=3) this.nombre=nombre;
        else throw new Exception("El nombre debe tener al menos 3 caracteres.");
    }
    public void setEdad(int edad) throws Exception {
        if (edad>=0) this.edad = edad;
        else throw new Exception("La edad no puede ser negativa.");
    }
    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
        return "Gato: " + nombre + ", Edad: " + edad;
    }
}
