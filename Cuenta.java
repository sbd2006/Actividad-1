
package com.mycompany.cuenta;

public class Cuenta {
    
    String titular;
    double total = 5000; 

    
    public Cuenta(String titular) {
        this.titular = titular;
    }

    
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.total += cantidad;
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            total = total + cantidad;
        }
    }

   
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (total - cantidad < 0) {
                total = 0;
            } else {
                total = total - cantidad;
            }
        }
    }

    
    public void mostrar() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo actual: $" + getTotal());
    }

    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Juan Jose Quintero");

        
        cuenta1.ingresar(1000);
        cuenta1.retirar(2000);
        cuenta1.mostrar();

        
        Cuenta cuenta2 = new Cuenta("Ana Gomez", 3000);
        cuenta2.ingresar(1500);
        cuenta2.retirar(1000);
        cuenta2.mostrar();
    }
}
