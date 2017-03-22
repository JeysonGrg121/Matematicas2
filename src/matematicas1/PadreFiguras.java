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
public class PadreFiguras {//se crea la clase padre
    int tipoFigura;//la variables que tiene en comun las clases hijas
    protected Punto punto1;
    protected Punto punto2;
    private Scanner teclado;
    public PadreFiguras() {
        teclado = new Scanner(System.in);        
    }

    public PadreFiguras(Punto punto1, Punto punto2) {// metodo donde crean las variables
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {//se retorna el valor
        return punto1;
    }

    public void setPunto1(Punto punto1) {// donde se va guadar el valor solicitado
        this.punto1 = punto1;
    }

    public Punto getPunto2() {//se retorna el valor
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;// donde se va guadar el valor solicitado
    }
    
    
}