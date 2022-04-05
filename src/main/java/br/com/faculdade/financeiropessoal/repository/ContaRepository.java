package br.com.faculdade.financeiropessoal.repository;

import br.com.faculdade.financeiropessoal.model.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta, Long> {

}