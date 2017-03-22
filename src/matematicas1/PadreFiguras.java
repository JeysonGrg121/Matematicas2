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
public class PadreFiguras {
    int tipoFigura;
    protected Punto punto1;
    protected Punto punto2;
    private Scanner teclado;
    public PadreFiguras() {
        teclado = new Scanner(System.in);        
    }

    public PadreFiguras(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    
    
}