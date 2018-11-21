/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacefuncional;



/**
 *
 * @author Laura
 */
public class Teste {
    
    public static void main(String[] args) {
         int x = 0;
         
         //CLASSE INTERNA ANONIMA
         InterfaceG g = new InterfaceG() {
            
            int a = x; //PODE ACESSAR OS CAMPOS DA CLASSE DE PRIMEIRO NIVEL
            
            @Override
            public void metodo1() {
                System.out.println("metodo1 da interface g implementada");
            }

            @Override
            public void metodo2() {
                System.out.println("metodo2 da interface g implementada");
            }

            @Override
            public void metodo3() {
                System.out.println("metodo3 da interface g implementada");
            }
        };
        
        //USA MÉTODOS DA CLASSE INTERNA ANONIMA
        g.metodo1();
         
        //USANDO LAMBDA PARA IMPLEMENTAR METODO ANONIMO DE INTERFACE FUNCIONAL
        InterfaceF j = (int i1) -> {
            System.out.println("Metodo func de InterfaceF");
            return i1*100;
        };
        
        //USA O MÉTODO ANÔNIMO
        System.out.println(j.func(2));
        
        
    }
}
