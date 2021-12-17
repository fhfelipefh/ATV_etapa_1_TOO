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
        this.diasLocacao = diasLocacao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
