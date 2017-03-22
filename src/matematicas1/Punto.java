/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas1;

/**
 *
 * @author Albert Charry,Jeyson Duarte,Jorge andres Duran
 */
public class Punto {//clase donde se va guardar los valores de x y 
    //se declaran las variables
    private double x;
    private double y;

    public Punto(double x, double y) {//donde se le asignan los valores solicyados
        this.x = x;
        this.y = y;
    }

    public double getX() {//se retorna el valor
        return x;
    }

    public void setX(double x) {//donde se guarda
        this.x = x;
    }
   
    public double getY() {//se retorna el valor
        return y;
    }
   
    public void setY(double y) {//se retorna el valor
        this.y = y;
    }
    
}