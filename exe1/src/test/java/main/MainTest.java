package main;

import org.junit.jupiter.api.Test;
import people.People;
import taxes.INSS;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldCalculateNetSalary() {
        People people = new People("Aline", 1900D);
        INSS inss = new INSS();
        assertEquals(1729D, inss.calcularSalarioLiquido(people.getSalarioBruto()));
    }

    @Test
    void shouldCalculateINSS() {
        People people = new People("Felipe", 1900D);
        INSS inss = new INSS();
        assertEquals(171D, inss.calcularDesconto(people.getSalarioBruto()));
    }

    @Test
    void shouldIsNomeVerifyNumberInString() {
       assertFalse(Main.isNome("123456789"));
       assertTrue(Main.isNome("felipe precisa estudar"));
    }

    @Test
    void shouldIsSalarioVerifyNumberInString() {
        assertEquals(123456789D , Main.isNumero("123456789"));
        assertEquals(0D , Main.isNumero("0"));
    }

    @Test
    void shouldCalculateINSSTaxes() {
        People people = new People("Felipe", 1900D);
        INSS inss = new INSS();
        assertEquals(171D, inss.calcularDesconto(people.getSalarioBruto()));
        people.setSalarioBruto(2000D);
        assertEquals(180D, inss.calcularDesconto(people.getSalarioBruto()));
        people.setSalarioBruto(3000D);
        assertEquals(360D, inss.calcularDesconto(people.getSalarioBruto()));
        people.setSalarioBruto(4000D);
        assertEquals(560D, inss.calcularDesconto(people.getSalarioBruto()));
        people.setSalarioBruto(20000D);
        assertEquals(19099.3002D, inss.calcularSalarioLiquido(people.getSalarioBruto()));
    }



}