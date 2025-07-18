// Importo a classe Scanner, que me permite ler dados digitados pelo usuário
import java.util.Scanner;

// Declaro a classe principal da minha calculadora
public class CalculadoraSimples {

    // Método principal - é onde meu programa começa a rodar
    public static void main(String[] args) {
        
        // Crio um objeto Scanner para capturar a entrada do usuário via teclado
        Scanner scanner = new Scanner(System.in);

        // Declaro as variáveis que vou usar: dois números, o operador e o resultado da operação
        double num1, num2, resultado;
        char operador;

        // Mostro um título para a calculadora no console
        System.out.println("==== Calculadora Simples ====");

        // Peço para o usuário digitar o primeiro número
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble(); // Leio o número e armazeno em num1

        // Peço para o usuário digitar o operador desejado (+, -, *, /)
        System.out.print("Digite o operador (+, -, *, /): ");
        operador = scanner.next().charAt(0); // Leio apenas o primeiro caractere digitado

        // Peço para o usuário digitar o segundo número
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble(); // Leio o número e armazeno em num2

        // Uso um switch para verificar qual operação foi escolhida
        
        switch (operador) {
            case '+':
                // Se o operador for '+', ira fazer a soma
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado); // Mostro o resultado
                break;
            case '-':
                // Se o operador for '-', ira fazer a subtração
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                // Se o operador for '*', ira fazer a multiplicação
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                // Se o operador for '/', preciso verificar se o divisor não é zero
                if (num2 != 0) {
                    resultado = num1 / num2; // Faço a divisão normalmente
                    System.out.println("Resultado: " + resultado);
                } else {
                    // Se for zero, aviso que não é permitido dividir por zero
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                // Se o operador digitado não for válido, o usuário será avisado no terminal
                System.out.println("Operador inválido.");
        }

        // Fecho o scanner para liberar o recurso de entrada
        scanner.close();
    }
}
