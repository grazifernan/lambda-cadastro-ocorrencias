package br.com.cadastro.ocorrencia.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class OcorrenciaDTONovo {

    private int codOcorrencia;
    @JsonProperty("idCognito")
    private String idCognito;
    @JsonProperty("codCanal")
    private int codCanal;
    @JsonProperty("titulo")
    private String titulo;
    @JsonProperty("imagem")
    private byte[] imagem;
    @JsonProperty("tipoOcorrencia")
    private int tipoOcorrencia;
    @JsonProperty("situacao")
    private int situacao;
    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("dataOcorrencia")
    private Timestamp dataOcorrencia;


    public int getCodOcorrencia() {
        return codOcorrencia;
    }

    public int getCodCanal() {
        return codCanal;
    }

    public String getTitulo() {
        return titulo;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public int getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public int getSituacao() {
        return situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Timestamp getDataOcorrencia() {
        return dataOcorrencia;
    }

    public String getIdCognito() { return idCognito; }

    public void setCodOcorrencia(int codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    public void setCodCanal(int codCanal) {
        this.codCanal = codCanal;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public void setTipoOcorrencia(int tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataOcorrencia(Timestamp dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public void setIdCognito(String idCognito) { this.idCognito = idCognito; }
}