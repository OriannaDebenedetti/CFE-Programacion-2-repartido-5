import java.time.Year;

public class Ejercicio6 {
    private String titulo;
    private String autor;
    private int anio;

    public Ejercicio6(String titulo, String autor, int anio) {
        int anioActual = Year.now().getValue();
        if (anio > anioActual) {
            System.out.println("Año inválido. Se usará el año actual.");
            this.anio = anioActual;
        } else {
            this.anio = anio;
        }
        this.titulo = titulo;
        this.autor = autor;
        System.out.println("Libro creado: " + titulo + " (" + this.anio + ")");
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) {
        int anioActual = Year.now().getValue();
        if (anio <= anioActual) {
            this.anio = anio;
        } else {
            System.out.println("Año inválido. No se modificó.");
        }
    }

    public static void main(String[] args) {
        Ejercicio6 libro = new Ejercicio6("Harry Potter", "J.K. Rowling", 2026); // año inválido a propósito
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año: " + libro.getAnio());
    }
}
