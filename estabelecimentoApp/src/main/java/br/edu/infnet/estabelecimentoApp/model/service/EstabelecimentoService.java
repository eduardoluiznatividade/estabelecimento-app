package br.edu.infnet.estabelecimentoApp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.estabelecimentoApp.clients.EstabelecimentoClient;
import br.edu.infnet.estabelecimentoApp.model.domain.Estabelecimento;

@Service
public class EstabelecimentoService {
	@Autowired
	private EstabelecimentoClient estabelecimentoCliente;
	
	public void incluir(Estabelecimento estabelecimento) {
		estabelecimentoCliente.incluirEstabelecimento(estabelecimento);
	}
		
	public void excluir(Integer id) {
		
	}
}
