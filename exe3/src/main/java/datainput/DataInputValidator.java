package datainput;

import java.time.LocalDate;

public class DataInputValidator {

    private LocalDate dataInput;
    private static String FORMAT = "dd/MM/yyyy";

    public LocalDate getDataInput() {
        return dataInput;
    }

    public LocalDate Input(String dataInput) {
        try {
            this.dataInput = LocalDate.parse(dataInput, java.time.format.DateTimeFormatter.ofPattern(FORMAT));
            return getDataInputLD();
        } catch (RuntimeException e) {
            System.out.println("Invalid date FORMAT. Please enter date in FORMAT dd/MM/yyyy" + e);
            return null;
        }
    }

    public void setDataInput(LocalDate dataInput) {
        this.dataInput = dataInput;
    }

    public void setDataInputPlus7Days() {
        try {
            dataInput = dataInput.plusDays(7);
        } catch (NullPointerException e) {
            System.out.println("Insert Data Before" + e);
        }
    }

    public LocalDate getDataInputLD() {
        return dataInput;
    }

    public String getDataInputToString() {
        return dataInput.format(java.time.format.DateTimeFormatter.ofPattern(FORMAT));
    }

}
