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
public class Triangulo extends PadreFiguras {//se crea la clase hija y se llama a la clase padre con sus atributos
    
Scanner entrada = new Scanner(System.in);
       
    private Punto punto3;// se asigana el valor de la clase punto
    public Triangulo(Punto punto1, Punto punto2,Punto punto3){//se llaman las variables de la clase punto
        super( punto1,  punto2);//Le asigan los valores de entrada a la clase padre
        this.punto3=punto3;
    }
    public Punto getPunto3() {//retorna el valor
        return punto3;
    }

    public void setPunto3(Punto punto3) {//asigna el valor
        this.punto3 = punto3;
    }
    
    private double perimetro;//variable para el calculo

    
    
   
    public void darResultados() {// el menu de la circulo
       int decision = -1;
       while(decision != 0){// se crea un while para  mostrar el menu  la veces que desee el usuario
           System.out.println("Menu Del Triangulo...\nElige una de las opciones");//de muestran las opciones por pantalla que va tener el usuario
           System.out.println("0.Salir \n1.Valor de los lados \n2.Perimetro \n"
                +"3.Area");
            decision = entrada.nextInt();
           switch(decision){//valor que va tomar para el switch dependiendo de la opcion que escoja
               case 0:
                   break;
               case 1: 
                   System.out.println("Lado1: " + darLado1());//imprime los valores ya calculados
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
    



    private double darLado1(){//calcula el lado 1
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);// ecucion para el calculo
        return lado;
    }
    

    private double darLado2(){//calcula el lado 2
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);// ecucion para el calculo
        return lado;
    }
    

    private double darLado3(){//calcula el lado 3
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);// ecucion para el calculo
        return lado;
    }
    

    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3();// ecucion para el calculo
        return this.perimetro;
    }
    
 
    private double darArea() {// para el calculo deseado
        double semiperimetro = this.perimetro / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));// ecucion para el calculo
        return area;
    }
    
 


 
    @Override// se hace el llamdo del metodo de la clase padre
  public Punto getPunto1() {
        return punto1;//retorna valor
    }


    @Override
    public void setPunto1(Punto punto1) {
       this.punto1 = punto1;//asigna el valor
    }
  
    @Override
    public Punto getPunto2() {
       return punto2;//retorna valor
}

 
    @Override
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;//asigna el valor
    }

}
