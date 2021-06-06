package m2.e3.tarefa.modelo;

public class Deputado {

	private String nomeParlamentar;
	private String cpf;
	private String idDeputado;
	private String numeroCarteiraParlamentar;
	private int legislatura;
	private String siglaUF;
	private String siglaPartido;
	private int codigoLegislatura;
	private int numeroSubCota;
	private String descricao;
	private int numeroEspecificacaoSubCota;
	private String descricaoEspecificacao;
	private String fornecedor;
	private String cnpjCPF;
	private int numero;
	private int tipoDocumento;
	private String dataEmissao;
	private double valorDocumento;
	private int valorGlosa;
	private double valorLiquido;
	private int mes;
	private int ano;
	private int parcela;
	private String passageiro;
	private String trecho;
	private String lote;
	private String ressarcimento;
	private String restituicao;
	private int numeroDeputadoID;
	private int idDocumento;
	private String urlDocumento;

	public Deputado(String nomeParlamentar, String cpf, String idDeputado, String numeroCarteiraParlamentar,
			int legislatura, String siglaUF, String siglaPartido, int codigoLegislatura, int numeroSubCota,
			String descricao, int numeroEspecificacaoSubCota, String descricaoEspecificacao, String fornecedor,
			String cnpjCPF, int numero, int tipoDocumento, String dataEmissao, double valorDocumento, int valorGlosa,
			double valorLiquido, int mes, int ano, int parcela, String passageiro, String trecho, String lote,
			String ressarcimento, String restituicao, int numeroDeputadoID, int idDocumento, String urlDocumento) {
		super();
		this.nomeParlamentar = nomeParlamentar;
		this.cpf = cpf;
		this.idDeputado = idDeputado;
		this.numeroCarteiraParlamentar = numeroCarteiraParlamentar;
		this.legislatura = legislatura;
		this.siglaUF = siglaUF;
		this.siglaPartido = siglaPartido;
		this.codigoLegislatura = codigoLegislatura;
		this.numeroSubCota = numeroSubCota;
		this.descricao = descricao;
		this.numeroEspecificacaoSubCota = numeroEspecificacaoSubCota;
		this.descricaoEspecificacao = descricaoEspecificacao;
		this.fornecedor = fornecedor;
		this.cnpjCPF = cnpjCPF;
		this.numero = numero;
		this.tipoDocumento = tipoDocumento;
		this.dataEmissao = dataEmissao;
		this.valorDocumento = valorDocumento;
		this.valorGlosa = valorGlosa;
		this.valorLiquido = valorLiquido;
		this.mes = mes;
		this.ano = ano;
		this.parcela = parcela;
		this.passageiro = passageiro;
		this.trecho = trecho;
		this.lote = lote;
		this.ressarcimento = ressarcimento;
		this.restituicao = restituicao;
		this.numeroDeputadoID = numeroDeputadoID;
		this.idDocumento = idDocumento;
		this.urlDocumento = urlDocumento;
	}

	public String getNomeParlamentar() {
		return nomeParlamentar;
	}

	public void setNomeParlamentar(String nomeParlamentar) {
		this.nomeParlamentar = nomeParlamentar;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdDeputado() {
		return idDeputado;
	}

	public void setIdDeputado(String idDeputado) {
		this.idDeputado = idDeputado;
	}

	public String getNumeroCarteiraParlamentar() {
		return numeroCarteiraParlamentar;
	}

	public void setNumeroCarteiraParlamentar(String numeroCarteiraParlamentar) {
		this.numeroCarteiraParlamentar = numeroCarteiraParlamentar;
	}

	public int getLegislatura() {
		return legislatura;
	}

	public void setLegislatura(int legislatura) {
		this.legislatura = legislatura;
	}

	public String getSiglaUF() {
		return siglaUF;
	}

	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	public int getCodigoLegislatura() {
		return codigoLegislatura;
	}

	public void setCodigoLegislatura(int codigoLegislatura) {
		this.codigoLegislatura = codigoLegislatura;
	}

	public int getNumeroSubCota() {
		return numeroSubCota;
	}

	public void setNumeroSubCota(int numeroSubCota) {
		this.numeroSubCota = numeroSubCota;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumeroEspecificacaoSubCota() {
		return numeroEspecificacaoSubCota;
	}

	public void setNumeroEspecificacaoSubCota(int numeroEspecificacaoSubCota) {
		this.numeroEspecificacaoSubCota = numeroEspecificacaoSubCota;
	}

	public String getDescricaoEspecificacao() {
		return descricaoEspecificacao;
	}

	public void setDescricaoEspecificacao(String descricaoEspecificacao) {
		this.descricaoEspecificacao = descricaoEspecificacao;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getCnpjCPF() {
		return cnpjCPF;
	}

	public void setCnpjCPF(String cnpjCPF) {
		this.cnpjCPF = cnpjCPF;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public double getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(double valorDocumento) {
		this.valorDocumento = valorDocumento;
	}

	public int getValorGlosa() {
		return valorGlosa;
	}

	public void setValorGlosa(int valorGlosa) {
		this.valorGlosa = valorGlosa;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}

	public String getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(String passageiro) {
		this.passageiro = passageiro;
	}

	public String getTrecho() {
		return trecho;
	}

	public void setTrecho(String trecho) {
		this.trecho = trecho;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getRessarcimento() {
		return ressarcimento;
	}

	public void setRessarcimento(String ressarcimento) {
		this.ressarcimento = ressarcimento;
	}

	public String getRestituicao() {
		return restituicao;
	}

	public void setRestituicao(String restituicao) {
		this.restituicao = restituicao;
	}

	public int getNumeroDeputadoID() {
		return numeroDeputadoID;
	}

	public void setNumeroDeputadoID(int numeroDeputadoID) {
		this.numeroDeputadoID = numeroDeputadoID;
	}

	public int getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getUrlDocumento() {
		return urlDocumento;
	}

	public void setUrlDocumento(String urlDocumento) {
		this.urlDocumento = urlDocumento;
	}

}
