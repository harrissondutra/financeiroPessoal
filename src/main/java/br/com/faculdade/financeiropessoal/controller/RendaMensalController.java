package br.com.faculdade.financeiropessoal.controller;

import br.com.faculdade.financeiropessoal.model.Conta;
import br.com.faculdade.financeiropessoal.model.RendaMensal;
import br.com.faculdade.financeiropessoal.repository.ContaRepository;
import br.com.faculdade.financeiropessoal.repository.RendaMensalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/rendaMensal")
public class RendaMensalController {

    @Autowired
    private RendaMensalRepository rendaMensalRepository;

    @GetMapping
    public Iterable<RendaMensal> getAllRendaMensal(){
        return rendaMensalRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<RendaMensal> getRendaMensalById(@PathVariable Long id) {
        return rendaMensalRepository.findById(id);
    }

    @PostMapping
    public @ResponseBody RendaMensal saveRendaMensal(@Valid RendaMensal rendaMensal){
        rendaMensalRepository.save(rendaMensal);
        return rendaMensal;
    }

    @PutMapping
    public RendaMensal changeRendaMensal(@PathVariable RendaMensal rendaMensal){
        rendaMensalRepository.save(rendaMensal);
        return rendaMensal;
    }

    @DeleteMapping("/{id}")
    public void deleteRendaMensal(@PathVariable Long id){
        rendaMensalRepository.deleteById(id);
    }

}
