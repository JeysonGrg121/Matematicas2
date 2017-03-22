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
public class Menu {
    
    Scanner entrada = new Scanner(System.in); 
 
    public Menu() {//secrea el contructor y se hace el llamado a la funcion iniciar 
              
        iniciar();
    }
    
 
  
    private void iniciar() {  
        int decision = -1;
       //secrea un while para seleccionar la opciones
        while(decision !=0) {
            System.out.println("...Bienbenido...\n Elige una opcion.");
            System.out.println("1. Triangulo \n2.Circulo \n3.Cuadrado \n0.Salir");
            decision =  entrada.nextInt();//se guarda en decision el valor o la opcion tomada
            switch(decision){//swintch para que dependiendo del valor dado haga el llamado dependiendo de lo que el usuario quiera
                case 0://si quiere salir del programa
                    break;
                case 1://para hacer el llamado de la funcion menu triangulo
                    iniciarTriangulo();
                    break;
                case 2://para hacer el llamado de la funcion menu circulo
                    iniciarCirculo();
                    break;
                case 3:
                    iniciarCuadrado();//para hacer el llamado de la menu cuadrado
                    break;
                default://en caso de no ingresar un de las opciones 
                    System.out.println("No esta dentro de las opciones\n"
                            + "Ingresa de nuevo");
                    
            }
        }
    }
    
    
    private void iniciarTriangulo(){//se hace esta funcion para los datos triangulo
        double x, y;//se declaran las variable de la funcion
        System.out.println("Digite punto x1");// lo que sava pedir por pantalla
        x = entrada.nextDouble();//los valores que se van a guardar dentro de la variable global
        System.out.println("Digite punto y1");
        y = entrada.nextDouble();
        Punto punto1 = new Punto(x, y);//se llama a la clase en el metodo punto1 para guarde lo valores de las variables x,y
        System.out.println("Digite punto x2");
        x = entrada.nextDouble();
        System.out.println("Digite punto y2");
        y = entrada.nextDouble();
        Punto punto2 = new Punto(x, y);//se llama a la clase en el metodo punto2 para guarde lo valores de las variables x,y
        System.out.println("Digite punto x3");
        x = entrada.nextDouble();
        System.out.println("Digite punto y3");
        y = entrada.nextDouble();
        Punto punto3 = new Punto(x, y);//se llama a la clase triangulo en el metodo punto3 para guarde lo valores de las variables x,y
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);//se envia los puntos en que se guadaron todos lo puntos del triangulo
        triangulo.darResultados();//se llama al metodo ubicado en la clase triangulo paraque muestre por pantalla lo calculado por medio de los valores enviadps        
    }
    private void iniciarCuadrado(){//se hace esta funcion para los datos cuadrado
        double x, y;//variables de la funcion
        System.out.println("Digite punto x1");// lo que sava pedir por pantalla
        x = entrada.nextDouble();//los valores que se van a guardar dentro de la variable global de la funcion
        System.out.println("Digite punto y1");
        y = entrada.nextDouble();
        Punto punto1 = new Punto(x, y);//se llama a la clase en el metodo punto1 para guarde lo valores de las variables x,y
        System.out.println("Digite punto x2");
        x = entrada.nextDouble();
        System.out.println("Digite punto y2");
        y = entrada.nextDouble();
        Punto punto2 = new Punto(x, y);//se llama a la clase en el metodo punto2 para guarde lo valores de las variables x,y
        System.out.println("Digite punto x3");
        x = entrada.nextDouble();
        System.out.println("Digite punto y3");
        y = entrada.nextDouble();
        Punto punto3 = new Punto(x, y);//se llama a la clase cuadrado en el metodo punto3 para guarde lo valores de las variables x,y
        System.out.println("Digite punto x4");
        x = entrada.nextDouble();
        System.out.println("Digite punto y4");
        y = entrada.nextDouble();
        Punto punto4 = new Punto(x, y);//se llama a la clase cadrado en el metodo punto4 para guarde lo valores de las variables x,y
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3,punto4);//se envia los puntos en que se guadaron todos lo puntos del cuadrado
        cuadrado.darResultados();//se llama al metodo ubicado en la clase triangulo paraque muestre por pantalla lo calculado por medio de los valores enviados        
        
    }        
       private void iniciarCirculo(){//se hace esta funcion para los datos circulo
        double x, y;//variables de la funcion
        System.out.println("Digite punto x1");//lo que va apedir por pantalla
        x = entrada.nextDouble();
        System.out.println("Digite punto y1");
        y = entrada.nextDouble();
        Punto punto1 = new Punto(x, y);// se hace el llamado de la clase para que guarden en el metodo punto1 los valores
        System.out.println("Digite punto x2");
        x = entrada.nextDouble();
        System.out.println("Digite punto y2");
        y = entrada.nextDouble();
        Punto punto2 = new Punto(x, y);// se hace el llamado de la clase para que guarden en el metodo punto2 los valores
        Circulo circulo = new Circulo(punto1, punto2);//se llama la clase circulo para que envie los valoes de los puntos
        circulo.darResultados();// se hace el llamado de los resultados calculados en la clase circulo        
    }
    
}
