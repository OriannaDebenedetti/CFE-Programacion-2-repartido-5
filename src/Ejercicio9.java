public class Ejercicio9 {
    private String codigo;
    private String nombre;
    private int stock;
    private double precio;

    public Ejercicio9(String codigo, String nombre, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;

        if (stock < 0) {
            System.out.println("Stock inválido. Se usará 0.");
            this.stock = 0;
        } else {
            this.stock = stock;
        }

        if (precio <= 0) {
            System.out.println(" Precio inválido. Se usará $1.");
            this.precio = 1;
        } else {
            this.precio = precio;
        }

        System.out.println("Producto creado: " + this.nombre + " - Stock: " + this.stock + " - Precio: $" + this.precio);
    }

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Vendidas " + cantidad + " unidades.");
        } else {
            System.out.println(" No hay stock suficiente o cantidad inválida.");
        }
    }

    public void reponer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Repuestos " + cantidad + " productos.");
        } else {
            System.out.println(" Cantidad de reposición inválida.");
        }
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            precio = nuevoPrecio;
            System.out.println("Precio actualizado a $" + nuevoPrecio);
        } else {
            System.out.println(" Precio inválido. No se actualizó.");
        }
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        Ejercicio9 producto = new Ejercicio9("P001", "Galletas", 5, 50);
        producto.vender(2);
        producto.reponer(3);
        producto.setPrecio(60);
        System.out.println("Stock final: " + producto.getStock());
        System.out.println(" Precio final: $" + producto.getPrecio());
    }
}
