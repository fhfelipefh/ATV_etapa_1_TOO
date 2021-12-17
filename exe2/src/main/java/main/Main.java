package main;

import calculator.Calculator;
import veiculos.Veiculo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate dataLocacao = null;
        LocalDate dataDevolucao = null;
        double valorDiaria = 0D;

        while (valorDiaria == 0) {
            System.out.println("Digite o valor da diária: ");
            try {
                valorDiaria = valor(in.nextLine());
            } catch (RuntimeException e) {
                System.out.println("Valor inválido");
            }
        }

        while (dataLocacao == null) {
            System.out.println("Digite a data de locação: yyyy-MM-dd");
            try {
                dataLocacao = parseData(in.nextLine());
            } catch (RuntimeException e) {
                System.out.println("Data inválida");
            }
        }

        while (dataDevolucao == null) {
            System.out.println("Digite a data de devolução: yyyy-MM-dd");
            try {
                dataDevolucao = parseData(in.nextLine());
            } catch (RuntimeException e) {
                System.out.println("Data inválida");
            }
            if (dataDevolucao.isBefore(dataLocacao)) {
                dataDevolucao = null;
            }
        }

        Calculator calculator = new Calculator();
        Veiculo veiculo = new Veiculo(valorDiaria, dataLocacao, dataDevolucao);
        veiculo.setDiasLocacao(calculator.calculateDiasLocacao(veiculo));
        veiculo.setValorTotal(calculator.calculateValorTotal(veiculo));
        System.out.println(veiculo.toStringData());

    }

    public static LocalDate parseData(String data) {
        try {
            LocalDate date = LocalDate.parse(data);
            if(date.toString() == "") {
                return null;
            }
            return date;
        } catch (RuntimeException e) {
            return null;
        }
    }

    public static double valor(String valor) {
        try {
            return Double.parseDouble(valor);
        } catch (Exception e) {
            return 0;
        }
    }

}
