package br.edu.infnet.estabelecimentoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.estabelecimentoApp.model.domain.Estabelecimento;
import br.edu.infnet.estabelecimentoApp.model.service.EstabelecimentoService;

@Controller
public class EstabelecimentoController {

	@Autowired 
	private EstabelecimentoService estabelecimentoService;
	
	
	@GetMapping(value = "/estabelecimento")
	public String telaCadastro() {
		return "estabelecimento/cadastro";
	}
	
	@PostMapping(value = "estabelecimento/incluir")
	public String incluir(Estabelecimento estabelecimento) {
		estabelecimentoService.incluir(estabelecimento);
		return "redirect:/";
	}
	
	
}
