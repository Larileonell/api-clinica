package med.voli.api.medico;

import med.voli.api.endereco.DadosEnderco;

public record DadosCadastroMedico( String nome, String email, String crm, Especialidade especialidade, DadosEnderco enderco) {

}
