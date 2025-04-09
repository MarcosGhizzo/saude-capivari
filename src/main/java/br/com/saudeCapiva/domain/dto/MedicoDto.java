package br.com.saudeCapiva.domain.dto;

import br.com.saudeCapiva.domain.Especialidade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicoDto {

    private Long id;
    private String nome;
    private String crm;
    private String email;
    private String senha;
    private Especialidade especialidade;
    private String telefone;

}
