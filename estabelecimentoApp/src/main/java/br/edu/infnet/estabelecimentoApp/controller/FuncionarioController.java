package br.edu.infnet.estabelecimentoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.estabelecimentoApp.model.domain.Funcionario;
import br.edu.infnet.estabelecimentoApp.model.service.FuncionarioService;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@GetMapping(value = "/funcionarios")
	public String telaLista(Model model) {
		model.addAttribute("funcionarios", funcionarioService.obterLista());
		return "funcionario/lista";
	}
	
	@GetMapping(value = "/funcionario")
	public String telaCadastro() {
		return "funcionario/cadastro";
	}
	
	@PostMapping(value = "/funcionario/incluir")
	public String incluir(Funcionario funcionario) {
		funcionarioService.incluir(funcionario);
		return "redirect:/";
	}
	
	
}
