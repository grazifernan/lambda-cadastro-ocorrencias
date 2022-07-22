package br.com.cadastro.ocorrencia.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "\"Cliente\"")

public class Cliente {

    @Id
    @SequenceGenerator(name="cliente", sequenceName="cliente_id_cliente_seq", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cliente")
    @Column(name="id_cliente")
    private int codCliente;

    @Column(name="nome")
    private String nomeCliente;

    @Column(name="cpf_cnpj")
    private String cpfCnpjCliente;

    @Column(name="ddd")
    private String ddd;

    @Column(name="telefone")
    private String telefone;

    @Column(name="email")
    private String email;

    @Column(name="id_cognito")
    private String idCognito;


    public Cliente(int codCliente, String nomeCliente, String cpfCnpjCliente, String ddd, String telefone, String email, String idCognito) {
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;
        this.cpfCnpjCliente = cpfCnpjCliente;
        this.ddd = ddd;
        this.telefone = telefone;
        this.email = email;
        this.idCognito = idCognito;
    }

    public Cliente (){};

    public int getCodCliente() {
        return codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getIdCognito() {
        return idCognito;
    }


    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCpfCnpjCliente(String cpfCnpjCliente) {
        this.cpfCnpjCliente = cpfCnpjCliente;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdCognito(String idCognito) {
        this.idCognito = idCognito;
    }

}