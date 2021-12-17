package main;

import datainput.DataInputValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataInputValidator validator = new DataInputValidator();
        System.out.println("Informe uma data: (dd/mm/aaaa)");
        while (validator.getDataInput() == null) {
            String str = scanner.nextLine();
            validator.Input(str);
        }

        System.out.println("Data informada: " + validator.getDataInputToString());

        for (int i = 0; i < 5; i++) {
            validator.setDataInputPlus7Days();
            System.out.println("Data de pagamento: " + validator.getDataInputToString());
        }
    }
}
