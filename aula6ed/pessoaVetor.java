package aula6ed;

public class pessoaVetor {

	
	pessoa[] vetor;
	int cont=0;
	
	void criarLista() {
		vetor = new pessoa [5];
	}
	
	void inserir(pessoa pessoa) {
		if(cont == 5) {
			System.out.println("Lista Cheia !!");
		}else {
			vetor[cont] = new pessoa();
			vetor[cont].setNome(pessoa.getNome());
			vetor[cont].setIdade(pessoa.getIdade());
			vetor[cont].setSalario(pessoa.getSalario());
			cont++;
			System.out.println ("Objeto cadastrado com sucesso!!");
			}
		}
	
	
	
	void listar(){
		if (cont == 0) {
			System.out.println("Lista cheia !!");
		}else {
			for (int i=0; i<cont;i++) {
			System.out.println("O nome: "+vetor[i].getNome()	
							  +"\nA idade: "+vetor[i].getIdade()
							  +"\nO salario: "+vetor[i].getSalario()
							  +"\n----------------------------");
			}
		}
	}
}
