package br.com.faculdade.financeiropessoal.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "conta")
@Getter @Setter @NoArgsConstructor
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nomeConta", nullable = false)
    private String nome;

    @ManyToOne
    private Despesas lancamentos;

    public Conta(String nome) {
        this.nome = nome;
    }

}