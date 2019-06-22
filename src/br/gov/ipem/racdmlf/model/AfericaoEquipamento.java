package br.gov.ipem.racdmlf.model;





import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name="afericaoequipamento")

public class AfericaoEquipamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name = "`data`")
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Column
	private String tipoServico;
	@Column
	private String municipio;
	@Column
	private Integer servico;
	@Column
	private String descricao;
	//@Column
	//private Funcionario funcionario;
	//@Column
	//private Funcionario funcionarioAux;
	@Column
	private String regional;
	@Column
	private String divisao;
	@Column
	private String tipoBalanca;
	@Column
	private String dataRelatorioDiario;
	@Column
	private Integer quantEfetiva;
	@Column
	private Double valorEfetvo;
	@Column
	private Integer quantidadeAprovada;
	@Column
	private Integer quantidadeReprovada;
	@Column
	private Double valorTotal;


	public Date getData() {
		return data;
	}
	public void setData(Date date) {
		this.data = date;
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
//	public Funcionario getFuncionario() {
//		return funcionario;
//	}
	

	
	public void setFuncionario(Funcionario funcionario) {
	//	this.funcionario = funcionario;
	}
//	public Funcionario getFuncionarioAux() {
	//	return funcionarioAux;
//	}
	//public void setFuncionarioAux(Funcionario funcionarioAux) {
	//	this.funcionarioAux = funcionarioAux;
//	}
	
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
