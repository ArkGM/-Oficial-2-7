import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            Financas c = new Financas();

            System.out.print("Digite o numero de dias de atraso: ");
            double dias = entrada.nextDouble();

            System.out.print("Digite o valor: ");
            double valor = entrada.nextDouble();
            System.out.println();

            c.juros(dias, valor);
            c.multa(valor);
        }

    }
}
