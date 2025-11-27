package calculadora;

/**
 * 
 * <p><strong>Projeto Teste Calculadora</strong></p>
 * <p>Esta classe fornece testes com as operações matemáticas básicas, soma, subtração,
 * multiplicação e divisão.</p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 *      <li>Técnicas de revisão estática (caixa branca)</li>
 *      <li>Técnicas de revisão (caixa branca)</li>
 *      <li>Aplicação de refatoração em codigo Java</li>
 *      <li>Documentação com Javadoc</li>
 * 
 * </ul>
 * * <p>Após a refatoração, os métodos dessa classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 * 
 * @author Marcelo Lisboa
 * @version 1.0
 */
public class TesteCalculadora {
    /**
     * <p>Método principal que executa os métodos da classe "Calculadora.java",
     * todos os resultados das operações são impressos no console</p>
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
