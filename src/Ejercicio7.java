public class Ejercicio7 {
    private String numero;
    private String titular;
    private double saldo;

    public Ejercicio7(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        System.out.println("Cuenta creada para: " + titular);
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito: $" + monto);
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro: $" + monto);
        } else {
            System.out.println("Fondos insuficientes para retirar $" + monto);
        }
    }

    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
    public String getNumero() { return numero; }

    public static void main(String[] args) {
        Ejercicio7 cuenta = new Ejercicio7("123456", "Orianna");
        cuenta.depositar(1000);
        cuenta.retirar(300);
        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}
