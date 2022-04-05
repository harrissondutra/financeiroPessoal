package br.com.faculdade.financeiropessoal.repository;


import br.com.faculdade.financeiropessoal.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
