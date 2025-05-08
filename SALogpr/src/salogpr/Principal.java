package SALogpr;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criando o local de armazenamento dos dados
        String[] vetVendedoresNomes;
        double[][] matVendas;
        double[] vetBonus;
        double[] vetTotalVendas;
        String vetStatus[];
        String[] vetDiaSemana = {"Segunda","Terca","Quarta","Quinta","Sexta"};
        int qtdVendedores;

        System.out.println("Informe a quantidade de vendedores");
        qtdVendedores = sc.nextInt();

        // estabelece o tamanho dos vetores e matriz com base na qtde de vendedores
        vetVendedoresNomes = new String[qtdVendedores];
        matVendas          = new double[qtdVendedores][5];
        vetBonus           = new double[qtdVendedores];
        vetTotalVendas     = new double[qtdVendedores];
        vetStatus          = new String[qtdVendedores];       
        
        // entrada de dados (Nomes, quantidade de funcionarios)
        for (int lin = 0; lin < qtdVendedores; lin++) {
            System.out.println("Informe o nome do vendedor nr " + (lin + 1));
            vetVendedoresNomes[lin] = sc.next();
            for (int col = 0; col < 5; col++) {
                System.out.println("Informe quanto o(a) " + vetVendedoresNomes[lin] + " vendeu na " + vetDiaSemana[col] );
                matVendas[lin][col] = sc.nextDouble();
                vetTotalVendas[lin] = vetTotalVendas[lin] + matVendas[lin][col];
            }
            if (vetTotalVendas[lin] >= 5000) {
                vetStatus[lin] = "Excelente";
                vetBonus[lin] = vetTotalVendas[lin]  * 0.1;
            } else if (vetTotalVendas[lin] >= 3000 && vetTotalVendas[lin] < 4999.99) {
                vetStatus[lin] = "Bom";
                vetBonus[lin] = vetTotalVendas[lin]  * 0.05;
            } else if (vetTotalVendas[lin] < 3000) {
                vetStatus[lin] = "Regular";
            } 
        }

        // Classificação dos funcionarios
         
         //  Relatorio
        System.out.println("============================================================");
        System.out.println("RELATORIO DE VENDAS SEMANAIS");
        System.out.println("============================================================");
        System.out.println("| Vendedor | Total Vendido | Classificacao | Bonus |");
        System.out.println("+-----------------------------------------------------------------------------+");
         
        for (int lin = 0; lin < qtdVendedores; lin++) {
            System.out.printf("%-16s | R$ %10.2f | %-13s | R$ %8.2f\n", vetVendedoresNomes[lin],vetTotalVendas[lin],vetStatus[lin],vetBonus[lin]);
        }      
        System.out.println("+-----------------------------------------------------------------------------+");        
        System.out.println("MELHOR VENDEDOR DA SEMANA: ");
        System.out.println("============================================================");
         
        sc.close();
    }
     }
    
