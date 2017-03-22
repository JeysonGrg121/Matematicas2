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
public class Menu {
    
    Scanner entrada = new Scanner(System.in); 
 
    public Menu() {
              
        iniciar();
    }
    
 
  
    private void iniciar() {  
        int decision = -1;
        while(decision !=0) {
            System.out.println("...Bienbenido...\n Elige una opcion.");
            System.out.println("1. Triangulo \n2.Circulo \n3.Cuadrado \n0.Salir");
            decision =  entrada.nextInt();
            switch(decision){
                case 0:
                    break;
                case 1:
                    iniciarTriangulo();
                    break;
                case 2:
                    iniciarCirculo();
                    break;
                case 3:
                    iniciarCuadrado();
                    break;
                default:
                    System.out.println("No esta dentro de las opciones\n"
                            + "Ingresa de nuevo");
                    
            }
        }
    }
    
    
    private void iniciarTriangulo(){
        double x, y;
        System.out.println("Digite punto x1");
        x = entrada.nextDouble();
        System.out.println("Digite punto y1");
        y = entrada.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite punto x2");
        x = entrada.nextDouble();
        System.out.println("Digite punto y2");
        y = entrada.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite punto x3");
        x = entrada.nextDouble();
        System.out.println("Digite punto y3");
        y = entrada.nextDouble();
        Punto punto3 = new Punto(x, y);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.darResultados();        
    }
    private void iniciarCuadrado(){
        double x, y;
        System.out.println("Digite punto x1");
        x = entrada.nextDouble();
        System.out.println("Digite punto y1");
        y = entrada.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite punto x2");
        x = entrada.nextDouble();
        System.out.println("Digite punto y2");
        y = entrada.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite punto x3");
        x = entrada.nextDouble();
        System.out.println("Digite punto y3");
        y = entrada.nextDouble();
        Punto punto3 = new Punto(x, y);
        System.out.println("Digite punto x4");
        x = entrada.nextDouble();
        System.out.println("Digite punto y4");
        y = entrada.nextDouble();
        Punto punto4 = new Punto(x, y);
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3,punto4);
        cuadrado.darResultados();
        
    }        
       private void iniciarCirculo(){
        double x, y;
        System.out.println("Digite punto x1");
        x = entrada.nextDouble();
        System.out.println("Digite punto y1");
        y = entrada.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite punto x2");
        x = entrada.nextDouble();
        System.out.println("Digite punto y2");
        y = entrada.nextDouble();
        Punto punto2 = new Punto(x, y);
        Circulo circulo = new Circulo(punto1, punto2);
        circulo.darResultados();        
    }
    
}
