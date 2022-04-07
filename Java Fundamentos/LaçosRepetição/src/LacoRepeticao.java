
public class LacoRepeticao {

	public static void main(String[] args) {
		// While
		int qtdVezes = 1;
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + " vez");
			qtdVezes++;
		}

		// Do while - Laço pós te4stado
		System.out.println("Comando do while");
		qtdVezes = 1;
		do {
			System.out.println("Estou fazendo a " + qtdVezes + " vez");
			qtdVezes++;
		} while (qtdVezes <= 10);
		System.out.println("Sai do laço e executei " + qtdVezes);
	

	// For
		System.out.println("Comando FOR");
	for (int qtdVezes1= 1; qtdVezes1 <=10; qtdVezes1++) {
		System.out.println("Comando for " + qtdVezes1 + " vez");
	}
	}
}
