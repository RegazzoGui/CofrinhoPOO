package programa;


import java.util.Scanner;

import classes.Cofrinho;


public class Main {

	public static void main(String[] args) {

	Cofrinho cofrinho = new Cofrinho();
	
	//Método Scaner para permitir a entrada de dados
    Scanner imput = new Scanner(System.in);
    
    //Menu inicial
    int opcao;

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar.");
        System.out.println("2 - Remover moedas.");
        System.out.println("3 - Listar moedas.");
        System.out.println("4 - Total de moedas.");
        System.out.println("5 - Encerrar.");

        opcao = imput.nextInt();

        while(opcao != 5){
            switch(opcao){
                case 1:
                    cofrinho.adicionarMoeda();
                    break;
                case 2:
                    cofrinho.removerMoeda();
                    break;
                case 3:
                    cofrinho.listaMoedas();
                    break;
                case 4:
                    cofrinho.totalMoedas();
                    break;
                default:
                    System.out.println("Opção inválida, apenas números de 1 a 5!");
            }

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar.");
            System.out.println("2 - Remover moedas.");
            System.out.println("3 - Listar moedas.");
            System.out.println("4 - Total de moedas.");
            System.out.println("5 - Encerrar.");

            opcao = imput.nextInt();
        }
        imput.close();
		

	}

}
