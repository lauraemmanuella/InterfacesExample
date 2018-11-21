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
public class ClienteDAO implements DAO<Cliente>{


    @Override
    public boolean cadastrar(Cliente o) {
        if(o != null){
            System.out.println(o + " cadastrado");
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean atualizar(Cliente src, Cliente dest) {
       if(src != null && dest != null){
            System.out.println(src + " será atualizado para " + dest); 
           return true;
       }
        else
            return false;
    }

    @Override
    public boolean remover(Cliente o) {
        if(o != null){
            System.out.println(o + " removido");
            return true;
        }
        else
            return false;
    }
    
     @Override
    public ArrayList<Cliente> listar() {
        ArrayList<Cliente> lista = new ArrayList<>();
        
        Cliente c1 = new Cliente(30, "Teste30");
        lista.add(c1);
        
        Cliente c2 = new Cliente(31, "Teste31");
        lista.add(c2);
        
        return lista;
    }

    @Override
    public Cliente buscar(int id) {
        Cliente c = new Cliente(51, "Teste51");

        if(id == 51)
            return c;
        else
            return null;
    }
    
}
