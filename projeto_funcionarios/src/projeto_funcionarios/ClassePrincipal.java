package projeto_funcionarios;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClasseFuncionarios funcionario = new ClasseFuncionarios();
		//pessoa.setAtributoIdPessoa(1);
		funcionario.setAtributoNomeFuncionario("Leandro");
		funcionario.setAtributoSalarioFuncionario(1.3);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(funcionario);


	}

}
