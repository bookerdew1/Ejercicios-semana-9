/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta.de.banco;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Booker
 */
public class CuentaDeBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuentas c = new Cuentas ();
       
       c.setCliente("Juan Perez");
       c.setTelefono("88923860");
       c.setNumeroCuenta(22411171);
       
        System.out.println("Cliente: "+c.getCliente()); 
        System.out.println("Telefono: "+c.getTelefono());
        System.out.println("Numero de Cuenta: "+c.getNumeroCuenta());
        System.out.println("Saldo Inicial: "+ c.getSaldo());
        
       c.depositar(5000);
       c.retirar(2000);
       c.depositar(-100);
       c.retirar(10000);
        
    }
    
}
