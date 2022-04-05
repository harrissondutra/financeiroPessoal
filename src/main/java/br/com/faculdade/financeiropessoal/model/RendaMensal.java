package br.com.faculdade.financeiropessoal.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "renda_mensal")
@Getter @Setter @NoArgsConstructor
public class RendaMensal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private double valor;
    private LocalDate data = LocalDate.now();
    private String descricao;

}