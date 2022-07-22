package br.com.cadastro.ocorrencia.repository;

import br.com.cadastro.ocorrencia.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    List<Cliente> findAll();
    Cliente findBycodCliente(int codCliente);
    Cliente findByidCognito(String idCognito);
}