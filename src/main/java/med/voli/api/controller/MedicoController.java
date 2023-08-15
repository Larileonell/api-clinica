package med.voli.api.controller;

import med.voli.api.endereco.Endereco;
import med.voli.api.medico.DadosCadastroMedico;
import med.voli.api.medico.Medico;
import med.voli.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {
   @Autowired
    private MedicoRepository repository;
   @PostMapping
    public void cadastrar (@RequestBody DadosCadastroMedico dados){
       repository.save(new Medico(dados));
   }


}
