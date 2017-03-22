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


public class Cuadrado extends PadreFiguras {//se crea la clase hija y se llama a la clase padre con sus atributos
    Scanner entrada = new Scanner(System.in);
    private Punto punto3;// variables unicas de la clase hija
    private Punto punto4;
    private double perimetro;

    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {//contructor se asigno los valores de la clse punto 
        super( punto1 , punto2 );//Le asigan los valores de entrada a la clase padre
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    
    public void darResultados() {// el menu de la cuadrado
    int decision = -1;
    // se crea un while para  mostrar el menu  la veces que desee el usuario
       while(decision != 0){//de muestran las opciones por pantalla que va tener el usuario
           System.out.println("Menu Del Cuadrado...\nElige una de las opciones");
           System.out.println("0.Salir \n1.Valor de los lados \n2.Perimetro \n"
                +"3.Area");
            decision = entrada.nextInt();//valor que va tomar para el switch dependiendo de la opcion que escoja
           switch(decision){
               case 0:
                   break;
               case 1: 
                   System.out.println("Lado1: " + darLado1());//imprime los valores ya calculados
                   System.out.println("Lado2: " + darLado2());
                   System.out.println("Lado3: " + darLado3());
                   System.out.println("Lado4: " + darLado4());
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
    

    private double darLado1(){// hace calculo de seeado
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);// ecucion para el calculo
        return lado;
    }
    

    private double darLado2(){// hace calculo de seeado
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);// ecucion para el calculo
        return lado;
    }
    

    private double darLado3(){// hace calculo de seeado
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);// ecucion para el calculo
        return lado;//retorna el valor calculado
    }

    private double darLado4(){// hace calculo de seeado
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);// ecucion para el calculo
        return lado;//retorna el valor calculado
    }

    private double darPermietro() {    // calculo 
        this.perimetro =  darLado1() + darLado2() + darLado3()+ darLado4();
        return this.perimetro;//retorna el valor calculado
    }
    

    private double darArea() {// ecucion para el calculo
        
        double lado1 = darLado1();
        double lado2 = darLado2();
        double area =  lado1*lado2;
        return area;//retorna el valor calculado
    }


    public Punto getPunto1() {
        return punto1;//retorna el valor 
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;//asigna el valor
    }
   
    @Override// se hace el llamdo del metodo de la clase padre
    public Punto getPunto2() {
        return punto2;//retorna el valor 
    }

    
    @Override
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;//asigna el valor
    }
    
    public Punto getPunto3() {
        return punto3;//retorna el valor 
    }

   
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;//asigna el valor
    }
    
    public Punto getPunto4() {
        return punto4;//retorna el valor
    }
   
    public void setPunto4(Punto punto3) {
        this.punto4 = punto4;//asigna el valor
    }
}
