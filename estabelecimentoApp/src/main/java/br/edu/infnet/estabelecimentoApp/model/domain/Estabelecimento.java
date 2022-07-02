package br.edu.infnet.estabelecimentoApp.model.domain;

import java.util.List;

public class Estabelecimento extends Usuario {
	private String cnpj;
	private String endereco;
	private boolean edTech;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isEdTech() {
		return edTech;
	}
	public void setEdTech(boolean edTech) {
		this.edTech = edTech;
	}
	
}