package calculator;

import veiculos.Veiculo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class Calculator {
    private int diasLocacao;
    private double valorTotal;

    public Calculator() {
    }

    public int calculateDiasLocacao(Veiculo veiculo) {
        setDiasLocacao((int) DAYS.between(veiculo.getDataLocacao(), veiculo.getDataDevolucao()));
        return getDiasLocacao();
    }

    public double calculateValorTotal(Veiculo veiculo) {
        return veiculo.getValorDiaria() * veiculo.getDiasLocacao();
    }

    public int getDiasLocacao() {
        return diasLocacao;
    }

    public void setDiasLocacao(int diasLocacao) {
        if (diasLocacao > 0) {
            this.diasLocacao = diasLocacao;
        } else {
            System.out.println("Dias de locação inválido, alteração não foi salva!");
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if(valorTotal > 0) {
        this.valorTotal = valorTotal;
        }
        else{
            System.out.println("Valor total inválido, alteração não foi salva!");
        }
    }
}
