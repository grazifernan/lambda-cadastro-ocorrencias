package br.com.cadastro.ocorrencia.repository;

import br.com.cadastro.ocorrencia.domain.Cliente;
import br.com.cadastro.ocorrencia.domain.Funcionario;
import br.com.cadastro.ocorrencia.domain.Ocorrencia;
import br.com.cadastro.ocorrencia.domain.Parecer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ParecerRepository extends JpaRepository<Parecer, Integer>{
    List<Parecer> findAll();
    Parecer findBycodParecer(int codParecer);
    List<Parecer> findByOcorrencia(Ocorrencia ocorrencia);
    List<Parecer> findByCliente(Cliente cliente);
    List<Parecer> findByFuncionario(Funcionario funcionario);
    List<Parecer> findByFuncionarioAndOcorrencia(Funcionario funcionario, Ocorrencia ocorrencia);


}