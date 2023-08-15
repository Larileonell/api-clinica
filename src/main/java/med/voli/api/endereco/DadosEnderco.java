package med.voli.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEnderco(
       @NotBlank
        String logradouro,
       @NotBlank
        String bairro,

       @NotBlank
       @Pattern(regexp = "\\{8}")
       String cep,
       @NotBlank
       String cidade,
       @NotBlank
       String uf,
        String complemento,
        String numero) {

}
