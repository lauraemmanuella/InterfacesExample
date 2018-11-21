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
public class NotaPOO implements Calculavel{

    @Override
    public double calcular(double... x) {
        System.out.println("Calcular nota POO\nMedia ponderada com pesos crescentes a partir de 1");
        double nota = 0;
        int pesos = 0;
        for(int i = 0; i < x.length; i++){
            nota += x[i] * (i+1);
            pesos += (i+1);
        }
        return nota/pesos;
    }
    
}
