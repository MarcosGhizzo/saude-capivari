package br.com.saudeCapiva.domain.mapper;

import br.com.saudeCapiva.domain.dto.MedicoDto;
import br.com.saudeCapiva.domain.entity.Medico;

public class MedicoMapper {

    public static MedicoDto toDto(Medico medico) {
        return new MedicoDto(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getSenha(), medico.getEspecialidade(), medico.getTelefone());

    }

    public static Medico toEntity(MedicoDto dto) {
        Medico medico = new Medico();
        medico.setId(dto.getId());
        medico.setNome(dto.getNome());
        medico.setCrm(dto.getCrm());
        medico.setEmail(dto.getEmail());
        medico.setSenha(dto.getSenha());
        medico.setEspecialidade(dto.getEspecialidade());
        medico.setTelefone(dto.getTelefone());

        return medico;
    }
}
