package br.gov.ipem.racdmlf.model;

import java.util.Date;

public class AfericaoEquipamento {
	
	
	private String data;
	private String tipoServico;
	private String municipio;
	private Integer servico;
	private String descricao;
	private Funcionario funcionario;
	private Funcionario funcionarioAux;
	private String regional;
	private String divisao;
	private String tipoBalanca;
	private String dataRelatorioDiario;
	private Integer quantEfetiva;
	private Double valorEfetvo;
	private Integer quantidadeAprovada;
	private Integer quantidadeReprovada;
	private Double valorTotal;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public Integer getServico() {
		return servico;
	}
	public void setServico(Integer servico) {
		this.servico = servico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Funcionario getFuncionarioAux() {
		return funcionarioAux;
	}
	public void setFuncionarioAux(Funcionario funcionarioAux) {
		this.funcionarioAux = funcionarioAux;
	}
	public String getRegional() {
		return regional;
	}
	public void setRegional(String regional) {
		this.regional = regional;
	}
	public String getDivisao() {
		return divisao;
	}
	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}
	public String getTipoBalanca() {
		return tipoBalanca;
	}
	public void setTipoBalanca(String tipoBalanca) {
		this.tipoBalanca = tipoBalanca;
	}
	public String getDataRelatorioDiario() {
		return dataRelatorioDiario;
	}
	public void setDataRelatorioDiario(String dataRelatorioDiario) {
		this.dataRelatorioDiario = dataRelatorioDiario;
	}
	public Integer getQuantEfetiva() {
		return quantEfetiva;
	}
	public void setQuantEfetiva(Integer quantEfetiva) {
		this.quantEfetiva = quantEfetiva;
	}
	public Double getValorEfetvo() {
		return valorEfetvo;
	}
	public void setValorEfetvo(Double valorEfetvo) {
		this.valorEfetvo = valorEfetvo;
	}
	public Integer getQuantidadeAprovada() {
		return quantidadeAprovada;
	}
	public void setQuantidadeAprovada(Integer quantidadeAprovada) {
		this.quantidadeAprovada = quantidadeAprovada;
	}
	public Integer getQuantidadeReprovada() {
		return quantidadeReprovada;
	}
	public void setQuantidadeReprovada(Integer quantidadeReprovada) {
		this.quantidadeReprovada = quantidadeReprovada;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
}
