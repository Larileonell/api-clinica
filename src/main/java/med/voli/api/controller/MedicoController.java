package med.voli.api.controller;

import jakarta.validation.Valid;
import med.voli.api.endereco.Endereco;
import med.voli.api.medico.DadosCadastroMedico;
import med.voli.api.medico.Medico;
import med.voli.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {
   @Autowired
    private MedicoRepository repository;
   @PostMapping
   @Transactional
    public void cadastrar (@RequestBody  @Valid DadosCadastroMedico dados){
       repository.save(new Medico(dados));
   }


}
