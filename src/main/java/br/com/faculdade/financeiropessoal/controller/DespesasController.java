package br.com.faculdade.financeiropessoal.controller;

import br.com.faculdade.financeiropessoal.model.Despesas;
import br.com.faculdade.financeiropessoal.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/despesas")
public class DespesasController {

    @Autowired
    private DespesasRepository despesasRepository;

    @GetMapping
    public Iterable<Despesas> getAllLancamentoGastos(){
        return despesasRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Despesas> getLancamentoGastosById(@PathVariable Long id) {
        return despesasRepository.findById(id);
    }

    @PostMapping
    public @ResponseBody
    Despesas saveLancamentoGastos(@Valid Despesas lancamentos){
        despesasRepository.save(lancamentos);
        return lancamentos;
    }

    @PutMapping
    public Despesas changeLancamentoGastos(@PathVariable Despesas lancamentos){
        despesasRepository.save(lancamentos);
        return lancamentos;
    }

    @DeleteMapping("/{id}")
    public void deleteLancamentoGastos(@PathVariable Long id){
        despesasRepository.deleteById(id);
    }

}
