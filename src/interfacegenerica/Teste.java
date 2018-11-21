/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegenerica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Teste {
    
    private DAO d; //polimorfismo de substituição de objetos
    Scanner entrada = new Scanner(System.in);
    
    public void menu(){
        
        int opcao = 0;
        do{
            System.out.println("\nGerenciar:\n1-Cliente\n2-Produto\n3-Sair\n");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    d = new ClienteDAO();//polimorfismo de substituição de objetos
                       //teste
                    Cliente c1 = new Cliente(1, "Laura");
                    Cliente c2 = new Cliente(2, "Emmanuella");
                    submenu(c1, c2);
                    break;
                case 2:
                    d = new ProdutoDAO();//polimorfismo de substituição de objetos
                    Produto p1 = new Produto(1, "Papel", 1);
                    Produto p2 = new Produto(2, "Lápis", 2);
                    submenu(p1, p2);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcao invalida\n");
            }
        }while(opcao != 3);
    }
    
    public void submenu(Object... o){
        int opcao = 0;
        do{
            System.out.println("\n1-Cadastrar\n2-Atualizar\n3-Buscar\n4-Remover\n5-Listar\n6-Sair\n");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    d.cadastrar(o[0]);
                    break;
                case 2:
                    d.atualizar(o[0], o[1]);
                    break;
                case 3:
                    System.out.println(d.buscar(51));
                    break;
                case 4:
                    d.remover(o[0]);
                    break;
                case 5:
                    ArrayList<Object> a = d.listar();
                    for(Object i: a)
                        System.out.println(a);
                    break;
                default:
                    System.out.println("Opcao invalida\n");
            }
        }while(opcao != 6);
    }
    
    public static void main(String[] args) {
            
            Teste t = new Teste();
            t.menu();
         
            
    }
}
