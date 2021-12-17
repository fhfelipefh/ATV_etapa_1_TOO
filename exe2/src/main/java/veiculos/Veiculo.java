package veiculos;

import java.time.LocalDate;

public class Veiculo {
    private double valorDiaria;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private int diasLocacao;
    private double ValorTotal;

    public Veiculo(double valorDiaria, LocalDate dataLocacao, LocalDate dataDevolucao) {
        this.valorDiaria = valorDiaria;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
    }

    public String toStringData() {
        return "Valor da diária: " + getValorDiaria() + "\n" +
                "Data de Locação: " + getDataLocacao().getDayOfMonth() +"/"+getDataLocacao().getMonthValue()+"/"+getDataLocacao().getYear() + "\n" +
                "Data de Devolução: " + getDataDevolucao().getDayOfMonth() +"/"+getDataDevolucao().getMonthValue()+"/"+getDataDevolucao().getYear() + "\n" +
                "Dias de Locação:" + getDiasLocacao() +  "\n" +
                "Valor Total da locação: " + getValorTotal() + "\n";
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getDiasLocacao() {
        return diasLocacao;
    }

    public void setDiasLocacao(int diasLocacao) {
        this.diasLocacao = diasLocacao;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
