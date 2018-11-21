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
public class MediaUFRN implements Calculavel{

    @Override
    public double calcular(double... x) {
        System.out.println("Calcular media UFRN\nMedia Aritmetica");
        double media = 0;
        for(double i: x)
            media += i;
        media /= x.length;
        return media;
    }
    
}
