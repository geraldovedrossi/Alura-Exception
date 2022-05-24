public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		
			try {
				metodo2();
			} catch (ArithmeticException | NullPointerException ex) {
				if(ex.getMessage() == "Erro Num") {
					System.out.println("ArithmeticException");
				} else if (ex.getMessage() == "Erro Null") {
					System.out.println("NullPointerException error");

				}
			}
		
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			throw new NullPointerException("Erro Null");
		}
		System.out.println("Fim do metodo2");
	}
}