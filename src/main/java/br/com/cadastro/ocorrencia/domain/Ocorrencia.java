package br.com.cadastro.ocorrencia.domain;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "\"Ocorrencia\"")

public class Ocorrencia {

    @Id
    @SequenceGenerator(name="Ocorrencia", sequenceName="ocorrencia_id_ocorrencia_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Ocorrencia")
    @Column(name="id_ocorrencia")
    private int codOcorrencia;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="id_canal")
    private Canal canal;

    @Column(name="titulo")
    private String titulo;

    @Lob
    @Column(name="imagem")
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] imagem;

    @Column(name="tipo_ocorrencia")
    private int tipoOcorrencia;

    @Column(name="situacao")
    private int situacao;

    @Column(name="descricao")
    private String descricao;

    @Column(name="data_ocorrencia", columnDefinition= "TIMESTAMP WITHOUT TIME ZONE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataOcorrencia;

    public Ocorrencia(){}

    public Ocorrencia(int codOcorrencia, Cliente cliente, Canal canal, String titulo, byte[] imagem, int tipoOcorrencia, int situacao, String descricao, Timestamp dataOcorrencia) {
        this.codOcorrencia = codOcorrencia;
        this.cliente = cliente;
        this.canal = canal;
        this.titulo = titulo;
        this.imagem = imagem;
        this.tipoOcorrencia = tipoOcorrencia;
        this.situacao = situacao;
        this.descricao = descricao;
        this.dataOcorrencia = dataOcorrencia;
    }


    public int getCodOcorrencia() {
        return codOcorrencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Canal getCanal() {
        return canal;
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

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setCodOcorrencia(int codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
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
}
