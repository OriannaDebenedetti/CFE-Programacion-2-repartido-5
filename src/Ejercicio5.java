public class Ejercicio5 {
    private String nombre;
    private int edad;

    public Ejercicio5(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Persona creada: " + nombre);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public static void main(String[] args) {
        Ejercicio5 persona = new Ejercicio5("Orianna", 22<);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
