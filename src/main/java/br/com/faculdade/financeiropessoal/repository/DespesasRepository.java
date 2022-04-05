package br.com.faculdade.financeiropessoal.repository;

import br.com.faculdade.financeiropessoal.model.Despesas;
import org.springframework.data.repository.CrudRepository;

public interface DespesasRepository extends CrudRepository<Despesas, Long> {
}