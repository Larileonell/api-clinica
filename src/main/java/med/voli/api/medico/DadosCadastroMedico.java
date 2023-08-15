package med.voli.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voli.api.endereco.DadosEnderco;

public record DadosCadastroMedico(
        @NotNull
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
                @Pattern(regexp = "\\{4,6}")
        String crm,
       @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid
        DadosEnderco endereco
) {

}
