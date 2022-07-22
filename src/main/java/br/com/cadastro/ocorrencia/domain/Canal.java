package br.com.cadastro.ocorrencia.domain;

import javax.persistence.*;

@Entity
@Table(name = "\"Canal\"")

public class Canal {

    @Id
    @SequenceGenerator(name="canal", sequenceName="canal_id_canal_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="canal")
    @Column(name="id_canal")
    private int codCanal;

    @Column(name="nome")
    private String nomeCanal;

    public Canal(int codCanal, String nomeCanal) {
        this.codCanal = codCanal;
        this.nomeCanal = nomeCanal;
    }

    public Canal(){};

    public int getCodCanal() {
        return codCanal;
    }

    public String getNomeCanal() {
        return nomeCanal;
    }

    public void setCodCanal(int codCanal) {
        this.codCanal = codCanal;
    }

    public void setNomeCanal(String nomeCanal) {
        this.nomeCanal = nomeCanal;
    }
}
