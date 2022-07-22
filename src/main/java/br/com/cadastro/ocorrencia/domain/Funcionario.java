package br.com.cadastro.ocorrencia.domain;

import javax.persistence.*;

@Entity
@Table(name = "\"Funcionario\"")


public class Funcionario {

    @Id
    @SequenceGenerator(name="funcionario", sequenceName="funcionario_id_funcionario_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="funcionario")
    @Column(name="id_funcionario")
    private int codFuncionario;

    @Column(name="nome")
    private String nomeFuncionario;

    public Funcionario(int codFuncionario, String nomeFuncionario) {
        this.codFuncionario = codFuncionario;
        this.nomeFuncionario = nomeFuncionario;
    }

    public Funcionario(){};

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}
