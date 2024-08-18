import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			try {

				System.out.println("Digite o primeiro parâmetro");
				int parametroUm = terminal.nextInt();
				System.out.println("Digite o segundo parâmetro");
				int parametroDois = terminal.nextInt();

				if (parametroDois <= parametroUm) {
					throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
				}

				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException exception) {
				System.out.println(exception.getMessage());
			}
		}
		
		}
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			int contagem = parametroDois - parametroUm;
			for (int i = 0; i <= contagem; i++) {
				System.out.println(parametroUm + i);
			}
	}
}