package SALogpr;

import java.io.IO;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criando o local de armazenamento dos dados
        String[] vetVendedoresNomes;
        double[][] matVendas;
        String[] vetDiaSemana = {"Segunda","Terca","Quarta","Quinta","Sexta"};
        int qtdVendedores;

        System.out.println("Informe a quantidade de vendedores");
        qtdVendedores = sc.nextInt();
        vetVendedoresNomes = new String[qtdVendedores];
        matVendas = new double[qtdVendedores][5];
        
        // entrada de dados (Nomes, quantidade de funcionarios)
        for (int lin = 0; lin < qtdVendedores; lin++) {
            System.out.println("Informe o nome do vendedor nr " + (lin + 1));
            vetVendedoresNomes[lin] = sc.next();
            for (int col = 0; col < 5; col++) {
                System.out.println("Informe quanto o(a) " + vetVendedoresNomes[lin] + " vendeu na " + vetDiaSemana[col] );
                matVendas[lin][col] = sc.nextDouble();
            }
        }
        // Classificação dos funcionarios
         System.out.println(vetVendedoresNomes >= 5000 "Excelente");
        
        sc.close();
    }

}
