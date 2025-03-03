
package com.mycompany.vehiculo;

public class Vehiculo {

    String Empresa;
    int Pasajeros; 
    int Combustible, Combustible_consumido;
 
    
    public Vehiculo (String Empresa,int Pasajeros, int Combustible, int Combustible_consumido){
        
        this.Empresa = Empresa;
        this.Pasajeros = Pasajeros;
        this.Combustible = Combustible;
        this.Combustible_consumido = Combustible_consumido;
        
    }
    
    public int Media(){
        return Combustible * Combustible_consumido;
    }
    
    void mostrar (String tipoV){
        System.out.println("La " +tipoV+ " de la empresa " +Empresa+ " puede llevar " +Pasajeros+ " pasajeros, con un rango de " + Media()+ " millas");
    }
    public static void main(String[] args) {
        
        Vehiculo minivan = new Vehiculo("Cootranar",11,29,22);
       
        Vehiculo duobus = new Vehiculo("Trans Arauca",40,28,35);
        
        minivan.mostrar("Minivan");
        duobus.mostrar("Duobus");
    }
}
