package cuenta.de.banco;

public class Cuentas {
 
    private String cliente;
    private String telefono;
    private int numeroCuenta;
    private float saldo;
    private final float limite = 999999;

    public Cuentas() {
        this.cliente = "";
        this.telefono = "";
        this.numeroCuenta = 0;
        this.saldo = 0;
    }

    
    public float getSaldo() {
        return saldo;
    }

    public void depositar(float monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor a cero.");
            return;
        }
        if (saldo + monto > limite) {
            System.out.println("El saldo no puede superar el límite de " + limite);
            return;
        }
        saldo += monto;
        System.out.println("Depósito exitoso. Saldo actual: " + saldo);
    }

    public void retirar(float monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
            return;
        }
        if (saldo - monto < 0) {
            System.out.println("No se puede retirar el monto. El saldo no puede ser negativo.");
            return;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo actual: " + saldo);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getLimite() {
        return limite;
    }
}

