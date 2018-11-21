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
 * @param <T>
 */
public interface DAO<T> {

    boolean cadastrar(T o);

    boolean atualizar(T src, T dest);

    boolean remover(T o);

    T buscar(int id);

    ArrayList<T> listar();
}
