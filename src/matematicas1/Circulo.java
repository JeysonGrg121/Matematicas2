/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */

public class Circulo extends PadreFiguras {
    Scanner entrada = new Scanner(System.in);
    private double perimetro;
    private double area;
    private double diametro;
    private double radio;

    public Circulo (Punto punto1, Punto punto2) {
        super(punto1,punto2);
        
    }
    
 
    public void darResultados() {
    int decision = -1;
       while(decision != 0){
           System.out.println("Menu Del Circulo...\nElige una de las opciones");
           System.out.println("0.Salir \n1.Perimetro \n2.Area \n3.Radio \n4.Diamtro");
            decision = entrada.nextInt();
           switch(decision){
               case 0:
                   break;
               case 1: 
                   System.out.println("Perimetro: " + darPermietro());
                   break;
               case 2:
                    System.out.println("Area: " + darArea());
                   break;
               case 3:
                   System.out.println("Radio: "+ darRadio());
                   break;
               case 4: 
                    System.out.println("Diametro: "+ darDiametro());
                   break;
               default:
                   System.out.println("no esta dentro de las opciones\n"
                   +"intena de nuevo");
           }
       }  
    }    
 
   
    private double darDiametro(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        this.diametro= Math.sqrt(auxiliarX +  auxiliarY);
        return this.diametro;
    }
    private double darRadio() {        
        this.radio = darDiametro()/2;
        return this.radio;
    }
  
    private double darPermietro() {        
        this.perimetro = (2*3.1416)*darRadio();
        return this.perimetro;
    }
    
    
    private double darArea() {
      this.area=darRadio()*3.1416;
        return this.area;       
        
    }

    @Override
    public Punto getPunto1() {
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
