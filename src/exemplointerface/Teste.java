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
public class Teste {
    
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora(new MediaUFRN(), 8, 7, 9);
        //Calculadora c = new Calculadora(new NotaPOO(), 8, 7, 9);
        System.out.println(c.getValor());
    }
    
}
