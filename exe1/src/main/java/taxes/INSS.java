package taxes;

public class INSS {

    private static double aliquota1 = 0.075D;
    private static double aliquota2 = 0.09D;
    private static double aliquota3 = 0.12D;
    private static double aliquota4 = 0.14D;
    private static double descontoTeto = 6433.57D * aliquota4;

    public INSS() {
    }

    public double calcularDesconto(double salarioBruto) {
        double desconto = 0;
        if (salarioBruto <= 1100) {
            desconto = salarioBruto * aliquota1;
        } else if (salarioBruto <= 2203.48) {
            desconto = salarioBruto * aliquota2;
        } else if (salarioBruto <= 3305.22) {
            desconto = salarioBruto * aliquota3;
        } else if (salarioBruto <= 6433.57) {
            desconto = salarioBruto * aliquota4;
        }
        return desconto;
    }

    public double calcularSalarioLiquido(double salarioBruto) {
        if(salarioBruto <= 6433.57) {
            double desconto = calcularDesconto(salarioBruto);
            double salarioLiquido = salarioBruto - desconto;
            return salarioLiquido;
        }else{
            return salarioBruto - descontoTeto;
        }
    }

}

