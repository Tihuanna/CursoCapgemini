package Cadastros;

public class Menu {

	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		try { /*
			//Incluir umna pessoa
			Pessoa p1 = new Pessoa (1, "Kevin", "kevin@email.com");
			Pessoa p2 = new Pessoa (2, "Kevin2", "kevin2@email.com");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
			
			//Alterar uma pessoa
			Pessoa pessoa = pd.consultaPessoaIndividual(2);
			System.out.println("pessoa: "+pessoa);
			pessoa.setEmail("kevin3@email.com");
			*/
			Pessoa pes1 = pd.consultaPessoaIndividual(1);
			System.out.println("Código: "+ pes1.getIdPessoa());
			System.out.println("Nome: "+ pes1.getNomePessoa());
			System.out.println("Email: "+ pes1.getEmail());
		} catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		

	}

}
