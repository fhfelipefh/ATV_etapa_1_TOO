package main;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCompra = 0D;
        int qtdParcelas = 0;
        LocalDate aux = LocalDate.now();
        System.out.println("Informe o valor da compra: ");
        while (valorCompra <= 0) {
            valorCompra = parseDoubleValid(sc.nextLine());
            if (valorCompra <= 0) {
                System.out.println("Valor inválido, informe novamente: ");
            }
        }
        System.out.println("Informe a quantidade de parcelas: ");
        while (qtdParcelas <= 0) {
            qtdParcelas = parseIntValid(sc.nextLine());
            if (qtdParcelas <= 0) {
                System.out.println("Quantidade inválida, informe novamente: ");
            }
        }

        double[] valorParcelas = new double[qtdParcelas];
        LocalDate[] dataVencimento = new LocalDate[qtdParcelas];

        double valorParcela = valorCompra / qtdParcelas;

        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Total de parcelas: " + qtdParcelas);

        for (int i = 0; i < qtdParcelas; i++) {
            valorParcelas[i] = valorParcela;
            dataVencimento[i] = aux;
            System.out.println("Valor da parcela: "+valorParcelas[i]+" Data do "+ (i+1) +"º vencimento: "+formatDate(dataVencimento[i]));
            aux = aux.plusDays(30);
        }

    }

    public static double parseDoubleValid(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static int parseIntValid(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static LocalDate parseValidDate(String str) {
        try {
            return LocalDate.parse(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static String formatDate(LocalDate date){
        return date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear();
    }

}
