import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Test
    public void deveSomarDoisNumeros() {

        int resultado = calculadora.somar(10, 20);

        assertEquals(30, resultado);
    }

    @Test
    public void deveSubtrairDoisNumeros() {

        int resultado = calculadora.subtrair(20, 8);

        assertEquals(12, resultado);
    }

    @Test
    public void deveMultiplicarDoisNumeros() {

        int resultado = calculadora.multiplicar(10, 2);

        assertEquals(20, resultado);
    }

    @Test
    public void deveDividirDoisNumeros() {

        int resultado = calculadora.dividir(10, 2);

        assertEquals(5, resultado);
    }

    @Test
    public void deveRetornarVerdadeiroParaNumeroPositivo() {

        assertTrue(calculadora.ehPositivo(10));

    }

    @Test
    public void deveRetornarFalsoParaNumeroNegativo() {

       assertFalse(calculadora.ehPositivo(-1));
    }

    @Test
    public void deveRetornarVerdadeiroQuandoNumeroForPar(){

        assertFalse(calculadora.ehPar(7));
    }

    @BeforeEach
    public void iniciar() {
        calculadora = new Calculadora();

        System.out.println("Preparando teste...");
    }

    @AfterEach
    public void finalizar(){
        System.out.println("Finalizando...");
    }
}
