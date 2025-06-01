public class Ejercicio8 {
    private String nombre;
    private String cargo;
    private double sueldoBase;

    public Ejercicio8(String nombre, String cargo, double sueldoBase) {
        this.nombre = nombre;
        this.cargo = cargo;
        if (sueldoBase < 0) {
            System.out.println("Sueldo inválido. Se asignará 0 por defecto.");
            this.sueldoBase = 0;
        } else {
            this.sueldoBase = sueldoBase;
        }
        System.out.println("Empleado creado: " + nombre + " - Cargo: " + cargo);
    }

    public double getSueldoFinal() {
        if (cargo.equalsIgnoreCase("Jefe")) {
            return sueldoBase * 1.20;
        }
        return sueldoBase;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSueldoBase() { return sueldoBase; }
    public void setSueldoBase(double sueldoBase) {
        if (sueldoBase >= 0) {
            this.sueldoBase = sueldoBase;
        } else {
            System.out.println("Sueldo inválido. No se modificó.");
        }
    }

    public static void main(String[] args) {
        Ejercicio8 empleado = new Ejercicio8("Ori", "Jefe", -5000); // prueba con sueldo negativo
        System.out.println("Sueldo final: $" + empleado.getSueldoFinal());
    }
}
