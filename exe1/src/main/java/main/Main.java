package main;

import people.People;
import taxes.INSS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        INSS inss = new INSS();
        String nome = "";
        double salarioBruto = 0;


        while (nome.length() == 0 || !isNome(nome)) {
            try {
                nome = "";
                System.out.println("Digite o nome do funcionário: ");
                nome = scanner.nextLine();
            } catch (RuntimeException e) {
                System.out.println("Nome inválido!" + e.getMessage());
            }
        }
        String salaryBrute = "";
        while (salarioBruto <= 0) {
            try {
                System.out.println("Digite o salário bruto do funcionário: ");
                salarioBruto = isNumero(scanner.nextLine());
            } catch (RuntimeException e) {
                System.out.println("Salário inválido!" + e.getMessage());
            }
        }

        People people = new People(nome.toString(), salarioBruto);
        people.setSalarioLiquido(inss.calcularSalarioLiquido(people.getSalarioBruto()));
        people.setINSS(inss.calcularDesconto(people.getSalarioBruto()));

        System.out.println(people.showOutput());
    }

    public static boolean isNome(String nome) {
        return nome.matches("[a-zA-Z\\s]+");
    }

    public static double isNumero(String bruto) {
        try {
            return Double.parseDouble(bruto);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
