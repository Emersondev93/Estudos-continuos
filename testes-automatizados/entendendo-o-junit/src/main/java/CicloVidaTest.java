import org.junit.jupiter.api.*;

public class CicloVidaTest {

    @BeforeAll
    static void iniciarTudo() {
        System.out.println("Iniciando Tudo");
    }

    @AfterAll
    static void finalizarTudo() {
        System.out.println("Finalizando Tudo");
    }

    @BeforeEach
    void preparar() {
        System.out.println("Iniciando Test");
    }

    @AfterEach
    void limpar() {
        System.out.println("Finalizando Test");
    }

    @Test
    void somar() {
        System.out.println("Somando Test");
    }

    @Test
    void subtrair() {
        System.out.println("Subtraindo Test");
    }
}
