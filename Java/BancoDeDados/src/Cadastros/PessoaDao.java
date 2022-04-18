package Cadastros;

public class PessoaDao extends Dao {

	public void incluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("Insert into pessoa values(?,?,?)");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}

	public void alterarPessoa(Pessoa p) throws Exception{
		open();
		stmt =con.prepareStatement("Update Pesoa nome =?, email = ? where idPessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}
	public void excluirPessoa(Pessoa p) throws Exception{
		open();
		stmt = con.prepareStatement("Delete from Pessoa where idPessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	public Pessoa consultaPessoaIndividual(int cod) throws Exception {
		open();
		stmt = con.prepareStatement("select * from pessoa where idPessoa = ?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		Pessoa p = null;
		if(rs.next()) {
			p = new Pessoa();
			p.setIdPessoa(rs.getInt("idPessoa"));
			p.setNomePessoa(rs.getString("nomePessoa"));
			p.setEmail(rs.getString("email"));
		} else {
			System.out.println("Registro não encontrado");
		}
		close();
		return p;
		
	}
}
