package br.edu.infnet.estabelecimentoApp.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.estabelecimentoApp.clients.EstabelecimentoClient;
import br.edu.infnet.estabelecimentoApp.model.domain.Funcionario;

@Service
public class FuncionarioService {
	@Autowired 
	private EstabelecimentoClient estabelecimentoClient;
	
	public void incluir(Funcionario funcionario) {
		estabelecimentoClient.incluirFuncionario(funcionario);
	}
	
	public List<Funcionario> obterLista(){
		return estabelecimentoClient.obterListaFuncionarios();
	}
	
	
}
