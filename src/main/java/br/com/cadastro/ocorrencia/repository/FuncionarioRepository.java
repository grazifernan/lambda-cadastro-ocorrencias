package br.com.cadastro.ocorrencia.repository;

import br.com.cadastro.ocorrencia.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{

    List<Funcionario> findAll();
    Funcionario findBycodFuncionario(int codFuncionario);
}
