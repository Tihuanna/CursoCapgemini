
public class Pessoas {

	public static void main(String[] args) {
		
		//Juridica
		Juridica jur = new Juridica();
		jur.nome = "Casas do silva";
		jur.cpnj = "123819381";
		jur.situacaoPessoa =" Inativada";
		
		
		//Fisica
		Fisica fis1 = new Fisica();
		fis1.nome = "Kevin";
		fis1.cpf = "123456789";
		fis1.identidade = "380411982193";
		fis1.situacaoPessoa = "Ativo";
		
		System.out.println("Dados da pessoa fisica: ");
		System.out.println(fis1.toString());
		
		System.out.println("Dados da pessoa juridica: ");
		System.out.println(jur.toString());
	}

}
