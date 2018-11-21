/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegenerica;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class ProdutoDAO implements DAO<Produto>{

    @Override
    public boolean cadastrar(Produto o) {
        if(o != null){
            System.out.println(o + " cadastrado");
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean atualizar(Produto src, Produto dest) {
         if(src != null && dest != null){
            System.out.println(src + " será atualizado para " + dest); 
           return true;
       }
        else
            return false;
    }

    @Override
    public boolean remover(Produto o) {
        if(o != null){
            System.out.println(o + " removido");
            return true;
        }
        else
            return false;
    }

    @Override
    public Produto buscar(int id) {
       Produto c = new Produto(51, "Teste51", 51);
      
        if(id == 51)
            return c;
        else
            return null;
    }

    @Override
    public ArrayList<Produto> listar() {
         ArrayList<Produto> lista = new ArrayList<>();
        Produto c1 = new Produto(30, "Teste30", 30);
       
        lista.add(c1);
        
        Produto c2 = new Produto(31, "Teste31", 31);
      
        lista.add(c2);
        
        return lista;
    }
    
}
