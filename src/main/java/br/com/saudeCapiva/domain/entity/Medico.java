package br.com.saudeCapiva.domain.entity;

import br.com.saudeCapiva.domain.Especialidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "crm")
    private String crm;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "especialidade")
    private Especialidade especialidade;

    @Column(name = "lista_consultas")
    private List<Consulta> consultas;

    @Column(name = "telefone")
    private String telefone;

}
