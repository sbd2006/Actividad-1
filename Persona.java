
package com.mycompany.persona;

public class Persona {

   String Nombre;
   int Edad;
   
   public Persona (String Nombre, int Edad){
   this.Nombre = Nombre;
   this.Edad = Edad;
   }
   
   
   void mostrar (){
       System.out.println("El nombre de la persona es: " +Nombre);
       System.out.println("La edad de la persona es: " +Edad);
}
   
   void correr (){
       System.out.println("Soy " +Nombre +" y tengo " +Edad+ " y he corrido mucho");
   }
   
   
    public static void main(String[] args) {
        Persona humano = new Persona ("Pablo",21);
        
        humano.correr();
        humano.mostrar();
    }
}
