package br.com.faculdade.financeiropessoal.controller;

import br.com.faculdade.financeiropessoal.model.Conta;
import br.com.faculdade.financeiropessoal.model.User;
import br.com.faculdade.financeiropessoal.repository.ContaRepository;
import br.com.faculdade.financeiropessoal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getAllUsersById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public @ResponseBody User saveUser(@Valid User user){
        userRepository.save(user);
        return user;
    }

    @PutMapping
    public User changeUser(@PathVariable User user){
        userRepository.save(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
    }

}
