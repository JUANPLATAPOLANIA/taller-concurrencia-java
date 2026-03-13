package Banco;
class CuentaBancaria {

    private int saldo = 1000;

    public synchronized void retirar(String cliente, int monto) {

        if (saldo >= monto) {
            System.out.println(cliente + " está retirando " + monto);
            saldo -= monto;
            System.out.println("Saldo restante: " + saldo);
        } else {
            System.out.println(cliente + " no puede retirar. Saldo insuficiente.");
        }
    }
}

class Cliente extends Thread {

    private CuentaBancaria cuenta;

    public Cliente(String nombre, CuentaBancaria cuenta) {
        super(nombre);
        this.cuenta = cuenta;
    }

    public void run() {
        cuenta.retirar(getName(), 400);
    }
}

public class Banco {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();

        Cliente c1 = new Cliente("Cliente 1", cuenta);
        Cliente c2 = new Cliente("Cliente 2", cuenta);
        Cliente c3 = new Cliente("Cliente 3", cuenta);

        c1.start();
        c2.start();
        c3.start();
    }
}