package br.edu.infnet.estabelecimentoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstabelecimentoAppController {

	@GetMapping(value = "/")
	public String telaInicial() {
		return "index";
	}
}
