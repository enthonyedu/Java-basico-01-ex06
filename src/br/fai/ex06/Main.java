package br.fai.ex06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {
		String[] carros = { "Civic", "Gol", "Palio", "Uno" };
		try {
			for (int i = 0; i < carros.length; i++) {
				String carro = carros[i];
				System.out.println("Nome do carro: " + carro);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} finally {
			System.out.println("Será executado independente se der ruim ou nao");
		}

		carros[1] = "L200";
		System.out.println("--------------");

		for (String carro : carros) {
			System.out.println("Nome do carro: " + carro);

		}
		System.out.println("------------");

		int tamanhodoarray = carros.length + 1;
		String[] novoArraydeCarros = new String[tamanhodoarray];

		for (int i = 0; i < carros.length; i++) {

			String carro = carros[i];
			novoArraydeCarros[i] = carro;

		}

		novoArraydeCarros[tamanhodoarray - 1] = "Gol";

		for (String string : novoArraydeCarros) {
			System.out.println("Novo array de carros: " + string);

		}

	}

}
