package calculator;

import org.junit.jupiter.api.Test;
import veiculos.Veiculo;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldCalculateDiasLocacao() {
        Veiculo veiculo = new Veiculo(180D, LocalDate.parse("2021-12-17"), LocalDate.parse("2021-12-19"));
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.calculateDiasLocacao(veiculo));
        veiculo.setDataLocacao(LocalDate.parse("2021-12-01"));
        assertEquals(18, calculator.calculateDiasLocacao(veiculo));
    }

    @Test
    void shouldCalculateValorTotal() {
        Veiculo veiculo2 = new Veiculo(180D, LocalDate.parse("2021-12-17"), LocalDate.parse("2021-12-19"));
        Calculator calculator = new Calculator();
        veiculo2.setDiasLocacao(2);
        veiculo2.setValorTotal(calculator.calculateValorTotal(veiculo2));
        assertEquals(360D, veiculo2.getValorTotal());
        veiculo2.setValorDiaria(2000D);
        veiculo2.setValorTotal(calculator.calculateValorTotal(veiculo2));
        assertEquals(4000D, veiculo2.getValorTotal());
    }
    
}