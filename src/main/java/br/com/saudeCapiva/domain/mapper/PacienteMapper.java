package br.com.saudeCapiva.domain.mapper;

import br.com.saudeCapiva.domain.dto.PacienteDto;
import br.com.saudeCapiva.domain.entity.Paciente;

public class PacienteMapper {

    public static PacienteDto toDto(Paciente paciente) {
        return new PacienteDto(paciente.getId(), paciente.getNome(), paciente.getDocumento(), paciente.getEmail(),
                paciente.getSenha(),paciente.getConsultas(), paciente.getMedico());
    }

    public static Paciente toEntity(PacienteDto dto) {
        Paciente paciente = new Paciente();
        paciente.setId(dto.getId());
        paciente.setNome(dto.getNome());
        paciente.setDocumento(dto.getDocumento());
        paciente.setEmail(dto.getEmail());
        paciente.setSenha(dto.getSenha());
        paciente.setConsultas(dto.getConsultas());
        paciente.setMedico(dto.getMedico());

        return paciente;
    }
}