/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface;

/**
 *
 * @author Laura
 */
public class Calculadora {
    private final double VALOR;

    public Calculadora(Calculavel c, double...v) {
        VALOR = c.calcular(v);
    }

    public double getValor() {
        return VALOR;
    } 
    
}
