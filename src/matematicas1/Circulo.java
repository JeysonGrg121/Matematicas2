/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas1;

import java.util.Scanner;

/**
 *
 * @author Albert Charry,Jeyson Duarte,Jorge andres Duran
 */

public class Circulo extends PadreFiguras {//se crea la clase hija y se llama a la clase padre con sus atributos
    Scanner entrada = new Scanner(System.in);
    // variables unicas de la clase circulo
    private double perimetro;
    private double area;
    private double diametro;
    private double radio;

    public Circulo (Punto punto1, Punto punto2) {
        super(punto1,punto2);//Le asigan los valores de entrada a la clase padre
        
    }
    
 
    public void darResultados() {// el menu de la figura circulo
    int decision = -1;
    // se crea un while para  mostrar el meu  la veces que desee el usuario
       while(decision != 0){//de muestran las opciones por pantalla que va tener el usuario
           System.out.println("Menu Del Circulo...\nElige una de las opciones");
           System.out.println("0.Salir \n1.Perimetro \n2.Area \n3.Radio \n4.Diamtro");
            decision = entrada.nextInt();//valor que va tomar para el switch dependiendo de la opcion que escoja
           switch(decision){
               case 0:
                   break;
               case 1: 
                   System.out.println("Perimetro: " + darPermietro());//llamado del calculo deseado a mostrar por pantalla
                   break;
               case 2:
                    System.out.println("Area: " + darArea());//llamado del calculo deseado a mostrar por pantalla
                   break;
               case 3:
                   System.out.println("Radio: "+ darRadio());//llamado del calculo deseado a mostrar por pantalla
                   break;
               case 4: 
                    System.out.println("Diametro: "+ darDiametro());//llamado del calculo deseado a mostrar por pantalla
                   break;
               default:
                   System.out.println("no esta dentro de las opciones\n"
                   +"intena de nuevo");//en caso de que no ingrese un valor desconocido a las opciones que tiene el menu
           }
       }  
    }    
 
   
    private double darDiametro(){//se hace los calculos deseeados
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        this.diametro= Math.sqrt(auxiliarX +  auxiliarY);//ecucion para el calculo deseado
        return this.diametro;//
    }
    private double darRadio() {        // calculo deseado hacer
        this.radio = darDiametro()/2;
        return this.radio;
    }
  
    private double darPermietro() {  // calculo deseado hacer
        this.perimetro = (2*3.1416)*darRadio();
        return this.perimetro;
    }
    
    
    private double darArea() {// calculo deseado hacer
      this.area=darRadio()*3.1416;
        return this.area;       
        
    }

    @Override // se hace el llamdo del metodo de la clase padre
    public Punto getPunto1() {//retorna los valores
        return punto1;
    }

 
    @Override
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
  
    @Override
    public Punto getPunto2() {
        return punto2;
    }

      
    @Override
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
     
}
