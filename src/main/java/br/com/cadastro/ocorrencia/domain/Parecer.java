package br.com.cadastro.ocorrencia.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "\"Parecer\"")


public class Parecer {

    @Id
    @SequenceGenerator(name="parecer", sequenceName="parecer_id_parecer_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="parecer")
    @Column(name="id_parecer")
    private Integer codParecer;

    @ManyToOne
    @JoinColumn(name="id_ocorrencia")
    private Ocorrencia ocorrencia;

    @ManyToOne
    @JoinColumn(name="id_funcionario")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    @Column(name="parecer")
    private String parecer;

    @Column(name="data_parecer")
    private Timestamp dataParecer;

    public Parecer(Integer codParecer, Ocorrencia ocorrencia, Funcionario funcionario, Cliente cliente, String parecer, Timestamp dataParecer) {
        this.codParecer = codParecer;
        this.ocorrencia = ocorrencia;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.parecer = parecer;
        this.dataParecer = dataParecer;
    }

    public Parecer(){}

    public Integer getCodParecer() {
        return codParecer;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getParecer() {
        return parecer;
    }

    public Timestamp getDataParecer() {
        return dataParecer;
    }

    public void setCodParecer(Integer codParecer) {
        this.codParecer = codParecer;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

    public void setDataParecer(Timestamp dataParecer) {
        this.dataParecer = dataParecer;
    }
}
