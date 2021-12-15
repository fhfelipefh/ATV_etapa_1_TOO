package people;


public class People {
    private String name;
    private double salarioBruto;
    private double salarioLiquido;
    private double INSS;

    public People(String name, double salarioBruto) {
        this.name = name;
        this.salarioBruto = salarioBruto;
    }

    public String showOutput() {
        return "Nome: " + name + '\n' +
                "Salário bruto: " + salarioBruto + '\n' +
                "INSS: " + INSS + '\n' +
                "Salário líquido: " + salarioLiquido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(double INSS) {
        this.INSS = INSS;
    }
}
