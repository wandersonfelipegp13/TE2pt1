package m2.e3.tarefa.modelo;

public class Deputado {

	private String uri;
	private String nome;
	private int idLegislaturaInicial;
	private int idLegislaturaFinal;
	private String nomeCivil;
	private String cpf;
	private String siglaSexo;
	private String urlRedeSocial;
	private String urlWebsite;
	private String dataNascimento;
	private String dataFalecimento;
	private String ufNascimento;
	private String municipioNascimento;

	public Deputado() {
		super();
	}

	public Deputado(String uri, String nome, int idLegislaturaInicial, int idLegislaturaFinal, String nomeCivil,
			String cpf, String siglaSexo, String urlRedeSocial, String urlWebsite, String dataNascimento,
			String dataFalecimento, String ufNascimento, String municipioNascimento) {
		super();
		this.setUri(uri);
		this.setNome(nome);
		this.setIdLegislaturaInicial(idLegislaturaInicial);
		this.setIdLegislaturaFinal(idLegislaturaFinal);
		this.setNomeCivil(nomeCivil);
		this.setCpf(cpf);
		this.setSiglaSexo(siglaSexo);
		this.setUrlRedeSocial(urlRedeSocial);
		this.setUrlWebsite(urlWebsite);
		this.setDataNascimento(dataNascimento);
		this.setDataFalecimento(dataFalecimento);
		this.setUfNascimento(ufNascimento);
		this.setMunicipioNascimento(municipioNascimento);
	}
	
	@Override
	public String toString() {
		return "URI=" + uri + "\nNome=" + nome + "\nID Legislatura Inicial=" + idLegislaturaInicial
				+ "\nID Legislatura Final=" + idLegislaturaFinal + "\nNome Civil=" + nomeCivil + "\nCPF=" + cpf
				+ "\nSigla Sexo=" + siglaSexo + "\nURL Rede Social=" + urlRedeSocial + "\nURL Website=" + urlWebsite
				+ "\nData Nascimento=" + dataNascimento + "\nData Falecimento=" + dataFalecimento + "\nUF Nascimento="
				+ ufNascimento + "\nMunicipio Nascimento=" + municipioNascimento;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdLegislaturaInicial() {
		return idLegislaturaInicial;
	}

	public void setIdLegislaturaInicial(int idLegislaturaInicial) {
		this.idLegislaturaInicial = idLegislaturaInicial;
	}

	public int getIdLegislaturaFinal() {
		return idLegislaturaFinal;
	}

	public void setIdLegislaturaFinal(int idLegislaturaFinal) {
		this.idLegislaturaFinal = idLegislaturaFinal;
	}

	public String getNomeCivil() {
		return nomeCivil;
	}

	public void setNomeCivil(String nomeCivil) {
		this.nomeCivil = nomeCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSiglaSexo() {
		return siglaSexo;
	}

	public void setSiglaSexo(String siglaSexo) {
		this.siglaSexo = siglaSexo;
	}

	public String getUrlRedeSocial() {
		return urlRedeSocial;
	}

	public void setUrlRedeSocial(String urlRedeSocial) {
		this.urlRedeSocial = urlRedeSocial;
	}

	public String getUrlWebsite() {
		return urlWebsite;
	}

	public void setUrlWebsite(String urlWebsite) {
		this.urlWebsite = urlWebsite;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataFalecimento() {
		return dataFalecimento;
	}

	public void setDataFalecimento(String dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}

	public String getUfNascimento() {
		return ufNascimento;
	}

	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}

	public String getMunicipioNascimento() {
		return municipioNascimento;
	}

	public void setMunicipioNascimento(String municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}

}
