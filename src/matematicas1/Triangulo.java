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
public class Triangulo extends PadreFiguras {
    
Scanner entrada = new Scanner(System.in);
       
    private Punto punto3;
    public Triangulo(Punto punto1, Punto punto2,Punto punto3){
        super( punto1,  punto2);
        this.punto3=punto3;
    }
    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    
    private double perimetro;

    
    
   
    public void darResultados() {
       int decision = -1;
       while(decision != 0){
           System.out.println("Menu Del Triangulo...\nElige una de las opciones");
           System.out.println("0.Salir \n1.Valor de los lados \n2.Perimetro \n"
                +"3.Area");
            decision = entrada.nextInt();
           switch(decision){
               case 0:
                   break;
               case 1: 
                   System.out.println("Lado1: " + darLado1());
                   System.out.println("Lado2: " + darLado2());
                   System.out.println("Lado3: " + darLado3());
                   break;
               case 2:
                    System.out.println("Perimetro: " + darPermietro());
                   break;
               case 3:
                   System.out.println("Area: " + darArea());
                   break;
               default:
                   System.out.println("no esta dentro de las opciones\n"
                   +"intena de nuevo");
           }
       }         
    }
    



    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    

    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    

    private double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    

    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();
        return this.perimetro;
    }
    
 
    private double darArea() {
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
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
