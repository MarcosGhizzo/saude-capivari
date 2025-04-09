package br.com.saudeCapiva.domain.dto;

import br.com.saudeCapiva.domain.entity.Consulta;
import br.com.saudeCapiva.domain.entity.Medico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteDto {

    private Long id;
    private String nome;
    private String documento;
    private String email;
    private String senha;
    private List<Consulta> consultas;
    private Medico medico;

}