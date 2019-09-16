/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

public class menu {
    
    public static void menu(){
        System.out.println("+------ Mercado JavaLovers ------+");
        System.out.println("|                                |");
        System.out.println("|      **  Área do cliente **    |");
        System.out.println("|                                |");
        System.out.println("|      1 - Realizar compra       |");
        System.out.println("|      2 - Ver estoque           |");
        System.out.println("|      3 - Área Restrita         |");
        System.out.println("|      4 - Consultar             |");
        System.out.println("|      0 - Sair/Cancelar         |");
        System.out.println("|                                |");
        System.out.println("+--------------------------------+");
        System.out.println("Digite aqui ");
    }

    public static void comprar(){
        System.out.println("Você entrou no método compra.");
    }
    
    public static void verEstoque(){
        System.out.println("Você está vendo o estoque.");
    }
    
    public static void restrito(){
        System.out.println("Você entrou na área restrita.");
    }
    
    public static void consultar(){
        System.out.println("Você entrou na área restrita.");
    }
    
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                comprar();
                break;
                
            case 2:
                verEstoque();
                break;
                
            case 3:
                restrito();
                break;
                
            case 4:
                consultar();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}