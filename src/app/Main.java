package app;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Entre com o número de contribuintes: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do contribuinte #" + (i+1));
            System.out.print("Pessoa física ou jurídica? (f/j)");
            char type = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Rendimento anual: ");
            double rendimentoAnual = scan.nextDouble();

            if(type == 'f'){
                System.out.print("Gastos com saúde: ");
                double gastosComSaude = scan.nextDouble();
                scan.nextLine();
                list.add(new PessoaFisica(nome, rendimentoAnual, gastosComSaude));
            } else{
                System.out.print("Número de funcionários: ");
                int numFuncionarios = scan.nextInt();
                list.add(new PessoaJuridica(nome, rendimentoAnual, numFuncionarios));
            }
        }

        double total = 0;
        System.out.println("Impostos pagos: ");
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).getNome() + ": " + "R$ " + String.format("%.2f", list.get(i).pagarImposto()));;
            total += list.get(i).pagarImposto();
        }

        System.out.println("Total arrecadado: " + total);

    }
}
