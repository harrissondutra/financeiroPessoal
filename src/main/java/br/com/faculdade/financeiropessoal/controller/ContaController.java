package br.com.faculdade.financeiropessoal.controller;

import br.com.faculdade.financeiropessoal.model.Conta;
import br.com.faculdade.financeiropessoal.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/conta")
@RequiredArgsConstructor // Remove @Autowired
public class ContaController {

    private ContaRepository contaRepository;

    @GetMapping
    public Iterable<Conta> getAllConta(){
        return contaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Conta> getContaById(@PathVariable Long id) {
        return contaRepository.findById(id);
    }

    @PostMapping
    public @ResponseBody Conta saveConta(@Valid Conta conta){
        contaRepository.save(conta);
        return conta;
    }

    @PutMapping
    public Conta changeConta(@PathVariable Conta conta){
        contaRepository.save(conta);
        return conta;
    }

    @DeleteMapping("/{id}")
    public void deleteConta(@PathVariable Long id){
        contaRepository.deleteById(id);
    }

}
