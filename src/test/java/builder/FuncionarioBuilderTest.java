package builder;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

    class FuncionarioBuilderTest {

        @Test
        void deveLancarExcecaoParaCodigoInvalido() {
            try {
                Funcionario funcionario = new FuncionarioBuilder()
                        .setCodFuncionario(0)
                        .setNome("João Silva")
                        .setCargo("Desenvolvedor")
                        .build();
                fail("Deveria lançar uma exceção para código inválido.");
            } catch (IllegalArgumentException e) {
                assertEquals("Codigo de Funcionario Invalido", e.getMessage());
            }
        }

        @Test
        void deveLancarExcecaoParaNomeVazio() {
            try {
                Funcionario funcionario = new FuncionarioBuilder()
                        .setCodFuncionario(101)
                        .setNome("")
                        .setCargo("Desenvolvedor")
                        .build();
                fail("Deveria lançar uma exceção para nome vazio.");
            } catch (IllegalArgumentException e) {
                assertEquals("Nome Invalido", e.getMessage());
            }
        }

        @Test
        void deveLancarExcecaoParaCargoVazio() {
            try {
                Funcionario funcionario = new FuncionarioBuilder()
                        .setCodFuncionario(101)
                        .setNome("João Silva")
                        .setCargo("")
                        .build();
                fail("Deveria lançar uma exceção para cargo vazio.");
            } catch (IllegalArgumentException e) {
                assertEquals("Cargo Invalido", e.getMessage());
            }
        }

        @Test
        void deveConstruirFuncionarioComSucesso() {
            Funcionario funcionario = new FuncionarioBuilder()
                    .setCodFuncionario(101)
                    .setNome("João Silva")
                    .setCargo("Desenvolvedor")
                    .setDataNascimento(new Date(1990, 5, 15))
                    .setEmail("joao.silva@example.com")
                    .setCpf("123.456.789-00")
                    .setRg("987654321")
                    .setCelular("(99) 99999-9999")
                    .setEnderecoLogadouro("Rua Principal")
                    .setEnderecoNumero("123")
                    .build();

            assertNotNull(funcionario);
            assertEquals(101, funcionario.getCodFuncionario());
            assertEquals("João Silva", funcionario.getNome());
            assertEquals("Desenvolvedor", funcionario.getCargo());
        }
    }


