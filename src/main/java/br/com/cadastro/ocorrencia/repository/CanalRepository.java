package br.com.cadastro.ocorrencia.repository;

import br.com.cadastro.ocorrencia.domain.Canal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CanalRepository extends JpaRepository<Canal, Integer>{
    List<Canal> findAll();
    Canal findBycodCanal(int codCanal);

}
