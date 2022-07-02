package br.edu.infnet.estabelecimentoApp.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.estabelecimentoApp.model.domain.Estabelecimento;
import br.edu.infnet.estabelecimentoApp.model.domain.Funcionario;

@FeignClient(url = "localhost:8080/api", name = "estabelecimentoClient")
public interface EstabelecimentoClient {

	@PostMapping(value = "/funcionario/incluir")
	public void incluirFuncionario(@RequestBody Funcionario funcionario);
	
	@GetMapping(value = "/funcionario/listar")
	public List<Funcionario> obterListaFuncionarios();
	
	
	@PostMapping(value = "/estabelecimento/incluir")
	public void incluirEstabelecimento(@RequestBody Estabelecimento estabelecimento);
	
	
}
